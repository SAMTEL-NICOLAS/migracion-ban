package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigActualizaDatosAsDao;
import co.com.samtel.entity.as400.BigActualizaDatosAs;
import co.com.samtel.entity.as400.BigActualizaDatosIdAs;

@Stateless(name="bigActualizaDatosAsDao")
public class BigActualizaDatosAsDao extends AbsDao<BigActualizaDatosAs, BigActualizaDatosIdAs> implements IBigActualizaDatosAsDao {

}
