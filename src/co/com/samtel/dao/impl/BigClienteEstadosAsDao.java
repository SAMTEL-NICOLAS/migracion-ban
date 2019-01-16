package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigClienteEstadosAsDao;
import co.com.samtel.entity.as400.BigClienteEstadosAs;
import co.com.samtel.entity.as400.BigClienteEstadosIdAs;

@Stateless(name="bigClienteEstadosAsDao")
public class BigClienteEstadosAsDao extends AbsDao<BigClienteEstadosAs, BigClienteEstadosIdAs> implements IBigClienteEstadosAsDao {

}
