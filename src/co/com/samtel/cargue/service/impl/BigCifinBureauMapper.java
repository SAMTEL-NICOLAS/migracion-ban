package co.com.samtel.cargue.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigCifinBureauColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigCifinBureauCsv;
import co.com.samtel.entity.manual.sql.BigCifinBureau;
import co.com.samtel.entity.manual.sql.BigCifinBureauId;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "bigCifinBureauMapper")
public class BigCifinBureauMapper extends AbsStrategyMapper<BigCifinBureauCsv, TypeBigCifinBureauColumn, BigCifinBureau>
		implements IStrategyMapper<BigCifinBureauCsv> {

	@EJB(beanName = "bigCifinBureauDao")
	IGenericDao<BigCifinBureau, BigCifinBureauId> objDao;
    ArrayList<BigCifinBureau> n = new ArrayList<>(); 
    ModelMapper modelMapper = new ModelMapper();
    
	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_CIFIN_BUREAU);
		setObjectMapper(new BigCifinBureauCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigCifinBureau getCustomMapper(BigCifinBureauCsv dto) {
		ModelMapper modelMapper = new ModelMapper();
		BigCifinBureau destinoSql = modelMapper.map(dto, BigCifinBureau.class);
		BigCifinBureauId id= new BigCifinBureauId(dto.getI_codigo_cliente(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

	@Override
	public List<BigCifinBureau> getCustomMapper2(List<BigCifinBureauCsv> dto) {
		for (BigCifinBureauCsv item : dto) {
			BigCifinBureau destinoSql = modelMapper.map(item, BigCifinBureau.class);
			BigCifinBureauId id = new BigCifinBureauId(item.getI_codigo_cliente(), item.getD_fecha_corte());
			destinoSql.setId(id);
			n.add(destinoSql);
		}
		System.out.println("salio");
		return n;
	}
}
