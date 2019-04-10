package co.com.samtel.migration.impl;

import java.util.List;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.exception.MapperException;

public abstract class MigrateAbs<T, U> {

	private Long registrosOrigen;
	private Long registrosDestino;

	private Long iniProcess;
	private Long finProcess;

	private String deleteRecords;

	private List<T> listOrigen;
	private List<U> listDestino;

	// Numero de registros que se migrarar (bloque de información)
	private Long numRecBlock;

	private String strPrimaryKey;
	private String typeOrder; // Me indica si el orden es ascendente o descendente

	private TableMigration tableToMigrate;

	private ErrorDto error;

	// Objeto con el cual se actualizara el log de As400 al culminar el proceso de
	// migracion
	private LogActivador logActivador;

	abstract public IGenericDao getOrigen();

	abstract public void setOrigen(IGenericDao origen);

	abstract public IGenericDao getDestino();

	abstract public void setDestino(IGenericDao destino);

	abstract public List<U> mappearOrigen(List<T> origen) throws MapperException;

	abstract public U mappearOrigen(T origen) throws MapperException;

	abstract public Class<T> getClassOrigin();

	/**
	 * Metodo con el cual inicializo la migracion
	 */
	public void initializeMigration() {
		getOrigen().setTypeConection(TypeConections.AS400);
		getDestino().setTypeConection(TypeConections.SQLSERVER);
	}

	/**
	 * Metodo con el cual realiza las validaciones previas a la migracion - Realiza
	 * un distinct a la tabla a migrar por su id y compara el resultado con los
	 * datos a migrar y deben ser iguales - En el caso de que en el archivo de
	 * configutacion lo indique debe borrar los datos de la tabla
	 * @throws ControlledExeption 
	 */
	public void validateData(String valida) throws ControlledExeption {
		if ("Y".equalsIgnoreCase(valida) && "Y".equalsIgnoreCase(getDeleteRecords()) ) {
			getDestino().deleteAllRecords(getTableToMigrate());
		}
		if("Y".equalsIgnoreCase(valida)) {
			Long registrosDistinct = getOrigen().distinctRecordsToMigrate(getStrPrimaryKey() ,getTableToMigrate());
			if(!getRegistrosOrigen().equals(registrosDistinct)) {
				throw new ControlledExeption("Datos duplicados en la base de datos origen");
			}
			System.out.println(".:: Registros con distinct "+registrosDistinct+" ::.");
		}
	}

	/**
	 * Metodo con el cual genero la migracion
	 * 
	 * @return
	 */
	public Boolean generateMigration() {
		extractInformation();
		iterateSource();
		return Boolean.TRUE;
	}

	/**
	 * Metodo con el cual muevo la informacion
	 * 
	 * @param ini
	 * @param fin
	 */
	@SuppressWarnings("unchecked")
	public void extractInformation() {
		setListOrigen(getOrigen().findBlockData(getTypeOrder(), getIniProcess(), getIniProcess() + getNumRecBlock()));
	}

	/**
	 * Metodo con el cual itero la lista origen e inserto los registros en la base
	 * de datos destino
	 */
	public void iterateSource() {
		try {
			System.out.println(".::Numero de registros a Migrar:" + getListOrigen().size() + "::.");
			for (T item : getListOrigen()) {
				process(item, mappearOrigen(item));
			}
			getOrigen().nativeUpdateBlock(getTableToMigrate(), 0, getNumRecBlock().intValue());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Genero el proceso de migracion item a item
	 */
	public void process(T origenItem, U destinoItem) {
		getDestino().saveEntity(destinoItem);
	}

	/**
	 * Metodo con el cual cuento el numero de registros que se deben migrar de as400
	 * y el numero de registros migrados en sql
	 * 
	 */
	public void numRecordsSourceAndDestination() {
		initializeMigration();
		getOrigen().countRecordsTable();
		setRegistrosOrigen(getOrigen().getNumRecordsTable());

		getDestino().countRecordsTableAll();
		setRegistrosDestino(getDestino().getNumRecordsTableAll());
	}

	public Long getRegistrosOrigen() {
		return registrosOrigen;
	}

	public void setRegistrosOrigen(Long registrosOrigen) {
		this.registrosOrigen = registrosOrigen;
	}

	public Long getRegistrosDestino() {
		return registrosDestino;
	}

	public void setRegistrosDestino(Long registrosDestino) {
		this.registrosDestino = registrosDestino;
	}

	public Long getIniProcess() {
		return iniProcess;
	}

	public void setIniProcess(Long iniProcess) {
		this.iniProcess = iniProcess;
	}

	public Long getFinProcess() {
		return finProcess;
	}

	public void setFinProcess(Long finProcess) {
		this.finProcess = finProcess;
	}

	public String getStrPrimaryKey() {
		return strPrimaryKey;
	}

	public void setStrPrimaryKey(String strPrimaryKey) {
		this.strPrimaryKey = strPrimaryKey;
	}

	public List<T> getListOrigen() {
		return listOrigen;
	}

	public void setListOrigen(List<T> listOrigen) {
		this.listOrigen = listOrigen;
	}

	public List<U> getListDestino() {
		return listDestino;
	}

	public void setListDestino(List<U> listDestino) {
		this.listDestino = listDestino;
	}

	public Long getNumRecBlock() {
		return numRecBlock;
	}

	public void setNumRecBlock(Long numRecBlock) {
		this.numRecBlock = numRecBlock;
	}

	public TableMigration getTableToMigrate() {
		return tableToMigrate;
	}

	public void setTableToMigrate(TableMigration tableToMigrate) {
		this.tableToMigrate = tableToMigrate;
	}

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

	public LogActivador getLogActivador() {
		return logActivador;
	}

	public void setLogActivador(LogActivador logActivador) {
		this.logActivador = logActivador;
	}

	public String getTypeOrder() {
		return typeOrder;
	}

	public void setTypeOrder(String typeOrder) {
		this.typeOrder = typeOrder;
	}

	public void ejecutarHilo() {
		System.out.println(".::No aplica multihilos::.");
	}

	public String getDeleteRecords() {
		return deleteRecords;
	}

	public void setDeleteRecords(String deleteRecords) {
		this.deleteRecords = deleteRecords;
	}

}
