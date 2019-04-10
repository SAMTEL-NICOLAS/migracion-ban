package co.com.samtel.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.ejb.EJB;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;
import org.hibernate.exception.JDBCConnectionException;

import co.com.samtel.cargue.exception.UploadMapperExpetion;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.bussines.IDetailAuditCsvDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.DetailAuditCsv;
import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.hibernate.IFactorySessionHibernate;
import co.com.samtel.migration.IConsecutivo;
import co.com.samtel.migration.IUploadMigration;

public abstract class AbsDao<T, PK, ENTITYAS extends IConsecutivo> implements IGenericDao<T, PK, ENTITYAS> {

	private Class<T> domainClass = initDomainClass();

	private ENTITYAS entityAs;

	private TypeConections typeConection;

	private Long numRecordsTable;

	private Long numRecordsTableAll;

	private ErrorDto error;

	private Integer row;

	@EJB
	IDetailAuditCsvDao detailAuditCsvDao;

	@EJB
	IUploadMigration executeUpload;

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
			setNumRecordsTableAll((Long) session.createCriteria(getDomainClass()).setProjection(Projections.rowCount())
					.uniqueResult());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factorySessionHibernate.close(session, null);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findBlockData(String order, Long ini, Long fin) {
		Session session = null;
		List<T> result = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			Criteria crit = session.createCriteria(getDomainClass())
						.add(Restrictions.eq("migrado", " "))
						.add(Restrictions.between("secuencia", ini, fin));
			if("ASC".equals(order)) {
				crit.addOrder(Order.asc("secuencia"));
			}else {
				crit.addOrder(Order.desc("secuencia"));
			}
					//.add(Restrictions.sqlRestriction(" 1 = 1 ORDER BY CONSECUTI " + order + " OFFSET 0 ROWS "))
					//.setMaxResults(offset);

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
	public Boolean saveEntity2(List<T> entity, String nameFile) {
		int fila = 0;
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
				validarError(fila, nameFile);
			} catch (DataException e) {
				e.printStackTrace();
				setError(ErrorDto.of(null, TypeErrors.DATAEXCEPTION, e.toString() + e.getSQLException()));
				System.out.println("Error" + e.getMessage());
				validarError(fila, nameFile);
			} catch (Exception e) {
				setError(ErrorDto.of(null, TypeErrors.MAPPER_EROR, e.toString() + e.getMessage()));
				validarError(fila, nameFile);
			} finally {
				factorySessionHibernate.close(session, tx);
			}
			fila++;
			System.out.println("Filas Insertadas: " + fila);
		}
		return Boolean.TRUE;
	}

	public void validarError(int fila, String nameFile) {
		setRow(fila);
		UploadMapperExpetion error = new UploadMapperExpetion(nameFile, "", Long.valueOf(getRow()) + 1, null,
				getError().getMessage());

		insertDetailAudit(error);
	}

	public void insertDetailAudit(UploadMapperExpetion error) {

		Long idTable = null;
		try {
			idTable = detailAuditCsvDao.getMaxValue();
		} catch (ControlledExeption e) {
			e.printStackTrace();
		}
		if (idTable == null) {
			new Exception("Imposible insertar detalle de auditoria");
		} else {
			idTable += 1;
		}
		DetailAuditCsv detail = new DetailAuditCsv();

		detail.setId(idTable);
		detail.setTabla(error.getFileName());
		detail.setRegDestino(Long.valueOf(0));
		detail.setRegOrigen(Long.valueOf(0));
		detail.setTraza("No fue posible realizar la inserción");
		detail.setIdAudit(executeUpload.getIdAudit());
		detail.setColumn_name(error.getColumnName());
		detail.setRow(error.getRow());
		detail.setColumna(error.getColumn());
		detail.setMessage(error.getMessage());
		detailAuditCsvDao.saveEntity(detail);
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
			System.out.println("Error" + e.getMessage());
			return Boolean.FALSE;
		} catch (Exception e) {
			setError(ErrorDto.of(null, TypeErrors.MAPPER_EROR, e.toString() + e.getMessage()));
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
	public Boolean nativeUpdate(List<ENTITYAS> listEntity, TableMigration tableName) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			for (ENTITYAS item : listEntity) {
				tx = session.beginTransaction();
				String query = "UPDATE DAMCYFILES.".concat(tableName.getNameAs())
						.concat(" SET migrar = 'S' WHERE consecuti = :secu");
				session.createSQLQuery(query).setLong("secu", item.getSecuencia()).executeUpdate();
				tx.commit();
			}
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

	public Boolean nativeUpdateBlock(TableMigration tableName, Integer ini, Integer fin) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			String query = "UPDATE DAMCYFILES.".concat(tableName.getNameAs())
					.concat(" SET migrar = 'S' WHERE consecuti between :ini and :fin");
			session.createSQLQuery(query)
			.setInteger("ini", ini)
			.setInteger("fin", fin)
			.executeUpdate();
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
	public Boolean nativeUpdateSingle(ENTITYAS entity, TableMigration tableName) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();

			tx = session.beginTransaction();
			String query = "UPDATE DAMCYFILES.".concat(tableName.getNameAs())
					.concat(" SET migrar = 'S' WHERE consecuti = :secu");
			session.createSQLQuery(query).setLong("secu", entity.getSecuencia()).executeUpdate();
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

	/**
	 * Metodo con el cual ejecuto update sobre la tabla por medio de un sql nativo
	 * 
	 * @param list
	 * @return
	 */

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
	@Override
	public Boolean deleteAllRecords( TableMigration tableName) {
		Session session = null;
		Transaction tx = null;
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			tx = session.beginTransaction();
			String hql = "delete from ".concat(tableName.getNameEntitySql());
			int records = session.createQuery(hql).executeUpdate();
			System.out.println(".:: Numero de registros eliminados"+ records +" ::.");
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return Boolean.FALSE;			
		}
		return Boolean.TRUE;
	}
	
	@Override
	public Long distinctRecordsToMigrate(String primaryKey,TableMigration tableName) {
		Session session = null;
		Integer valor = Integer.valueOf("0");
		try {
			session = factorySessionHibernate.generateSesion(getTypeConection()).openSession();
			String sql = "SELECT count(*) FROM (SELECT distinct " + primaryKey + " FROM DAMCYFILES." + tableName.getNameAs() + " ent WHERE ent.migrar = ' '   )";
			valor = (Integer) session.createSQLQuery(sql).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Long.valueOf(valor);
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

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public ENTITYAS getEntityAs() {
		return entityAs;
	}

	public void setEntityAs(ENTITYAS entityAs) {
		this.entityAs = entityAs;
	}
}
