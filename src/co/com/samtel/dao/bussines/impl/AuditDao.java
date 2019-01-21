package co.com.samtel.dao.bussines.impl;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Session;
import org.hibernate.Transaction;

import co.com.samtel.dao.bussines.IAuditDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.Auditoria;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name="auditDao")
public class AuditDao extends AbsDao<Auditoria, Long> implements IAuditDao {
	
	
	@EJB(beanName="")
	IFactorySessionHibernate factorySessionHibernate;
	
	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}
	
	@Override
	public Long insertAudit(Auditoria audit) {
		Session session = null;
		Transaction tx = null;
		Long id = null;
		
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			id = (Long) session.save(audit);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
		return id;
	}

}
