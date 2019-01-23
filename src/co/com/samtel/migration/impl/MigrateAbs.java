package co.com.samtel.migration.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.ejb.EJB;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.exception.MapperException;
import co.com.samtel.exception.NoRecordsFoundException;
import co.com.samtel.exception.TimeOutCustomException;
import co.com.samtel.service.IParametrosService;

public abstract class MigrateAbs<T, U> {

	private Class<T> typeOrigin;
	private T origin;

	@EJB
	IParametrosService parametrosService;
	// Numero de registros a migrar
	private Long numRecords;
	// Numero de registros migrados
	private Long numRecMig;
	// Numero de registros que se migrarar (bloque de información)
	private Long numRecBlock;

	private String strPrimaryKey;
	private TableMigration tableToMigrate;
	private List<T> listOrigen;
	private List<U> listDestino;
	private ErrorDto error;

	// Objeto con el cual se actualizara el log de As400 al culminar el proceso de
	// migracion
	private LogActivador logActivador;

	abstract public IGenericDao getOrigen();

	abstract public void setOrigen(IGenericDao origen);

	abstract public IGenericDao getDestino();

	abstract public void setDestino(IGenericDao destino);

	abstract public List<U> mappearOrigen(List<T> origen) throws MapperException;
	
	abstract public Class<T> getClassOrigin();

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
		System.out.println(
				".:: Inicio de la migracion, Numero de registros a migrar: ".concat(getNumRecords().toString()));
		//Inicio contador para medir tiempo de la transacción
		long startTime = System.currentTimeMillis();
		try {
			// Itero las veces que sea necesario
			for (int i = 0; i <= getNumRecords(); i += getNumRecBlock()) {
				//Calculo tiempo que lleva la operación de migración
				long endTime = System.currentTimeMillis() - startTime;
				//Superior a un minuto
				if(endTime > 60000 ) {
						throw new TimeOutCustomException("Time Out Superado: 60000 ms");
				}
				extractInformation(getStrPrimaryKey(), getNumRecBlock().intValue());
				setListDestino(mappearOrigen(getListOrigen()));
				persistInformation();
				updateMigrateOrigin();
				System.out.println(".:: Registros Migrados: ".concat(String.valueOf(i)).concat(" ::."));
			}
		} catch (MapperException e) {
			e.printStackTrace();
			setError(ErrorDto.of(getTableToMigrate(), TypeErrors.MAPPER_EROR, e.getMessage()));
			return Boolean.FALSE;
		} catch (NoRecordsFoundException e) {
			e.printStackTrace();
			setError(ErrorDto.of(getTableToMigrate(), TypeErrors.NO_RECORDSFOUND, e.getMessage()));
			return Boolean.FALSE;
		} catch (ControlledExeption e) {
			e.printStackTrace();
			getError().setTable(getTableToMigrate());
			return Boolean.FALSE;
		} catch (TimeOutCustomException e) {
			e.printStackTrace();
			setError(ErrorDto.of(getTableToMigrate(), TypeErrors.TIME_OUT_CUSTOM, e.getMessage()));
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
	public void extractInformation(String idColum, Integer offset) {
		setListOrigen(getOrigen().findBlockData(idColum,  offset));
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
			for (U item : getListDestino()) {
				if (!getDestino().saveEntity(item)) {
					setError(getDestino().getError());
					throw new ControlledExeption("Error al persistir");
				} else {
					setNumRecMig(getNumRecMig() + 1);
				}
			}
		} else if (getNumRecords().equals(numRecMig)) {
			setError(ErrorDto.of(getTableToMigrate(), TypeErrors.SUCCESS, "Ok"));
		} else {
			throw new NoRecordsFoundException("Sin Registros de origen");
		}

	}

	/**
	 * Metodo con el cual marco los registros migrados
	 * 
	 * @throws ControlledExeption
	 */
	@SuppressWarnings("all")
	public void updateMigrateOrigin() throws ControlledExeption {
		if (getListOrigen() != null && !getListOrigen().isEmpty()) {
			for (T item : getListOrigen()) {
				item = adicionoParametroMigrate(item);
			}
			if (! getOrigen().updateListEntity(getListOrigen())) {
				setError(getDestino().getError());
				throw new ControlledExeption("Error al actualizar a migrado el origen");
			}
		}
	}

	/**
	 * Metodo con el cual cambio el estado del registro
	 */
	public T adicionoParametroMigrate(T item) {
		try {
			Method method = getClassOrigin().getMethod("setMigrado", String.class);
			method.invoke(item, "S");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return item;
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

	public Long getNumRecMig() {
		return numRecMig;
	}

	public void setNumRecMig(Long numRecMig) {
		this.numRecMig = numRecMig;
	}

	public LogActivador getLogActivador() {
		return logActivador;
	}

	public void setLogActivador(LogActivador logActivador) {
		this.logActivador = logActivador;
	}

}
