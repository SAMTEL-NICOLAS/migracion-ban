package co.com.samtel.dao.impl.multithread;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigClienteEstadosAsDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.as400.BigClienteEstadosAs;
import co.com.samtel.entity.as400.BigClienteEstadosIdAs;

@Stateless(name="bigClienteEstadosAsDaoUno")
public class BigClienteEstadosAsDaoUno extends AbsDao<BigClienteEstadosAs, BigClienteEstadosIdAs, BigClienteEstadosAs> implements IBigClienteEstadosAsDao {

}
