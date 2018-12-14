package co.com.samtel.migration.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.dao.IBigRecogidosAsDao;
import co.com.samtel.dao.IBigRecogidosDao;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.migration.IGenerateMigration;
import co.com.samtel.service.IParametrosService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Stateless(name = "bigRecorridosMigrate")
public class BigRecorridosMigrate implements IGenerateMigration {
	
	@EJB(beanName="bigRecogidosAsDao")
	IBigRecogidosAsDao origen;
	
	@EJB(beanName="bigRecogidosDao")
	IBigRecogidosDao destino;
	
	@EJB
	IParametrosService parametrosService;
	
	@PostConstruct
	public void init() {
		origen.setTypeConection(TypeConections.AS400);
		destino.setTypeConection(TypeConections.SQLSERVER);
	}
	
	public void initializeMigration() {
		origen.countRecordsTable();
	}
	
	@Override
	public Boolean generateMigration() {
		initializeMigration();
		try {
			//Obtengo el numero de registros origen 			
			Long records = origen.getNumRecordsTable();
			//Obtengo el numero de registros que se desean por bloque
			Long numRecords = parametrosService.getNumRecordsToProcess();
			//Itero las veces que sea necesario
			for(int i = 0; i < records ; i += numRecords) {
				int limit = i + numRecords.intValue();
				List<BigRecogidosAs> listOrigen = origen.findBlockData(i, limit);
				//Mapeo el objeto de origen a destino
				ModelMapper modelMapper = new ModelMapper();
				BigRecogidos [] listaDestino = 	modelMapper.map(listOrigen, BigRecogidos[].class);
				//visualizo la lista de destino
				if(listaDestino.length != 0) {
					System.out.println("Si llego");
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}	
		return Boolean.TRUE;
	}

}
