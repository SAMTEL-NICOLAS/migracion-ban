package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCodigosAbogadoAsDao;
import co.com.samtel.entity.as400.BigCodigosAbogadoAs;
@Stateless(name="bigCodigosAbogadoAsDao")
public class BigCodigosAbogadoAsDao extends AbsDao<BigCodigosAbogadoAs, String, BigCodigosAbogadoAs> implements IBigCodigosAbogadoAsDao {

}
