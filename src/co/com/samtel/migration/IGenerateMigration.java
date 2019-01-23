package co.com.samtel.migration;

import javax.ejb.Local;

import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TableMigration;

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
	/**
	 * Metodo con el cual obtengo el nombre de la tabla que se va ha migrar
	 * @return
	 */
	TableMigration getTableToMigrate();
	/**
	 * Metodo con el cual obtengo el numero de registros que se deben migrar
	 * @return
	 */
	Long getNumRecords();
	/**
	 * Numero de registros que se migraron en la tabla que corresponde
	 * @return
	 */
	Long getNumRecMig();
	
	LogActivador getLogActivador();

	void setLogActivador(LogActivador logActivador);
	
	void setNumRecMig(Long valor);
}
