package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigPasivosConsolidadoAs;
import co.com.samtel.entity.sql.BigPasivosConsolidado;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigPasivosConsolidadoMigrate")
public class BigPasivosConsolidadoMigrate extends MigrateAbs<  BigPasivosConsolidadoAs,   BigPasivosConsolidado> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigPasivosConsolidadoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigPasivosConsolidadoDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" crcnui ASC,crcpro ASC ,crcspr ASC ");
		setTableToMigrate(TableMigration.BIG_PASIVOS_CONSOLIDADO);
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
	public List<BigPasivosConsolidado> mappearOrigen(List<BigPasivosConsolidadoAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		for(BigPasivosConsolidadoAs item : origen ) {		                  
			item.getId().setD_fecha_cierre(transformDate(item.getCrfeccAux()));		
		}
		BigPasivosConsolidado [] listaDestino = 	modelMapper.map(origen, BigPasivosConsolidado[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigPasivosConsolidadoAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigPasivosConsolidadoAs.class;
	}
}
