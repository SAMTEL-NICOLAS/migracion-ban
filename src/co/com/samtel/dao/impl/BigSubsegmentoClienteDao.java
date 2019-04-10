package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.DummyConsecutivo;
import co.com.samtel.dao.IBigSubsegmentoClienteDao;
import co.com.samtel.entity.sql.BigSubsegmentoCliente;
import co.com.samtel.entity.sql.BigSubsegmentoClienteId;
@Stateless(name="bigSubsegmentoClienteDao")
public class BigSubsegmentoClienteDao extends AbsDao<BigSubsegmentoCliente, BigSubsegmentoClienteId, DummyConsecutivo> implements IBigSubsegmentoClienteDao{

}
