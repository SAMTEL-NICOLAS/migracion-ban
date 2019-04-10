package co.com.samtel.cargue.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigInfFinancieraColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigInfFinancieraCsv;
import co.com.samtel.entity.manual.sql.BigInfFinanciera;
import co.com.samtel.entity.manual.sql.BigInfFinancieraId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigInfFinancieraMapper")
public class BigInfFinancieraMapper extends
		AbsStrategyMapper<BigInfFinancieraCsv, TypeBigInfFinancieraColumn, BigInfFinanciera>
		implements IStrategyMapper<BigInfFinancieraCsv> {

	@EJB(beanName = "bigInfFinancieraDao")
	IGenericDao<BigInfFinanciera, BigInfFinancieraId, DummyConsecutivo> objDao;
	
	ModelMapper modelMapper = new ModelMapper();	
	ArrayList<BigInfFinanciera> obj = new ArrayList<>();

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_INF_FINANCIERA);
		setObjectMapper(new BigInfFinancieraCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigInfFinanciera getCustomMapper(BigInfFinancieraCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigInfFinanciera destinoSql = modelMapper.map(dto, BigInfFinanciera.class);
		BigInfFinancieraId id= new BigInfFinancieraId(dto.getI_cod_oficina() ,dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

	@Override
	public List<BigInfFinanciera> getCustomMapper2(List<BigInfFinancieraCsv> dto) {
		for (BigInfFinancieraCsv item : dto) {
			BigInfFinanciera destinoSql = modelMapper.map(item, BigInfFinanciera.class);
			BigInfFinancieraId id= new BigInfFinancieraId(item.getI_cod_oficina() ,item.getD_fecha_corte());
			destinoSql.setId(id);
			obj.add(destinoSql);
		}
		System.out.println("salio");
		return obj;
	}

}
