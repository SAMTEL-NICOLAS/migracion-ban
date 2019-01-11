package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigClientesAsDao;
import co.com.samtel.entity.as400.BigClientesAs;

@Stateless(name="bigClientesAsDao")
public class BigClientesAsDao extends AbsDao<BigClientesAs, Long> implements IBigClientesAsDao {

}
