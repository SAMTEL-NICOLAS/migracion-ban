package co.com.samtel.enumeraciones;

public enum TypeErrors {
	
	SUCCESS("000", "APLICACION"), 
	CONSTRAINT_VIOLATION("001","HIBERNATE"), 
	NO_RECORDSFOUND("002", "ORIGEN"), 
	MAPPER_EROR("003", "ERROR_MAPEO"),
	TIME_OUT_CUSTOM("004", "TIME_OUT"),
	CONNECTION_DATA_BASE("005", "CONNECTION_DATA_BASE"),
	DATAEXCEPTION("006", "ERROR DATA"),
	NO_RECORDS_FOUND("007","SIN_REGISTROS_ORIGEN");

	private String code;
	private String type;

	private TypeErrors(String code, String type) {
		this.code = code;
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
