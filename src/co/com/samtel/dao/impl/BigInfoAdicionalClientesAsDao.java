package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigInfoAdicionalClientesAsDao;
import co.com.samtel.entity.as400.BigInfoAdicionalClientesAs;
import co.com.samtel.entity.as400.BigInfoAdicionalClientesIdAs;

@Stateless(name="bigInfoAdicionalClientesAsDao")
public class BigInfoAdicionalClientesAsDao extends AbsDao<BigInfoAdicionalClientesAs, BigInfoAdicionalClientesIdAs, BigInfoAdicionalClientesAs> implements IBigInfoAdicionalClientesAsDao {

}
