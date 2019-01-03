package co.com.samtel.migration.impl;

import java.util.List;

import javax.ejb.EJB;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.exception.MapperException;
import co.com.samtel.exception.NoRecordsFoundException;
import co.com.samtel.service.IParametrosService;

public abstract class MigrateAbs<T, U> {

	@EJB
	IParametrosService parametrosService;

	private Long numRecords;
	private Long numRecBlock;
	private String strPrimaryKey;
	private TableMigration tableToMigrate;
	private List<T> listOrigen;
	private List<U> listDestino;
	private ErrorDto error;

	abstract public IGenericDao getOrigen();

	abstract public void setOrigen(IGenericDao origen);

	abstract public IGenericDao getDestino();

	abstract public void setDestino(IGenericDao destino);

	abstract public List<U> mappearOrigen(List<T> origen) throws MapperException;

	public String getStrPrimaryKey() {
		return strPrimaryKey;
	}

	public void setStrPrimaryKey(String strPrimaryKey) {
		this.strPrimaryKey = strPrimaryKey;
	}

	/**
	 * Metodo con el cual inicializo la migracion
	 */
	public void initializeMigration() {
		getOrigen().setTypeConection(TypeConections.AS400);
		getDestino().setTypeConection(TypeConections.SQLSERVER);
		// Obtengo el numero de registros origen
		getOrigen().countRecordsTable();
		setNumRecords(getOrigen().getNumRecordsTable());
		// Obtengo el numero de registros que se desean por bloque
		setNumRecBlock(parametrosService.getNumRecordsToProcess());
	}

	/**
	 * Metodo con el cual genero la migracion
	 * 
	 * @return
	 */
	public Boolean generateMigration() {
		initializeMigration();
		System.out.println(".:: Inicio de la migracion, Numero de registros a migrar: ".concat(getNumRecords().toString()));
		try {
			// Itero las veces que sea necesario
			for (int i = 0; i <= getNumRecords(); i += getNumRecBlock()) {
				extractInformation(getStrPrimaryKey(), i, getNumRecBlock().intValue());
				setListDestino(mappearOrigen(getListOrigen()));
				persistInformation();
				System.out.println(".:: Registros Migrados: ".concat(String.valueOf(i)).concat(" ::."));
			}
		} catch (MapperException e) {
			e.printStackTrace();
			setError(ErrorDto.of(getTableToMigrate(), TypeErrors.MAPPER_EROR, e.getMessage()));
			return Boolean.FALSE;
		} catch (NoRecordsFoundException e ) {
			e.printStackTrace();
			setError(ErrorDto.of(getTableToMigrate(), TypeErrors.NO_RECORDSFOUND, e.getMessage()));
			return Boolean.FALSE;
		} catch (ControlledExeption  e) {
			e.printStackTrace();
			getError().setTable(getTableToMigrate());
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	/**
	 * Metodo con el cual muevo la informacion
	 * 
	 * @param ini
	 * @param fin
	 */
	@SuppressWarnings("unchecked")
	public void extractInformation(String idColum, Integer fin, Integer offset) {
		setListOrigen(getOrigen().findBlockData(idColum, fin, offset));
	}

	/**
	 * Metodo con el cual persisto la informacion
	 * 
	 * @throws NoRecordsFoundException
	 * 
	 * @throws MapperException
	 */
	@SuppressWarnings("unchecked")
	public void persistInformation() throws NoRecordsFoundException, ControlledExeption {
		if (getListDestino() != null && !getListDestino().isEmpty()) {
			if (!getDestino().saveBlockInformation(listDestino)) {
				setError(getDestino().getError());
				throw new ControlledExeption("Error al persistir");
			}
		} else {
			throw new NoRecordsFoundException("Sin Registros de origen");
		}

	}

	public IParametrosService getParametrosService() {
		return parametrosService;
	}

	public void setParametrosService(IParametrosService parametrosService) {
		this.parametrosService = parametrosService;
	}

	public Long getNumRecords() {
		return numRecords;
	}

	public void setNumRecords(Long numRecords) {
		this.numRecords = numRecords;
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

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}

}
