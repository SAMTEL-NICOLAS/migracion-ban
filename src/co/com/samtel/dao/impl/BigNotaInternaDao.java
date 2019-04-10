package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigNotaInternaDao;
import co.com.samtel.entity.sql.BigNotaInterna;
import co.com.samtel.entity.sql.BigNotaInternaId;

@Stateless(name="bigNotaInternaDao")
public class BigNotaInternaDao extends AbsDao<BigNotaInterna, BigNotaInternaId, DummyConsecutivo> implements  IBigNotaInternaDao {

}
