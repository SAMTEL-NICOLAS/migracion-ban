package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigDireccionAsDao;
import co.com.samtel.entity.as400.BigDireccionAs;
import co.com.samtel.entity.as400.BigDireccionIdAs;

@Stateless(name="bigDireccionAsDao")
public class BigDireccionAsDao extends AbsDao<BigDireccionAs, BigDireccionIdAs> implements IBigDireccionAsDao {

}
