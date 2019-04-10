package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCalificacionCarteraAsDao;
import co.com.samtel.entity.as400.BigCalificacionCarteraAs;

@Stateless(name="bigCalificacionCarteraAsDao")
public class BigCalificacionCarteraAsDao extends AbsDao<BigCalificacionCarteraAs, Long, BigCalificacionCarteraAs> implements IBigCalificacionCarteraAsDao {

}
