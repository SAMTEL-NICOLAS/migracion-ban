package co.com.samtel.cargue.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaUpdate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigGeneraIcsColumn;
import co.com.samtel.cargue.exception.UploadMapperExpetion;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.manual.csv.BigGeneraIcsCsv;
import co.com.samtel.entity.manual.sql.BigGeneraIcs;
import co.com.samtel.entity.manual.sql.BigGeneraIcsId;
import co.com.samtel.entity.sql.BigClientes;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name = "bigGeneraIcsMapper")
public class BigGeneraIcsMapper extends AbsStrategyMapper<BigGeneraIcsCsv, TypeBigGeneraIcsColumn, BigGeneraIcs>
		implements IStrategyMapper<BigGeneraIcsCsv> {

	@EJB(beanName = "bigGeneraIcsDao")
	IGenericDao<BigGeneraIcs, BigGeneraIcsId> objDao;

	@EJB
	IFactorySessionHibernate factorySessionHibernate;

	@SuppressWarnings("static-access")
	@PostConstruct
	public void init() {
		getDao().setTypeConection(TypeConections.SQLSERVER);
		setTypeFile(TypeFile.BIG_GENERA_ICS);
		setObjectMapper(new BigGeneraIcsCsv());
		setListEnumColumns(Arrays.asList(getEnumColumns().values()));
	}

	@Override
	public IGenericDao getDao() {
		return objDao;
	}

	@Override
	public BigGeneraIcs getCustomMapper(BigGeneraIcsCsv dto) {
		List<BigClientes> missingField = extractMissingField(dto);
		if (!missingField.isEmpty() == true) {
			dto.setI_codigo_cliente(missingField.get(0).getNui());
		}
		ModelMapper modelMapper = new ModelMapper();
		BigGeneraIcs destinoSql = modelMapper.map(dto, BigGeneraIcs.class);
		BigGeneraIcsId id = new BigGeneraIcsId(dto.getI_codigo_cliente(), dto.getS_cod_producto(),
				dto.getD_fecha_corte());
		destinoSql.setId(id);
		System.out.println(destinoSql);
		return destinoSql;
	}

	public List<BigClientes> extractMissingField(BigGeneraIcsCsv dto) {
		System.out.println(dto);
		System.out.println(dto.getS_id_cliente());
		Session session = null;
		List<BigClientes> result = null;
		try {
			session = factorySessionHibernate.generateSesion(TypeConections.SQLSERVER).openSession();
			Criteria crit = session.createCriteria(BigClientes.class)
					.add(Restrictions.eq("numidentif", dto.getS_id_cliente()));
			result = crit.list();
			if (result.isEmpty()) {
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
