package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCupoRotativoDao;
import co.com.samtel.entity.sql.BigCupoRotativo;
import co.com.samtel.entity.sql.BigCupoRotativoId;
@Stateless(name="bigCupoRotativoDao")
public class BigCupoRotativoDao extends AbsDao<BigCupoRotativo, BigCupoRotativoId> implements IBigCupoRotativoDao {

}
