package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigActualizaDatosDao;
import co.com.samtel.entity.sql.BigActualizaDatos;
import co.com.samtel.entity.sql.BigActualizaDatosId;

@Stateless(name="bigActualizaDatosDao")
public class BigActualizaDatosDao extends AbsDao<BigActualizaDatos, BigActualizaDatosId, DummyConsecutivo> implements IBigActualizaDatosDao {

}
