package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigCalificacionCarteraDao;
import co.com.samtel.entity.sql.BigCalificacionCartera;

@Stateless(name="bigCalificacionCarteraDao")
public class BigCalificacionCarteraDao  extends AbsDao<BigCalificacionCartera, Long> implements IBigCalificacionCarteraDao {

}
