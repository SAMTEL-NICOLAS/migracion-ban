package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigBarrios;
import co.com.samtel.entity.sql.BigBarriosId;

public interface IBigBarriosDao extends IGenericDao<BigBarrios, BigBarriosId> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
