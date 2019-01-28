package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigClienteProductoDao;
import co.com.samtel.entity.sql.BigClienteProducto;
import co.com.samtel.entity.sql.BigClienteProductoId;

@Stateless(name="bigClienteProductoDao")
public class BigClienteProductoDao extends AbsDao<BigClienteProducto, BigClienteProductoId> implements IBigClienteProductoDao {

}
