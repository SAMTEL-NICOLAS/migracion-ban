package co.com.samtel.dao.bussines;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.exception.ControlledExeption;

@Local
public interface IDetailAudit {
	
	Long getMaxValue()throws ControlledExeption;
	
	Boolean saveEntity(DetailAudit entity);
	
	Boolean updateEntity(DetailAudit entity);

	List<DetailAudit> getAllDetailAudit();
	
	List<DetailAudit> getDetailById(String idDatail);
	
	Boolean updateStateAudit(String idAudit);
	
	
}
