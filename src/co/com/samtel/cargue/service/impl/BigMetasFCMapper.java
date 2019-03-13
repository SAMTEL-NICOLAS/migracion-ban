package co.com.samtel.cargue.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigMetasFuerzaComercialColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigMetasFuerzaComercialCsv;
import co.com.samtel.entity.manual.sql.BigMetasFuerzaComercial;
import co.com.samtel.entity.manual.sql.BigMetasFuerzaComercialId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigMetasFCMapper")
public class BigMetasFCMapper extends AbsStrategyMapper<BigMetasFuerzaComercialCsv, TypeBigMetasFuerzaComercialColumn, BigMetasFuerzaComercial>
		implements IStrategyMapper<BigMetasFuerzaComercialCsv> {
	
	@EJB(beanName="bigMetasFCDao")
	IGenericDao<BigMetasFuerzaComercial, BigMetasFuerzaComercialId > objDao;
	
	ModelMapper modelMapper = new ModelMapper();	
	ArrayList<BigMetasFuerzaComercial> obj = new ArrayList<>();
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_METAS_FUERZA_COMERCIAL);
		setObjectMapper(new BigMetasFuerzaComercialCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigMetasFuerzaComercial getCustomMapper(BigMetasFuerzaComercialCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigMetasFuerzaComercial destinoSql = modelMapper.map(dto, BigMetasFuerzaComercial.class);
		BigMetasFuerzaComercialId id= new BigMetasFuerzaComercialId(dto.getD_fecha(), dto.getI_cod_fuerza_comercial(),dto.getI_cod_segmento_producto(),dto.getI_categoria_asesor(),dto.getS_nombre_meta());
		destinoSql.setId(id);
		return destinoSql;
	}

	@Override
	public List<BigMetasFuerzaComercial> getCustomMapper2(List<BigMetasFuerzaComercialCsv> dto) {
		for (BigMetasFuerzaComercialCsv item : dto) {
			BigMetasFuerzaComercial destinoSql = modelMapper.map(item, BigMetasFuerzaComercial.class);
			BigMetasFuerzaComercialId id= new BigMetasFuerzaComercialId(item.getD_fecha(), item.getI_cod_fuerza_comercial(),item.getI_cod_segmento_producto(),item.getI_categoria_asesor(),item.getS_nombre_meta());
			destinoSql.setId(id);
			obj.add(destinoSql);
		}
		System.out.println("salio");
		return obj;
	}

}
