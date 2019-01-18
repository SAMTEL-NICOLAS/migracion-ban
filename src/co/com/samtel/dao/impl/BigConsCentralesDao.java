package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigConsCentralesDao;
import co.com.samtel.entity.sql.BigConsCentrales;
import co.com.samtel.entity.sql.BigConsCentralesId;

@Stateless(name="bigConsCentralesDao")
public class BigConsCentralesDao extends AbsDao<BigConsCentrales, BigConsCentralesId> implements  IBigConsCentralesDao  {

}
