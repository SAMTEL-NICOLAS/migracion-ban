package co.com.samtel.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IGenerateMigration;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter @Setter
public class LoginMB {

	private String usuario;
	
	@EJB(beanName="factoryMigration")
	IFactoryMigration factoryMigration;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void login() {
		List<IGenerateMigration> listTablesToMigrate = factoryMigration.setMigration(TypeMigration.PRUEBA).build();
		//Metodo con el cual genero la migracion de las tablas dependenciendo el tipo de proceso que se realiza
		for(IGenerateMigration item : listTablesToMigrate) {
			System.out.println(item.generateMigration());
		}
	}

}
