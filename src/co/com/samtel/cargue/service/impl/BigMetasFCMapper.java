package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigMetasFuerzaComercialColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigMetasFuerzaComercialCsv;
import co.com.samtel.entity.manual.sql.BigMetasFuerzaComercial;

@Stateless(name = "bigMetasFCMapper")
public class BigMetasFCMapper extends AbsStrategyMapper<BigMetasFuerzaComercialCsv, TypeBigMetasFuerzaComercialColumn, BigMetasFuerzaComercial>
		implements IStrategyMapper<BigMetasFuerzaComercialCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_METAS_FUERZA_COMERCIAL);
		setObjectMapper(new BigMetasFuerzaComercialCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigMetasFuerzaComercial getCustomMapper(BigMetasFuerzaComercialCsv dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
