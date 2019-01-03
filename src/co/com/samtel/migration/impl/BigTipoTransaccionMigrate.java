package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigClienteProductoAs;
import co.com.samtel.entity.as400.BigTipoTransaccionAs;
import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.entity.sql.BigTipoTransaccion;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigTipoTransaccionMigrate")
public class BigTipoTransaccionMigrate extends MigrateAbs<BigTipoTransaccionAs, BigTipoTransaccion> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigTipoTransaccionAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigTipoTransaccionDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_transa ASC, des_transa ASC ");
	}
	
	@Override
	public List<BigTipoTransaccion> mappearOrigen(List<BigTipoTransaccionAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		/*for(BigTipoTransaccionAs item : origen ) {
		
		}*/
		BigTipoTransaccion [] listaDestino = 	modelMapper.map(origen, BigTipoTransaccion[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public IGenericDao getOrigen() {
		// TODO Auto-generated method stub
		return origen;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		this.origen = origen;
		
	}

	@Override
	public IGenericDao getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}

	@Override
	public void setDestino(IGenericDao destino) {
		this.destino = destino;
		
	}

}
