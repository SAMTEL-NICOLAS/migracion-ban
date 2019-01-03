package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigTipoIdentClientes;

public interface IBigTipoIdentClientesDao extends IGenericDao<BigTipoIdentClientes, String> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
