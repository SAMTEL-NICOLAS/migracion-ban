package co.com.samtel.cargue.service.impl;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigCalificacionCarteraClienteColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigCalificacionCarteraClienteCsv;
import co.com.samtel.entity.manual.sql.BigCalificacionCarteraCliente;
import co.com.samtel.entity.manual.sql.BigCalificacionCarteraClienteId;

@Stateless(name = "bigCalificacionCarteraClienteMapper")
public class BigCalificacionCarteraClienteMapper
		extends AbsStrategyMapper<BigCalificacionCarteraClienteCsv, TypeBigCalificacionCarteraClienteColumn,BigCalificacionCarteraCliente>
		implements IStrategyMapper<BigCalificacionCarteraClienteCsv> {
	
	IGenericDao<BigCalificacionCarteraCliente,BigCalificacionCarteraClienteId > objDao;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
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
		// TODO Auto-generated method stub
		return null;
	}
}
