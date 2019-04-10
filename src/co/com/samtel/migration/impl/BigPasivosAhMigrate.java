package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigPasivosAhAs;
import co.com.samtel.entity.sql.BigPasivosAh;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;
@Stateless(name = "bigPasivosAhMigrate")
public class BigPasivosAhMigrate extends MigrateAbs< BigPasivosAhAs,  BigPasivosAh> implements IGenerateMigration, ITransformation {
	
	@EJB(beanName="bigPasivosAhAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigPasivosAhDao")
	IGenericDao destino;
	
	@PostConstruct
	public void init() {
		setStrPrimaryKey(" numcuenta ASC");
		setTableToMigrate(TableMigration.BIG_PASIVOS_AH);
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
	public List<BigPasivosAh> mappearOrigen(List<BigPasivosAhAs> origen) throws MapperException {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		for(BigPasivosAhAs item : origen ) {
			item.getId().setD_fecha_corte(transformDate(item.getFeccorteAux()));
			item.setFecultran(transformDate(item.getFecultranAux()));
			item.setFecconsti(transformDate(item.getFecconstiAux()));
			
//				if(item.getFecactivaAux() == 0) {
//					item.setFecactiva(new Date());
//				}else {
					item.setFecactiva(transformDate(item.getFecactivaAux()));
//				}
			
		}
		BigPasivosAh [] listaDestino = 	modelMapper.map(origen, BigPasivosAh[].class);
		return Arrays.asList(listaDestino);
	}

	@Override
	public Class<BigPasivosAhAs> getClassOrigin() {
		// TODO Auto-generated method stub
		return BigPasivosAhAs.class;
	}

	@Override
	public BigPasivosAh mappearOrigen(BigPasivosAhAs origen) throws MapperException {
		// TODO Auto-generated method stub
		return null;
	}
}
