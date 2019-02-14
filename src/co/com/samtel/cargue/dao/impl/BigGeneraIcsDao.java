package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigGeneraIcs;
import co.com.samtel.entity.manual.sql.BigGeneraIcsId;

@Stateless(name="bigGeneraIcsDao")
public class BigGeneraIcsDao extends AbsDao<BigGeneraIcs, BigGeneraIcsId> implements IGenericDao<BigGeneraIcs, BigGeneraIcsId>{

}
