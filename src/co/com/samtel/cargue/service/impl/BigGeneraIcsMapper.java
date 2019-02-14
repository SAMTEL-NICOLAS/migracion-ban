package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigGeneraIcsColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigGeneraIcsCsv;
import co.com.samtel.entity.manual.sql.BigGeneraIcs;
import co.com.samtel.entity.manual.sql.BigGeneraIcsId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigGeneraIcsMapper")
public class BigGeneraIcsMapper extends AbsStrategyMapper<BigGeneraIcsCsv, TypeBigGeneraIcsColumn, BigGeneraIcs>
		implements IStrategyMapper<BigGeneraIcsCsv> {

	@EJB(beanName = "bigDesendeudeseDao")
	IGenericDao<BigGeneraIcs, BigGeneraIcsId> objDao;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_GENERA_ICS);
		setObjectMapper(new BigGeneraIcsCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigGeneraIcs getCustomMapper(BigGeneraIcsCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigGeneraIcs destinoSql = modelMapper.map(dto, BigGeneraIcs.class);
		BigGeneraIcsId id= new BigGeneraIcsId(dto.getI_codigo_cliente(),dto.getS_cod_producto(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

}
