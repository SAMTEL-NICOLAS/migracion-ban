package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigIndicadoresColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigParaIndicadoresCsv;
import co.com.samtel.entity.manual.sql.BigIndicadores;

@Stateless(name = "bigIndicadoresMapper")
public class BigIndicadoresMapper extends AbsStrategyMapper<BigParaIndicadoresCsv, TypeBigIndicadoresColumn,BigIndicadores>
		implements IStrategyMapper<BigParaIndicadoresCsv> {
	
	@EJB(beanName="bigDesendeudeseDao")
	IGenericDao<BigIndicadores,BigIndicadores > objDao;
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_PARA_INDICADORES);
		setObjectMapper(new BigParaIndicadoresCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigIndicadores getCustomMapper(BigParaIndicadoresCsv dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
