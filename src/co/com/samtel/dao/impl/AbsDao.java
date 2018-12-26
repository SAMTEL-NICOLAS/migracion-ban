package co.com.samtel.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;
import lombok.Getter;
import lombok.Setter;


public abstract class AbsDao<T, PK> implements IGenericDao<T, PK> {

	private Class<T> domainClass = initDomainClass();
	
	private TypeConections typeConection;
	
	private Long numRecordsTable;
	
	@Inject
	IFactorySessionHibernate factorySessionHibernate;

	/**
	 * Metodo con el cual obtengo la clase en la cual se esta implemento la clase abstracta
	 * @return
	 */
	protected Class<T> initDomainClass() {
		if(domainClass == null) {
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
			setNumRecordsTable((Long) session
					.createCriteria(getDomainClass())
					.setProjection(Projections.rowCount())
					.uniqueResult());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
	}
	@Override
	public List<T> findBlockData(Integer ini, Integer fin) {
		Session session = null;
		List<T> result = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			Criteria crit = session
					.createCriteria(BigRecogidosAs.class)
					//.addOrder(Order.asc("id"))
					.setFirstResult(ini)
					.setMaxResults(fin);
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
			tx = session.beginTransaction();
			for(T item : blockInformation) {
				session.save(item);
			}
		} catch (Exception e) {
			tx.rollback();
			factorySessionHibernate.close(session, tx);
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, tx);
		}
		return null;
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
	
	


}