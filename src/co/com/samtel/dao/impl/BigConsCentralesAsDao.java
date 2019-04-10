package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigConsCentralesAsDao;
import co.com.samtel.entity.as400.BigConsCentralesAs;
import co.com.samtel.entity.as400.BigConsCentralesIdAs;

@Stateless(name="bigConsCentralesAsDao")
public class BigConsCentralesAsDao extends AbsDao<BigConsCentralesAs, BigConsCentralesIdAs, BigConsCentralesAs> implements  IBigConsCentralesAsDao {

}
