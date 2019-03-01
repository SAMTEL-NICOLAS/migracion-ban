package co.com.samtel.dao.bussines;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.entity.business.Auditoria;
import co.com.samtel.exception.ControlledExeption;

@Local
public interface IAuditDao {
	/**
	 * Metodo con el cual inserto el registro principal de auditoria
	 * 
	 * @param audit
	 * @return
	 */
	Long insertAudit(Auditoria audit) throws ControlledExeption;

	Long getMaxValue() throws ControlledExeption;

	List<Auditoria> findAllAudit();

	List<Auditoria> getAuditByDate(String date1, String date2);
	
	List<Auditoria> getAuditByDateAndId(String date1, String date2,String id);

}
