package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigSubproductosAsDao;
import co.com.samtel.entity.as400.BigSubproductosAs;

@Stateless(name="bigSubproductosAsDao")
public class BigSubproductosAsDao extends AbsDao<BigSubproductosAs, String> implements IBigSubproductosAsDao {

}
