package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigActivosDao;
import co.com.samtel.entity.sql.BigActivos;
import co.com.samtel.entity.sql.BigActivosId;

@Stateless(name="bigActivosDao")
public class BigActivosDao extends AbsDao<BigActivos, BigActivosId> implements IBigActivosDao  {

}
