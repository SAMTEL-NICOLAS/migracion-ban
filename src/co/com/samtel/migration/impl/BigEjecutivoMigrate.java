package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigEjecutivoAs;
import co.com.samtel.entity.sql.BigEjecutivo;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigEjecutivoMigrate")
public class BigEjecutivoMigrate extends MigrateAbs<BigEjecutivoAs, BigEjecutivo> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigEjecutivoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigEjecutivoDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" codigo_ase ASC, tipo_estad ASC ");
		setTableToMigrate(TableMigration.BIG_EJECUTIVO);
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
	public List<BigEjecutivo> mappearOrigen(List<BigEjecutivoAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();	
		BigEjecutivo [] listaDestino = 	modelMapper.map(origen, BigEjecutivo[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigEjecutivoAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigEjecutivoAs.class;
	}

}
