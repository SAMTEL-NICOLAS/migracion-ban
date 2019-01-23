package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigOficinaAs;
import co.com.samtel.entity.sql.BigOficina;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigOficinaMigrate")
public class BigOficinaMigrate extends MigrateAbs<BigOficinaAs, BigOficina> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigOficinaAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigOficinaDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" codofc ASC");
		setTableToMigrate(TableMigration.BIG_OFICINA);
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
	public List<BigOficina> mappearOrigen(List<BigOficinaAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		BigOficina [] listaDestino = 	modelMapper.map(origen, BigOficina[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigOficinaAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigOficinaAs.class;
	}
}
