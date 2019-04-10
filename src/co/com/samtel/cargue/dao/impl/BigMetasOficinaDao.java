package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigMetasOficina;
import co.com.samtel.entity.manual.sql.BigMetasOficinaId;

@Stateless(name="bigMetasOficinaDao")
public class BigMetasOficinaDao extends AbsDao<BigMetasOficina, BigMetasOficinaId,DummyConsecutivo> implements IGenericDao<BigMetasOficina, BigMetasOficinaId,DummyConsecutivo> {

}
