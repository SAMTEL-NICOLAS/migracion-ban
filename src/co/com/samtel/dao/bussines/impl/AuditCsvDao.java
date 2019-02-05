package co.com.samtel.dao.bussines.impl;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.JDBCConnectionException;

import co.com.samtel.dao.bussines.IAuditDaoCsv;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.AuditoriaCsv;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name = "auditCsvDao")
public class AuditCsvDao extends AbsDao<AuditoriaCsv, Long> implements IAuditDaoCsv {

	@EJB
	IFactorySessionHibernate factorySessionHibernate;

	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}

	@Override
	public Long insertAudit(AuditoriaCsv audit) throws ControlledExeption {
		Session session = null;
		Transaction tx = null;
		Long id = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			id = (Long) session.save(audit);
			tx.commit();
		} catch (JDBCConnectionException e) {
			throw new ControlledExeption(
					"Error al intentar generar la conexion a la base de datos: " + getTypeConection().getValue());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
		return id;
	}
}
