package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigEstadosCarpetasAsDao;
import co.com.samtel.entity.as400.BigEstadoCarpetasAs;

@Stateless(name="bigEstadosCarpetasAsDao")
public class BigEstadosCarpetasAsDao extends AbsDao<BigEstadoCarpetasAs, String> implements IBigEstadosCarpetasAsDao {

}
