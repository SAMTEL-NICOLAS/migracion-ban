package co.com.samtel.dao;

import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.as400.BigRecogidosIdAs;

public interface IBigRecogidosAsDao extends IGenericDao<BigRecogidosAs, BigRecogidosIdAs>{
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}	
