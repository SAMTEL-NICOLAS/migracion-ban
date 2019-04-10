package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigTipoTransaccionDao;
import co.com.samtel.entity.sql.BigTipoTransaccion;
import co.com.samtel.entity.sql.BigTipoTransaccionId;

@Stateless(name="bigTipoTransaccionDao")
public class BigTipoTransaccionDao extends AbsDao<BigTipoTransaccion, BigTipoTransaccionId, DummyConsecutivo> implements IBigTipoTransaccionDao {

}
