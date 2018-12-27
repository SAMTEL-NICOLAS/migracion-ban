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

	@Override
	public IFactoryMigration setMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration; 
		return this;
	}

	@Override
	public List<IGenerateMigration> build() {
		List<IGenerateMigration> listEjb = new ArrayList<>();
		if(getTypeMigration().equals(TypeMigration.PRUEBA)) {
			listEjb.add(bigRecorridosMigrate);
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
