package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigPasivosCdtAs;
import co.com.samtel.entity.sql.BigPasivosCdt;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigPasivosCdtMigrate")
public class BigPasivosCdtMigrate extends MigrateAbs< BigPasivosCdtAs,  BigPasivosCdt> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigPasivosCdtAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigPasivosCdtDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" numero_cdt ASC ");
		setTableToMigrate(TableMigration.BIG_PASIVOS_CDT);
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
	public List<BigPasivosCdt> mappearOrigen(List<BigPasivosCdtAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigPasivosCdtAs item : origen ) {
		                  
			item.getId().setD_fecha_cierre(transformDate(item.getFech_corteAux()));
			item.setFech_emisi(transformDate(item.getFech_emisiAux()));
			item.setFecha_venc(transformDate(item.getFecha_vencAux()));
		}
		BigPasivosCdt [] listaDestino = 	modelMapper.map(origen, BigPasivosCdt[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigPasivosCdtAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigPasivosCdtAs.class;
	}

}
