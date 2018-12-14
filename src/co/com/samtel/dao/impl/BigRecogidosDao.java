package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigRecogidosDao;
import co.com.samtel.entity.sql.BigRecogidos;
import co.com.samtel.entity.sql.BigRecogidosId;

@Stateless(name="bigRecogidosDao")
public class BigRecogidosDao extends AbsDao<BigRecogidos, BigRecogidosId> implements IBigRecogidosDao {
}