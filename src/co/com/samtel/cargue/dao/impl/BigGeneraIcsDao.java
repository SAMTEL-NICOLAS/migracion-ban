package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigGeneraIcs;
import co.com.samtel.entity.manual.sql.BigGeneraIcsId;

@Stateless(name="bigGeneraIcsDao")
public class BigGeneraIcsDao extends AbsDao<BigGeneraIcs, BigGeneraIcsId,DummyConsecutivo> implements IGenericDao<BigGeneraIcs, BigGeneraIcsId, DummyConsecutivo>{

}
