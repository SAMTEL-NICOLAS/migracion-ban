package co.com.samtel.ldap;

import javax.ejb.Stateless;
import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPException;
import java.io.UnsupportedEncodingException;
import com.novell.ldap.LDAPSearchResults;
import co.com.samtel.enumeraciones.TypeErrors;
import java.util.logging.Logger;
import java.util.logging.Level;

@Stateless(name = "conexionLdap")
public class ConexionLdap implements ILdap {
	
	private int ldapPort;
	private int ldapVersion;
	private LDAPConnection lc;
	private String login;
	private String password;
	private String ldapHost;
	private String ldapIp;

	private ErrorDto errorLdap;

	public ConexionLdap() {
		initializeData();
	}

	@Override
	public Boolean generateConnection(String user, String password) {
		Boolean ldapOk = Boolean.FALSE;
		try {
			conn(user,password);
			ldapOk = Boolean.TRUE;
		} catch (Exception e) {
			ldapOk = Boolean.FALSE;
			setErrorLdap(ErrorDto.of(user, TypeErrors.CONNECTION_DATA_BASE, e.getMessage()));
		}
		return ldapOk;
	}

	public void conn(String user , String password) throws LDAPException, UnsupportedEncodingException {
		login = "uid=" + user + ",CN=G_CRM_eIBS_BIGDATA,OU=Grupos,OU=Bancompartir,DC=bancompartir,DC=local";	
		System.out.println("" + login);
		ldapPort = LDAPConnection.DEFAULT_PORT;
		System.out.println("puerto: " + ldapPort);
		ldapVersion = LDAPConnection.LDAP_V3;
		System.out.println("Vesion: " + ldapVersion);
		System.out.println("HOST: " + getLdapHost());
		try {
			lc = new LDAPConnection();
			lc.connect(getLdapHost(), ldapPort);
			System.out.println("====Conectado al Servidor LDAP====");
			lc.bind(ldapVersion, login, password.getBytes("UTF8"));
			System.out.println("Autenticado en el servidor....");
		} catch (UnsupportedEncodingException ex) {
			Logger.getLogger(ConexionLdap.class.getName()).log(Level.SEVERE, null, ex);
		} catch (LDAPException ex) {
			Logger.getLogger(ConexionLdap.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
	public void connectionManager(String user) throws LDAPException, UnsupportedEncodingException {

		LDAPSearchResults searchResults;
		int searchScope = LDAPConnection.SCOPE_SUB;
		try {
			lc = new LDAPConnection();
			lc.connect(getLdapHost(), LDAPConnection.DEFAULT_PORT);// Realiza conexion al LDAP
			System.out.println("====Conectado al Servidor LDAP====");
			lc.bind(getLdapVersion(), getLogin(), getPassword());// Valida las credenciales del usuario Administrador
			System.out.println("Autenticado en el servidor....");
			String filtro = "(uid=" + user + ")";// Realiza el filtro en el LDAP por el atributo uid el cual es el
													// nombre
													// del usuario
			String raiz = "o=unal.edu.co";

		} catch (LDAPException ex) {
			Logger.getLogger(ConexionLdap.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Metodo que se encarga de inicializar los datos para realizar la conexion al
	 * LDAP.
	 */
	public void initializeData() {
		setLdapIp(ldapIp);
		setLdapPort(ldapPort);
		setLdapVersion(LDAPConnection.LDAP_V3);
		setLogin(login);
		setPassword(password);
		setLdapHost("192.168.0.83");
	}

	public int getLdapPort() {
		return ldapPort;
	}

	public void setLdapPort(int ldapPort) {
		this.ldapPort = ldapPort;
	}

	public int getLdapVersion() {
		return ldapVersion;
	}

	public void setLdapVersion(int ldapVersion) {
		this.ldapVersion = ldapVersion;
	}

	public LDAPConnection getLc() {
		return lc;
	}

	public void setLc(LDAPConnection lc) {
		this.lc = lc;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLdapHost() {
		return ldapHost;
	}

	public void setLdapHost(String ldapHost) {
		this.ldapHost = ldapHost;
	}

	public ErrorDto getErrorLdap() {
		return errorLdap;
	}

	public void setErrorLdap(ErrorDto errorLdap) {
		this.errorLdap = errorLdap;
	}

	public String getLdapIp() {
		return ldapIp;
	}

	public void setLdapIp(String ldapIp) {
		this.ldapIp = ldapIp;
	}

	@Override
	public ErrorDto getMessageError() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LdapDto getLdapDto() {
		// TODO Auto-generated method stub
		return null;
	}
}
