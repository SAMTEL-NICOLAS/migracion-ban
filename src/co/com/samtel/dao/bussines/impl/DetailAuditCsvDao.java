package co.com.samtel.dao.bussines.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import co.com.samtel.dao.bussines.IDetailAuditCsvDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.entity.business.DetailAuditCsv;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "detailAuditCsvDao")
public class DetailAuditCsvDao extends AbsDao<DetailAuditCsv, Long> implements IDetailAuditCsvDao {

	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}

	/**
	 * Metodo que se encarga de consultar el detalle de la auditoria en la base de
	 * datos filtrando por el id de la tabla padre.
	 */
	@Override
	public List<DetailAuditCsv> getDetailById(String idDatail,String table) {
		Session session = null;
		List<DetailAuditCsv> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass());
			crit.add(Restrictions.eq("idAudit", Long.valueOf(idDatail)));
			crit.addOrder(Order.asc("id"));
			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}
	
	/**
	 * Metodo que se encarga de consultar en la BD el detalle de la auditoria por id
	 * y por tabla
	 */
	@Override
	public List<DetailAuditCsv> getDetailByIdAndTable(String idDatail, String table) {
		Session session = null;
		List<DetailAuditCsv> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass());
			crit.add(Restrictions.eq("idAudit", Long.valueOf(idDatail)));
			crit.add(Restrictions.eq("tabla", table));
			crit.addOrder(Order.asc("id"));
			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}

	@Override
	public List<DetailAuditCsv> getAllDetailAudit() {
		Session session = null;
		List<DetailAuditCsv> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass());

			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}

}
