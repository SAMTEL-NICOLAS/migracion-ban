package co.com.samtel.cargue.service;

import javax.ejb.Local;

import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.exception.UploadMapperExpetion;

@Local
public interface IStrategyMapper<T> {
	/**
	 * Metodo con el cual realizo el mapeo de un string y lo mappeo a un objeto
	 */
	Boolean executeUpload(String delimiter) throws MapperException,  UploadMapperExpetion;

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
	/**
	 * Metodo con el cual seteo la fila en la cual va la migracion
	 * @param row
	 */
	void setRow(Integer row);
	/**
	 * Metodo con el cual obtengo la fila de la migracion
	 * @return
	 */
	Integer getRow();
	
	

}
