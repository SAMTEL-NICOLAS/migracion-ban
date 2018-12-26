package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigRecogidosAsDao;
import co.com.samtel.entity.as400.BigRecogidosAs;

@Stateless(name="bigRecogidosAsDao")
public class BigRecogidosAsDao extends AbsDao<BigRecogidosAs, Long> implements IBigRecogidosAsDao {

}