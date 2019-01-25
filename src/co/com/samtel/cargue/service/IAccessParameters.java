package co.com.samtel.cargue.service;

import javax.ejb.Local;

@Local
public interface IAccessParameters {
	
	public enum TYPEPARAMETER {
		URL, TYPE_FILE
	}
	/**
	 * Metodo con el cual obtengo un parametro por medio de su llave
	 * @param key
	 * @return
	 */
	String getParameter(TYPEPARAMETER key);

}
