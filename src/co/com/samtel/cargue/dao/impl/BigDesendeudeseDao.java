package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigDesendeudese;
import co.com.samtel.entity.manual.sql.BigDesendeudeseId;

@Stateless(name="bigDesendeudeseDao")
public class BigDesendeudeseDao extends AbsDao<BigDesendeudese, BigDesendeudeseId> implements IGenericDao<BigDesendeudese, BigDesendeudeseId> {

}
