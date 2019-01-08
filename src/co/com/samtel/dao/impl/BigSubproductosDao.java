package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigSubproductosDao;
import co.com.samtel.entity.sql.BigSubproductos;
@Stateless(name="bigSubproductosDao")
public class BigSubproductosDao extends AbsDao<BigSubproductos, String> implements IBigSubproductosDao{

}
