package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigLocalidadAsDao;
import co.com.samtel.entity.as400.BigLocalidadAs;
import co.com.samtel.entity.as400.BigLocalidadIdAs;

@Stateless(name="bigLocalidadAsDao")
public class BigLocalidadAsDao extends AbsDao<BigLocalidadAs, BigLocalidadIdAs> implements IBigLocalidadAsDao  {

}
