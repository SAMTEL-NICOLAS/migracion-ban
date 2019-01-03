package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.entity.sql.BigClienteProductoId;

public interface IBigClienteProductoDao extends IGenericDao<BigClienteProducto, BigClienteProductoId> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
