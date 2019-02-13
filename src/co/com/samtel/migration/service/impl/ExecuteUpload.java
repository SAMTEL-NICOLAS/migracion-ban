package co.com.samtel.migration.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
import co.com.samtel.entity.business.DetailAuditCsv;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.migration.IUploadMigration;

@Stateless(name = "executeUpload")
public class ExecuteUpload implements IUploadMigration, Runnable {

	@EJB(beanName = "executePersistTable")
	IExecutePersistTable executePersistTable;

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
	private String estado;

	private ErrorDto errorMig;

	private TypeFile typeFile;

	private Thread hilo;

	private Object valor;

	@Override
	public void run() {
		callUpload();
	}

	@Override
	public Boolean generateMigration(String user) {
		Boolean respuesta = Boolean.TRUE;
		try {
			// Genero el registro padre de la uditoria
			Long idTable = auditCsvDao.getMaxValue();

			setEstado("En proceso");
			Long id = auditCsvDao
					.insertAudit(new AuditoriaCsv(idTable + Long.valueOf(1), user, new Date(), getEstado()));
			setIdAudit(id);

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

	public void callUpload() {

		List<TypeFile> typetiles = Arrays.asList(TypeFile.values());

		for (TypeFile item : typetiles) {
			// Genera el registro inicial del log
			DetailAuditCsv detail = generateAuditMigration(item);
			executeMigration(item, Long.valueOf("0"));
			// Genera el detalle de la migracion
			generateAuditMigration(detail);
		}

	}

	/**
	 * Metodo que se encarga de ejecutar el proceso de carge validar si se realizo
	 * de manera exitosa o no.
	 * 
	 * @return
	 */
	public void executeMigration(TypeFile item, Long migrados) {
		try {

			// Seteamos el numero de registros que ha migrado

			String url = "\\ArchivosCargueExcel\\".concat(item.getNombreArchivo());
			if (existFile(url)) {
				url = url.concat(getExtention());
				setDelimiter(";");
				System.out.println("Archivo: ".concat(item.getNombreArchivo()));
				Boolean respuesta = executePersistTable.executeProcess(url, getTypeFile(item.getNombreArchivo()),
						getDelimiter(), item.getNombreArchivo());

				if (respuesta) {
					System.out.println("MAPEO REALIZADO CORRECTAMENTE");
				} else {
					System.out.println("Error al mapear el excel");
				}
			} else {
				System.out.println("No existe el archivo: ".concat(item.getNombreArchivo()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo con el cual genero el registro inicial del detalle de la auditoria
	 */
	public DetailAuditCsv generateAuditMigration(TypeFile item) {
		Long idTable = null;
		try {
			idTable = detailAuditCsvDao.getMaxValue();
		} catch (ControlledExeption e) {
			e.printStackTrace();
		}
		if (idTable == null) {
			new Exception("Imposible insertar detalle de auditoria");
		} else {
			idTable += 1;
		}
		DetailAuditCsv detail = new DetailAuditCsv();
		detail.setIdAudit(getIdAudit());
		detail.setId(idTable);
		detail.setRegDestino(Long.valueOf(0));
		detail.setRegOrigen(Long.valueOf(0));
		detail.setTabla(item.getNombreArchivo());
		detail.setTraza("Sin Traza");

		detailAuditCsvDao.saveEntity(detail);
		return detail;
	}

	public void generateAuditMigration(DetailAuditCsv detail) {
		detail.setRegDestino(Long.valueOf(0));
		detail.setRegOrigen(Long.valueOf(0));
		detail.setTraza("Ok");
		detailAuditCsvDao.updateEntity(detail);
		// Actualizo el disparador
	}

	public Boolean existFile(String url) {
		Boolean exist = Boolean.FALSE;
		setExtention(".csv");
		File fichero = new File(url.concat(getExtention()));

		if (fichero.exists()) {
			exist = Boolean.TRUE;
		} else {
			exist = Boolean.FALSE;
		}

		return exist;
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

	public TypeFile getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(TypeFile typeFile) {
		this.typeFile = typeFile;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public TypeFile getFileToUpload() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Boolean generateMigration(TypeMigration typeMigration, HttpServletRequest request) {
//		Boolean respuesta = Boolean.TRUE;
//		try {
//
//			// Genero el registro padre de la uditoria
//			Long idTable = auditCsvDao.getMaxValue();
//
//			createFile(request, idTable + Long.valueOf(1));
//			setEstado("En proceso");
//			Long id = auditCsvDao
//					.insertAudit(new AuditoriaCsv(idTable + Long.valueOf(1), getUser(), new Date(), getEstado()));
//			setIdAudit(id);
//
//		} catch (ControlledExeption e) {
//			e.printStackTrace();
//			respuesta = Boolean.FALSE;
//			setErrorMig(ErrorDto.of(null, TypeErrors.CONNECTION_DATA_BASE, e.getMessage()));
//		} catch (Exception e) {
//			e.printStackTrace();
//			respuesta = Boolean.FALSE;
//		}
//		if (respuesta) {
//			// Llamo al proceso que genera la migración
//			hilo = new Thread(this);
//			hilo.start();
//		}
//		return respuesta;
//	}

	@Override
	public Long getNumRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getNumRecMig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogActivador(LogActivador logActivador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setNumRecMig(Long valor) {
		// TODO Auto-generated method stub

	}

}
