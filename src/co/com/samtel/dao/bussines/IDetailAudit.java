package co.com.samtel.dao.bussines;

import javax.ejb.Local;

import co.com.samtel.entity.business.DetailAudit;

@Local
public interface IDetailAudit {
	
	Long getMaxValue();
	
	Boolean saveEntity(DetailAudit entity);
	
	Boolean updateEntity(DetailAudit entity);
	
}
