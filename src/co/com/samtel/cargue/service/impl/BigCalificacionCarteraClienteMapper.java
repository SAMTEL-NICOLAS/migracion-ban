package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigCalificacionCarteraClienteColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigCalificacionCarteraClienteCsv;

@Stateless(name = "bigCalificacionCarteraClienteMapper")
public class BigCalificacionCarteraClienteMapper
		extends AbsStrategyMapper<BigCalificacionCarteraClienteCsv, TypeBigCalificacionCarteraClienteColumn>
		implements IStrategyMapper<BigCalificacionCarteraClienteCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_CALIFICACION_CARTERA_CLIENTE);
		setObjectMapper(new BigCalificacionCarteraClienteCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}
}
