package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigInfoFinanciera;
import co.com.samtel.entity.manual.sql.BigInfoFinancieraId;

@Stateless(name="bigInfoFinancieraDao")
public class BigInfoFinancieraDao extends AbsDao<BigInfoFinanciera,BigInfoFinancieraId> implements IGenericDao<BigInfoFinanciera,BigInfoFinancieraId> {

}
