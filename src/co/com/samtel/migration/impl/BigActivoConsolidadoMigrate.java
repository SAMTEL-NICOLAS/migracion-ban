package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigActivoConsolidadoAs;
import co.com.samtel.entity.as400.BigClienteProductoAs;
import co.com.samtel.entity.sql.BigActivoConsolidado;
import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigActivoConsolidadoMigrate")
public class BigActivoConsolidadoMigrate extends MigrateAbs< BigActivoConsolidadoAs, BigActivoConsolidado> implements IGenerateMigration, ITransformation  {
	
	@EJB(beanName="bigActivoConsolidadoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigActivoConsolidadoDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" nui ASC, cod_subpro ASC ");
		setTableToMigrate(TableMigration.BIG_ACTIVO_CONSOLIDADO);
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
	public List<BigActivoConsolidado> mappearOrigen(List<BigActivoConsolidadoAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigActivoConsolidadoAs item : origen ) {
			item.getId().setD_fecha_corte(transformDate(item.getFecha_cortAux()));
		}
		BigActivoConsolidado [] listaDestino = 	modelMapper.map(origen, BigActivoConsolidado[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigActivoConsolidadoAs> getClassOrigin() {
		return BigActivoConsolidadoAs.class;
	}
}
