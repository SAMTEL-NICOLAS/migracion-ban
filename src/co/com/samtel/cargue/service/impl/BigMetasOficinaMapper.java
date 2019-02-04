package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigMetasOficinaColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigMetasOficinaCsv;
import co.com.samtel.entity.manual.sql.BigMetasOficina;
import co.com.samtel.entity.manual.sql.BigMetasOficinaId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigMetasOficinaMapper")
public class BigMetasOficinaMapper extends AbsStrategyMapper<BigMetasOficinaCsv, TypeBigMetasOficinaColumn,BigMetasOficina>
		implements IStrategyMapper<BigMetasOficinaCsv> {

	@EJB(beanName="bigMetasOficinaDao")
	IGenericDao<BigMetasOficina, BigMetasOficinaId> objDao;

		@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_METAS_OFICINA);
		setObjectMapper(new BigMetasOficinaCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigMetasOficina getCustomMapper(BigMetasOficinaCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigMetasOficina destinoSql = modelMapper.map(dto, BigMetasOficina.class);
		BigMetasOficinaId id= new BigMetasOficinaId(dto.getS_cod_oficina(),dto.getI_cod_segmento_producto(),dto.getS_nombre_meta(),dto.getD_fecha());
		destinoSql.setId(id);
		return destinoSql;
	}

}
