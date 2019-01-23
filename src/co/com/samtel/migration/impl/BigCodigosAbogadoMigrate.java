package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigCodigosAbogadoAs;
import co.com.samtel.entity.sql.BigCodigosAbogado;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigCodigosAbogadoMigrate")
public class BigCodigosAbogadoMigrate extends MigrateAbs<BigCodigosAbogadoAs, BigCodigosAbogado> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigCodigosAbogadoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigCodigosAbogadoDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_ente ASC");
		setTableToMigrate(TableMigration.BIG_CODIGOS_ABOGADO);
	}
	
	@Override
	public List<BigCodigosAbogado> mappearOrigen(List<BigCodigosAbogadoAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		/*for(BigCiudadesAs item : origen ) {
		
		}*/
		BigCodigosAbogado [] listaDestino = 	modelMapper.map(origen, BigCodigosAbogado[].class);
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
	public Class<BigCodigosAbogadoAs> getClassOrigin() {
		return BigCodigosAbogadoAs.class;
	}


}
