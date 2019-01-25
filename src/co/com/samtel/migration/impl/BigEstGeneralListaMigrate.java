package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigEstGeneralListaAs;
import co.com.samtel.entity.sql.BigEstGeneralLista;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigEstGeneralListaMigrate")
public class BigEstGeneralListaMigrate extends MigrateAbs< BigEstGeneralListaAs,  BigEstGeneralLista> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigEstGeneralListaAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigEstGeneralListaDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_bander ASC, cod_refenc ASC");
		setTableToMigrate(TableMigration.BIG_EST_GENERAL_LISTA);
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
	public List<BigEstGeneralLista> mappearOrigen(List<BigEstGeneralListaAs> origen){
		ModelMapper modelMapper = new ModelMapper();	
		BigEstGeneralLista [] listaDestino = 	modelMapper.map(origen, BigEstGeneralLista[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigEstGeneralListaAs> getClassOrigin() {
		return BigEstGeneralListaAs.class;
	}
}
