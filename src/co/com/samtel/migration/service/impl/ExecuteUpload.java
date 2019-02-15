package co.com.samtel.migration.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
	private String url;
	private String urlFinal;
	private String traceDetail;

	private Long idAudit;
	private Long idDetailAudit;
	private String estado;

	private ErrorDto errorMig;

	private TypeFile typeFile;

	private Thread hilo;

	private Object valor;

	private InputStream in;

	private OutputStream out;

	@Override
	public void run() {
		callUpload();
	}

	/**
	 * Metodo inicial el cual se encargara de insertar en la tabla padre de la
	 * auditoria y luego crea un hilo para realizar el cargue "Manual".
	 */
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

	/**
	 * Metodo que se encarga de ser el nuevo hilo en cual se realizara el proceso de
	 * cargue "Manual"
	 */
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
			setUrl("\\ArchivosCargueExcel\\".concat(item.getNombreArchivo()));
			if (existFile(getUrl())) {
				setUrl(backupFile());
				setDelimiter(";");
				System.out.println("Archivo: ".concat(item.getNombreArchivo()));
				Boolean respuesta = executePersistTable.executeProcess(getUrl(), getTypeFile(item.getNombreArchivo()),
						getDelimiter(), item.getNombreArchivo());
				if (respuesta) {
					setTraceDetail("Mapeo realizado correctamente");
				} else {
					setTraceDetail("Error al mapear el excel");
				}
			} else {
				setTraceDetail("No existe el archivo: ".concat(item.getNombreArchivo()).concat(".csv"));
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

		setIdDetailAudit(idTable);

		detailAuditCsvDao.saveEntity(detail);
		return detail;
	}

	/**
	 * Metodo que se encarga de actualizar los detalles de la auditoria.
	 * 
	 * @param detail
	 */
	public void generateAuditMigration(DetailAuditCsv detail) {
		detail.setRegDestino(Long.valueOf(0));
		detail.setRegOrigen(Long.valueOf(0));
		detail.setTraza(getTraceDetail());
		detailAuditCsvDao.updateEntity(detail);
		// Actualizo el disparador
	}

	/**
	 * Metodo que se encarga de validar si existe un archivo en un directorio
	 * especifico.
	 * 
	 * @param url
	 * @return
	 */
	public Boolean existFile(String url) {
		Boolean exist = Boolean.FALSE;
		setExtention(".csv");
		setUrl(url.concat(getExtention()));
		File fichero = new File(getUrl());

		if (fichero.exists()) {
			exist = Boolean.TRUE;
		} else {
			exist = Boolean.FALSE;
		}

		return exist;
	}

	/**
	 * Metodo que se encarga de validar si existe un directorio, en el caso que no
	 * lo crea.
	 * 
	 * @param url
	 */
	public void existdirectory(String url) {
		File directory = new File(url);

		if (!directory.exists()) {
			directory.mkdir();
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

	/**
	 * Metodo que se encarga de copiar el archivo original y dejarlo en una ruta
	 * cambiandole el nombre del archivo por el ID de la tabla de la auditoria.
	 * 
	 * @throws IOException
	 */
	public String backupFile() throws IOException {
		setUrlFinal("\\AuditoriaArchivosCargados\\");
		existdirectory(getUrlFinal());
		setUrlFinal(getUrlFinal().concat(getIdDetailAudit().toString()).concat(getExtention()));
		in = new FileInputStream(getUrl());
		out = new FileOutputStream(getUrlFinal());

		byte[] b = new byte[1024];
		int l;
		while ((l = in.read(b)) > 0) {
			out.write(b, 0, l);
		}

		return getUrlFinal();
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

	public Long getIdDetailAudit() {
		return idDetailAudit;
	}

	public void setIdDetailAudit(Long idDetailAudit) {
		this.idDetailAudit = idDetailAudit;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlFinal() {
		return urlFinal;
	}

	public void setUrlFinal(String urlFinal) {
		this.urlFinal = urlFinal;
	}

	public String getTraceDetail() {
		return traceDetail;
	}

	public void setTraceDetail(String traceDetail) {
		this.traceDetail = traceDetail;
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

}
