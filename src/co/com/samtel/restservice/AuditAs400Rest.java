package co.com.samtel.restservice;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.dao.bussines.ILogActivadorDao;

@Stateless
@Path("/v.1/auditAs400")
public class AuditAs400Rest {

	@EJB(beanName = "logActivadorDao")
	ILogActivadorDao logActivadorDao;

	@GET
	@Path("/getAllLogActiva")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllLogActiva() {
		return Response.status(Response.Status.OK).entity(logActivadorDao.findAllLogActive())
				.type(MediaType.APPLICATION_JSON_TYPE).build();
	}

}
