package co.com.samtel.restservice;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.dto.ResponseRest;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IExecuteMigration;

@Stateless
@Path("/migracion")
public class MigracionRest {

	@EJB(beanName = "executeMigration")
	IExecuteMigration executeMigration;

	@GET
	@Path("/{user}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response generateMigration(@PathParam("user") String user) {
		Boolean result = executeMigration.generateMigration(TypeMigration.PRUEBA);
		if (result) {
			return Response.status(Response.Status.OK)
					
					.entity(new ResponseRest<Long>(TypeErrors.SUCCESS, "OK", executeMigration.getIdAudit()))
					.type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.status(Response.Status.OK)
					.entity(new ResponseRest<Long>(executeMigration.getMessageError().getTypeError(),
							executeMigration.getMessageError().getMessage(), Long.valueOf("-1")))
					.type(MediaType.APPLICATION_JSON_TYPE).build();
		}
	}
}
