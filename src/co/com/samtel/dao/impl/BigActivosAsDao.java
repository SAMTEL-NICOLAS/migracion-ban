package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigActivosAsDao;
import co.com.samtel.entity.as400.BigActivosAs;
import co.com.samtel.entity.as400.BigActivosIdAs;

@Stateless(name="bigActivosAsDao")
public class BigActivosAsDao  extends AbsDao<BigActivosAs, BigActivosIdAs> implements IBigActivosAsDao  {

}
