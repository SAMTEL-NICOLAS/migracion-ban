package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCredipremiumAsDao;
import co.com.samtel.entity.as400.BigCredipremiumAs;

@Stateless(name="bigCredipremiumAsDao")
public class BigCredipremiumAsDao extends AbsDao<BigCredipremiumAs, Long> implements  IBigCredipremiumAsDao  {

}
