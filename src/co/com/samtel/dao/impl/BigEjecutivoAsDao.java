package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigEjecutivoAsDao;
import co.com.samtel.entity.as400.BigEjecutivoAs;
import co.com.samtel.entity.as400.BigEjecutivoIdAs;

@Stateless(name="bigEjecutivoAsDao")
public class BigEjecutivoAsDao extends AbsDao<BigEjecutivoAs, BigEjecutivoIdAs> implements IBigEjecutivoAsDao {

}
