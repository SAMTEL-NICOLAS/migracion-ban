package co.com.samtel.restservice;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.dto.LoginDto;
import co.com.samtel.dto.ResponseRest;
import co.com.samtel.enumeraciones.TypeErrors;

@Stateless
@Path("/login")
public class LoginRest {
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLogin(@Valid LoginDto userLogin) {
		String response ="";
		if(userLogin.getUser().equalsIgnoreCase("admin") && userLogin.getPass().equalsIgnoreCase("admin")) {
			response = "Ok";
		}else {
			response = "Error";
		}
		return Response.status(Response.Status.OK)
				.entity( new ResponseRest<String>(TypeErrors.SUCCESS, "OK", response) )
				.type(MediaType.APPLICATION_JSON_TYPE)
				.build();
	}

}
