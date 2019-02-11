package co.com.samtel.dao.bussines;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.entity.business.DetailAuditCsv;
import co.com.samtel.exception.ControlledExeption;

@Local
public interface IDetailAuditCsvDao {
	Long getMaxValue() throws ControlledExeption;

	Boolean saveEntity(DetailAudit entity);

	Boolean updateEntity(DetailAudit entity);

	List<DetailAuditCsv> getAllDetailAudit();

	List<DetailAuditCsv> getDetailById(String idDatail);
}
