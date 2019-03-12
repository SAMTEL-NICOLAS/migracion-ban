package co.com.samtel.cargue.service.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;

import co.com.samtel.cargue.enumeraciones.ErrorMapperType;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.IColumn;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.exception.UploadMapperExpetion;
import co.com.samtel.cargue.exception.dto.ErrorMapperDto;
import co.com.samtel.cargue.service.IReadResource;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.bussines.IDetailAuditCsvDao;
import co.com.samtel.entity.business.DetailAuditCsv;
import co.com.samtel.entity.manual.csv.BigCifinBureauCsv;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.exception.NoRecordsFoundException;
import co.com.samtel.migration.IUploadMigration;

public abstract class AbsStrategyMapper<T, U extends IColumn, Z> implements IStrategyMapper<T> {

	private String data;
	private List<String> data2;

	private Integer row;

	private Class<T> domainClass = initDomainClass();

	@EJB(beanName = "csvRead")
	private IReadResource readResource;

	private String url;

	private List<String> columns;
	private List<String> titlesColumns;

	private TypeFile typeFile;

	private U enumColumns;

	private List<U> listEnumColumns;
	List<T> l;

	ArrayList<T> listAllObject = new ArrayList<>();

	private T objectMapper;

	private Z objectDataBase;

	private String DELIMITER;

	abstract public void init();

	abstract public IGenericDao getDao();

	abstract public Z getCustomMapper(T dto);
		
	abstract public List<Z> getCustomMapper2(List<T> dto);

	@EJB
	IUploadMigration executeUpload;

	@EJB
	IDetailAuditCsvDao detailAuditCsvDao;
	
	BigCifinBureauCsv p;

	/**
	 * Metodo con el cual obtengo la clase en la cual se esta implemento la clase
	 * abstracta
	 * 
	 * @return
	 */
	@SuppressWarnings("all")
	protected Class<T> initDomainClass() {
		if (domainClass == null) {
			ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
			domainClass = (Class) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	public Boolean mapper(String delimiter) throws MapperException, UploadMapperExpetion, InstantiationException {
		this.DELIMITER = delimiter;
		initialize();
		splitData();
		validateStructure();
		Boolean result = mapperObject();
		return result;
	}

	public void initialize() {
		setColumns(new ArrayList<>());
	}

	public void splitData() throws MapperException {

		if (getData() == null) {
			throw new MapperException(ErrorMapperDto.of(ErrorMapperType.EMPTY_DATA, typeFile, null, "Linea Vacia"));
		} else if (getData().equalsIgnoreCase("")) {
			throw new MapperException(ErrorMapperDto.of(ErrorMapperType.EMPTY_DATA, typeFile, null, "Linea Vacia"));
		}

		String ultimo = data.substring(data.length() - 1);
		if (ultimo.equals(";")) {
			List<String> myList = new ArrayList<String>(Arrays.asList(data.split(DELIMITER)));

			while (getTypeFile().getNumColumns().intValue() != myList.size()) {
				myList.add(null);
			}

			int tamanio = myList.size();
			System.out.println(tamanio);
			System.out.println("DELIMITER: ".concat(DELIMITER));

			for (String item : myList) {
				if (getColumns() == null) {
					setColumns(new ArrayList<String>());
				}
				columns.add(item);
			}
		} else {
			String[] columnsVector = data.split(DELIMITER);
			if (columnsVector.length == 0) {
				DELIMITER = ",";
				columnsVector = data.split(DELIMITER);
				if (columnsVector.length == 0) {
					throw new MapperException(
							ErrorMapperDto.of(ErrorMapperType.EMPTY_DATA, typeFile, null, "Sin InformaciÃ³n"));
				}
			}

			System.out.println("DELIMITER: ".concat(DELIMITER));

			for (String item : columnsVector) {
				if (getColumns() == null) {
					setColumns(new ArrayList<String>());
				}
				columns.add(item);
			}
		}
	}

	/**
	 * Metodo con el cual valido si la fila tiene la estructura correcta
	 * 
	 * @throws MapperException
	 */
	public void validateStructure() throws MapperException {
		System.out.println("Tamaño columnas del archivo: " + getColumns().size());
		System.out.println("Tamaño columnas que deberia tener el archivo: " + getTypeFile().getNumColumns().intValue());
		if (getColumns().size() != getTypeFile().getNumColumns().intValue()) {
			throw new MapperException(
					ErrorMapperDto.of(ErrorMapperType.WRONG_STRUCTURE, typeFile, null, "Estructura incorrecta"));
		}
	}

	public Boolean mapperObject() throws UploadMapperExpetion, InstantiationException {
		Boolean result = true;
		try {
			String nombreDeLaClase = getDomainClass().getSimpleName();
			Constructor constructor = getDomainClass().getConstructor();
			T objeto = (T) constructor.newInstance();
//			switch (nombreDeLaClase) {
//			case "BigCifinBureauCsv":
			// BigCifinBureauCsv ci = (BigCifinBureauCsv) c.newInstance();
			for (U item : getListEnumColumns()) {

				Method method = getDomainClass().getMethod("set" + item.getNombreColumna(), item.getTypeColumn());

				switch (item.getTypeColumn().getName()) {
				case "java.lang.String":
					method.invoke(objeto, getColumns().get(item.getIndice()));
					break;
				case "java.lang.Integer":
					try {
						if (getColumns().get(item.getIndice()) == null
								|| getColumns().get(item.getIndice()).isEmpty()) {
							Integer integer = null;
							method.invoke(objeto, integer);
						} else {
							method.invoke(objeto, Integer.valueOf(getColumns().get(item.getIndice())));
						}
					} catch (Exception e) {
						UploadMapperExpetion error = new UploadMapperExpetion(getTypeFile().getNombreArchivo(),
								item.getNombreColumna(), Long.valueOf(getRow()) + 1, Long.valueOf(item.getIndice()) + 1,
								e.getMessage());

						insertDetailAudit(error);
						result = false;
					}
					break;
				case "java.lang.Double":
					method.invoke(objeto, Double.valueOf(getColumns().get(item.getIndice())));
					break;
				case "java.math.BigDecimal":
					try {
						if (getColumns().get(item.getIndice()) == null
								|| getColumns().get(item.getIndice()).isEmpty()) {
							BigDecimal bigDecimal = null;
							method.invoke(objeto, bigDecimal);
						} else {
							BigDecimal bigDecimal = formatingBigDecimal(getColumns().get(item.getIndice()));
							method.invoke(objeto, bigDecimal);
						}

					} catch (ParseException | IndexOutOfBoundsException e) {
						e.printStackTrace();
						UploadMapperExpetion error = new UploadMapperExpetion(getTypeFile().getNombreArchivo(),
								item.getNombreColumna(), Long.valueOf(getRow()) + 1, Long.valueOf(item.getIndice()) + 1,
								e.getMessage());

						insertDetailAudit(error);
						result = false;
					}

					break;
				case "java.util.Date":
					try {
						if (getColumns().get(item.getIndice()) == null
								|| getColumns().get(item.getIndice()).isEmpty()) {
							Date date = null;
							method.invoke(objeto, date);
						} else {
							Date date1 = formatingDate(getColumns().get(item.getIndice()));
							method.invoke(objeto, date1);
						}

					} catch (ParseException e) {
						e.printStackTrace();

						UploadMapperExpetion error = new UploadMapperExpetion(getTypeFile().getNombreArchivo(),
								item.getNombreColumna(), Long.valueOf(getRow() + 1), Long.valueOf(item.getIndice()) + 1,
								e.getMessage());

						insertDetailAudit(error);
						result = false;
					}
					break;

				default:
					break;
				}
			}
			listAllObject.add(objeto);
//			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Metodo con el cual se inserta en la tabla detalle auditoria cada ves que se
	 * genere un error
	 */
	public void insertDetailAudit(UploadMapperExpetion error) {

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

		detail.setId(idTable);
		detail.setTabla(error.getFileName());
		detail.setRegDestino(Long.valueOf(0));
		detail.setRegOrigen(Long.valueOf(0));
		detail.setTraza("No fue posible realizar la inserción");
		detail.setIdAudit(executeUpload.getIdAudit());
		detail.setColumn_name(error.getColumnName());
		detail.setRow(error.getRow());
		detail.setColumna(error.getColumn());
		detail.setMessage(error.getMessage());
		detailAuditCsvDao.saveEntity(detail);

	}

	/**
	 * Metodo con el cual se evaluaran todos los posibles formatos que podra tener
	 * un BigDecimal en la aplicacion.
	 * 
	 * @param value
	 * @return
	 * @throws ParseException
	 */
	public BigDecimal formatingBigDecimal(String value) throws ParseException {
		BigDecimal bigDecimal = null;
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		String pattern = "#.##";

		try {
			DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
			decimalFormat.setParseBigDecimal(true);
			bigDecimal = (BigDecimal) decimalFormat.parse(value);
		} catch (ParseException e) {
			try {
				pattern = "#,##";
				DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
				decimalFormat.setParseBigDecimal(true);
				bigDecimal = (BigDecimal) decimalFormat.parse(value);
			} catch (Exception e2) {
				throw new ParseException(e2.getMessage(), 0);
			}
		}

		return bigDecimal;
	}

	/**
	 * Metodo con el cual se evaluaran todos los posibles formatos que podra tener
	 * una fecha en la aplicacion
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public Date formatingDate(String date) throws ParseException {
		Date fecha = null;
		try {
			SimpleDateFormat parseador = new SimpleDateFormat("yyyy-MM-dd");
			fecha = parseador.parse(date);
		} catch (ParseException e) {
			SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yyyy");
			try {
				fecha = parseador.parse(date);
			} catch (ParseException e1) {
				SimpleDateFormat parseador1 = new SimpleDateFormat("dd-MM-yyyy");
				try {
					fecha = parseador1.parse(date);
				} catch (ParseException e2) {
					throw new ParseException(e2.getMessage(), 0);
				}
			}
		}
		return fecha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Metodo con el cual realizo el proceso de cargue
	 * 
	 * @return
	 * @throws MapperException
	 * @throws UploadMapperExpetion
	 */
	public Boolean executeUpload(String delimeter) throws MapperException, UploadMapperExpetion {
		DELIMITER = delimeter;
		Boolean respuesta = Boolean.FALSE;
		readResource.setUrl(getUrl());
		if (readResource.readFile()) {
			try {
				respuesta = throughRows();
				getListAllObject();
				persistInformation();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Error al leer el archivo");
			respuesta = Boolean.FALSE;
		}

		return respuesta;
	}

	public void persistInformation() throws NoRecordsFoundException, ControlledExeption {

		getDao().saveEntity2(getCustomMapper2(getListAllObject()));
		// Se extrae el error
		getDao().getError();
		if (getDao().getError() != null) {
			validarError();
		}
	}
	
//	public void persistInformation() throws NoRecordsFoundException, ControlledExeption {
//		if (getListAllObject() != null && !getListAllObject().isEmpty()) {
//			for (T item : getListAllObject()) {
//				getDao().saveEntity(getCustomMapper(item));			
//				// Se extrae el error
//				getDao().getError();
//				if (getDao().getError() != null) {
//					validarError();
//				}
//			}
//		}
//	}

	/**
	 * Metodo que se encarga de iterar cada una de las filas del archivo incluyendo
	 * la de los titulos para asi validar si la estructura se encuentra correcta.
	 * 
	 * @return
	 * @throws Exception
	 */
	public Boolean throughRows() throws Exception {
		Boolean answer = Boolean.TRUE;
		List<String> rows = readResource.getRows();
		int i = 0;
		for (String item : rows) {
			if (i == 0) {
				System.out.println("Titulos");
				if (!splitColumns(item)) {
					answer = Boolean.FALSE;
					System.out.println("Error en la estructura del documento");
					throw new MapperException(ErrorMapperDto.of(ErrorMapperType.WRONG_STRUCTURE, typeFile, null,
							"Error en la estructura del documento"));
				}
			}
			if (i != 0) {
				int fila = i;
				process(item, fila);
				T objeto = getObjectMapper();
			}
			i++;
			System.out.println("Registros: " + i);
		}
		return answer;
	}


	/**
	 * Metodo que se encarga de tomar cada uno de los campos de la primera fila del
	 * archivo (Titulos) los guardo en una lista para que luego se pueda validar la
	 * estructura.
	 * 
	 * @param item2
	 * @return
	 * @throws MapperException
	 */
	public Boolean splitColumns(String item2) throws MapperException {
		Boolean structureOk = Boolean.FALSE;
		String[] columnsVector = item2.split(DELIMITER);
		if (columnsVector.length == 0) {
			DELIMITER = ",";
			columnsVector = item2.split(DELIMITER);
			if (columnsVector.length == 0) {
				throw new MapperException(ErrorMapperDto.of(ErrorMapperType.EMPTY_DATA, typeFile, null,
						"Sin datos para valdiar la estruxtura."));
			}
		}

		for (String item : columnsVector) {
			if (getTitlesColumns() == null) {
				setTitlesColumns(new ArrayList<String>());
			}
			titlesColumns.add(item);
		}

		structureOk = validateFileStructure();
		return structureOk;
	}

	/**
	 * Metodo que se encarga de validar que la estructura del archivo sea correcta,
	 * en el caso de que el orden de las columnas no sean iguales no continuara con
	 * el proceso.
	 * 
	 * @return
	 */
	public Boolean validateFileStructure() {
		Boolean structureOk = Boolean.TRUE;

		for (U item : getListEnumColumns()) {
			if (structureOk) {
				if (getTitlesColumns().get(item.getIndice()).equalsIgnoreCase(item.getNombreColumna())) {
					System.out.println("Los nombres de las columnas son igules son iguales...");
					structureOk = Boolean.TRUE;
				} else {
					System.out.println("Los nombres de las columnas no son iguales...");
					System.out.println(
							"Columna del archivo: ".concat(getTitlesColumns().get(item.getIndice()).toUpperCase()));
					System.out.println("Columna que deberia ir: ".concat(item.getNombreColumna().toUpperCase()));
					structureOk = Boolean.FALSE;
				}
			}
		}
		return structureOk;
	}

	/**
	 * Metodo que se encarga de continuar con el proceso de mapeo del archivo.
	 * 
	 * @param item
	 * @throws MapperException
	 * @throws UploadMapperExpetion
	 * @throws InstantiationException
	 */
	public void process(String item, int fila) throws MapperException, UploadMapperExpetion, InstantiationException {
		setData(item);
		setRow(fila);
		Boolean result = false;
		result = mapper(DELIMITER);

//		if (result == true) {
//			T objeto = getObjectMapper();
//			getDao().save(objeto);
//		}
//		getDao().getListAllObject();
//			getDao().saveEntity(getCustomMapper(objeto));
//			// Se extrae el error
//			getDao().getError();
//			if (getDao().getError() != null) {
//				validarError();
//			}
//			System.out.println("llego" + objeto.toString());
//		} else {
//			System.out.println("No debe continuar");
//		}
	}

	/**
	 * Metodo que se encarga de setear el error a la clase UploadMapperExpetion e
	 * invocar el metodo que lo inserta en la tabla de auditoria
	 */
	public void validarError() {

		UploadMapperExpetion error = new UploadMapperExpetion(getTypeFile().getNombreArchivo(), "",
				Long.valueOf(getRow()) + 1, null, getDao().getError().getMessage());

		insertDetailAudit(error);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<String> getColumns() {
		return columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	public TypeFile getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(TypeFile typeFile) {
		this.typeFile = typeFile;
	}

	public T getObjectMapper() {
		return objectMapper;
	}

	public void setObjectMapper(T objectMapper) {
		this.objectMapper = objectMapper;
	}

	public Class<T> getDomainClass() {
		return domainClass;
	}

	public void setDomainClass(Class<T> domainClass) {
		this.domainClass = domainClass;
	}

	public U getEnumColumns() {
		return enumColumns;
	}

	public void setEnumColumns(U enumColumns) {
		this.enumColumns = enumColumns;
	}

	public List<U> getListEnumColumns() {
		return listEnumColumns;
	}

	public void setListEnumColumns(List<U> listEnumColumns) {
		this.listEnumColumns = listEnumColumns;
	}

	public List<String> getTitlesColumns() {
		return titlesColumns;
	}

	public void setTitlesColumns(List<String> titlesColumns) {
		this.titlesColumns = titlesColumns;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public List<String> getData2() {
		return data2;
	}

	public void setData2(List<String> data2) {
		this.data2 = data2;
	}

	public ArrayList<T> getListAllObject() {
		return listAllObject;
	}

	public void setListAllObject(ArrayList<T> listAllObject) {
		this.listAllObject = listAllObject;
	}

}
