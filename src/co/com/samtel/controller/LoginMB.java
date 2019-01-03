package co.com.samtel.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import co.com.samtel.dao.IGenericDao;
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
	
	@EJB(beanName="bigRecorridosMigrate")
	IGenerateMigration bigRecorridosMigrate;
	
	@EJB(beanName="bigRecuperaCarteraCastigadaMigrate")
	IGenerateMigration bigRecuperaCarteraCastigadaMigrate;
	
	@EJB(beanName="bigClienteProductoMigrate")
	IGenerateMigration bigClienteProductoMigrate;
	
	@EJB(beanName="bigActividadEconomicaInternaMigrate")
	IGenerateMigration bigActividadEconomicaInternaMigrate;	

	@EJB(beanName="bigCiudadesMigrate")
	IGenerateMigration bigCiudadesMigrate;
	
	@EJB(beanName="bigTipoIdentClientesMigrate")
	IGenerateMigration bigTipoIdentClientesMigrate;	

	@EJB(beanName="bigCodigosAbogadoMigrate")
	IGenerateMigration bigCodigosAbogadoMigrate;
	
	@EJB(beanName="bigTipoTransaccionMigrate")
	IGenerateMigration bigTipoTransaccionMigrate;
		
	@EJB(beanName="bigBarriosMigrate")
	IGenerateMigration bigBarriosMigrate;

	
	
	@EJB(beanName="bigActivosMigrate")
	IGenerateMigration bigActivosMigrate;
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void login() {
//		List<IGenerateMigration> listTablesToMigrate = factoryMigration.setMigration(TypeMigration.PRUEBA).build();
//		//Metodo con el cual genero la migracion de las tablas dependenciendo el tipo de proceso que se realiza
//		for(IGenerateMigration item : listTablesToMigrate) {
//			System.out.println(item.generateMigration());
//		}
		
//		bigRecorridosMigrate.generateMigration();
//		bigRecuperaCarteraCastigadaMigrate.generateMigration();
//		bigClienteProductoMigrate.generateMigration();
//		bigActividadEconomicaInternaMigrate.generateMigration();
//		bigCiudadesMigrate.generateMigration();
//		bigTipoIdentClientesMigrate.generateMigration();
		//bigCodigosAbogadoMigrate.generateMigration();
		bigTipoTransaccionMigrate.generateMigration();
	//	bigBarriosMigrate.generateMigration();
		//bigActivosMigrate.generateMigration();
	}

}
