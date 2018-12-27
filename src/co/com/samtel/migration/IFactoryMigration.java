package co.com.samtel.migration;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.enumeraciones.TypeMigration;

@Local
public interface IFactoryMigration {

	/**
	 * Metodo con el cual setero el tipo de migracion
	 * 
	 * @param typeMigration
	 * @return
	 */
	IFactoryMigration setMigration(TypeMigration typeMigration);

	/**
	 * Metodo con el cual construyo la lista de ejbs para realizar la migracion
	 * 
	 * @return
	 */
	List<IGenerateMigration> build();
}
