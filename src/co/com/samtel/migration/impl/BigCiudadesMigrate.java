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
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigCiudadesMigrate")
public class BigCiudadesMigrate extends MigrateAbs<BigCiudadesAs, BigCiudades>
		implements IGenerateMigration, ITransformation {

	@EJB(beanName = "bigCiudadesAsDao")
	IGenericDao origen;

	@EJB(beanName = "bigCiudadesDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_ciudad ASC,cod_depto ASC");
		// Seteo el valor de la tabla que se va ha migrar
		setTableToMigrate(TableMigration.BIG_CIUDADES);
	}

	@Override
	public List<BigCiudades> mappearOrigen(List<BigCiudadesAs> origen) throws MapperException {
		BigCiudades[] listaDestino = null;
		ModelMapper modelMapper = new ModelMapper();	
		listaDestino = modelMapper.map(origen, BigCiudades[].class);
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
	public Class<BigCiudadesAs> getClassOrigin() {
		return BigCiudadesAs.class;
	}

	@Override
	public BigCiudades mappearOrigen(BigCiudadesAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}
}
