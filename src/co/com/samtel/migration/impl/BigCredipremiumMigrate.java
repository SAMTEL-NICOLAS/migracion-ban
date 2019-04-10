package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigCredipremiumAs;
import co.com.samtel.entity.sql.BigCredipremium;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigCredipremiumMigrate")
public class BigCredipremiumMigrate extends MigrateAbs<BigCredipremiumAs, BigCredipremium> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigCredipremiumAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigCredipremiumDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" crcnui ASC");
		setTableToMigrate(TableMigration.BIG_CREDIPREMIUM);
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
	public List<BigCredipremium> mappearOrigen(List<BigCredipremiumAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigCredipremiumAs item : origen ) {
		item.setCrcfcr(transformDate(item.getCrcfcrAux()));
		item.setCrcfvc(transformDate(item.getCrcfvcAux()));		
		item.setCrcfpc(transformDate(item.getCrcfpcAux()));
		item.setCrcfcr(transformDate(item.getCrcfcrAux()));
		
		}
		BigCredipremium [] listaDestino = 	modelMapper.map(origen, BigCredipremium[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigCredipremiumAs> getClassOrigin() {		
		return BigCredipremiumAs.class;
	}

	@Override
	public BigCredipremium mappearOrigen(BigCredipremiumAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}
}
