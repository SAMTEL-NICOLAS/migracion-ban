package co.com.samtel.cargue.service.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigDesendeudeseCsv;

@Stateless(name="executePersistTable")
public class ExecutePersistTable implements IExecutePersistTable {
	
	
	
	@EJB(beanName = "bigDesendeudeseMapper")
	private IStrategyMapper<BigDesendeudeseCsv> strategyMapperBigDesendeudese;
	
	
	@Override
	public Boolean executeProcess(String url, TypeFile typeFile, String delimiter) throws MapperException {
		Boolean respuesta = Boolean.TRUE;
		
		strategyMapperBigDesendeudese.setUrl(url);		
		respuesta = strategyMapperBigDesendeudese.executeUpload(delimiter);
		
		System.out.println(respuesta);
		return respuesta;
	}

}
