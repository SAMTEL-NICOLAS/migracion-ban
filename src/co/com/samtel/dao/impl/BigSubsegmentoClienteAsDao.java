package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigSubsegmentoClienteAsDao;
import co.com.samtel.entity.as400.BigSubsegmentoClienteAs;
import co.com.samtel.entity.as400.BigSubsegmentoClienteIdAs;
@Stateless(name="bigSubsegmentoClienteAsDao")
public class BigSubsegmentoClienteAsDao extends AbsDao<BigSubsegmentoClienteAs, BigSubsegmentoClienteIdAs> implements IBigSubsegmentoClienteAsDao {

}
