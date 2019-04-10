package co.com.samtel.cargue.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigGeoreferenciarProspectoColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigGeoReferenciarProspectoCsv;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspecto;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspectoId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigGeorreferenciarProspectoMapper")
public class BigGeorreferenciarProspectoMapper extends
		AbsStrategyMapper<BigGeoReferenciarProspectoCsv, TypeBigGeoreferenciarProspectoColumn, BigGeoReferenciarProspecto>
		implements IStrategyMapper<BigGeoReferenciarProspectoCsv> {

	@EJB(beanName = "bigGeoreferenciarProspectoDao")
	IGenericDao<BigGeoReferenciarProspecto, BigGeoReferenciarProspectoId, DummyConsecutivo> objDao;
	
	ModelMapper modelMapper = new ModelMapper();	
	ArrayList<BigGeoReferenciarProspecto> obj = new ArrayList<>();

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_GEOREFERENCIAR_PROSPECTO);
		setObjectMapper(new BigGeoReferenciarProspectoCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigGeoReferenciarProspecto getCustomMapper(BigGeoReferenciarProspectoCsv dto) {
		ModelMapper modelMapper = new ModelMapper();
		BigGeoReferenciarProspecto destinoSql = modelMapper.map(dto, BigGeoReferenciarProspecto.class);
		BigGeoReferenciarProspectoId id = new BigGeoReferenciarProspectoId(dto.getI_tipo_persona(),
				dto.getS_codigo_persona(), dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

	@Override
	public List<BigGeoReferenciarProspecto> getCustomMapper2(List<BigGeoReferenciarProspectoCsv> dto) {
		for (BigGeoReferenciarProspectoCsv item : dto) {
			BigGeoReferenciarProspecto destinoSql = modelMapper.map(item, BigGeoReferenciarProspecto.class);
			BigGeoReferenciarProspectoId id = new BigGeoReferenciarProspectoId(item.getI_tipo_persona(),
					item.getS_codigo_persona(), item.getD_fecha_corte());
			destinoSql.setId(id);
			obj.add(destinoSql);
		}
		System.out.println("salio");
		return obj;
	}
}
