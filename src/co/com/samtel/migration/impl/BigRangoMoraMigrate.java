package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigRangoMoraAs;
import co.com.samtel.entity.sql.BigRangoMora;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigRangoMoraMigrate")
public class BigRangoMoraMigrate extends MigrateAbs<BigRangoMoraAs, BigRangoMora> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigRangoMoraAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigRangoMoraDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" i_id_rango ASC");
		setTableToMigrate(TableMigration.BIG_RANGO_MORA);
	}

	@Override
	public IGenericDao getOrigen() {
		return origen;
	}

	@Override
	public void setOrigen(IGenericDao origen) {
		this.origen= origen;
		
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
	public List<BigRangoMora> mappearOrigen(List<BigRangoMoraAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();		
		BigRangoMora [] listaDestino = 	modelMapper.map(origen, BigRangoMora[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigRangoMoraAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigRangoMoraAs.class;
	}

}
