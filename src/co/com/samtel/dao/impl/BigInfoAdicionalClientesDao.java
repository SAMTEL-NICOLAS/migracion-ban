package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigInfoAdicionalClientesDao;
import co.com.samtel.entity.sql.BigInfoAdicionalClientes;
import co.com.samtel.entity.sql.BigInfoAdicionalClientesId;

@Stateless(name="bigInfoAdicionalClientesDao")
public class BigInfoAdicionalClientesDao extends AbsDao<BigInfoAdicionalClientes, BigInfoAdicionalClientesId> implements IBigInfoAdicionalClientesDao {

}
