package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigActivos;
import co.com.samtel.entity.sql.BigActivosId;

public interface IBigActivosDao extends IGenericDao<BigActivos, BigActivosId> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
