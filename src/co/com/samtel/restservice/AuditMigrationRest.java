package co.com.samtel.restservice;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.dao.bussines.IDetailAudit;

@Stateless
@Path("/v.1/auditMigration")
public class AuditMigrationRest {
	@EJB(beanName = "detailAuditDao")
	IDetailAudit detailAuditDao;

	@GET
	@Path("/getDetailAuditByDate/{date}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetailAuditByDate(@PathParam("date") String date) {
		System.out.println(date);
		return Response.status(Response.Status.OK).entity(detailAuditDao.findAllDetailAudit())
				.type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	@GET
	@Path("/getAllDetailAudit")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListLogActiva() {
		return Response.status(Response.Status.OK).entity(detailAuditDao.findAllDetailAudit())
				.type(MediaType.APPLICATION_JSON_TYPE).build();
	}

}
