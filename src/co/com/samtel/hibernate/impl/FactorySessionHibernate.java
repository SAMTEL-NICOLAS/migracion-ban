package co.com.samtel.hibernate.impl;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;
import co.com.samtel.hibernate.IHibernateConnector;

@Singleton
@Startup
public class FactorySessionHibernate implements IFactorySessionHibernate {

	@EJB(beanName = "hibernateConnSqlServer")
	private IHibernateConnector HibernateConnSql;
	@EJB(beanName = "hibernateConnAs400")
	private IHibernateConnector HibernateConnAs400;

	@Override
	public SessionFactory generateSesion(TypeConections typeConections) {
		if (typeConections.equals(TypeConections.AS400)) {
			return getHibernateConnAs400().getSessionFactory();
		} else if (typeConections.equals(TypeConections.SQLSERVER)) {
			return getHibernateConnSql().getSessionFactory();
		}
		return null;
	}

	@Override
	public void close(Session session, Transaction tx) {
		try {
			if (tx != null) {
				tx.commit();
			}
		} catch (Exception e) {
			System.err.println("..:: Error al cerrar la conexion Transaccion ::.".concat(e.getMessage()));
		}
		try {
			if (session != null) {
				session.flush();
				session.close();
			}

		} catch (Exception e) {
			System.err.println("..:: Error al cerrar la conexion Session ::.".concat(e.getMessage()));
		}

	}

	public IHibernateConnector getHibernateConnSql() {
		return HibernateConnSql;
	}

	public void setHibernateConnSql(IHibernateConnector hibernateConnSql) {
		HibernateConnSql = hibernateConnSql;
	}

	public IHibernateConnector getHibernateConnAs400() {
		return HibernateConnAs400;
	}

	public void setHibernateConnAs400(IHibernateConnector hibernateConnAs400) {
		HibernateConnAs400 = hibernateConnAs400;
	}

}
