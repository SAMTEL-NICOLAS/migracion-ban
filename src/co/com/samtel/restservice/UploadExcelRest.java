package co.com.samtel.restservice;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.dto.ResponseRest;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IUploadMigration;

@Stateless
@Path("/v.1/uploadExcel")
public class UploadExcelRest {

	@EJB(beanName = "executeUpload")
	IUploadMigration executeUpload;

	@GET
	@Path("/{user}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response generateUpload(@PathParam("request") HttpServletRequest request) {
		Boolean result = executeUpload.generateMigration(TypeMigration.PRUEBA, request);
		if (result) {
			return Response.status(Response.Status.OK)
					.entity(new ResponseRest<Long>(TypeErrors.SUCCESS, "OK", executeUpload.getIdAudit()))
					.type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.status(Response.Status.OK)
					.entity(new ResponseRest<Long>(executeUpload.getMessageError().getTypeError(),
							executeUpload.getMessageError().getMessage(), Long.valueOf("-1")))
					.type(MediaType.APPLICATION_JSON_TYPE).build();
		}
	}

}
