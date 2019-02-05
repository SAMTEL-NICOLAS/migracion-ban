package co.com.samtel.migration;

import javax.ejb.Local;

import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TypeMigration;

@Local
public interface IUploadMigration {

	/**
	 * Fachada con la cual se generara un tipo de migracion con respecto a lo que
	 * envie el metodo que se antecede a este Se encargara de todo lo
	 * correspondiente a la migracion
	 * 
	 * @param typeMigration
	 * @return
	 */
	Boolean generateMigration(TypeMigration typeMigration, String user);

	/**
	 * Metodo con el cual obtendre el error que se genero al ejecutar la migracion
	 * 
	 * @return
	 */
	ErrorDto getMessageError();

	/**
	 * Obtengo el id de la auditoria
	 * 
	 * @return
	 */
	Long getIdAudit();
}
