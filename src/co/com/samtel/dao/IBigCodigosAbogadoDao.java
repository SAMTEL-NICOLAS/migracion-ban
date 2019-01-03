package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigCodigosAbogado;

public interface IBigCodigosAbogadoDao extends IGenericDao<BigCodigosAbogado, String> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}