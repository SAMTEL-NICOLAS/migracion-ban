package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigRecorridosMigrate")
public class BigRecogidosMigrate extends MigrateAbs<BigRecogidosAs, BigRecogidos> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigRecogidosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigRecogidosDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" numcliente ASC, numcredrec ASC ");
		setTableToMigrate(TableMigration.BIG_RECOGIDOS);
	}

	@Override
	public List<BigRecogidos> mappearOrigen(List<BigRecogidosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigRecogidosAs item : origen ) {
			item.getId().setD_fecha_corte(transformDate(item.getFeccorte()));
			item.setFecapertur(transformDate(item.getFecaperturAux()));
			item.setFeccancrec(transformDate(item.getFeccancrecAux()));
		}
		BigRecogidos [] listaDestino = 	modelMapper.map(origen, BigRecogidos[].class);
		return Arrays.asList(listaDestino);
	}

	public IGenericDao getOrigen() {
		return origen;
	}

	public void setOrigen(IGenericDao origen) {
		this.origen = origen;
	}

	public IGenericDao getDestino() {
		return destino;
	}

	public void setDestino(IGenericDao destino) {
		this.destino = destino;
	}
}
