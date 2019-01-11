package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigParametrosConsolidadoDao;
import co.com.samtel.entity.sql.BigParametrosConsolidados;
import co.com.samtel.entity.sql.BigParametrosConsolidadosId;

@Stateless(name="bigParametrosConsolidadoDao")
public class BigParametrosConsolidadoDao extends AbsDao<BigParametrosConsolidados, BigParametrosConsolidadosId> implements IBigParametrosConsolidadoDao {

}
