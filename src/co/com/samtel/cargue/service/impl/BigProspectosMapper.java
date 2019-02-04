package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;
import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigProspectosColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigPropectosCsv;
import co.com.samtel.entity.manual.sql.BigProspectos;
import co.com.samtel.entity.manual.sql.BigProspectosId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigProspectosMapper")
public class BigProspectosMapper extends AbsStrategyMapper<BigPropectosCsv, TypeBigProspectosColumn, BigProspectos>
		implements IStrategyMapper<BigPropectosCsv> {

	@EJB(beanName="bigProspectosDao")
	IGenericDao<BigProspectos,BigProspectosId > objDao;
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_PROSPECTOS);
		setObjectMapper(new BigPropectosCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigProspectos getCustomMapper(BigPropectosCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigProspectos destinoSql = modelMapper.map(dto, BigProspectos.class);
		BigProspectosId id= new BigProspectosId(dto.getS_codigo_tipo_identificacion(), dto.getS_numero_identificacion(),dto.getI_numero_carpeta(),dto.getD_fecha_cargue());
		destinoSql.setId(id);
		return destinoSql;
	}

}
