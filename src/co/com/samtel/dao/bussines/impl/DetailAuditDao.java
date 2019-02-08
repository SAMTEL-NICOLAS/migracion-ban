package co.com.samtel.dao.bussines.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import co.com.samtel.dao.bussines.IDetailAudit;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "detailAuditDao")
public class DetailAuditDao extends AbsDao<DetailAudit, Long> implements IDetailAudit {

	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}

	/**
	 * Metodo que se encarga de consultar el detalle de la auditoria en la base de
	 * datos filtrando por el id de la tabla padre.
	 */
	@Override
	public List<DetailAudit> getDetailById(String idDatail) {
		Session session = null;
		List<DetailAudit> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass());
			crit.add(Restrictions.eq("idAudit", Long.valueOf(idDatail)));

			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}

	@Override
	public List<DetailAudit> getAllDetailAudit() {
		Session session = null;
		List<DetailAudit> result = null;
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
