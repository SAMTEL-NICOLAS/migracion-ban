package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigRangoMoraDao;
import co.com.samtel.entity.sql.BigRangoMora;

@Stateless(name="bigRangoMoraDao")
public class BigRangoMoraDao extends AbsDao<BigRangoMora, Short> implements IBigRangoMoraDao  {

}
