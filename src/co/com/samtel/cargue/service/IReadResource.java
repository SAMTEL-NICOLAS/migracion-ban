package co.com.samtel.cargue.service;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IReadResource {
	/**
	 * Metodo con el cual seteo la url donde se encuentra el recurso a leer
	 * @param url
	 */
	void setUrl(String url);
	/**
	 * Metodo con el cual leo un archivo
	 * @return
	 */
	Boolean readFile();
	/**
	 * Metodo con el cual obtengo las filas del archivo
	 * @return
	 */
	List<String> getRows();
}
