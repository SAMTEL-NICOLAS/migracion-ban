package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigPasivosAhAsDao;
import co.com.samtel.entity.as400.BigPasivosAhAs;
import co.com.samtel.entity.as400.BigPasivosAhIdAs;

@Stateless(name="bigPasivosAhAsDao")
public class BigPasivosAhAsDao extends AbsDao<BigPasivosAhAs, BigPasivosAhIdAs, BigPasivosAhAs> implements IBigPasivosAhAsDao {

}
