package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigProductosColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigProductosCsv;
import co.com.samtel.entity.manual.sql.BigProductos;
import co.com.samtel.entity.manual.sql.BigProductosId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigProductosMapper")
public class BigProductosMapper extends AbsStrategyMapper<BigProductosCsv, TypeBigProductosColumn, BigProductos>
		implements IStrategyMapper<BigProductosCsv> {

	@EJB(beanName = "bigProductosDao")
	IGenericDao<BigProductos, BigProductosId> objDao;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_PRODUCTOS);
		setObjectMapper(new BigProductosCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigProductos getCustomMapper(BigProductosCsv dto) {
		ModelMapper modelMapper = new ModelMapper();
		BigProductos destinoSql = modelMapper.map(dto, BigProductos.class);
		BigProductosId id= new BigProductosId(dto.getI_cod_sub_producto(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

}
