package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigActividadEconomicaInternaAs;
import co.com.samtel.entity.sql.BigActividadEconomicaInterna;
import co.com.samtel.entity.sql.BigCiudades;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigActividadEconomicaInternaMigrate")
public class BigActividadEconomicaInternaMigrate extends MigrateAbs<BigActividadEconomicaInternaAs, BigActividadEconomicaInterna> implements IGenerateMigration, ITransformation  {

	@EJB(beanName="bigActividadEconomicaInternaAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigActividadEconomicaInternaDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" codigo_int ASC");
		setTableToMigrate(TableMigration.BIG_ACTIVIDAD_ECONOMICA_INTERNA);
	}
	
	@Override
	public IGenericDao getOrigen() {
		// TODO Auto-generated method stub
		return origen;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		this.origen = origen;
		
		
	}

	@Override
	public IGenericDao getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

	@Override
	public void setDestino(IGenericDao destino) {
		this.destino = destino;
		
	}

	@Override
	public List<BigActividadEconomicaInterna> mappearOrigen(List<BigActividadEconomicaInternaAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		/*for(BigCiudadesAs item : origen ) {
		
		}*/
		BigActividadEconomicaInterna [] listaDestino = 	modelMapper.map(origen, BigActividadEconomicaInterna[].class);
		return Arrays.asList(listaDestino);
	}

}
