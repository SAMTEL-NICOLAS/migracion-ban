package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigConsCentralesAs;
import co.com.samtel.entity.sql.BigConsCentrales;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigConsCentralesMigrate")
public class BigConsCentralesMigrate extends MigrateAbs<BigConsCentralesAs, BigConsCentrales> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigConsCentralesAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigConsCentralesDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" crcnpo ASC, crcnui ASC ");
		setTableToMigrate(TableMigration.BIG_CONS_CENTRALES);
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
	public List<BigConsCentrales> mappearOrigen(List<BigConsCentralesAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		for(BigConsCentralesAs item : origen ) {		
			item.setCrcfcn(transformDate(item.getCrcfcnAux()));
			item.setCrfecc(transformDate(item.getCrfeccAux()));
		}
		BigConsCentrales [] listaDestino = 	modelMapper.map(origen, BigConsCentrales[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigConsCentralesAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigConsCentralesAs.class;
	}

	@Override
	public BigConsCentrales mappearOrigen(BigConsCentralesAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}

}
