package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigCiudadesDao;
import co.com.samtel.entity.sql.BigCiudades;

@Stateless(name="bigCiudadesDao")
public class BigCiudadesDao extends AbsDao<BigCiudades, String, DummyConsecutivo> implements IBigCiudadesDao {

}
