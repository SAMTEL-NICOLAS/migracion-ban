package co.com.samtel.migration;

import javax.ejb.Local;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.LogActivador;

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
	Boolean generateMigration(String user);
	
//	Boolean generateMigration(TypeMigration typeMigration, HttpServletRequest request);

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

	/**
	 * Metodo con el cual obtengo el nombre de del archivo que se va a cargar.
	 * 
	 * @return
	 */
	TypeFile getFileToUpload();

	/**
	 * Metodo con el cual obtengo el numero de registros que se deben migrar
	 * 
	 * @return
	 */
	Long getNumRecords();

	/**
	 * Numero de registros que se migraron en la tabla que corresponde
	 * 
	 * @return
	 */
	Long getNumRecMig();

	void setLogActivador(LogActivador logActivador);

	void setNumRecMig(Long valor);

}
