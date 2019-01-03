package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigRecogidosAsDao;
import co.com.samtel.entity.as400.BigRecogidosAs;
import co.com.samtel.entity.as400.BigRecogidosIdAs;

@Stateless(name="bigRecogidosAsDao")
public class BigRecogidosAsDao extends AbsDao<BigRecogidosAs, BigRecogidosIdAs> implements IBigRecogidosAsDao {

}