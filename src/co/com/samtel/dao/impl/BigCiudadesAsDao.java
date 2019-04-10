package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCiudadesAsDao;
import co.com.samtel.entity.as400.BigCiudadesAs;

@Stateless(name="bigCiudadesAsDao")
public class BigCiudadesAsDao extends AbsDao<BigCiudadesAs, String, BigCiudadesAs> implements IBigCiudadesAsDao {

}
