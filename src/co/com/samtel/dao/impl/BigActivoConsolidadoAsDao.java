package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigActivoConsolidadoAsDao;
import co.com.samtel.entity.as400.BigActivoConsolidadoAs;
import co.com.samtel.entity.as400.BigActivoConsolidadoIdAs;

@Stateless(name="bigActivoConsolidadoAsDao")
public class BigActivoConsolidadoAsDao extends AbsDao<BigActivoConsolidadoAs, BigActivoConsolidadoIdAs,BigActivoConsolidadoAs> implements IBigActivoConsolidadoAsDao {

}
