package co.com.samtel.dao.impl.multithread;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigClienteEstadosDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.sql.BigClienteEstados;
import co.com.samtel.entity.sql.BigClienteEstadosId;

@Stateless(name="bigClienteEstadosDaoUno")
public class BigClienteEstadosDaoUno extends AbsDao<BigClienteEstados, BigClienteEstadosId,DummyConsecutivo> implements IBigClienteEstadosDao {

}
