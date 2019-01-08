package co.com.samtel.dao.bussines;

import javax.ejb.Local;

import co.com.samtel.entity.business.Auditoria;

@Local
public interface IAuditDao {
	/**
	 * Metodo con el cual inserto el registro principal de auditoria
	 * @param audit
	 * @return
	 */
	Long insertAudit(Auditoria audit);
	
	Long getMaxValue();

}
