package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigParametrosConsolidadosAs;
import co.com.samtel.entity.sql.BigParametrosConsolidados;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigParametrosConsolidadosMigrate")
public class BigParametrosConsolidadosMigrate extends MigrateAbs< BigParametrosConsolidadosAs,  BigParametrosConsolidados> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigParametrosConsolidadoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigParametrosConsolidadoDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_bander ASC, cod_refenc ASC,llave_iva ASC ");
		setTableToMigrate(TableMigration.BIG_PARAMETROS_CONSOLIDADOS);
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
	public List<BigParametrosConsolidados> mappearOrigen(List<BigParametrosConsolidadosAs> origen){
		ModelMapper modelMapper = new ModelMapper();	
		BigParametrosConsolidados [] listaDestino = 	modelMapper.map(origen, BigParametrosConsolidados[].class);
		return Arrays.asList(listaDestino);
	}
}
