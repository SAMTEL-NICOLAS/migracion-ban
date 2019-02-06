package co.com.samtel.controller;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IExecuteMigration;
//import lombok.Getter;
//import lombok.Setter;

@ManagedBean
//@Getter
//@Setter
public class LoginMB {

	private String usuario;
	private String contrasena;

	@EJB(beanName = "executeMigration")
	IExecuteMigration executeMigration;

	public String validaDatosSesion() {
		String respuesta = "";

		try {
			if ("admin".equals(getUsuario()) && "admin".equals(getContrasena())) {
				respuesta = "inicio";
			} else {
				respuesta = "error ";
			}
		} catch (Exception e) {
			throw e;
		}

		return respuesta;
	}

	/**
	 * Metodo con el cual executo la migracion de Informacion
	 */
	public void executeMigration() {
		Boolean result = executeMigration.generateMigration(TypeMigration.PRUEBA, "admin");
		FacesContext context = FacesContext.getCurrentInstance();
		if (result) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success",
					"Migracion culminada con �xito, Id generado: ".concat(executeMigration.getIdAudit().toString())));
		} else {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
							"Se ha generado un error al migrar la tabla "
									.concat(executeMigration.getMessageError().getTable().toString()).concat(" ")
									.concat(", Con la siguiente excepci�n: ")
									.concat(executeMigration.getMessageError().getMessage())));
		}

	}

	public void login() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
