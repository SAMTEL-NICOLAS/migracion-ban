package co.com.samtel.migration.service.impl;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
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
	private String user;
	private String nameFile;
	private String extention;

	private Long idAudit;

	private ErrorDto errorMig;

	private TypeMigration typeMigration;

	private Thread hilo;

	private Object valor;

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

			createFile(request, idTable + Long.valueOf(1));

			Long id = auditCsvDao.insertAudit(new AuditoriaCsv(idTable + Long.valueOf(1), getUser(), new Date()));
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

	/**
	 * Metodo que se encarga de ejecutar el proceso de carge validar si se realizo
	 * de manera exitosa o no.
	 * 
	 * @return
	 */
	public String uploadFile() {
		String proceso = "";
		try {
			System.out.println("001");

			String url = "\\ArchivosCargueExcel\\".concat(getIdAudit().toString()).concat(getExtention());

			setDelimiter(",");

			System.out.println("002");
			Boolean respuesta = executePersistTable.executeProcess(url, getTypeFile(getNameFile()), getDelimiter(),
					getNameFile());

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
		return this.idAudit;
	}

	/**
	 * Metodo que se encarga de recuperar el archivo o archivos que se envian desde
	 * la vista y los guarda en una ruta final
	 * 
	 * @param reqest
	 */
	public void createFile(HttpServletRequest request, Long idAuditoria) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			String finalRoute = "\\ArchivosCargueExcel";
			String extention = "";

			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1024);
			factory.setRepository(new File(finalRoute));
			ServletFileUpload upload = new ServletFileUpload(factory);

			List<FileItem> parts = upload.parseRequest(request);
			setUser(parts.get(0).getFieldName());
			setNameFile(parts.get(1).getFieldName());
			for (FileItem item : parts) {
				if (null != item.getName()) {
					extention = item.getName().substring(item.getName().lastIndexOf('.'));
					File file = new File(finalRoute, idAuditoria.toString().concat(extention));
					item.write(file);
				}
			}
			setExtention(extention);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo que se encarga de obtener el TypeFile que se va a procesar en el
	 * cargue.
	 * 
	 * @param nameFile
	 * @return
	 */
	public TypeFile getTypeFile(String nameFile) {
		TypeFile typeFile = null;
		switch (nameFile) {
		case "BIG_CALIFICACION_CARTERA_CLIENTE":
			typeFile = TypeFile.BIG_CALIFICACION_CARTERA_CLIENTE;
			break;
		case "BIG_DESENDEUDESE":
			typeFile = TypeFile.BIG_DESENDEUDESE;
			break;
		case "BIG_GEOREFERENCIAR_PROSPECTO":
			typeFile = TypeFile.BIG_GEOREFERENCIAR_PROSPECTO;
			break;
		case "BIG_INFO_FINANCIERA":
			typeFile = TypeFile.BIG_INFO_FINANCIERA;
		case "BIG_METAS_FUERZA_COMERCIAL":
			typeFile = TypeFile.BIG_METAS_FUERZA_COMERCIAL;
			break;
		case "BIG_METAS_OFICINA":
			typeFile = TypeFile.BIG_METAS_OFICINA;
			break;
		case "BIG_PARA_INDICADORES":
			typeFile = TypeFile.BIG_PARA_INDICADORES;
			break;
		case "BIG_PROSPECTOS":
			typeFile = TypeFile.BIG_PROSPECTOS;
			break;
		default:
			break;
		}

		return typeFile;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

}
