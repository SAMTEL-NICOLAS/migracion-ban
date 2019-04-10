package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigProspectos;
import co.com.samtel.entity.manual.sql.BigProspectosId;

@Stateless(name="bigProspectosDao")
public class BigProspectosDao extends AbsDao<BigProspectos, BigProspectosId,DummyConsecutivo> implements IGenericDao<BigProspectos, BigProspectosId, DummyConsecutivo> {

}
