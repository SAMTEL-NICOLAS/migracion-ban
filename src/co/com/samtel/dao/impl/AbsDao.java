package co.com.samtel.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.hibernate.IFactorySessionHibernate;

public abstract class AbsDao<T, PK> implements IGenericDao<T, PK> {

	private Class<T> domainClass = initDomainClass();

	private TypeConections typeConection;

	private Long numRecordsTable;
	
	private ErrorDto error;

	@Inject
	IFactorySessionHibernate factorySessionHibernate;

	/**
	 * Metodo con el cual obtengo la clase en la cual se esta implemento la clase
	 * abstracta
	 * 
	 * @return
	 */
	protected Class<T> initDomainClass() {
		if (domainClass == null) {
			ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
			domainClass = (Class) thisType.getActualTypeArguments()[0];
		}
		return domainClass;
	}

	@Override
	public void countRecordsTable() {
		Session session = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			setNumRecordsTable((Long) session.createCriteria(getDomainClass()).setProjection(Projections.rowCount())
					.uniqueResult());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findBlockData(String idColum, Integer fin, Integer offset) {
		Session session = null;
		List<T> result = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass())
					.add(Restrictions.sqlRestriction(" 1 = 1 ORDER BY " + idColum + " OFFSET " + fin + " ROWS "))
					.setMaxResults(offset);

			result = crit.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
		return result;
	}

	@Override
	public Boolean saveBlockInformation(List<T> blockInformation) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			for (T item : blockInformation) {
				tx = session.beginTransaction();
				session.save(item);
				tx.commit();
			}
			return Boolean.TRUE;
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			setError(ErrorDto.of(null, TypeErrors.CONSTRAINT_VIOLATION, e.toString() + e.getSQLException()));
			return Boolean.FALSE;
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;
		} finally {
			factorySessionHibernate.close(session, tx);
		}
	}

	public Class<T> getDomainClass() {
		return domainClass;
	}

	public void setDomainClass(Class<T> domainClass) {
		this.domainClass = domainClass;
	}

	public TypeConections getTypeConection() {
		return typeConection;
	}

	public void setTypeConection(TypeConections typeConection) {
		this.typeConection = typeConection;
	}

	public Long getNumRecordsTable() {
		return numRecordsTable;
	}

	public void setNumRecordsTable(Long numRecordsTable) {
		this.numRecordsTable = numRecordsTable;
	}

	public IFactorySessionHibernate getFactorySessionHibernate() {
		return factorySessionHibernate;
	}

	public void setFactorySessionHibernate(IFactorySessionHibernate factorySessionHibernate) {
		this.factorySessionHibernate = factorySessionHibernate;
	}

	public ErrorDto getError() {
		return error;
	}

	public void setError(ErrorDto error) {
		this.error = error;
	}
	
	

}
