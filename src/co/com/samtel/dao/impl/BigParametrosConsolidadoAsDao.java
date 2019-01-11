package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigParamentrosConsolidadoAsDao;
import co.com.samtel.entity.as400.BigParametrosConsolidadosAs;
import co.com.samtel.entity.as400.BigParametrosConsolidadosIdAs;

@Stateless(name="bigParametrosConsolidadoAsDao")
public class BigParametrosConsolidadoAsDao extends AbsDao<BigParametrosConsolidadosAs, BigParametrosConsolidadosIdAs> implements IBigParamentrosConsolidadoAsDao {

}
