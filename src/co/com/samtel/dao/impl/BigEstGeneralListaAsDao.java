package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigEstGeneralListaAsDao;
import co.com.samtel.entity.as400.BigEstGeneralListaAs;
import co.com.samtel.entity.as400.BigEstGeneralListaIdAs;

@Stateless(name="bigEstGeneralListaAsDao")
public class BigEstGeneralListaAsDao extends AbsDao<BigEstGeneralListaAs, BigEstGeneralListaIdAs, BigEstGeneralListaAs> implements IBigEstGeneralListaAsDao {

}
