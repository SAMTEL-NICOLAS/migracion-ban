package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigDesendeudeseColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.cargue.service.dto.BigDesendeudeseDto;
import co.com.samtel.entity.manual.csv.BigDesendeudeseCsv;

@Stateless(name = "bigDesendeudeseMapper")
public class BigDesendeudeseMapper extends AbsStrategyMapper<BigDesendeudeseCsv, TypeBigDesendeudeseColumn>
		implements IStrategyMapper<BigDesendeudeseCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_DESENDEUDESE);
		setObjectMapper(new BigDesendeudeseCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));		
	}	

}
