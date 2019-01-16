package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigNotaInternaAsDao;
import co.com.samtel.entity.as400.BigNotaInternaAs;
import co.com.samtel.entity.as400.BigNotaInternaIdAs;

@Stateless(name="bigNotaInternaAsDao")
public class BigNotaInternaAsDao extends AbsDao<BigNotaInternaAs, BigNotaInternaIdAs> implements  IBigNotaInternaAsDao {

}
