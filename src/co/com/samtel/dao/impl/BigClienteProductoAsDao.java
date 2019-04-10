package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigClienteProductoAsDao;
import co.com.samtel.entity.as400.BigClienteProductoAs;
import co.com.samtel.entity.as400.BigClienteProductoIdAs;

@Stateless(name="bigClienteProductoAsDao")
public class BigClienteProductoAsDao extends AbsDao<BigClienteProductoAs, BigClienteProductoIdAs , BigClienteProductoAs > implements IBigClienteProductoAsDao {

}
