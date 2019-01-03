package co.com.samtel.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IExecuteMigration;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
public class LoginMB {

	private String usuario;

	@Inject
	IExecuteMigration executeMigration;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Metodo con el cual executo la migracion de Informacion
	 */
	public void executeMigration() {
		Boolean result = executeMigration.generateMigration(TypeMigration.PRUEBA);
		FacesContext context = FacesContext.getCurrentInstance();
		if (result) {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Migracion culminada con éxito"));
		} else {
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
							"Se ha generado un error al migrar la tabla "
									.concat(executeMigration.getMessageError().getTable().toString()).concat(" ")
									.concat(", Con la siguiente excepción: ")
									.concat(executeMigration.getMessageError().getMessage())));
		}

	}

	public void login() {
	}

}
