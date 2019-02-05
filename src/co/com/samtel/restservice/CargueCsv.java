package co.com.samtel.restservice;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

@WebServlet("/servletupdate")
public class CargueCsv extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@EJB(beanName = "executeUpload")
	IUploadMigration executeUpload;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		generateUpload(request);
		System.out.println("Termino el proceso y enviara a la pagina de cargue...");

	}

	public Response generateUpload(HttpServletRequest request) {
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
