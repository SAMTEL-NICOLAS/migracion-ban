package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigTipoIdentClientesAsDao;
import co.com.samtel.entity.as400.BigTipoIdentClientesAs;
import co.com.samtel.entity.as400.BigTipoIdentClientesIdAs;

@Stateless(name="bigTipoIdentClientesAsDao")
public class BigTipoIdentClientesAsDao extends AbsDao<BigTipoIdentClientesAs, BigTipoIdentClientesIdAs> implements IBigTipoIdentClientesAsDao{

}
