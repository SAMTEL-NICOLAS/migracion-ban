package co.com.samtel.migration.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IExecuteMigration;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IGenerateMigration;

@Stateless(name = "executeMigration")
public class ExecuteMigration implements IExecuteMigration {

	@Inject
	IFactoryMigration factoryMigration;

	private ErrorDto errorMig;

	@Override
	public Boolean generateMigration(TypeMigration typeMigration) {
		//Obtengo la lista de tablas a migrar
		List<IGenerateMigration> listTablesToMigrate = factoryMigration.setMigration(typeMigration).build();
		// Metodo con el cual genero la migracion de las tablas dependendiendo el tipo
		// de proceso que se realiza
		for (IGenerateMigration item : listTablesToMigrate) {
			if(!item.generateMigration()) {
				setErrorMig(item.getError());
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	@Override
	public ErrorDto getMessageError() {
		if (getErrorMig() == null) {
			return ErrorDto.of(null, TypeErrors.SUCCESS, null);
		}
		return getErrorMig();
	}

	public ErrorDto getErrorMig() {
		return errorMig;
	}

	public void setErrorMig(ErrorDto errorMig) {
		this.errorMig = errorMig;
	}

}
