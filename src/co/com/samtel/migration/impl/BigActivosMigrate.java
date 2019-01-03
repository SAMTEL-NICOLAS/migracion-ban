package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigActivosAs;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigActivos;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigActivosMigrate")
public class BigActivosMigrate extends MigrateAbs<BigActivosAs, BigActivos> implements IGenerateMigration, ITransformation {

	@EJB(beanName="bigActivosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigActivosDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" numcliente ASC, numcredrec ASC ");
	}
	
	@Override
	public IGenericDao getOrigen() {
		// TODO Auto-generated method stub
		return origen;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		// TODO Auto-generated method stub
		this.origen = origen;
		
	}

	@Override
	public IGenericDao getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

	@Override
	public void setDestino(IGenericDao destino) {
		// TODO Auto-generated method stub
		this.destino = destino;
	}

	@Override
	public List<BigActivos> mappearOrigen(List<BigActivosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigActivosAs item : origen ) {
			item.getId().setD_fecha_corte(transformDate(item.getFeccigeinf()));
			//.setD_fecha_corte(transformDate(item.getFeccorte()));
			
		}
		BigActivos [] listaDestino = 	modelMapper.map(origen, BigActivos[].class);
		return Arrays.asList(listaDestino);
	}

}
