package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigTipoTransaccion;
import co.com.samtel.entity.sql.BigTipoTransaccionId;

public interface IBigTipoTransaccionDao extends IGenericDao<BigTipoTransaccion, BigTipoTransaccionId> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
