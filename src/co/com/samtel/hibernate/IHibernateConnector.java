package co.com.samtel.hibernate;

import javax.ejb.Local;

import org.hibernate.SessionFactory;

@Local
public interface IHibernateConnector {
	
	SessionFactory getSessionFactory();
	
}
