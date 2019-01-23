package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigSubproductosAs;
import co.com.samtel.entity.sql.BigSubproductos;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigSubproductosMigrate")
public class BigSubproductosMigrate extends MigrateAbs< BigSubproductosAs,  BigSubproductos> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigSubproductosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigSubproductosDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_subpro ASC");
		setTableToMigrate(TableMigration.BIG_SUBPRODUCTOS);
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

	@Override
	public List<BigSubproductos> mappearOrigen(List<BigSubproductosAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();		
		BigSubproductos [] listaDestino = 	modelMapper.map(origen, BigSubproductos[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigSubproductosAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigSubproductosAs.class;
	}
}
