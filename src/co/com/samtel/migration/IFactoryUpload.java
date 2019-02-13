package co.com.samtel.migration;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.cargue.enumeraciones.TypeFile;

@Local
public interface IFactoryUpload {

	/**
	 * Metodo con el cual setero el tipo de migracion
	 * 
	 * @param typeMigration
	 * @return
	 */
	IFactoryUpload setUpload(TypeFile typeFile);

	/**
	 * Metodo con el cual construyo la lista de ejbs para realizar la migracion
	 * 
	 * @return
	 */
	List<TypeFile> build();
}
