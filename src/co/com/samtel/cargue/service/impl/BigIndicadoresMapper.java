package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigIndicadoresColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigParaIndicadoresCsv;

@Stateless(name = "bigIndicadoresMapper")
public class BigIndicadoresMapper extends AbsStrategyMapper<BigParaIndicadoresCsv, TypeBigIndicadoresColumn>
		implements IStrategyMapper<BigParaIndicadoresCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_PARA_INDICADORES);
		setObjectMapper(new BigParaIndicadoresCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}
}
