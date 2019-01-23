package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigDireccionAs;
import co.com.samtel.entity.sql.BigDireccion;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigDireccionMigrate")
public class BigDireccionMigrate extends MigrateAbs< BigDireccionAs,  BigDireccion> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigDireccionAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigDireccionDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_client ASC, tip_direcc ASC ");
		setTableToMigrate(TableMigration.BIG_DIRECCION);
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
	public List<BigDireccion> mappearOrigen(List<BigDireccionAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();		
		BigDireccion [] listaDestino = 	modelMapper.map(origen, BigDireccion[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigDireccionAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigDireccionAs.class;
	}
}
