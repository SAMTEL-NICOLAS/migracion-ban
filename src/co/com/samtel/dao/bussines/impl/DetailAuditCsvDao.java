package co.com.samtel.dao.bussines.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import co.com.samtel.dao.bussines.IDetailAuditCsvDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.entity.business.DetailAuditCsv;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name = "detailAuditCsvDao")
public class DetailAuditCsvDao extends AbsDao<DetailAuditCsv, Long> implements IDetailAuditCsvDao {

	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}

	@Override
	public Boolean saveEntity(DetailAudit entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateEntity(DetailAudit entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
