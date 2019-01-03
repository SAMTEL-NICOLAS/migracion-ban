package co.com.samtel.enumeraciones;

public enum TypeErrors {
	
	CONSTRAINT_VIOLATION("001","HIBERNATE"), SUCCESS("000", "APLICACION"), NO_RECORDSFOUND("002", "ORIGEN"), MAPPER_EROR("003", "CAROLINA");

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
