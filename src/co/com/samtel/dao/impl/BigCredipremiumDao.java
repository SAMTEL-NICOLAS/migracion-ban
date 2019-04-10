package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigCredipremiumDao;
import co.com.samtel.entity.sql.BigCredipremium;

@Stateless(name="bigCredipremiumDao")
public class BigCredipremiumDao extends AbsDao<BigCredipremium, Long, DummyConsecutivo> implements  IBigCredipremiumDao {

}
