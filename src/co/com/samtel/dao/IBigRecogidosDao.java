package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.entity.sql.BigRecogidosId;

public interface IBigRecogidosDao extends IGenericDao<BigRecogidos, BigRecogidosId>{
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}	
