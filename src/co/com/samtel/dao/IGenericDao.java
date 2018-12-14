package co.com.samtel.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import co.com.samtel.enumeraciones.TypeConections;

@Local
public interface IGenericDao<T, PK extends Serializable> {
	
	/**
	 * Metodo con el cual extraigo un bloque de informacion
	 * @param ini
	 * @param fin
	 * @return
	 */
	public List<T> findBlockData(Integer ini, Integer fin);
	
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
}
