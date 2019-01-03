package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigCiudades;

public interface IBigCiudadesDao extends IGenericDao<BigCiudades, String> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
