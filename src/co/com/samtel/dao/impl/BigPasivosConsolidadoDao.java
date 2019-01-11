package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigPasivosConsolidadoDao;
import co.com.samtel.entity.sql.BigPasivosConsolidado;
import co.com.samtel.entity.sql.BigPasivosConsolidadoId;

@Stateless(name="bigPasivosConsolidadoDao")
public class BigPasivosConsolidadoDao extends AbsDao<BigPasivosConsolidado, BigPasivosConsolidadoId> implements IBigPasivosConsolidadoDao {

}
