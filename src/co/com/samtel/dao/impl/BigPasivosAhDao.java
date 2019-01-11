package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigPasivosAhDao;
import co.com.samtel.entity.sql.BigPasivosAh;
import co.com.samtel.entity.sql.BigPasivosAhId;

@Stateless(name="bigPasivosAhDao")
public class BigPasivosAhDao extends AbsDao<BigPasivosAh, BigPasivosAhId> implements IBigPasivosAhDao  {

}
