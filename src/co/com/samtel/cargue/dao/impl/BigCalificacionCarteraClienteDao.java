package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigCalificacionCarteraCliente;
import co.com.samtel.entity.manual.sql.BigCalificacionCarteraClienteId;

@Stateless(name="bigCalificacionCarteraClienteDao")
public class BigCalificacionCarteraClienteDao extends AbsDao<BigCalificacionCarteraCliente, BigCalificacionCarteraClienteId, DummyConsecutivo> implements IGenericDao<BigCalificacionCarteraCliente, BigCalificacionCarteraClienteId, DummyConsecutivo> {


}
