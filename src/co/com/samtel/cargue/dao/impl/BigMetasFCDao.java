package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigMetasFuerzaComercial;
import co.com.samtel.entity.manual.sql.BigMetasFuerzaComercialId;

@Stateless(name="bigMetasFCDao")
public class BigMetasFCDao extends AbsDao<BigMetasFuerzaComercial, BigMetasFuerzaComercialId, DummyConsecutivo> implements IGenericDao<BigMetasFuerzaComercial, BigMetasFuerzaComercialId, DummyConsecutivo> {

}
