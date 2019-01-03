package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigTipoIdentClientesDao;
import co.com.samtel.entity.sql.BigTipoIdentClientes;
import co.com.samtel.entity.sql.BigTipoIdentClientesId;

@Stateless(name="bigTipoIdentClientesDao")
public class BigTipoIdentClientesDao extends AbsDao<BigTipoIdentClientes, BigTipoIdentClientesId> implements IBigTipoIdentClientesDao  {

}
