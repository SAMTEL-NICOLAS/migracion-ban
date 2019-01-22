package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigEjecutivoDao;
import co.com.samtel.entity.sql.BigEjecutivo;
import co.com.samtel.entity.sql.BigEjecutivoId;

@Stateless(name="bigEjecutivoDao")
public class BigEjecutivoDao extends AbsDao<BigEjecutivo, BigEjecutivoId> implements IBigEjecutivoDao {

}
