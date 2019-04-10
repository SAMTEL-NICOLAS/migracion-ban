package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigBarriosAs;
import co.com.samtel.entity.sql.BigBarrios;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigBarriosMigrate")
public class BigBarriosMigrate  extends MigrateAbs<BigBarriosAs, BigBarrios> implements IGenerateMigration, ITransformation{

	@EJB(beanName="bigBarriosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigBarriosDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_ciuurb ASC, cod_barrio ASC ");
		setTableToMigrate(TableMigration.BIG_BARRIOS);
	}
	

	@Override
	public List<BigBarrios> mappearOrigen(List<BigBarriosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();		
		BigBarrios [] listaDestino = 	modelMapper.map(origen, BigBarrios[].class);
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


	@Override
	public Class<BigBarriosAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigBarriosAs.class;
	}


	@Override
	public BigBarrios mappearOrigen(BigBarriosAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}

}
