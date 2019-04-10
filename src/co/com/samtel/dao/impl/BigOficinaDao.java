package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigOficinaDao;
import co.com.samtel.entity.sql.BigOficina;

@Stateless(name="bigOficinaDao")
public class BigOficinaDao extends AbsDao<BigOficina, String, DummyConsecutivo> implements IBigOficinaDao {

}
