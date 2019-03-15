package co.com.samtel.ldap;

import java.io.UnsupportedEncodingException;

import javax.ejb.Local;

import com.novell.ldap.LDAPException;

import co.com.samtel.ldap.ErrorDto;

@Local
public interface ILdap {

	/**
	 * Metodo el cual se encarga de realizar la conexion del usuario con el LDAP.
	 * 
	 * @param user
	 * @param password
	 * @return
	 * @throws LDAPException
	 * @throws UnsupportedEncodingException
	 */
	public Boolean generateConnection(String user, String password) throws UnsupportedEncodingException, LDAPException;

	/**
	 * Metodo con el cual obtendre el error que se genero al realizar la conexion
	 * con el LDAP.
	 * 
	 * @return
	 */
	public ErrorDto getMessageError();

	/**
	 * Metodo con el cual obtendre el objeto del LDAP del usuario.
	 * 
	 * @return
	 */
	public LdapDto getLdapDto();
}
