package co.com.samtel.ldap;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Iterator;

import javax.ejb.Stateless;

import com.novell.ldap.LDAPAttribute;
import com.novell.ldap.LDAPAttributeSet;
import com.novell.ldap.LDAPConnection;
import com.novell.ldap.LDAPEntry;
import com.novell.ldap.LDAPException;
import com.novell.ldap.LDAPSearchResults;

import co.com.samtel.enumeraciones.TypeErrors;

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
	public Boolean generateConnection(String user, String password) throws UnsupportedEncodingException, LDAPException {
		return connectionManager(user, password);
	}

	@SuppressWarnings("deprecation")
	public Boolean connectionManager(String user, String password) throws LDAPException {
		Boolean continuar = Boolean.FALSE;

		setLogin(user.concat("@bancompartir.local"));
		setPassword(password);
		System.out.println("Usuario: ".concat(getLogin()));
		System.out.println("Clave: ".concat(getPassword()));

		try {
			lc = new LDAPConnection();
			lc.connect(getLdapHost(), getLdapPort());// Realiza conexion al LDAP.
			lc.bind(getLdapVersion(), getLogin(), getPassword());// Valida las credenciales del usuario.
			continuar = busquedaUsuario(user);
		} catch (LDAPException ex) {
			System.out.println("Se genero error LDAP :".concat(ex.getMessage()));
			setErrorLdap(ErrorDto.of(getLogin(), TypeErrors.LDAP, ex.getMessage()));
			ex.printStackTrace();
		}

		return continuar;
	}

	public Boolean busquedaUsuario(String usuarioFiltro) throws LDAPException {
		LDAPSearchResults searchResults;
		Boolean continuar = Boolean.FALSE;

		int searchScope = LDAPConnection.SCOPE_SUB;
		String filtro = "(sAMAccountName=" + usuarioFiltro + ")";

		String raiz = "OU=Bancompartir,DC=bancompartir,DC=local";
		// Realizara la busqueda en todo el Directorio Activof
		searchResults = lc.search(raiz, searchScope, filtro, null, false);

		if (existeUsuario(searchResults)) {
			System.out.println("Existe el usuario");
			continuar = Boolean.TRUE;
		} else {
			System.out.println("No existe el usuario");
			continuar = Boolean.FALSE;
		}

		return continuar;
	}

	public Boolean existeUsuario(LDAPSearchResults searchResults) {

		String baseGrupo = "CN=G_CRM_eIBS_BIGDATA,OU=Grupos,OU=Bancompartir,DC=bancompartir,DC=local";
		// Recorre Todos los Usuarios de la Base
		Boolean exiteUsuarioFiltro = Boolean.FALSE;

		while (searchResults.hasMore()) {
			LDAPEntry nextEntry = null;
			try {
				nextEntry = searchResults.next();
			} catch (LDAPException e) {
				e.printStackTrace();
				continue;
			}

			LDAPAttributeSet attributeSet = nextEntry.getAttributeSet();// Traera todos los atributos que tenga el
																		// usuario a consultar
			Iterator allAttributes = attributeSet.iterator();

			while (allAttributes.hasNext()) {// Recore los atributos del usuario
				LDAPAttribute attribute = (LDAPAttribute) allAttributes.next();
				Enumeration allValues = attribute.getStringValues();
				System.out.println("Clave: " + attribute.getName());

				if (allValues != null) {
					if ("memberOf".equalsIgnoreCase(attribute.getName())) {
						while (allValues.hasMoreElements()) {
							String value = (String) allValues.nextElement();// Obtiene los valores del atributo
							System.out.println("Valor: " + value);
							if (baseGrupo.equalsIgnoreCase(value)) {
								exiteUsuarioFiltro = Boolean.TRUE;
								System.out.println("Si existe el usuario en el grupo");
							}
						}
					}
				}
			}

			exiteUsuarioFiltro = Boolean.TRUE;
		}

		return exiteUsuarioFiltro;
	}

	/**
	 * Metodo que se encarga de inicializar los datos para realizar la conexion al
	 * LDAP.
	 */
	public void initializeData() {
		setLdapIp(ldapIp);
		setLdapPort(389);
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
	public LdapDto getLdapDto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorDto getMessageError() {
		// TODO Auto-generated method stub
		return null;
	}

}
