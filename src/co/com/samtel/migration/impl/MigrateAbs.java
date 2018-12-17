package co.com.samtel.migration.impl;

import java.util.List;

import javax.ejb.EJB;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.service.IParametrosService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MigrateAbs<T,U> {

	@EJB
	IParametrosService parametrosService;
	


	private Long numRecords;
	private Long numRecBlock;

	abstract public IGenericDao getOrigen();

	abstract public void setOrigen(IGenericDao origen);

	abstract public IGenericDao getDestino();

	abstract public void setDestino(IGenericDao destino);
	
	abstract public List<U> mappearOrigen(List<T> origen);
	

	public void initializeMigration() {
		getOrigen().setTypeConection(TypeConections.AS400);
		getDestino().setTypeConection(TypeConections.SQLSERVER);
		// Obtengo el numero de registros origen
		getOrigen().countRecordsTable();
		setNumRecords(getOrigen().getNumRecordsTable());
		// Obtengo el numero de registros que se desean por bloque
		setNumRecBlock(parametrosService.getNumRecordsToProcess());
	}

	public Boolean generateMigration() {
		initializeMigration();
		try {
			// Itero las veces que sea necesario
			for (int i = 0; i < getNumRecords(); i += getNumRecBlock()) {
				int limit = i + getNumRecBlock().intValue();
				extractInformation(i, limit);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	/**
	 * Metodo con el cual muevo la informacion
	 * 
	 * @param ini
	 * @param fin
	 */
	public void extractInformation(Integer ini, Integer fin) {
		List<T> listOrigen = getOrigen().findBlockData(ini, fin);
		persistInformation(listOrigen);
	}

	/**
	 * Metodo con el cual persisto la informacion
	 */
	public void persistInformation(List<T> origen) {
		List<U> listDestino = mappearOrigen(origen);		
		if (!listDestino.isEmpty()) {
			getDestino().saveBlockInformation(listDestino);
		}
	}

}
