package co.com.samtel.cargue.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import co.com.samtel.cargue.enumeraciones.ErrorMapperType;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.IColumn;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.exception.dto.ErrorMapperDto;
import co.com.samtel.cargue.service.IStrategyMapper;

public abstract class AbsStrategyMapper<T, U extends IColumn> implements IStrategyMapper<T> {

	private String data;

	private Class<T> domainClass = initDomainClass();

	private List<String> columns;

	private TypeFile typeFile;

	private U enumColumns;
	
	private List<U> listEnumColumns;

	private T objectMapper;
	
	private String DELIMITER;
	
	abstract public void init();

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

	public void mapper(String delimiter) throws MapperException {
		this.DELIMITER = delimiter;
		initialize();
		splitData();
		validateStructure();
		mapperObject();
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
		String[] columnsVector = data.split(DELIMITER);
		if (columnsVector.length == 0) {
			throw new MapperException(ErrorMapperDto.of(ErrorMapperType.EMPTY_DATA, typeFile, null, "Sin Información"));
		}

		for (String item : columnsVector) {
			if (getColumns() == null) {
				setColumns(new ArrayList<String>());
			}
			columns.add(item);
		}
	}

	/**
	 * Metodo con el cual valido si la fila tiene la estructura correcta
	 * 
	 * @throws MapperException
	 */
	public void validateStructure() throws MapperException {
		if (getColumns().size() != getTypeFile().getNumColumns().intValue()) {
			throw new MapperException(
					ErrorMapperDto.of(ErrorMapperType.WRONG_STRUCTURE, typeFile, null, "Estructura incorrecta"));
		}
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

	public void mapperObject() {
		try {
			for (U item : getListEnumColumns()) {

				Method method = getDomainClass().getMethod("set" + item.getNombreColumna(), item.getTypeColumn());

				method.invoke(getObjectMapper(), getColumns().get(item.getIndice()));

			}
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
