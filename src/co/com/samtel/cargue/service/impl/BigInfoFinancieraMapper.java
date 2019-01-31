package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigInfoFinancieraColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigInfoFinancieraCsv;

@Stateless(name = "bigInfoFinancieraMapper")
public class BigInfoFinancieraMapper extends AbsStrategyMapper<BigInfoFinancieraCsv, TypeBigInfoFinancieraColumn>
		implements IStrategyMapper<BigInfoFinancieraCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_INFO_FINANCIERA);
		setObjectMapper(new BigInfoFinancieraCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

}
