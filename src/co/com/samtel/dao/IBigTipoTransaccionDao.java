package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigTipoTransaccion;

public interface IBigTipoTransaccionDao extends IGenericDao<BigTipoTransaccion, String> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
