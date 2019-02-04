package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigInfoFinancieraColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigInfoFinancieraCsv;
import co.com.samtel.entity.manual.sql.BigInfoFinanciera;
import co.com.samtel.entity.manual.sql.BigInfoFinancieraId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigInfoFinancieraMapper")
public class BigInfoFinancieraMapper extends AbsStrategyMapper<BigInfoFinancieraCsv, TypeBigInfoFinancieraColumn, BigInfoFinanciera>
		implements IStrategyMapper<BigInfoFinancieraCsv> {


	@EJB(beanName="bigInfoFinancieraDao")
	IGenericDao<BigInfoFinanciera,BigInfoFinancieraId> objDao;
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_INFO_FINANCIERA);
		setObjectMapper(new BigInfoFinancieraCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {		
		return objDao;
	}

	@Override
	public BigInfoFinanciera getCustomMapper(BigInfoFinancieraCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigInfoFinanciera destinoSql = modelMapper.map(dto, BigInfoFinanciera.class);
		BigInfoFinancieraId id= new BigInfoFinancieraId(dto.getI_cod_oficina(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

}
