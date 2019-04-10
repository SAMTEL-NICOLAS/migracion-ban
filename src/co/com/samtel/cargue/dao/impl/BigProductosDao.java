package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigProductos;
import co.com.samtel.entity.manual.sql.BigProductosId;

@Stateless(name="bigProductosDao")
public class BigProductosDao extends AbsDao<BigProductos, BigProductosId, DummyConsecutivo> implements IGenericDao<BigProductos, BigProductosId, DummyConsecutivo>{

}
