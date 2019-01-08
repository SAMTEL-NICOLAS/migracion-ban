package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigOficinaAsDao;
import co.com.samtel.entity.as400.BigOficinaAs;

@Stateless(name="bigOficinaAsDao")
public class BigOficinaAsDao extends AbsDao<BigOficinaAs, String> implements IBigOficinaAsDao {

}
