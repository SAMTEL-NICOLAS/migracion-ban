package co.com.samtel.cargue.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.modelmapper.ModelMapper;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.enumeraciones.tables.TypeBigSegurosColumn;
import co.com.samtel.cargue.service.IStrategyMapper;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.CnofcAs;
import co.com.samtel.entity.manual.csv.BigGeneraIcsCsv;
import co.com.samtel.entity.manual.csv.BigSegurosCsv;
import co.com.samtel.entity.manual.sql.BigSeguros;
import co.com.samtel.entity.manual.sql.BigSegurosId;
import co.com.samtel.entity.sql.BigActivos;
import co.com.samtel.entity.sql.BigClientes;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name = "bigSegurosMapper")
public class BigSegurosMapper extends AbsStrategyMapper<BigSegurosCsv, TypeBigSegurosColumn, BigSeguros>
		implements IStrategyMapper<BigSegurosCsv> {

	@EJB(beanName = "bigSegurosDao")
	IGenericDao<BigSeguros, BigSegurosId> objDao;

	@EJB
	IFactorySessionHibernate factorySessionHibernate;

	
    ModelMapper modelMapper = new ModelMapper();	
	ArrayList<BigSeguros> obj = new ArrayList<>();

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
		dto.setI_cod_producto(99);
		dto.setD_fecha_corte(dto.getD_fecha());
		System.out.println(dto);
		List<BigClientes> missingField = extractMissingFieldCodeCliente(dto);
		if (!missingField.isEmpty() == true) {
			dto.setI_codigo_cliente(missingField.get(0).getNui());
			List<BigActivos> missingFieldCodeProduct = extractMissingFieldCodeProduct(dto);
			if (!missingFieldCodeProduct.isEmpty() == true) {
				Long codeProduct = Long.parseLong(missingFieldCodeProduct.get(0).getId().getI_nro_credito());
				dto.setI_producto_asociado(codeProduct);
			}
			List<CnofcAs> missingFieldCodeAdviser = extractMissingFieldCodeAdviser(dto);
			if(!missingFieldCodeAdviser.isEmpty() == true) {				
				int codeAdviser = Integer.parseInt(missingFieldCodeAdviser.get(0).getId().getCodigo_asesor());
				dto.setI_codigo_asesor(codeAdviser);
			}
		} else {
			dto.setI_codigo_cliente(null);
			dto.setI_producto_asociado(null);
		}
		System.out.println(dto);
		ModelMapper modelMapper = new ModelMapper();
		BigSeguros destinoSql = modelMapper.map(dto, BigSeguros.class);
		BigSegurosId id = new BigSegurosId(dto.getS_plan(), dto.getI_cod_producto(), dto.getI_codigo_cliente(),
				dto.getD_fecha_corte());
		destinoSql.setId(id);
		return destinoSql;
	}

	public List<BigClientes> extractMissingFieldCodeCliente(BigSegurosCsv dto) {
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

	public List<BigActivos> extractMissingFieldCodeProduct(BigSegurosCsv item) {
		Session session = null;
		List<BigActivos> result = null;
		try {
			session = factorySessionHibernate.generateSesion(TypeConections.SQLSERVER).openSession();

			DetachedCriteria subCriteria = DetachedCriteria.forClass(BigActivos.class)
					.setProjection(Projections.max("fecinicred"))
					.add(Restrictions.eq("num_idclie", item.getI_codigo_cliente()));

			Criteria crit = session.createCriteria(BigActivos.class)
					.add(Subqueries.propertyEq("fecinicred", subCriteria))
					.add(Restrictions.eq("num_idclie", item.getI_codigo_cliente()));
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
	
	public  List<CnofcAs> extractMissingFieldCodeAdviser(BigSegurosCsv dto) {
		System.out.println(dto.getS_id_vendedor());
		Session session = null;
		List<CnofcAs> result = null;
		try {
			session = factorySessionHibernate.generateSesion(TypeConections.AS400).openSession();
			Criteria crit = session.createCriteria(CnofcAs.class)
					.add(Restrictions.eq("cnorut", dto.getS_id_vendedor()));
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

	@Override
	public List<BigSeguros> getCustomMapper2(List<BigSegurosCsv> dto) {
		for (BigSegurosCsv item : dto) {
			item.setI_cod_producto(99);
			item.setD_fecha_corte(item.getD_fecha());
			List<BigClientes> missingField = extractMissingFieldCodeCliente(item);
			if (!missingField.isEmpty() == true) {
				item.setI_codigo_cliente(missingField.get(0).getNui());
				List<BigActivos> missingFieldCodeProduct = extractMissingFieldCodeProduct(item);
				if (!missingFieldCodeProduct.isEmpty() == true) {
					Long codeProduct = Long.parseLong(missingFieldCodeProduct.get(0).getId().getI_nro_credito());
					item.setI_producto_asociado(codeProduct);
				}
				List<CnofcAs> missingFieldCodeAdviser = extractMissingFieldCodeAdviser(item);
				if (!missingFieldCodeAdviser.isEmpty() == true) {
					int codeAdviser = Integer.parseInt(missingFieldCodeAdviser.get(0).getId().getCodigo_asesor());
					item.setI_codigo_asesor(codeAdviser);
				}
			} else {
				item.setI_codigo_cliente(null);
				item.setI_producto_asociado(null);
			}
			BigSeguros destinoSql = modelMapper.map(item, BigSeguros.class);
			BigSegurosId id = new BigSegurosId(item.getS_plan(), item.getI_cod_producto(), item.getI_codigo_cliente(),
					item.getD_fecha_corte());
			destinoSql.setId(id);
			obj.add(destinoSql);
		}
		return obj;
	}
}
