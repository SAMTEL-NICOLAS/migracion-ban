package co.com.samtel.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import org.hibernate.Criteria;
import org.hibernate.JDBCException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;
import org.hibernate.exception.JDBCConnectionException;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.hibernate.IFactorySessionHibernate;

public abstract class AbsDao<T, PK> implements IGenericDao<T, PK> {

	private Class<T> domainClass = initDomainClass();

	private TypeConections typeConection;

	private Long numRecordsTable;
	
	private Long numRecordsTableAll;

	private ErrorDto error;
	
	@EJB
	IFactorySessionHibernate factorySessionHibernate;

	/**
	 * Metodo con el cual obtengo la clase en la cual se esta implemento la clase
	 * abstracta
	 * 
	 * @return
	 */
	@SuppressWarnings("all")
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
					.add(Restrictions.eq("migrado", " ")).uniqueResult());
//			setNumRecordsTable((Long) session.createCriteria(getDomainClass()).setProjection(Projections.rowCount()).uniqueResult());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
	}
	@Override
	public void countRecordsTableAll() {
		Session session = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			setNumRecordsTableAll((Long) session.createCriteria(getDomainClass()).setProjection(Projections.rowCount()).uniqueResult());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findBlockData(String idColum, Integer offset) {
		Session session = null;
		List<T> result = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass())
					// .add(Restrictions.isNull("migrado"))
					.add(Restrictions.eq("migrado", " "))
					.add(Restrictions.sqlRestriction(" 1 = 1 ORDER BY " + idColum + " OFFSET 0 ROWS "))
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
		System.out.println(".:: Tamanio de la lista a persistir ".concat("" + blockInformation.size()).concat("::."));
		for (T item : blockInformation) {
			if (!saveEntity(item)) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean saveEntity2(List<T> entity) {
		for (T item : entity) {
			Session session = null;
			Transaction tx = null;
			setError(null);
			try {
				session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
				tx = session.beginTransaction();
				session.save(item);
				tx.commit();
				System.out.println("Todo ok");
			} catch (ConstraintViolationException e) {
				System.out.println("Error controlado debe actualizar");
				setError(ErrorDto.of(null, TypeErrors.CONSTRAINT_VIOLATION, e.toString() + e.getSQLException()));
				return Boolean.FALSE;
			} catch (DataException e) {
				e.printStackTrace();
				setError(ErrorDto.of(null, TypeErrors.DATAEXCEPTION, e.toString() + e.getSQLException()));
				System.out.println("Error" + e.getMessage());
				return Boolean.FALSE;
			} catch (Exception e) {
				setError(ErrorDto.of(null, TypeErrors.MAPPER_EROR, e.toString() + e.getMessage()));
			} finally {
				factorySessionHibernate.close(session, tx);
			}
		}
		return Boolean.TRUE;
	}
	@Override
	public Boolean saveEntity(T entity) {
		Session session = null;
		Transaction tx = null;
		setError(null);		
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			session.save(entity);
			tx.commit();
			System.out.println("Todo ok");
		} catch (ConstraintViolationException e) {
			System.out.println("Error controlado debe actualizar");
			setError(ErrorDto.of(null, TypeErrors.CONSTRAINT_VIOLATION, e.toString() + e.getSQLException()));
			return Boolean.FALSE;
		} catch (DataException e) {
			e.printStackTrace();
			setError(ErrorDto.of(null, TypeErrors.DATAEXCEPTION, e.toString() + e.getSQLException()));
			System.out.println("Error"+ e.getMessage());
			return Boolean.FALSE;	
		} catch (Exception e) {
			setError(ErrorDto.of(null,TypeErrors.MAPPER_EROR,e.toString() + e.getMessage()));
		} finally {
			factorySessionHibernate.close(session, tx);
		}
		return Boolean.TRUE;
	}

	@Override
	public Boolean updateEntity(T entity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			session.update(entity);
			tx.commit();
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
		return Boolean.TRUE;
	}

	@Override
	public Boolean updateListEntity(List<T> listEntity) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			for (T item : listEntity) {
				session.update(item);
			}
			tx.commit();
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
		return Boolean.TRUE;
	}

	@Override
	public Long getMaxValue() throws ControlledExeption {
		Long maxRecords = Long.valueOf("0");
		Session session = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass()).setProjection(Projections.max("id"));
			maxRecords = (Long) crit.uniqueResult();
			if (maxRecords == null) {
				maxRecords = Long.valueOf("0");
			}
		} catch (JDBCConnectionException e) {
			throw new ControlledExeption(
					"Error al intentar generar la conexion a la base de datos: " + getTypeConection().getValue());
		} catch (Exception e) {
			e.printStackTrace();
			maxRecords = Long.valueOf("0");
		} finally {
			factorySessionHibernate.close(session, null);
		}
		return maxRecords;
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

	public Long getNumRecordsTableAll() {
		return numRecordsTableAll;
	}

	public void setNumRecordsTableAll(Long numRecordsTableAll) {
		this.numRecordsTableAll = numRecordsTableAll;
	}

}
