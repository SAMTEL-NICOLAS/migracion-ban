package co.com.samtel.dao.impl;

import javax.ejb.Stateless;
import co.com.samtel.dao.IBigCanalesDao;
import co.com.samtel.entity.sql.BigCanales;
import co.com.samtel.entity.sql.BigCanalesId;

@Stateless(name="bigCanalesDao")
public class BigCanalesDao extends AbsDao<BigCanales, BigCanalesId> implements IBigCanalesDao {

}
