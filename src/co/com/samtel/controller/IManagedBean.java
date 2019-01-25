package co.com.samtel.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public interface IManagedBean {
	
	public enum TYPEMESSAGE {
		SUCCESS, WARNING, ERROR
	};
	
	default void addMessage(TYPEMESSAGE type, String message) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(type.toString(), message ));
	}

}
