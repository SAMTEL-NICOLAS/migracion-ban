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
}
