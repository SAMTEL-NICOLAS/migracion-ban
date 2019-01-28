package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigClienteProductoAs;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigClienteProductoMigrate")
public class BigClienteProductoMigrate extends MigrateAbs<BigClienteProductoAs, BigClienteProducto> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigClienteProductoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigClienteProductoDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" crterc ASC, crnupr ASC, crctac ASC ");
		setTableToMigrate(TableMigration.BIG_CLIENTE_PRODUCTO);
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
	public List<BigClienteProducto> mappearOrigen(List<BigClienteProductoAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigClienteProductoAs item : origen ) {
			item.getId().setD_fecha_corte(transformDate(item.getCrfeccAux()));
		}
		BigClienteProducto [] listaDestino = 	modelMapper.map(origen, BigClienteProducto[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigClienteProductoAs> getClassOrigin() {
		return BigClienteProductoAs.class;
	}

}
