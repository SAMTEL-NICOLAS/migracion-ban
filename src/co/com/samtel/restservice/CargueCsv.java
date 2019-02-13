package co.com.samtel.restservice;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IUploadMigration;

@WebServlet("/servletupdate")
public class CargueCsv extends HttpServlet {

//	private static final long serialVersionUID = 1L;
//
//	@EJB(beanName = "executeUpload")
//	IUploadMigration executeUpload;
//
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.setContentType("text/html;charset=UTF-8");
//		Long idAuditoria = generateUpload(request);
//		System.out.println("Termino el proceso y enviara a la pagina de cargue...");
//		response.sendRedirect("/migracion-ban/#!/cargue?idAuditoria=" + idAuditoria);
//	}
//
//	/**
//	 * Metodo con el cual se genera el cargue del archivo y se ejecuta el proceso de
//	 * ejecucion
//	 * 
//	 * @param request
//	 * @return
//	 */
//	public Long generateUpload(HttpServletRequest request) {
//		Boolean result = executeUpload.generateMigration(TypeMigration.PRUEBA, request);
//		Long idAuditoria = (long) 0;
//		if (result) {
//			idAuditoria = executeUpload.getIdAudit();
//		} else {
//			idAuditoria = (long) -1;
//		}
//		return idAuditoria;
//	}

}
