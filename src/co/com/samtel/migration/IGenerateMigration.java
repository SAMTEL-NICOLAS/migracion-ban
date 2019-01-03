package co.com.samtel.migration;

import javax.ejb.Local;

import co.com.samtel.dto.ErrorDto;

@Local
public interface IGenerateMigration {
	/**
	 * Metodo con el cual genero la migracion de toda una tabla
	 * @return
	 */
	Boolean generateMigration();
	/**
	 * Metodo con el cual se obtiene el error generado al mapear una tabla
	 * @return
	 */
	ErrorDto getError();
}
