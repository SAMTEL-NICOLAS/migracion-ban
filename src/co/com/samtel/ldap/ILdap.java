package co.com.samtel.ldap;

import javax.ejb.Local;

import co.com.samtel.ldap.ErrorDto;

@Local
public interface ILdap {

	/**
	 * Metodo el cual se encarga de realizar la conexion del usuario con el LDAP.
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	Boolean generateConnection(String user, String password);

	/**
	 * Metodo con el cual obtendre el error que se genero al realizar la conexion
	 * con el LDAP.
	 * 
	 * @return
	 */
	ErrorDto getMessageError();

	/**
	 * Metodo con el cual obtendre el objeto del LDAP del usuario.
	 * 
	 * @return
	 */
	LdapDto getLdapDto();
}
