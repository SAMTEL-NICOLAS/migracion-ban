package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigClientesDao;
import co.com.samtel.entity.sql.BigClientes;
@Stateless(name="bigClientesDao")
public class BigClientesDao extends AbsDao<BigClientes, Long> implements IBigClientesDao  {

}
