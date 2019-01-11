package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCupoRotativoAsDao;
import co.com.samtel.entity.as400.BigCupoRotativoAs;
import co.com.samtel.entity.as400.BigCupoRotativoIdAs;
@Stateless(name="bigCupoRotativoAsDao")
public class BigCupoRotativoAsDao extends AbsDao<BigCupoRotativoAs, BigCupoRotativoIdAs> implements IBigCupoRotativoAsDao {

}
