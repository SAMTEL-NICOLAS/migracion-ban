package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigInfoAdicionalClientesAs;
import co.com.samtel.entity.as400.BigLocalidadAs;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigInfoAdicionalClientes;
import co.com.samtel.entity.sql.BigLocalidad;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigInfoAdicionalClientesMigrate")
public class BigInfoAdicionalClientesMigrate extends MigrateAbs<BigInfoAdicionalClientesAs, BigInfoAdicionalClientes> implements IGenerateMigration, ITransformation {

	@EJB(beanName="bigInfoAdicionalClientesAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigInfoAdicionalClientesDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" crcnui ASC");
		setTableToMigrate(TableMigration.BIG_INFO_ADICIONAL_CLIENTE);
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
	public List<BigInfoAdicionalClientes> mappearOrigen(List<BigInfoAdicionalClientesAs> origen){
	ModelMapper modelMapper = new ModelMapper();
	for(BigInfoAdicionalClientesAs item : origen ) {
		item.getId().setD_fecha_corte(transformDate(item.getCrfecc()));
	
	}
	BigInfoAdicionalClientes [] listaDestino = 	modelMapper.map(origen, BigInfoAdicionalClientes[].class);
	return Arrays.asList(listaDestino);
	}

}
