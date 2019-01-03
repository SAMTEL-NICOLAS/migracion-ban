package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigTipoTransaccionDao;
import co.com.samtel.entity.sql.BigTipoTransaccion;

@Stateless(name="bigTipoTransaccionDao")
public class BigTipoTransaccionDao extends AbsDao<BigTipoTransaccion, String> implements IBigTipoTransaccionDao {

}
