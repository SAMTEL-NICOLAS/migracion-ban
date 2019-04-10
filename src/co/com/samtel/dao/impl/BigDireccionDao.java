package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigDireccionDao;
import co.com.samtel.entity.sql.BigDireccion;
import co.com.samtel.entity.sql.BigDireccionId;

@Stateless(name="bigDireccionDao")
public class BigDireccionDao extends AbsDao<BigDireccion, BigDireccionId, DummyConsecutivo> implements IBigDireccionDao {

}
