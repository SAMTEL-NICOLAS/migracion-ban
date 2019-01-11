package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigLocalidadAs;
import co.com.samtel.entity.sql.BigLocalidad;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigLocalidadMigrate")
public class BigLocalidadMigrate extends MigrateAbs<BigLocalidadAs, BigLocalidad> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigLocalidadAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigLocalidadDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_dept ASC, cod_ciud ASC,cod_loca ASC ");
		setTableToMigrate(TableMigration.BIG_LOCALIDAD);
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
	public List<BigLocalidad> mappearOrigen(List<BigLocalidadAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
	
		BigLocalidad [] listaDestino = 	modelMapper.map(origen, BigLocalidad[].class);
		return Arrays.asList(listaDestino);
	}
}
