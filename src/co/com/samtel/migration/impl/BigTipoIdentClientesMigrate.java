package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigTipoIdentClientesAs;
import co.com.samtel.entity.sql.BigCiudades;
import co.com.samtel.entity.sql.BigTipoIdentClientes;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigTipoIdentClientesMigrate")
public class BigTipoIdentClientesMigrate extends MigrateAbs<BigTipoIdentClientesAs, BigTipoIdentClientes> implements IGenerateMigration, ITransformation  {

	@EJB(beanName="bigTipoIdentClientesAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigTipoIdentClientesDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" tipo_perso ASC, clase_tipo ASC");
	}
	
	@Override
	public List<BigTipoIdentClientes> mappearOrigen(List<BigTipoIdentClientesAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		/*for(BigCiudadesAs item : origen ) {
		
		}*/
		BigTipoIdentClientes [] listaDestino = 	modelMapper.map(origen, BigTipoIdentClientes[].class);
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
}
