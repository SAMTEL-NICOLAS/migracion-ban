package co.com.samtel.cargue.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IGenericDao;
import co.com.samtel.dao.impl.AbsDao;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspecto;
import co.com.samtel.entity.manual.sql.BigGeoReferenciarProspectoId;

@Stateless(name="bigGeoreferenciarProspectoDao")
public class BigGeoreferenciarProspectoDao extends AbsDao<BigGeoReferenciarProspecto, BigGeoReferenciarProspectoId, DummyConsecutivo> implements IGenericDao<BigGeoReferenciarProspecto, BigGeoReferenciarProspectoId, DummyConsecutivo> {

}
