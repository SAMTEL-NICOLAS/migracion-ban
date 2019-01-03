package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigBarriosDao;
import co.com.samtel.entity.sql.BigBarrios;
import co.com.samtel.entity.sql.BigBarriosId;

@Stateless(name="bigBarriosDao")
public class BigBarriosDao extends AbsDao<BigBarrios, BigBarriosId> implements IBigBarriosDao {

}
