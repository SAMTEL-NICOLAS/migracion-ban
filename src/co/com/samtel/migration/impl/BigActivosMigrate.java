package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigActivosAs;
import co.com.samtel.entity.sql.BigActivos;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigActivosMigrate")
public class BigActivosMigrate extends MigrateAbs<BigActivosAs, BigActivos> implements IGenerateMigration, ITransformation {

	@EJB(beanName="bigActivosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigActivosDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" num_creotr ASC");
		setTableToMigrate(TableMigration.BIG_ACTIVOS);
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
	public List<BigActivos> mappearOrigen(List<BigActivosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();		
		for(BigActivosAs item : origen ) {
		item.getId().setD_fecha_corte(transformDate(item.getFeccigeinf()));
		item.setFec_vencre(transformDate(item.getFec_vencreAux()));
		item.setFulprecrca(transformDate(item.getFulprecrcaAux()));
		item.setFukorecrin(transformDate(item.getFukorecrinAux()));
		item.setFecinicred(transformDate(item.getFecinicredAux()));
		item.setFeccredmor(transformDate(item.getFeccredmorAux()));
		item.setFechinimor(transformDate(item.getFechinimorAux()));
		item.setFechapaguc(transformDate(item.getFechapagucAux()));
		item.setFecfngefga(transformDate(item.getFecfngefgaAux()));
		item.setFecusaefga(transformDate(item.getFecusaefgaAux()));
		item.setFecintcred(transformDate(item.getFecintcredAux()));
		item.setFecproxpcr(transformDate(item.getFecproxpcrAux()));
		item.setFeccredcas(transformDate(item.getFeccredcasAux()));
		item.setFeccafngeg(transformDate(item.getFeccafngegAux())); 
		
		}
		BigActivos [] listaDestino = 	modelMapper.map(origen, BigActivos[].class);
		return Arrays.asList(listaDestino);
	}

}
