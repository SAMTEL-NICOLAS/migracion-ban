package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigActividadEconomicaInternaDao;
import co.com.samtel.entity.sql.BigActividadEconomicaInterna;

@Stateless(name="bigActividadEconomicaInternaDao")
public class BigActividadEconomicaInternaDao extends AbsDao<BigActividadEconomicaInterna, String> implements IBigActividadEconomicaInternaDao  {

}
