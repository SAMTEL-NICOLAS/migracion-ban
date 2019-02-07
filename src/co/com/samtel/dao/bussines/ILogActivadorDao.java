package co.com.samtel.dao.bussines;

import java.util.List;

import javax.ejb.Local;

import co.com.samtel.entity.business.LogActivador;

@Local
public interface ILogActivadorDao {
	
	List<LogActivador> findLogActive();
	
	Boolean updateEntity(LogActivador entity);

	List<LogActivador> findAllLogActive();

}
