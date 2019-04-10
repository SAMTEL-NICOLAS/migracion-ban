package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigCifinBureau;
import co.com.samtel.entity.manual.sql.BigCifinBureauId;

@Stateless(name="bigCifinBureauDao")
public class BigCifinBureauDao extends AbsDao<BigCifinBureau, BigCifinBureauId, DummyConsecutivo> implements IGenericDao<BigCifinBureau, BigCifinBureauId,DummyConsecutivo> {

}
