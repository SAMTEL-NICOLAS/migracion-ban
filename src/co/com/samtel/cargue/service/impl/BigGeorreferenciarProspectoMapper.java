package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigGeoreferenciarProspectoColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigGeoReferenciarProspectoCsv;
import co.com.samtel.entity.manual.sql.BigDesendeudese;
import co.com.samtel.entity.manual.sql.BigDesendeudeseId;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspecto;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspectoId;

@Stateless(name = "bigGeorreferenciarProspectoMapper")
public class BigGeorreferenciarProspectoMapper
		extends AbsStrategyMapper<BigGeoReferenciarProspectoCsv, TypeBigGeoreferenciarProspectoColumn,BigGeoReferenciarProspecto>
		implements IStrategyMapper<BigGeoReferenciarProspectoCsv> {
	
	@EJB(beanName="bigDesendeudeseDao")
	IGenericDao<BigGeoReferenciarProspecto,BigGeoReferenciarProspectoId > objDao;
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		setTypeFile(TypeFile.BIG_GEOREFERENCIAR_PROSPECTO);
		setObjectMapper(new BigGeoReferenciarProspectoCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigGeoReferenciarProspecto getCustomMapper(BigGeoReferenciarProspectoCsv dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
