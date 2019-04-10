package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigActividadEconomicaInternaAsDao;
import co.com.samtel.entity.as400.BigActividadEconomicaInternaAs;

@Stateless(name="bigActividadEconomicaInternaAsDao")
public class BigActividadEconomicaInternaAsDao extends AbsDao<BigActividadEconomicaInternaAs, String, BigActividadEconomicaInternaAs> implements IBigActividadEconomicaInternaAsDao{

}
