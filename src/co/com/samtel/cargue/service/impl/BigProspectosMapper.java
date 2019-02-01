package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigProspectosColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigProspectosCsv;
import co.com.samtel.entity.manual.sql.BigProspectos;

@Stateless(name = "bigProspectosMapper")
public class BigProspectosMapper extends AbsStrategyMapper<BigProspectosCsv, TypeBigProspectosColumn, BigProspectos>
		implements IStrategyMapper<BigProspectosCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_PROSPECTOS);
		setObjectMapper(new BigProspectosCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigProspectos getCustomMapper(BigProspectosCsv dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
