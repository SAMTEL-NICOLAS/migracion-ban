package co.com.samtel.migration.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.dao.bussines.IAuditDao;
import co.com.samtel.dao.bussines.IDetailAudit;
import co.com.samtel.dao.bussines.ILogActivadorDao;
import co.com.samtel.dto.ErrorDto;
import co.com.samtel.entity.business.Auditoria;
import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.exception.ControlledExeption;
import co.com.samtel.migration.IExecuteMigration;
import co.com.samtel.migration.IFactoryMigration;
import co.com.samtel.migration.IGenerateMigration;

@Stateless(name = "executeMigration")
public class ExecuteMigration implements IExecuteMigration, Runnable {

	@EJB
	IFactoryMigration factoryMigration;

	// Objeto para la consulta de tablas listas para migrar
	@EJB
	ILogActivadorDao logActivadorDao;

	@EJB
	IAuditDao auditDao;

	@EJB
	IDetailAudit detailAuditDao;

	private Long idAudit;

	private ErrorDto errorMig;

	private TypeMigration typeMigration;

	private Thread hilo;

	@Override
	public Boolean generateMigration(TypeMigration typeMigration, String user) {
		setTypeMigration(typeMigration);
		Boolean respuesta = Boolean.TRUE;
		try {
			// Genero el registro padre de la uditoria
			Long idTable = auditDao.getMaxValue();
			Long id = auditDao.insertAudit(new Auditoria(idTable + Long.valueOf(1), user, new Date()));
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

	public void callMigration() {
		// Obtengo la lista de tablas a migrar
		List<IGenerateMigration> listTablesToMigrate = factoryMigration.setMigration(typeMigration).build();
		// Metodo con el cual genero la migracion de las tablas dependendiendo el tipo
		// de proceso que se realiza
		for (IGenerateMigration item : listTablesToMigrate) {
			// Genera el registro inicial del log
			DetailAudit detail = generateAuditMigration(item);
			executeMigration(item, Long.valueOf("0"));
			// Genera el detalle de la migracion
			generateAuditMigration(item, detail);
			// Cambia el estado del log Activador marcandola como migrada
			changeLogActivador(item);
		}
	}

	/**
	 * Metodo con el cual ejecuto la migracion
	 * 
	 * @param item
	 * @param migrados
	 */
	public void executeMigration(IGenerateMigration item, Long migrados) {
		// Seteamos el numero de registros que ha migrado
		item.setNumRecMig(migrados);
		item.generateMigration();

		// Extrae el error de la migracion
		setErrorMig(item.getError());

		if (getErrorMig().getTypeError().equals(TypeErrors.TIME_OUT_CUSTOM)) {
			executeMigration(item, item.getNumRecMig());
		}
	}

	/**
	 * Metodo con el cual genero el registro inicial del detalle de la auditoria
	 */
	public DetailAudit generateAuditMigration(IGenerateMigration table) {
		Long idTable = null;
		try {
			idTable = detailAuditDao.getMaxValue();
		} catch (ControlledExeption e) {
			e.printStackTrace();
		}
		if (idTable == null) {
			new Exception("Imposible insertar detalle de auditoria");
		} else {
			idTable += 1;
		}
		DetailAudit detail = new DetailAudit();
		detail.setIdAudit(getIdAudit());
		detail.setId(idTable);
		detail.setRegDestino(Long.valueOf(0));
		detail.setRegOrigen(Long.valueOf(0));
		detail.setTabla(table.getTableToMigrate().toString());
		detail.setTraza("Sin Traza");

		detailAuditDao.saveEntity(detail);
		return detail;
	}

	public void generateAuditMigration(IGenerateMigration table, DetailAudit detail) {
		detail.setRegDestino(table.getNumRecords());
		detail.setRegOrigen(table.getNumRecMig());
		if (!getErrorMig().getTypeError().equals(TypeErrors.SUCCESS)) {
			detail.setTraza("Tipo Error: " + getErrorMig().getTypeError() + " Mensaje: " + getErrorMig().getMessage());
		} else {
			detail.setTraza("Ok");
		}
		detailAuditDao.updateEntity(detail);
		// Actualizo el disparador
	}

	public void changeLogActivador(IGenerateMigration table) {
		// Date nowDate = new Date();
		if (getErrorMig().getTypeError().equals(TypeErrors.SUCCESS)) {
			// Quiere decir que la tabla se migro correctamente
			table.getLogActivador().setEstado("1");
			table.getLogActivador().setRegMig(table.getNumRecords());
		} else if (getErrorMig().getTypeError().equals(TypeErrors.TIME_OUT_CUSTOM)) {
			table.getLogActivador().setEstado("-3");
		} else {
			table.getLogActivador().setEstado("-2");
		}

		Calendar fecha = Calendar.getInstance();
		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH) + 1;
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minutos = fecha.get(Calendar.MINUTE);
		int segundos = fecha.get(Calendar.SECOND);

		table.getLogActivador().setAnio(Long.valueOf(anio));
		table.getLogActivador().setMes(Long.valueOf(mes));
		table.getLogActivador().setDia(Long.valueOf(dia));
		// table.getLogActivador().setHora(Long.valueOf(hora+ ":" + minutos + ":" +
		// segundos));
		table.getLogActivador().setHora(Long.valueOf(hora));

		/*
		 * table.getLogActivador().setAnio(Long.valueOf(nowDate.getYear() + 1900));
		 * table.getLogActivador().setMes(Long.valueOf(nowDate.getMonth()+1));
		 * table.getLogActivador().setDia(Long.valueOf(nowDate.getDay()));
		 * table.getLogActivador().setHora(Long.valueOf(nowDate.getHours()));
		 */

		logActivadorDao.updateEntity(table.getLogActivador());

	}

	@Override
	public ErrorDto getMessageError() {
		if (getErrorMig() == null) {
			return ErrorDto.of(null, TypeErrors.SUCCESS, null);
		}
		return getErrorMig();
	}

	public ErrorDto getErrorMig() {
		return errorMig;
	}

	public void setErrorMig(ErrorDto errorMig) {
		this.errorMig = errorMig;
	}

	@Override
	public void run() {
		callMigration();
	}

	public TypeMigration getTypeMigration() {
		return typeMigration;
	}

	public void setTypeMigration(TypeMigration typeMigration) {
		this.typeMigration = typeMigration;
	}

	public Long getIdAudit() {
		return idAudit;
	}

	public void setIdAudit(Long idAudit) {
		this.idAudit = idAudit;
	}

}
