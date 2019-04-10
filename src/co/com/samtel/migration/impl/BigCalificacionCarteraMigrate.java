package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigCalificacionCarteraAs;
import co.com.samtel.entity.sql.BigCalificacionCartera;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigCalificacionCarteraMigrate")
public class BigCalificacionCarteraMigrate extends MigrateAbs<BigCalificacionCarteraAs, BigCalificacionCartera> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigCalificacionCarteraAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigCalificacionCarteraDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" i_cod_cali ASC");
		setTableToMigrate(TableMigration.BIG_CALIFICACION_CARTERA);
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
		this.destino=destino;
		
	}

	@Override
	public List<BigCalificacionCartera> mappearOrigen(List<BigCalificacionCarteraAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();	
		BigCalificacionCartera [] listaDestino = 	modelMapper.map(origen, BigCalificacionCartera[].class);
		return Arrays.asList(listaDestino);
	
	}

	@Override
	public Class<BigCalificacionCarteraAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigCalificacionCarteraAs.class;
	}

	@Override
	public BigCalificacionCartera mappearOrigen(BigCalificacionCarteraAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}

}
