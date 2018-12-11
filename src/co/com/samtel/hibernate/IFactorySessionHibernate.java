package co.com.samtel.hibernate;

import javax.ejb.Local;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.com.samtel.enumeraciones.TypeConections;

@Local
public interface IFactorySessionHibernate {
	/**
	 * Metodo el cual se encargara de entregar una session de hibernate lista para
	 * usar dependiendo del tipo de conexion que se requiera
	 * 
	 * @param typeConections
	 * @return
	 */
	SessionFactory generateSesion(TypeConections typeConections);

	/**
	 * Metodo con el cual me encargo de hacer flush commit y cerrar la session cada
	 * vez que se necesite
	 * 
	 * @param session
	 */
	void close(Session session, Transaction tx);
}
