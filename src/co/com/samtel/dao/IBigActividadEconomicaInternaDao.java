package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigActividadEconomicaInterna;

public interface IBigActividadEconomicaInternaDao  extends IGenericDao<BigActividadEconomicaInterna, String,DummyConsecutivo> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
