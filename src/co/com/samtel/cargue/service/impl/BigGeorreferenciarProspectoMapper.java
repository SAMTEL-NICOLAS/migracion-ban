package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigGeoreferenciarProspectoColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigGeoreferenciarProspectoCsv;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspecto;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspectoId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigGeorreferenciarProspectoMapper")
public class BigGeorreferenciarProspectoMapper
		extends AbsStrategyMapper<BigGeoreferenciarProspectoCsv, TypeBigGeoreferenciarProspectoColumn,BigGeoReferenciarProspecto>
		implements IStrategyMapper<BigGeoreferenciarProspectoCsv> {
	
	@EJB(beanName="bigGeoreferenciarProspectoDao")
	IGenericDao<BigGeoReferenciarProspecto,BigGeoReferenciarProspectoId > objDao;
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_GEOREFERENCIAR_PROSPECTO);
		setObjectMapper(new BigGeoreferenciarProspectoCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigGeoReferenciarProspecto getCustomMapper(BigGeoreferenciarProspectoCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigGeoReferenciarProspecto destinoSql = modelMapper.map(dto, BigGeoReferenciarProspecto.class);
		BigGeoReferenciarProspectoId id= new BigGeoReferenciarProspectoId(dto.getI_tipo_persona(), dto.getS_codigo_persona(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

}
