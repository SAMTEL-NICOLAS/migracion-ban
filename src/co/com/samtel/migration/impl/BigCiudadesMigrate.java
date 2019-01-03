package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigCiudadesAs;
import co.com.samtel.entity.sql.BigCiudades;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigCiudadesMigrate")
public class BigCiudadesMigrate extends MigrateAbs<BigCiudadesAs, BigCiudades> implements IGenerateMigration, ITransformation  {

	@EJB(beanName="bigCiudadesAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigCiudadesDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_ciudad ASC");
	}

	@Override
	public List<BigCiudades> mappearOrigen(List<BigCiudadesAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		/*for(BigCiudadesAs item : origen ) {
		
		}*/
		BigCiudades [] listaDestino = 	modelMapper.map(origen, BigCiudades[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public IGenericDao getOrigen() {	
		return origen;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		this.origen = origen;
		
	}

	@Override
	public IGenericDao getDestino() {
		return destino;
	}

	@Override
	public void setDestino(IGenericDao destino) {
		this.destino = destino;
		
	}
}
