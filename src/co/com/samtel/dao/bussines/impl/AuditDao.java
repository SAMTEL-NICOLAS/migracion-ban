package co.com.samtel.dao.bussines.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.JDBCConnectionException;

import co.com.samtel.dao.bussines.IAuditDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.Auditoria;
import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name="auditDao")
public class AuditDao extends AbsDao<Auditoria, Long> implements IAuditDao {
	
	
	@EJB
	IFactorySessionHibernate factorySessionHibernate;
	
	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}
	
	@Override
	public Long insertAudit(Auditoria audit) throws ControlledExeption {
		Session session = null;
		Transaction tx = null;
		Long id = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			id = (Long) session.save(audit);
			tx.commit();
		}catch (JDBCConnectionException e) {
			throw new ControlledExeption("Error al intentar generar la conexion a la base de datos: " +getTypeConection().getValue()); 
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
		return id;
	}

	@Override
	public List<Auditoria> finAuditSqlServer(String date) {
		Session session = null;
		List<Auditoria> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			SimpleDateFormat parseador = new SimpleDateFormat("yyyy-MM-dd");		
			Date fecha = parseador.parse(date);
			Criteria crit = session.createCriteria(getDomainClass()).add(Restrictions.eq("fecha", fecha));
			//Criteria crit = session.createCriteria(getDomainClass());
			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}

}
