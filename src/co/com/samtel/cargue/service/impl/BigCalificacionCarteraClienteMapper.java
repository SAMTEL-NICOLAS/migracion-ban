package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigCalificacionCarteraClienteColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigCalificacionCarteraClienteCsv;
import co.com.samtel.entity.manual.sql.BigCalificacionCarteraCliente;
import co.com.samtel.entity.manual.sql.BigCalificacionCarteraClienteId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigCalificacionCarteraClienteMapper")
public class BigCalificacionCarteraClienteMapper
		extends AbsStrategyMapper<BigCalificacionCarteraClienteCsv, TypeBigCalificacionCarteraClienteColumn,BigCalificacionCarteraCliente>
		implements IStrategyMapper<BigCalificacionCarteraClienteCsv> {
	
	@EJB(beanName="bigCalificacionCarteraClienteDao")
	IGenericDao<BigCalificacionCarteraCliente,BigCalificacionCarteraClienteId > objDao;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_CALIFICACION_CARTERA_CLIENTE);
		setObjectMapper(new BigCalificacionCarteraClienteCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return 	objDao;
	}

	@Override
	public BigCalificacionCarteraCliente getCustomMapper(BigCalificacionCarteraClienteCsv dto) {
		ModelMapper modelMapper = new ModelMapper();
		BigCalificacionCarteraCliente destinoSql = modelMapper.map(dto, BigCalificacionCarteraCliente.class);
		BigCalificacionCarteraClienteId id= new BigCalificacionCarteraClienteId(dto.getI_codigo_cliente(),dto.getI_cod_operacion(),dto.getD_fecha_carga());
		destinoSql.setId(id);
		return destinoSql;
	}
}
