package co.com.samtel.ldap;

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

@Stateless
@Path("/v.1/ldap")
public class LdapRest {

	@EJB(beanName = "conexionLdap")
	ILdap conexionLdap;

	@GET
	@Path("/{user}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response generateUpload(@PathParam("user") String user, @PathParam("password") String password) {
		System.out.println(user+password);		
		Boolean result = conexionLdap.generateConnection(user, password);
	
		if (result) {
			return Response.status(Response.Status.OK)
					.entity(new ResponseRest<Long>(TypeErrors.SUCCESS, "OK", conexionLdap.getLdapDto()))
					.type(MediaType.APPLICATION_JSON_TYPE).build();
		} else {
			return Response.status(Response.Status.OK)
					.entity(new ResponseRest<Long>(conexionLdap.getMessageError().getTypeError(),
							conexionLdap.getMessageError().getMessage(), Long.valueOf("-1")))
					.type(MediaType.APPLICATION_JSON_TYPE).build();
		}		
	}
}
