package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigBarriosAsDao;
import co.com.samtel.entity.as400.BigBarriosAs;
import co.com.samtel.entity.as400.BigBarriosIdAs;
@Stateless(name="BigBarriosAsDao")
public class BigBarriosAsDao  extends AbsDao<BigBarriosAs, BigBarriosIdAs> implements IBigBarriosAsDao {

}
