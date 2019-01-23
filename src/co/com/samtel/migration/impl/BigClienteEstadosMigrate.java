package co.com.samtel.migration.impl;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigClienteEstadosAs;
import co.com.samtel.entity.sql.BigClienteEstados;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.exception.MapperException;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.migration.ITransformation;

@Stateless(name = "bigClienteEstadosMigrate")
public class BigClienteEstadosMigrate extends MigrateAbs< BigClienteEstadosAs,  BigClienteEstados>
implements IGenerateMigration, ITransformation {

@EJB(beanName = "bigClienteEstadosAsDao")
IGenericDao origen;

@EJB(beanName = "bigClienteEstadosDao")
IGenericDao destino;

@PostConstruct
public void init() {
setStrPrimaryKey(" nui ASC");
setTableToMigrate(TableMigration.BIG_CLIENTE_ESTADOS);
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
public List<BigClienteEstados> mappearOrigen(List<BigClienteEstadosAs> origen) throws MapperException {
	ModelMapper modelMapper = new ModelMapper();
	//Mapeo 
	for(BigClienteEstadosAs item : origen ) {
		item.getId().setD_fecha_corte(transformDate(item.getFecha_cor()));
		item.setFecha_actu(transformDate(item.getFecha_actuAux()));
		
	}
	BigClienteEstados [] listaDestino = 	modelMapper.map(origen, BigClienteEstados[].class);
	return Arrays.asList(listaDestino);
}

@Override
public Class<BigClienteEstadosAs> getClassOrigin() {
	return BigClienteEstadosAs.class;
}

}
