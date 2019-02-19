package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigSegurosColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigSegurosCsv;
import co.com.samtel.entity.manual.sql.BigSeguros;
import co.com.samtel.entity.manual.sql.BigSegurosId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigSegurosMapper")
public class BigSegurosMapper extends
		AbsStrategyMapper<BigSegurosCsv, TypeBigSegurosColumn, BigSeguros>
		implements IStrategyMapper<BigSegurosCsv> {

	@EJB(beanName = "bigSegurosDao")
	IGenericDao<BigSeguros, BigSegurosId> objDao;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_SEGUROS);
		setObjectMapper(new BigSegurosCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigSeguros getCustomMapper(BigSegurosCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigSeguros destinoSql = modelMapper.map(dto, BigSeguros.class);
		BigSegurosId id= new BigSegurosId(dto.getS_plan(),dto.getI_cod_producto(),dto.getI_codigo_cliente(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

}
