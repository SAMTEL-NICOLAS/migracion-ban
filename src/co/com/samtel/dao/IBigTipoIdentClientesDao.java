package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigTipoIdentClientes;
import co.com.samtel.entity.sql.BigTipoIdentClientesId;

public interface IBigTipoIdentClientesDao extends IGenericDao<BigTipoIdentClientes, BigTipoIdentClientesId> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
