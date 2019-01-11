package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigClienteProductoAs;
import co.com.samtel.entity.as400.BigCupoRotativoAs;
import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.entity.sql.BigCupoRotativo;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;
@Stateless(name = "bigCupoRotativoMigrate")
public class BigCupoRotativoMigrate extends MigrateAbs<BigCupoRotativoAs, BigCupoRotativo> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigCupoRotativoAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigCupoRotativoDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" numpro ASC ");
		setTableToMigrate(TableMigration.BIG_CUPO_ROTATIVO);
		
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
	public List<BigCupoRotativo> mappearOrigen(List<BigCupoRotativoAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigCupoRotativoAs item : origen ) {	                  
			
			item.getId().setD_fecha_corte(transformDate(item.getFeccor_Aux()));
			item.setFeccup(transformDate(item.getFeccupAux()));
			item.setFecluc(transformDate(item.getFeclucAux()));

		}
		BigCupoRotativo [] listaDestino = 	modelMapper.map(origen, BigCupoRotativo[].class);
		return Arrays.asList(listaDestino);
	}
}
