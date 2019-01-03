package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigBarriosAs;
import co.com.samtel.entity.as400.BigClienteProductoAs;
import co.com.samtel.entity.sql.BigBarrios;
import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigBarriosMigrate")
public class BigBarriosMigrate  extends MigrateAbs<BigBarriosAs, BigBarrios> implements IGenerateMigration, ITransformation{

	@EJB(beanName="bigBarriosAsDao")
	IGenericDao origen;
	
	@EJB(beanName="bigBarriosDao")
	IGenericDao destino;

	@PostConstruct
	public void init() {
		setStrPrimaryKey(" cod_ciuurb ASC, cod_barrio ASC ");
	}
	

	@Override
	public List<BigBarrios> mappearOrigen(List<BigBarriosAs> origen) {
		ModelMapper modelMapper = new ModelMapper();
		//Mapeo 
		/*for(BigClienteProductoAs item : origen ) {
		                  
			item.getId().setD_fecha_corte(transformDate(item.getCrfeccAux()));	

		}*/
		BigBarrios [] listaDestino = 	modelMapper.map(origen, BigBarrios[].class);
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
