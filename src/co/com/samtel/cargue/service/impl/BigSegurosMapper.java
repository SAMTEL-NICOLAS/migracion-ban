package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigSegurosColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigSegurosCsv;
import co.com.samtel.entity.manual.sql.BigSeguros;
import co.com.samtel.entity.manual.sql.BigSegurosId;
import co.com.samtel.entity.sql.BigClientes;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name = "bigSegurosMapper")
public class BigSegurosMapper extends
		AbsStrategyMapper<BigSegurosCsv, TypeBigSegurosColumn, BigSeguros>
		implements IStrategyMapper<BigSegurosCsv> {

	@EJB(beanName = "bigSegurosDao")
	IGenericDao<BigSeguros, BigSegurosId> objDao;
	
	@EJB
	IFactorySessionHibernate factorySessionHibernate;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_SEGUROS);
		setObjectMapper(new BigSegurosCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigSeguros getCustomMapper(BigSegurosCsv dto) {
		System.out.println(dto);
		dto.setI_cod_producto(99);
		dto.setD_fecha_corte(dto.getD_fecha());
		System.out.println(dto);
		List<BigClientes> missingField = extractMissingField(dto);		
		System.out.println(missingField.get(0).getNui());
		dto.setI_codigo_cliente(missingField.get(0).getNui());
		System.out.println(dto);
		ModelMapper modelMapper = new ModelMapper();		
		BigSeguros destinoSql = modelMapper.map(dto, BigSeguros.class);
		BigSegurosId id= new BigSegurosId(dto.getS_plan(),dto.getI_cod_producto(),dto.getI_codigo_cliente(),dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}
	public List<BigClientes> extractMissingField(BigSegurosCsv dto) {
		System.out.println(dto.getS_id_cliente());
		Session session = null;
		List<BigClientes> result = null;
		try {
			session = factorySessionHibernate.generateSesion(TypeConections.SQLSERVER).openSession();
			Criteria crit = session.createCriteria(BigClientes.class)
					.add(Restrictions.eq("numidentif", dto.getS_id_cliente()));
			result = crit.list();	
			if(result.isEmpty()) {
				System.out.println("La consulta no retorna nada");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
		return result;
	}

}
