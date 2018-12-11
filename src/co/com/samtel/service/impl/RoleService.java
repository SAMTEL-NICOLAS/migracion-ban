package co.com.samtel.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;

import co.com.samtel.entity.as400.BigRecojidosEntity;
import co.com.samtel.entity.sql.BigActivos;
import co.com.samtel.enumeraciones.TypeConections;
import co.com.samtel.hibernate.IFactorySessionHibernate;
import co.com.samtel.service.IRoleService;

@Stateless
public class RoleService implements IRoleService {
	
	@Inject
	IFactorySessionHibernate factorySessionHibernate;

	@Override
	public void findAll() {
		Session session = null;
		try {
			session = factorySessionHibernate.generateSesion(TypeConections.AS400).openSession();
			Criteria crit = session.createCriteria(BigRecojidosEntity.class);

			List queryList = crit.list();
			if (queryList != null && queryList.isEmpty()) {
				//return null;
			} else {
				System.out.println("list " + queryList);
				//return (List<Student>) queryList;
			}
		} catch (Exception e) {
			e.printStackTrace();
			//return null;
		} finally {
			session.close();
		}
	}

}
