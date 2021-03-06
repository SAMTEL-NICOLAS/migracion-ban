package co.com.samtel.cargue.service;

import javax.ejb.Local;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.exception.UploadMapperExpetion;

@Local
public interface IExecutePersistTable {
	/**
	 * Metodo en el cual ejecuto el proceso para persistir la tabla que corresponde
	 * 
	 * @param url
	 * @return
	 */

	Boolean executeProcess(String url, TypeFile typeFile, String delimiter, String nameFile, Integer row) throws MapperException,UploadMapperExpetion;

}
