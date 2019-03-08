package co.com.samtel.ldap;

import co.com.samtel.enumeraciones.TypeErrors;

public class ErrorDto {
	
	private String usuario;
	private TypeErrors typeError;
	private String message;

	public static ErrorDto of() {
		return new ErrorDto();
	}

	public static ErrorDto of(String usuario, TypeErrors typeError, String message) {
		return new ErrorDto(usuario, typeError, message);
	}

	public ErrorDto(String usuario, TypeErrors typeError, String message) {
		super();
		this.usuario = usuario;
		this.typeError = typeError;
		this.message = message;
	}

	public ErrorDto() {
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public TypeErrors getTypeError() {
		return typeError;
	}

	public void setTypeError(TypeErrors typeError) {
		this.typeError = typeError;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
