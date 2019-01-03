package co.com.samtel.dao.impl;

import javax.ejb.Stateless;

import co.com.samtel.dao.IBigCodigosAbogadoDao;
import co.com.samtel.entity.sql.BigCodigosAbogado;
@Stateless(name="bigCodigosAbogadoDao")
public class BigCodigosAbogadoDao extends AbsDao<BigCodigosAbogado, String> implements IBigCodigosAbogadoDao {

}
