package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigEstadoCarpetasAs;
import co.com.samtel.entity.sql.BigEstadoCarpetas;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigEstadoCarpetasMigrate")
public class BigEstadoCarpetasMigrate extends MigrateAbs<BigEstadoCarpetasAs, BigEstadoCarpetas> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigEstadosCarpetasAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigEstadosCarpetasDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" codigo_est ASC");
		setTableToMigrate(TableMigration.BIG_ESTADOS_CARPETAS);
	}
	@Override
	public List<BigEstadoCarpetas> mappearOrigen(List<BigEstadoCarpetasAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		BigEstadoCarpetas [] listaDestino = 	modelMapper.map(origen, BigEstadoCarpetas[].class);
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
	public Class<BigEstadoCarpetasAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigEstadoCarpetasAs.class;
	}
	
}
