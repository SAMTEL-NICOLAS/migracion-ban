package co.com.samtel.migration.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IGenerateMigration;

@Stateless(name="factoryMigration")
public class FactoryMigration implements IFactoryMigration {
	
	private TypeMigration typeMigration;
	
	@EJB(beanName="bigRecorridosMigrate")
	IGenerateMigration bigRecorridosMigrate;
	
	@EJB(beanName="bigRecuperaCarteraCastigadaMigrate")
	IGenerateMigration bigRecuperaCarteraCastigadaMigrate;
	
	/*@EJB(beanName="bigClienteProductoMigrate")
	IGenerateMigration bigClienteProductoMigrate;*/
	
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
	
//	
//	@EJB(beanName="bigActivosMigrate")
//	IGenerateMigration bigActivosMigrate;

	@Override
	public IFactoryMigration setMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration; 
		return this;
	}

	@Override
	public List<IGenerateMigration> build() {
		List<IGenerateMigration> listEjb = new ArrayList<>();
	/*	if(getTypeMigration().equals(TypeMigration.PRUEBA)) {
			listEjb.add(bigRecorridosMigrate);
			listEjb.add(bigRecuperaCarteraCastigadaMigrate);
//			listEjb.add(bigClienteProductoMigrate);
			listEjb.add(bigActividadEconomicaInternaMigrate);
			listEjb.add(bigCiudadesMigrate);
//			listEjb.add(bigActivosMigrate);
			listEjb.add(bigTipoIdentClientesMigrate);
			listEjb.add(bigCodigosAbogadoMigrate);
			listEjb.add(bigTipoTransaccionMigrate);
//			listEjb.add(bigBarriosMigrate);*/
		
			if(getTypeMigration().equals(TypeMigration.PRUEBA)) {
//		listEjb.add(bigRecorridosMigrate);
//		listEjb.add(bigRecuperaCarteraCastigadaMigrate);
//		listEjb.add(bigClienteProductoMigrate);
//		listEjb.add(bigActividadEconomicaInternaMigrate);
//		listEjb.add(bigCiudadesMigrate);
//		listEjb.add(bigActivosMigrate);
//		listEjb.add(bigTipoIdentClientesMigrate);
//		listEjb.add(bigCodigosAbogadoMigrate);
		listEjb.add(bigTipoTransaccionMigrate);
//		listEjb.add(bigBarriosMigrate);
		}
		return listEjb;
	}

	public TypeMigration getTypeMigration() {
		return typeMigration;
	}

	public void setTypeMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
	}

}
