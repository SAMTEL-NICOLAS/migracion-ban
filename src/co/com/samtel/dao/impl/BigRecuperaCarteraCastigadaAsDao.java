package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigRecuperaCarteraCastigadaAsDao;
import co.com.samtel.entity.as400.BigRecuperaCarteraCastigadaAs;
import co.com.samtel.entity.as400.BigRecuperaCarteraCastigadaIdAs;

@Stateless(name="bigRecuperaCarteraCastigadaAsDao")
public class BigRecuperaCarteraCastigadaAsDao extends AbsDao<BigRecuperaCarteraCastigadaAs, BigRecuperaCarteraCastigadaIdAs> implements IBigRecuperaCarteraCastigadaAsDao {

}
