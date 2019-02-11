package co.com.samtel.dao.bussines;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.entity.business.AuditoriaCsv;
import co.com.samtel.exception.ControlledExeption;

@Local
public interface IAuditDaoCsv {

	/**
	 * Metodo con el cual inserto el registro principal de auditoria
	 * 
	 * @param audit
	 * @return
	 */
	Long insertAudit(AuditoriaCsv audit) throws ControlledExeption;

	Long getMaxValue() throws ControlledExeption;

	List<AuditoriaCsv> findAllAudit();

	List<AuditoriaCsv> getAuditByDate(String date1, String date2);
}
