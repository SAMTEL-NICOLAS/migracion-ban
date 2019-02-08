package co.com.samtel.restservice;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import co.com.samtel.dao.bussines.IAuditDao;

@Stateless
@Path("/v.1/auditMigration")
public class AuditMigrationRest {

	@EJB(beanName = "auditDao")
	IAuditDao auditDao;

	/**
	 * Servicio que se encarga de recuperar la fecha de la vista y la envia a la
	 * consulta para luego retornar la respuesta por medio de un objeto Json.
	 * 
	 * @param date
	 * @return
	 */
	@GET
	@Path("/getAuditByDate/{date1}/{date2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAuditByDate(@PathParam("date1") String date1, @PathParam("date2") String date2) {
		return Response.status(Response.Status.OK).entity(auditDao.getAuditByDate(date1, date2))
				.type(MediaType.APPLICATION_JSON_TYPE).build();
	}

	@GET
	@Path("/getAllAudit")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllAudit() {
		return Response.status(Response.Status.OK).entity(auditDao.findAllAudit()).type(MediaType.APPLICATION_JSON_TYPE)
				.build();
	}

}
