package co.com.samtel.hibernate.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import co.com.samtel.enumeraciones.TypeConections;

public abstract class HibernateConnAbs {
	
	protected abstract Logger getLogger();
	
	private TypeConections typeConections;
	private SessionFactory sessionFactory;

	public TypeConections getTypeConections() {
		return typeConections;
	}

	public void setTypeConections(TypeConections typeConections) {
		this.typeConections = typeConections;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Metodo con el cual genero la session de hibernate
	 */
	public void generateSession() {
		try {
			if (getSessionFactory() == null) {
				Configuration configuration = new Configuration();
				configuration.configure(getTypeConections().getConfig());
				StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
				serviceRegistryBuilder.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
				setSessionFactory(configuration.buildSessionFactory(serviceRegistry));
				getLogger().log(Level.INFO, ".::. Se genero correctamente la session de sql server .::.");
			}
		} catch (Exception e) {
			getLogger().log(Level.SEVERE, ".::. Error al generar la conexion con ".concat(getTypeConections().getValue()).concat(" .::. "), e);
			e.printStackTrace();
		}
		
	}
}
