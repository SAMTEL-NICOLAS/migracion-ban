package co.com.samtel.hibernate.impl;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IHibernateConnector;

@Startup
@Singleton(name="hibernateConnAs400")
public class HibernateConnAs400 extends HibernateConnAbs implements IHibernateConnector {

	
	private static final Logger LOG = Logger.getLogger(HibernateConnAs400.class.getName());

	/**
	 * Metodo con el cual inicializo el la configuracion de SqlServer
	 */
	@PostConstruct
	public void init() {
		setTypeConections(TypeConections.AS400);
		generateSession();
	}

	@Override
	protected Logger getLogger() {
		return LOG;
	}

}