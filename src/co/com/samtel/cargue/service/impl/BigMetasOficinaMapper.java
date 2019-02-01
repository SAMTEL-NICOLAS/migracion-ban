package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigMetasOficinaColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigMetasOficinaCsv;
import co.com.samtel.entity.manual.sql.BigMetasOficina;

@Stateless(name = "bigMetasOficinaMapper")
public class BigMetasOficinaMapper extends AbsStrategyMapper<BigMetasOficinaCsv, TypeBigMetasOficinaColumn,BigMetasOficina>
		implements IStrategyMapper<BigMetasOficinaCsv> {

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_METAS_OFICINA);
		setObjectMapper(new BigMetasOficinaCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigMetasOficina getCustomMapper(BigMetasOficinaCsv dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
