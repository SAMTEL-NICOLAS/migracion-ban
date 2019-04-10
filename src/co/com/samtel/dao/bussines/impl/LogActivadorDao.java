package co.com.samtel.dao.bussines.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.bussines.ILogActivadorDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.LogActivador;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "logActivadorDao")
public class LogActivadorDao extends AbsDao<LogActivador, Long, DummyConsecutivo> implements ILogActivadorDao {

	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.AS400);
	}

	@Override
	public List<LogActivador> findLogActive() {
		Session session = null;
		List<LogActivador> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass())
					.add(Restrictions.in("estado", new String[] { "0", "-2" }));

			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}
	
	@Override
	public List<LogActivador> findLogActiveByState(String estado) {
		Session session = null;
		List<LogActivador> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass()).add(Restrictions.eq("estado",estado));
			
			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}
	
	@Override
	public List<LogActivador> findLogAllActive() {
		Session session = null;
		List<LogActivador> result = null;
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