package co.com.samtel.migration.service.impl;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.dao.bussines.IAuditDaoCsv;
import co.com.samtel.dao.bussines.IDetailAuditCsvDao;
import co.com.samtel.dao.bussines.ILogActivadorDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.AuditoriaCsv;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IUploadMigration;

@Stateless(name = "executeUpload")
public class ExecuteUpload implements IUploadMigration, Runnable {

	@EJB
	IFactoryMigration factoryMigration;

	// Objeto para la consulta de tablas listas para migrar
	@EJB
	ILogActivadorDao logActivadorDao;

	@EJB
	IAuditDaoCsv auditCsvDao;

	@EJB
	IDetailAuditCsvDao detailAuditCsvDao;

	private Long idAudit;

	private ErrorDto errorMig;

	private TypeMigration typeMigration;

	private Thread hilo;

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean generateMigration(TypeMigration typeMigration, String user) {
		setTypeMigration(typeMigration);
		Boolean respuesta = Boolean.TRUE;
		try {
			// Genero el registro padre de la uditoria
			Long idTable = auditCsvDao.getMaxValue();
			Long id = auditCsvDao.insertAudit(new AuditoriaCsv(idTable + Long.valueOf(1), user, new Date()));
			setIdAudit(id);
			System.out.println("Este es el id de la auditoria ".concat(id.toString()));

		} catch (ControlledExeption e) {
			e.printStackTrace();
			respuesta = Boolean.FALSE;
			setErrorMig(ErrorDto.of(null, TypeErrors.CONNECTION_DATA_BASE, e.getMessage()));
		} catch (Exception e) {
			e.printStackTrace();
			respuesta = Boolean.FALSE;
		}
		if (respuesta) {
			// Llamo al proceso que genera la migración
			hilo = new Thread(this);
			hilo.start();
		}
		return respuesta;
	}

	@Override
	public ErrorDto getMessageError() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getIdAudit() {
		// TODO Auto-generated method stub
		return null;
	}

	public IFactoryMigration getFactoryMigration() {
		return factoryMigration;
	}

	public void setFactoryMigration(IFactoryMigration factoryMigration) {
		this.factoryMigration = factoryMigration;
	}

	public ILogActivadorDao getLogActivadorDao() {
		return logActivadorDao;
	}

	public void setLogActivadorDao(ILogActivadorDao logActivadorDao) {
		this.logActivadorDao = logActivadorDao;
	}

	public IAuditDaoCsv getAuditCsvDao() {
		return auditCsvDao;
	}

	public void setAuditCsvDao(IAuditDaoCsv auditCsvDao) {
		this.auditCsvDao = auditCsvDao;
	}

	public IDetailAuditCsvDao getDetailAuditCsvDao() {
		return detailAuditCsvDao;
	}

	public void setDetailAuditCsvDao(IDetailAuditCsvDao detailAuditCsvDao) {
		this.detailAuditCsvDao = detailAuditCsvDao;
	}

	public ErrorDto getErrorMig() {
		return errorMig;
	}

	public void setErrorMig(ErrorDto errorMig) {
		this.errorMig = errorMig;
	}

	public TypeMigration getTypeMigration() {
		return typeMigration;
	}

	public void setTypeMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
	}

	public Thread getHilo() {
		return hilo;
	}

	public void setHilo(Thread hilo) {
		this.hilo = hilo;
	}

	public void setIdAudit(Long idAudit) {
		this.idAudit = idAudit;
	}

}
