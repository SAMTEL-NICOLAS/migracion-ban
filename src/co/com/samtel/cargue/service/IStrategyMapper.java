package co.com.samtel.cargue.service;

import javax.ejb.Local;

import co.com.samtel.cargue.exception.MapperException;

@Local
public interface IStrategyMapper<T> {
	/**
	 * Metodo con el cual realizo el mapeo de un string y lo mappeo a un objeto
	 */
	Boolean executeUpload(String delimiter) throws MapperException;

	/**
	 * Obtengo el objeto mapeado
	 * 
	 * @return
	 */
	T getObjectMapper();

	/**
	 * Metodo con el cual seteo la información para luego mappearlo
	 * 
	 * @param data
	 */
	void setData(String data);

	/**
	 * Metodo con el cual seteo la url en donde se encuentra el archivo a procesar
	 * @param url
	 */
	void setUrl(String url);

}
