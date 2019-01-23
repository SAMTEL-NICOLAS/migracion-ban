package co.com.samtel.dao;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TypeConections;

@Local
public interface IGenericDao<T, PK > {
	
	/**
	 * Metodo con el cual extraigo un bloque de informacion
	 * @param ini
	 * @param fin
	 * @return
	 */
	public List<T> findBlockData(String idColum, Integer fin, Integer offset);
	
	/**
	 * Metodo con el cual se cuenta cuantos registros hay en la tabla
	 */
	public void countRecordsTable();
	/**
	 * Metodo con el cual seteo que tipo de conexion deseo usar
	 * @param typeConections
	 */
	public void setTypeConection(TypeConections typeConections );
	/**
	 * Metodo con el cual persisto una lista de objetos
	 * @param blockInformation
	 * @return
	 */
	Boolean saveBlockInformation(List<T> blockInformation);
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
	/**
	 * Metodo con el cual obtengo los errores que se generan en los accesos a datos
	 * @return
	 */
	ErrorDto getError();
	/**
	 * Metodo con el cual  obtengo el valor maximo del id de la tabla
	 * @return
	 */
	Long getMaxValue();
	/**
	 * Metodo con el cual se persiste una entidad
	 * @param Entity
	 * @return
	 */
	Boolean saveEntity(T Entity);
	/**
	 * Metodo con el cual actualizo la entidad
	 * @param entity
	 * @return
	 */
	Boolean updateEntity(T listEntity);
	/**
	 * Metodo con el cual actualizo en masa un bloque de registros
	 * @param listEntity
	 * @return
	 */
	Boolean updateListEntity(List<T> listEntity);
}
