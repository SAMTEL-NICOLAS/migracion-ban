package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigRecuperaCarteraCastigadaAs;
import co.com.samtel.entity.sql.BigRecuperaCarteraCastigada;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigRecuperaCarteraCastigadaMigrate")
public class BigRecuperaCarteraCastigadaMigrate extends MigrateAbs<BigRecuperaCarteraCastigadaAs, BigRecuperaCarteraCastigada> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigRecuperaCarteraCastigadaAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigRecuperaCarteraCastigadaDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" F01DEAACC ASC, F01TRAACR ASC ");
	}

	@Override
	public List<BigRecuperaCarteraCastigada> mappearOrigen(List<BigRecuperaCarteraCastigadaAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigRecuperaCarteraCastigadaAs item : origen ) {
			
			item.getId().setD_fecha_corte(transformDate(item.getF01fcorte()));			
			item.setF01fecpag(transformDate(item.getF01fecpagAux()));
			item.setF01feccas(transformDate(item.getF01feccasAux()));
			
			
	
		}
		BigRecuperaCarteraCastigada[] listaDestino = 	modelMapper.map(origen, BigRecuperaCarteraCastigada[].class);
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



}
