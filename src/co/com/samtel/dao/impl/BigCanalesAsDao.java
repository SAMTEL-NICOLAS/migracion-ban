package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigCanalesAsDao;
import co.com.samtel.entity.as400.BigCanalesAs;
import co.com.samtel.entity.as400.BigCanalesIdAs;

@Stateless(name="bigCanalesAsDao")
public class BigCanalesAsDao extends AbsDao<BigCanalesAs, BigCanalesIdAs> implements IBigCanalesAsDao{

}
