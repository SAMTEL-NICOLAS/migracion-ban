package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigClienteEstadosDao;
import co.com.samtel.entity.sql.BigClienteEstados;
import co.com.samtel.entity.sql.BigClienteEstadosId;

@Stateless(name="bigClienteEstadosDao")
public class BigClienteEstadosDao extends AbsDao<BigClienteEstados, BigClienteEstadosId> implements IBigClienteEstadosDao {

}
