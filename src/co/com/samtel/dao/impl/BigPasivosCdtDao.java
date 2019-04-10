package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigPasivosCdtDao;
import co.com.samtel.entity.sql.BigPasivosCdt;
import co.com.samtel.entity.sql.BigPasivosCdtId;

@Stateless(name="bigPasivosCdtDao")
public class BigPasivosCdtDao extends AbsDao<BigPasivosCdt, BigPasivosCdtId, DummyConsecutivo> implements IBigPasivosCdtDao {

}
