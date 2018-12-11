package co.com.samtel.enumeraciones;

public enum TypeConections {

	SQLSERVER("sqlserver", "SqlServerHibernate.cfg.xml"), AS400("as400", "As400Hibernate.cfg.xml");

	private String value;
	private String config;

	private TypeConections(String value, String config) {
		this.value = value;
		this.config = config;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

}
