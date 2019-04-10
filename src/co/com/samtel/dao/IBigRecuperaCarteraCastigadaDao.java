package co.com.samtel.dao;

import co.com.samtel.entity.sql.BigRecuperaCarteraCastigada;
import co.com.samtel.entity.sql.BigRecuperaCarteraCastigadaId;

public interface IBigRecuperaCarteraCastigadaDao extends IGenericDao<BigRecuperaCarteraCastigada, BigRecuperaCarteraCastigadaId, DummyConsecutivo> {
	/**
	 * Metodo con el cual obtengo el numero de registros en la tabla
	 * @return
	 */
	Long getNumRecordsTable();
}
