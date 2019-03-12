package co.com.samtel.dto;

import java.util.List;

import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.ldap.LdapDto;

public class ResponseRest<T> {

	private TypeErrors typeError;
	private String message;
	private T response;
	private List<T> listResponse;
	private LdapDto ldapDto;

	public ResponseRest(TypeErrors typeError, String message, List<T> listResponse) {
		super();
		this.typeError = typeError;
		this.message = message;
		this.listResponse = listResponse;
	}

	public ResponseRest(TypeErrors typeError, String message, T response) {
		super();
		this.typeError = typeError;
		this.message = message;
		this.response = response;
	}

	public ResponseRest(TypeErrors typeError, String message, LdapDto ldapDto) {
		super();
		this.typeError = typeError;
		this.message = message;		
		this.ldapDto = ldapDto;
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

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	public List<T> getListResponse() {
		return listResponse;
	}

	public void setListResponse(List<T> listResponse) {
		this.listResponse = listResponse;
	}

}
