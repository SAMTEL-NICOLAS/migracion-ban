package co.com.samtel.ldap;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

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
	private String baseUsuario;
	private String atributoNombre;
	private String raiz;
	private String baseGrupo;

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

		setLogin(user.concat(getBaseUsuario()));
		setPassword(password);
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

		int searchScope = LDAPConnection.SCOPE_SUB;
		String filtro = "(".concat(getAtributoNombre()).concat("=").concat(usuarioFiltro).concat(")");
		// Realizara la busqueda en todo el Directorio Activo
		searchResults = lc.search(getRaiz(), searchScope, filtro, null, false);

		return existeUsuario(searchResults);
	}

	public Boolean existeUsuario(LDAPSearchResults searchResults) {
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
				if (allValues != null) {
					if ("memberOf".equalsIgnoreCase(attribute.getName())) {
						while (allValues.hasMoreElements()) {
							String value = (String) allValues.nextElement();// Obtiene los valores del atributo
							System.out.println("Valor: " + value);
							if (getBaseGrupo().equalsIgnoreCase(value)) {
								exiteUsuarioFiltro = Boolean.TRUE;
							}
						}
					}
				}
			}

		}

		return exiteUsuarioFiltro;
	}

	/**
	 * Metodo que se encarga de inicializar los datos para realizar la conexion al
	 * LDAP.
	 */
	public void initializeData() {
		setLdapVersion(LDAPConnection.LDAP_V3);
		cargaDatosIniciales();
	}

	private void cargaDatosIniciales() {
		InputStream inputStream = null;
		Properties prop = new Properties();
		String propFileName = "general.properties";

		try {
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			setLdapHost(prop.getProperty("host"));
			setLdapPort(Integer.valueOf(prop.getProperty("puerto")));
			setBaseUsuario(prop.getProperty("baseUsuario"));
			setAtributoNombre(prop.getProperty("atributoNombre"));
			setRaiz(prop.getProperty("raiz"));
			setBaseGrupo(prop.getProperty("baseGrupo"));

		} catch (Exception e) {
			e.printStackTrace();
		}

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

	public String getBaseUsuario() {
		return baseUsuario;
	}

	public void setBaseUsuario(String baseUsuario) {
		this.baseUsuario = baseUsuario;
	}

	public String getAtributoNombre() {
		return atributoNombre;
	}

	public void setAtributoNombre(String atributoNombre) {
		this.atributoNombre = atributoNombre;
	}

	public String getRaiz() {
		return raiz;
	}

	public void setRaiz(String raiz) {
		this.raiz = raiz;
	}

	public String getBaseGrupo() {
		return baseGrupo;
	}

	public void setBaseGrupo(String baseGrupo) {
		this.baseGrupo = baseGrupo;
	}

	@Override
	public LdapDto getLdapDto() {
		return null;
	}

	@Override
	public ErrorDto getMessageError() {
		return getErrorLdap();
	}

}
