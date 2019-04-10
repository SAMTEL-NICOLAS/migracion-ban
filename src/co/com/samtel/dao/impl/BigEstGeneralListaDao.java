package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigEstGeneralListaDao;
import co.com.samtel.entity.sql.BigEstGeneralLista;
import co.com.samtel.entity.sql.BigEstGeneralListaId;

@Stateless(name="bigEstGeneralListaDao")
public class BigEstGeneralListaDao extends AbsDao<BigEstGeneralLista, BigEstGeneralListaId, DummyConsecutivo> implements IBigEstGeneralListaDao {

}
