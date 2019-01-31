package co.com.samtel.cargue.service.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.exception.MapperException;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.cargue.service.IReadResource;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.cargue.service.dto.BigDesendeudeseDto;
import co.com.samtel.entity.manual.csv.BigDesendeudeseCsv;

@Stateless(name="executePersistTable")
public class ExecutePersistTable implements IExecutePersistTable {
	
	@EJB(beanName = "csvRead")
	private IReadResource readResource;
	
	@EJB(beanName = "bigDesendeudeseMapper")
	private IStrategyMapper<BigDesendeudeseCsv> strategyMapper;

	@Override
	public Boolean executeProcess(String url, TypeFile typeFile, String delimiter) throws MapperException {
		Boolean respuesta = Boolean.TRUE;
		readResource.setUrl(url);
		if (readResource.readFile()) {
			List<String> rows = readResource.getRows();
			int i = 0;
			for (String item : rows) {
				strategyMapper.setData(item);
				strategyMapper.mapper(delimiter);
				BigDesendeudeseCsv objeto = strategyMapper.getObjectMapper();
				System.out.println("llego" + objeto.toString());
				i++;
				System.out.println("Registros: " + i);
			}
		} else {
			System.out.println("Error al leer el archivo");
		}
		return respuesta;
	}

}
