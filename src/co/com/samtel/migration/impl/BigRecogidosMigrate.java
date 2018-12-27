package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigRecorridosMigrate")
public class BigRecogidosMigrate extends MigrateAbs<BigRecogidosAs, BigRecogidos> implements IGenerateMigration {
	
	@EJB(beanName="bigRecogidosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigRecogidosDao")
	IGenericDao destino;
	
	@EJB(name="transformationBigRecogidos")
	ITransformation<BigRecogidosAs, BigRecogidos> transform;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" this_.numcliente ASC, 	this_.numcredrec ASC ");
	}

	@Override
	public List<BigRecogidos> mappearOrigen(List<BigRecogidosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigRecogidosAs item : origen ) {
			item.getId().setD_fecha_corte(transform.transformDate(item.getFeccorte()));
		}
		BigRecogidos [] listaDestino = 	modelMapper.map(origen, BigRecogidos[].class);
		return Arrays.asList(listaDestino);
	}

	public IGenericDao getOrigen() {
		return origen;
	}

	public void setOrigen(IGenericDao origen) {
		this.origen = origen;
	}

	public IGenericDao getDestino() {
		return destino;
	}

	public void setDestino(IGenericDao destino) {
		this.destino = destino;
	}

	public ITransformation<BigRecogidosAs, BigRecogidos> getTransform() {
		return transform;
	}

	public void setTransform(ITransformation<BigRecogidosAs, BigRecogidos> transform) {
		this.transform = transform;
	}
	
	

}
