package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigInfoFinancieraColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigInfoFinancieraCsv;
import co.com.samtel.entity.manual.sql.BigInfoFinanciera;

@Stateless(name = "bigInfoFinancieraMapper")
public class BigInfoFinancieraMapper extends AbsStrategyMapper<BigInfoFinancieraCsv, TypeBigInfoFinancieraColumn, BigInfoFinanciera>
		implements IStrategyMapper<BigInfoFinancieraCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_INFO_FINANCIERA);
		setObjectMapper(new BigInfoFinancieraCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInfoFinanciera getCustomMapper(BigInfoFinancieraCsv dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
