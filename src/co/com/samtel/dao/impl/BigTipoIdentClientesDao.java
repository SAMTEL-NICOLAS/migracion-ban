package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigTipoIdentClientesDao;
import co.com.samtel.entity.sql.BigTipoIdentClientes;

@Stateless(name="bigTipoIdentClientesDao")
public class BigTipoIdentClientesDao extends AbsDao<BigTipoIdentClientes, String> implements IBigTipoIdentClientesDao  {

}
