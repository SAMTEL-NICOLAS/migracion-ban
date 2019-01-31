package co.com.samtel.restservice;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/v.1/cargue")
public class CargueRest {
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String imAlive() {
		return "Im alive";
	}
	
	
}
