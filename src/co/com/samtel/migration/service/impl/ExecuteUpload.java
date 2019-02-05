package co.com.samtel.migration.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.dao.bussines.IAuditDaoCsv;
import co.com.samtel.dao.bussines.IDetailAuditCsvDao;
import co.com.samtel.dao.bussines.ILogActivadorDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.AuditoriaCsv;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IUploadMigration;

@Stateless(name = "executeUpload")
public class ExecuteUpload implements IUploadMigration, Runnable {

	@EJB(beanName = "executePersistTable")
	IExecutePersistTable executePersistTable;

	@EJB
	IFactoryMigration factoryMigration;

	// Objeto para la consulta de tablas listas para migrar
	@EJB
	ILogActivadorDao logActivadorDao;

	@EJB
	IAuditDaoCsv auditCsvDao;

	@EJB
	IDetailAuditCsvDao detailAuditCsvDao;

	private String delimiter;

	private Long idAudit;

	private ErrorDto errorMig;

	private TypeMigration typeMigration;

	private Thread hilo;

	@Override
	public void run() {
		uploadFile();
	}

	@Override
	public Boolean generateMigration(TypeMigration typeMigration, HttpServletRequest request) {
		setTypeMigration(typeMigration);
		Boolean respuesta = Boolean.TRUE;
		try {

			// Genero el registro padre de la uditoria
			Long idTable = auditCsvDao.getMaxValue();

			String user = createFile(request, idTable + Long.valueOf(1));

			Long id = auditCsvDao.insertAudit(new AuditoriaCsv(idTable + Long.valueOf(1), user, new Date()));
			setIdAudit(id);
			System.out.println("Este es el id de la auditoria ".concat(id.toString()));

		} catch (ControlledExeption e) {
			e.printStackTrace();
			respuesta = Boolean.FALSE;
			setErrorMig(ErrorDto.of(null, TypeErrors.CONNECTION_DATA_BASE, e.getMessage()));
		} catch (Exception e) {
			e.printStackTrace();
			respuesta = Boolean.FALSE;
		}
		if (respuesta) {
			// Llamo al proceso que genera la migración
			hilo = new Thread(this);
			hilo.start();
		}
		return respuesta;
	}

	public String uploadFile() {
		String proceso = "";
		try {
			System.out.println("001");

			String url = "\\ArchivosCargueExcel\\BIG_METAS_OFICINA.csv";

			setDelimiter(",");

			System.out.println("002");
			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_METAS_OFICINA, getDelimiter());

			System.out.println("005");
			if (respuesta) {
				System.out.println("MAPEO REALIZADO CORRECTAMENTE");
				proceso = "MAPEO REALIZADO CORRECTAMENTE";
			} else {
				System.out.println("Error al mapear el excel");
				proceso = "Error al mapear el excel";
			}

		} catch (Exception e) {
			System.out.println("003");
			e.printStackTrace();
		}

		return proceso;
	}

	@Override
	public ErrorDto getMessageError() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getIdAudit() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Metodo que se encarga de recuperar el archivo o archivos que se envian desde
	 * la vista y los guarda en una ruta final
	 * 
	 * @param reqest
	 */
	public String createFile(HttpServletRequest request, Long idAuditoria) {
		String user = "";
		try {
			String finalRoute = "\\ArchivosCargueExcel";

			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1024);
			factory.setRepository(new File(finalRoute));
			ServletFileUpload upload = new ServletFileUpload(factory);

			List<FileItem> parts = upload.parseRequest(request);
			user = parts.get(0).getFieldName();
			for (FileItem item : parts) {
				if (null != item.getName()) {
					String extencion = item.getName().substring(item.getName().length() - 4);
					File file = new File(finalRoute, idAuditoria.toString().concat(extencion));
					item.write(file);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public IFactoryMigration getFactoryMigration() {
		return factoryMigration;
	}

	public void setFactoryMigration(IFactoryMigration factoryMigration) {
		this.factoryMigration = factoryMigration;
	}

	public ILogActivadorDao getLogActivadorDao() {
		return logActivadorDao;
	}

	public void setLogActivadorDao(ILogActivadorDao logActivadorDao) {
		this.logActivadorDao = logActivadorDao;
	}

	public IAuditDaoCsv getAuditCsvDao() {
		return auditCsvDao;
	}

	public void setAuditCsvDao(IAuditDaoCsv auditCsvDao) {
		this.auditCsvDao = auditCsvDao;
	}

	public IDetailAuditCsvDao getDetailAuditCsvDao() {
		return detailAuditCsvDao;
	}

	public void setDetailAuditCsvDao(IDetailAuditCsvDao detailAuditCsvDao) {
		this.detailAuditCsvDao = detailAuditCsvDao;
	}

	public ErrorDto getErrorMig() {
		return errorMig;
	}

	public void setErrorMig(ErrorDto errorMig) {
		this.errorMig = errorMig;
	}

	public TypeMigration getTypeMigration() {
		return typeMigration;
	}

	public void setTypeMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
	}

	public Thread getHilo() {
		return hilo;
	}

	public void setHilo(Thread hilo) {
		this.hilo = hilo;
	}

	public void setIdAudit(Long idAudit) {
		this.idAudit = idAudit;
	}

	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

}
