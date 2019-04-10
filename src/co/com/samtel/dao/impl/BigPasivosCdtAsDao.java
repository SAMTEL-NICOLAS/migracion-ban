package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigPasivosCdtAsDao;
import co.com.samtel.entity.as400.BigPasivosCdtAs;
import co.com.samtel.entity.as400.BigPasivosCdtIdAs;

@Stateless(name="bigPasivosCdtAsDao")
public class BigPasivosCdtAsDao extends AbsDao<BigPasivosCdtAs, BigPasivosCdtIdAs, BigPasivosCdtAs> implements IBigPasivosCdtAsDao {

}
