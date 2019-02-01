package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigDesendeudeseColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigDesendeudeseCsv;
import co.com.samtel.entity.manual.sql.BigDesendeudese;
import co.com.samtel.entity.manual.sql.BigDesendeudeseId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigDesendeudeseMapper")
public class BigDesendeudeseMapper extends AbsStrategyMapper<BigDesendeudeseCsv, TypeBigDesendeudeseColumn, BigDesendeudese>
		implements IStrategyMapper<BigDesendeudeseCsv> {
	
	@EJB(beanName="bigDesendeudeseDao")
	IGenericDao<BigDesendeudese,BigDesendeudeseId > objDao;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_DESENDEUDESE);
		setObjectMapper(new BigDesendeudeseCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));		
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigDesendeudese getCustomMapper(BigDesendeudeseCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigDesendeudese destinoSql = modelMapper.map(dto, BigDesendeudese.class);
		BigDesendeudeseId id= new BigDesendeudeseId(dto.getI_codigo_cliente(), dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

		
	
	

}
