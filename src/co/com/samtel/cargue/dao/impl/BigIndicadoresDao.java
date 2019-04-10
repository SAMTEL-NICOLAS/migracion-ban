package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigIndicadores;
import co.com.samtel.entity.manual.sql.BigIndicadoresId;

@Stateless(name="bigIndicadoresDao")
public class BigIndicadoresDao extends AbsDao<BigIndicadores, BigIndicadoresId, DummyConsecutivo> implements IGenericDao<BigIndicadores, BigIndicadoresId, DummyConsecutivo>  {

}
