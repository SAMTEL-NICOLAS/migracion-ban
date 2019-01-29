package co.com.samtel.restservice;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.samtel.dto.GenericParamDto;

@Stateless
@Path("/parametros")
@Produces(MediaType.APPLICATION_JSON)
public class ParametrosRest {
	
	@GET
	@Path("/delimiter")
	public List<GenericParamDto> getDelimiters(){
		List<GenericParamDto> rta = new ArrayList<>();
		rta.add(GenericParamDto.of(",", "Coma"));
		rta.add(GenericParamDto.of(";", "Punto y coma"));
		return rta;
	}
}
