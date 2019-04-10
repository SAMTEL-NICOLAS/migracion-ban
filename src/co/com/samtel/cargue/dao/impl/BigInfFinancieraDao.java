package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigInfFinanciera;
import co.com.samtel.entity.manual.sql.BigInfFinancieraId;

@Stateless(name="bigInfFinancieraDao")
public class BigInfFinancieraDao extends AbsDao<BigInfFinanciera, BigInfFinancieraId, DummyConsecutivo> implements IGenericDao<BigInfFinanciera, BigInfFinancieraId, DummyConsecutivo> {

}
