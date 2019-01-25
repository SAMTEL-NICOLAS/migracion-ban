package co.com.samtel.cargue.service;

import java.io.InputStream;

import javax.ejb.Local;

@Local
public interface IManageResource {
	/**
	 * Metodo con el cual copio un csv en el servidor
	 * @param resource
	 * @return
	 */
	Boolean copyResourceServer(InputStream resource);
	/**
	 * Metodo con el cual obtengo la url destino del servidor
	 * @return
	 */
	String getUrlDestination();

}
