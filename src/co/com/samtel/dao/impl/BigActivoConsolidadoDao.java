package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigActivoConsolidadoDao;
import co.com.samtel.entity.sql.BigActivoConsolidado;
import co.com.samtel.entity.sql.BigActivoConsolidadoId;

@Stateless(name="bigActivoConsolidadoDao")
public class BigActivoConsolidadoDao extends AbsDao<BigActivoConsolidado, BigActivoConsolidadoId> implements IBigActivoConsolidadoDao {

}
