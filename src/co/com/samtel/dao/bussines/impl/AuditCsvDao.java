package co.com.samtel.dao.bussines.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.JDBCConnectionException;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.bussines.IAuditDaoCsv;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.AuditoriaCsv;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.hibernate.IFactorySessionHibernate;

@Stateless(name = "auditCsvDao")
public class AuditCsvDao extends AbsDao<AuditoriaCsv, Long, DummyConsecutivo> implements IAuditDaoCsv {

	@EJB
	IFactorySessionHibernate factorySessionHibernate;

	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}

	/**
	 * Metodo que se encarga insertar los registros de la Auditoria que se realizara
	 * para el cargue de excel.
	 */
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

	/**
	 * Metodo que se encarga de consultar los registros de la tabla de AUDITORIA
	 * filtrandolos por fecha.
	 */
	@Override
	public List<AuditoriaCsv> getAuditByDate(String date1, String date2, String id) {
		Session session = null;
		List<AuditoriaCsv> result = null;
		Long idAuditoria= Long.parseLong(id);
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			SimpleDateFormat parseador = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha1 = parseador.parse(date1);
			Date fecha2 = parseador.parse(date2);
			fecha2 = addDays(fecha2, 1);
			Criteria crit = session.createCriteria(getDomainClass());
			crit.add(Restrictions.ge("fecha", fecha1));
			crit.add(Restrictions.lt("fecha", fecha2));
			crit.add(Restrictions.eq("id", idAuditoria));			
			result = crit.list();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}
	@Override
	public List<AuditoriaCsv> getAuditByDateAllId(String date1, String date2) {
		Session session = null;
		List<AuditoriaCsv> result = null;
		try {
			session = getFactorySessionHibernate().generateSesion(getTypeConection()).openSession();
			SimpleDateFormat parseador = new SimpleDateFormat("yyyy-MM-dd");
			Date fecha1 = parseador.parse(date1);
			Date fecha2 = parseador.parse(date2);
			fecha2 = addDays(fecha2, 1);
			Criteria crit = session.createCriteria(getDomainClass());
			crit.add(Restrictions.ge("fecha", fecha1));
			crit.add(Restrictions.lt("fecha", fecha2));
			crit.add(Restrictions.eq("estadoActividad", "A"));	
			crit.addOrder(Order.asc("id"));
			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getFactorySessionHibernate().close(session, null);
		}
		return result;
	}

	/**
	 * Metodo que se encarga de consultar todos los registros de la tabla AUDITORIA
	 * que se encuentra en la base de datos.
	 */
	@Override
	public List<AuditoriaCsv> findAllAudit() {
		Session session = null;
		List<AuditoriaCsv> result = null;
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

	/**
	 * Metodo que se encarga de sumar dias a una fecha.
	 * 
	 * @param date
	 * @param day
	 * @return
	 */
	public Date addDays(Date date, int day) {
		if (day == 0) {
			return date;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		return calendar.getTime();
	}
}
