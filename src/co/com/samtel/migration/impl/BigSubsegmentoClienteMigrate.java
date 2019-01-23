package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigSubsegmentoClienteAs;
import co.com.samtel.entity.sql.BigSubsegmentoCliente;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigSubsegmentoClienteMigrate")
public class BigSubsegmentoClienteMigrate extends MigrateAbs<BigSubsegmentoClienteAs, BigSubsegmentoCliente> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigSubsegmentoClienteAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigSubsegmentoClienteDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_nicho ASC, cod_subseg ASC ");
		setTableToMigrate(TableMigration.BIG_SUBSEGMENTO_CLIENTE);
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
	public List<BigSubsegmentoCliente> mappearOrigen(List<BigSubsegmentoClienteAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();		
		BigSubsegmentoCliente [] listaDestino = 	modelMapper.map(origen, BigSubsegmentoCliente[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigSubsegmentoClienteAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigSubsegmentoClienteAs.class;
	}
}
