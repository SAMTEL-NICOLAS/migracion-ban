package co.com.samtel.service;

import javax.ejb.Local;

@Local
public interface IParametrosService {
	/**
	 * Metodo con el cual se obtiene el numero de registros que se procesaran por
	 * bloque
	 * 
	 * @return
	 */
	Long getNumRecordsToProcess();
}
