package co.com.samtel.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import co.com.samtel.dao.IBigRecogidosAsDao;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.migration.IGenerateMigration;
import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter @Setter
public class LoginMB {

	private String usuario;
	
	@EJB(beanName="bigRecorridosMigrate")
	IGenerateMigration bigRecorridosMigrate;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void login() {
		
		System.out.println(bigRecorridosMigrate.generateMigration());
		//bigRecorridosAsDao.findBlockData(ini, fin)
	}

}
