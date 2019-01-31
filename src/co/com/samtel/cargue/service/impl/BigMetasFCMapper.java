package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigMetasFuerzaComercialColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigMetasFuerzaComercialCsv;

@Stateless(name = "bigMetasFCMapper")
public class BigMetasFCMapper extends AbsStrategyMapper<BigMetasFuerzaComercialCsv, TypeBigMetasFuerzaComercialColumn>
		implements IStrategyMapper<BigMetasFuerzaComercialCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_METAS_FUERZA_COMERCIAL);
		setObjectMapper(new BigMetasFuerzaComercialCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

}
