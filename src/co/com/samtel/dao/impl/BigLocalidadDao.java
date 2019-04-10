package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigLocalidadDao;
import co.com.samtel.entity.sql.BigLocalidad;
import co.com.samtel.entity.sql.BigLocalidadId;

@Stateless(name="bigLocalidadDao")
public class BigLocalidadDao extends AbsDao<BigLocalidad, BigLocalidadId, DummyConsecutivo> implements IBigLocalidadDao {

}
