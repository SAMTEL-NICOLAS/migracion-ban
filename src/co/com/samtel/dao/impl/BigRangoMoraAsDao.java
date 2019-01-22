package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigRangoMoraAsDao;
import co.com.samtel.entity.as400.BigRangoMoraAs;

@Stateless(name="bigRangoMoraAsDao")
public class BigRangoMoraAsDao extends AbsDao<BigRangoMoraAs, Short> implements IBigRangoMoraAsDao  {

}
