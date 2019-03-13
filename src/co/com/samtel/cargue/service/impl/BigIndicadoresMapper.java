package co.com.samtel.cargue.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigIndicadoresColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigIndicadoresCsv;
import co.com.samtel.entity.manual.sql.BigIndicadores;
import co.com.samtel.entity.manual.sql.BigIndicadoresId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigIndicadoresMapper")
public class BigIndicadoresMapper extends AbsStrategyMapper<BigIndicadoresCsv, TypeBigIndicadoresColumn,BigIndicadores>
		implements IStrategyMapper<BigIndicadoresCsv> {
	
	@EJB(beanName="bigIndicadoresDao")
	IGenericDao<BigIndicadores,BigIndicadoresId > objDao;
	ModelMapper modelMapper = new ModelMapper();	
	ArrayList<BigIndicadores> obj = new ArrayList<>();
	
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_PARA_INDICADORES);
		setObjectMapper(new BigIndicadoresCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}
	
	@Override
	public BigIndicadores getCustomMapper(BigIndicadoresCsv dto) {
		ModelMapper modelMapper = new ModelMapper();		
		BigIndicadores destinoSql = modelMapper.map(dto, BigIndicadores.class);
		BigIndicadoresId id= new BigIndicadoresId(dto.getI_id_indicador(),dto.getD_fecha_fin(), dto.getD_fecha_inicio());
		destinoSql.setId(id);
		return destinoSql;
	}

	@Override
	public List<BigIndicadores> getCustomMapper2(List<BigIndicadoresCsv> dto) {
		for (BigIndicadoresCsv item : dto) {
			BigIndicadores destinoSql = modelMapper.map(item, BigIndicadores.class);
			BigIndicadoresId id = new BigIndicadoresId(item.getI_id_indicador(), item.getD_fecha_fin(),
					item.getD_fecha_inicio());
			destinoSql.setId(id);
			obj.add(destinoSql);
		}
		System.out.println("salio");
		return obj;
	}
}
