package co.com.samtel.dao;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.migration.IConsecutivo;

@Local
public interface IGenericDao<T, PK, ENTITYAS extends IConsecutivo> {

	/**
	 * Metodo con el cual extraigo un bloque de informacion
	 * 
	 * @param ini
	 * @param fin
	 * @return
	 */
	List<T> findBlockData(String order, Long ini, Long fin);

	/**
	 * Metodo con el cual se cuenta cuantos registros hay en la tabla que faltan por
	 * migrar
	 */
	public void countRecordsTable();

	/**
	 * Metodo con el cual se cuenta cuantos registros hay en total en la tabla
	 */
	public void countRecordsTableAll();

	/**
	 * Metodo con el cual seteo que tipo de conexion deseo usar
	 * 
	 * @param typeConections
	 */
	public void setTypeConection(TypeConections typeConections);

	/**
	 * Metodo con el cual persisto una lista de objetos
	 * 
	 * @param blockInformation
	 * @return
	 */
	Boolean saveBlockInformation(List<T> blockInformation);

	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * 
	 * @return
	 */
	Long getNumRecordsTable();

	Long getNumRecordsTableAll();

	/**
	 * Metodo con el cual obtengo los errores que se generan en los accesos a datos
	 * 
	 * @return
	 */
	ErrorDto getError();

	/**
	 * Metodo con el cual obtengo el valor maximo del id de la tabla
	 * 
	 * @return
	 */
	Long getMaxValue() throws ControlledExeption;

	/**
	 * Metodo con el cual se persiste una entidad
	 * 
	 * @param Entity
	 * @return
	 */
	Boolean saveEntity(T Entity);

	Boolean saveEntity2(List<T> listEntity, String nameFile);

	/**
	 * Metodo con el cual actualizo la entidad
	 * 
	 * @param entity
	 * @return
	 */

	Boolean updateEntity(T listEntity);

	/**
	 * Metodo con el cual actualizo en masa un bloque de registros
	 * 
	 * @param listEntity
	 * @return
	 */
	Boolean updateListEntity(List<T> listEntity);

	/**
	 * Metodo con el cual ejecuto un update sin intermedio de hibernate
	 * 
	 * @param listEntity
	 * @param tableName
	 * @return
	 */
	Boolean nativeUpdate(List<ENTITYAS> listEntity, TableMigration tableName);

	/**
	 * Metodo con el cual ejecuto un update sin intermedio de hibernate
	 * 
	 * @param listEntity
	 * @param tableName
	 * @return
	 */
	Boolean nativeUpdateSingle(ENTITYAS entity, TableMigration tableName);

	/**
	 * Metodo con el cual actualizo un bloque de información por medio de sql nativo
	 * 
	 * @param tableName
	 * @param ini
	 * @param fin
	 * @return
	 */
	Boolean nativeUpdateBlock(TableMigration tableName, Integer ini, Integer fin);
	/**
	 * Metodo con el cual se eliminan todos los registros de una tabla
	 * @return
	 */
	Boolean deleteAllRecords(TableMigration tableName);
	/**
	 * Metodo con el cual se realiza el conteo de los registros que se deben migrar realizando un distinct por medio de su llave primaria
	 * @return
	 */
	Long distinctRecordsToMigrate(String primaryKey,TableMigration tableName);
}
