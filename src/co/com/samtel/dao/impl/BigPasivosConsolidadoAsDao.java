package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigPasivosConsolidadoAsDao;
import co.com.samtel.entity.as400.BigPasivosConsolidadoAs;
import co.com.samtel.entity.as400.BigPasivosConsolidadoIdAs;

@Stateless(name="bigPasivosConsolidadoAsDao")
public class BigPasivosConsolidadoAsDao extends AbsDao<BigPasivosConsolidadoAs, BigPasivosConsolidadoIdAs> implements IBigPasivosConsolidadoAsDao {

}
