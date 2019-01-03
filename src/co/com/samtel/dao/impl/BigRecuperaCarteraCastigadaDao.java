package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigRecuperaCarteraCastigadaDao;
import co.com.samtel.entity.sql.BigRecuperaCarteraCastigada;
import co.com.samtel.entity.sql.BigRecuperaCarteraCastigadaId;

@Stateless(name="bigRecuperaCarteraCastigadaDao")
public class BigRecuperaCarteraCastigadaDao extends AbsDao< BigRecuperaCarteraCastigada, BigRecuperaCarteraCastigadaId> implements IBigRecuperaCarteraCastigadaDao {

}
