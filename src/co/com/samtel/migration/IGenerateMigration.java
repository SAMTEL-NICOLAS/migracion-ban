package co.com.samtel.migration;

import javax.ejb.Local;

import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TableMigration;

@Local
public interface IGenerateMigration {
	/**
	 * Metodo con el cual genero la migracion de toda una tabla
	 * 
	 * @return
	 */
	Boolean generateMigration();

	/**
	 * Metodo con el cual se obtiene el error generado al mapear una tabla
	 * 
	 * @return
	 */
	ErrorDto getError();

	/**
	 * Metodo con el cual obtengo el nombre de la tabla que se va ha migrar
	 * 
	 * @return
	 */
	TableMigration getTableToMigrate();

	/**
	 * Metodo con el cual tengo el registro del log activador del proceso
	 * 
	 * @param logActivador
	 */
	void setLogActivador(LogActivador logActivador);

	/**
	 * Metodo con el cual inicializo los registros que se deben migrar y los que han
	 * sido migrados
	 */
	void numRecordsSourceAndDestination();

	/**
	 * Metodo con el cual seteo el tipo de orden que tienen las tablas
	 * 
	 * @param typeOrder
	 */
	void setTypeOrder(String typeOrder);

	/**
	 * Metodo en el cual seteo el numero de registros que se van a procesar en
	 * bloque
	 * 
	 * @param numRecBlock
	 */
	void setNumRecBlock(Long numRecBlock);
	/**
	 * Metodo con el cual se ejecuta un hilo
	 */
	void ejecutarHilo();
	/**
	 * Metodo con el cual referencio el inicio del proceso de migracion
	 * @param iniProcess
	 */
	void setIniProcess(Long iniProcess);
}
