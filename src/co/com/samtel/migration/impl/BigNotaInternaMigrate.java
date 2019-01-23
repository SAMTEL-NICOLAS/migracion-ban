package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigNotaInternaAs;
import co.com.samtel.entity.sql.BigNotaInterna;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigNotaInternaMigrate")
public class BigNotaInternaMigrate extends MigrateAbs<BigNotaInternaAs, BigNotaInterna> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigNotaInternaAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigNotaInternaDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" nuicliente ASC ");
		setTableToMigrate(TableMigration.BIG_NOTA_INTERNA);
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
	public List<BigNotaInterna> mappearOrigen(List<BigNotaInternaAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		for(BigNotaInternaAs item : origen ) {		                  
			item.getId().setD_fecha_corte(transformDate(item.getFeccorte()));
		}
		BigNotaInterna [] listaDestino = 	modelMapper.map(origen, BigNotaInterna[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigNotaInternaAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigNotaInternaAs.class;
	}

}
