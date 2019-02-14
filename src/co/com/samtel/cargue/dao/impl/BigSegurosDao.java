package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigSeguros;
import co.com.samtel.entity.manual.sql.BigSegurosId;

@Stateless(name="bigSegurosDao")
public class BigSegurosDao extends AbsDao<BigSeguros, BigSegurosId> implements IGenericDao<BigSeguros, BigSegurosId> {

}
