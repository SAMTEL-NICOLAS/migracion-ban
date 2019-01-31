package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigGeoreferenciarProspectoColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.entity.manual.csv.BigGeoReferenciarProspectoCsv;

@Stateless(name = "bigGeorreferenciarProspectoMapper")
public class BigGeorreferenciarProspectoMapper
		extends AbsStrategyMapper<BigGeoReferenciarProspectoCsv, TypeBigGeoreferenciarProspectoColumn>
		implements IStrategyMapper<BigGeoReferenciarProspectoCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_GEOREFERENCIAR_PROSPECTO);
		setObjectMapper(new BigGeoReferenciarProspectoCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

}
