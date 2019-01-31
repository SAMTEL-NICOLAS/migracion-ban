package co.com.samtel.restservice;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.dto.ResponseRest;
import co.com.samtel.dto.UploadDto;
import co.com.samtel.enumeraciones.TypeErrors;

@Stateless
@Path("/v.1/cargue")
public class CargueRest {
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String imAlive() {
		return "Im alive";
	}
	
	@POST
	@Path("/upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(@Valid UploadDto archivo) {
		return Response.status(Response.Status.OK)
			.entity(new ResponseRest<String>(TypeErrors.SUCCESS, "OK", "Ok"))
			.type(MediaType.APPLICATION_JSON_TYPE).build();
	}
	
	
}
