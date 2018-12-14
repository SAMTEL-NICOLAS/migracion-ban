package co.com.samtel.migration;

import javax.ejb.Local;

@Local
public interface IGenerateMigration {
	/**
	 * Metodo con el cual genero la migracion de toda una tabla
	 * @return
	 */
	Boolean generateMigration();
}
