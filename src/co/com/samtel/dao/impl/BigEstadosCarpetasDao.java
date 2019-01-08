package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigEstadosCarpetasDao;
import co.com.samtel.entity.sql.BigEstadoCarpetas;
@Stateless(name="bigEstadosCarpetasDao")
public class BigEstadosCarpetasDao extends AbsDao<BigEstadoCarpetas, String> implements IBigEstadosCarpetasDao {

}
