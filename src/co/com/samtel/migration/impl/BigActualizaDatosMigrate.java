package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigActualizaDatosAs;
import co.com.samtel.entity.sql.BigActualizaDatos;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigActualizaDatosMigrate")
public class BigActualizaDatosMigrate extends MigrateAbs<BigActualizaDatosAs, BigActualizaDatos> implements IGenerateMigration, ITransformation {

	@EJB(beanName="bigActualizaDatosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigActualizaDatosDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" f01b01cun ASC");
		setTableToMigrate(TableMigration.BIG_ACTUALIZA_DATOS);
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
	public List<BigActualizaDatos> mappearOrigen(List<BigActualizaDatosAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();		
		for(BigActualizaDatosAs item : origen ) {
			item.getId().setD_fecha_carga(transformDate(item.getF01fecsys()));
			item.setF01fecact(transformDate(item.getF01fecactAux()));		
		}
		BigActualizaDatos [] listaDestino = 	modelMapper.map(origen, BigActualizaDatos[].class);
		return Arrays.asList(listaDestino);
	}
}
