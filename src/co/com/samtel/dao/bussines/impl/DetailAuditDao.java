package co.com.samtel.dao.bussines.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;

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

	@Override
	public List<DetailAudit> findAllDetailAudit() {
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
