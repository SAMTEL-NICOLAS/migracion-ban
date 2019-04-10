package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigTipoTransaccionAsDao;
import co.com.samtel.entity.as400.BigTipoTransaccionAs;
import co.com.samtel.entity.as400.BigTipoTransaccionIdAs;

@Stateless(name="bigTipoTransaccionAsDao")
public class BigTipoTransaccionAsDao extends AbsDao<BigTipoTransaccionAs, BigTipoTransaccionIdAs, BigTipoTransaccionAs> implements IBigTipoTransaccionAsDao {

}
