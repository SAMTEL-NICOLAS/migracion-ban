package co.com.samtel.cargue.service;

import javax.ejb.Local;

import co.com.samtel.cargue.exception.MapperException;

@Local
public interface IStrategyMapper<T> {
	/**
	 * Metodo con el cual realizo el mapeo de un string y lo mappeo a un objeto
	 */
	void mapper(String delimiter)throws MapperException;
	/**
	 * Obtengo el objeto mapeado 
	 * @return
	 */
	T getObjectMapper();
	/**
	 * Metodo con el cual seteo la información para luego mappearlo
	 * @param data
	 */
	void setData(String data);

}
