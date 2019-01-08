package co.com.samtel.dao.bussines.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import co.com.samtel.dao.bussines.IDetailAudit;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.business.DetailAudit;
import co.com.samtel.enumeraciones.TypeConections;

@Stateless(name="detailAuditDao")
public class DetailAuditDao extends AbsDao<DetailAudit, Long> implements IDetailAudit{


	@PostConstruct
	public void init() {
		setTypeConection(TypeConections.SQLSERVER);
	}
}
