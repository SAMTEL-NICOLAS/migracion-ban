package co.com.samtel.restservice;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/servletupdate")
public class CargueCsv extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Metodo que se encarga de recuperar el archivo o archivos que se envian desde
	 * la vista y los guarda en una ruta final
	 * 
	 * @param reqest
	 */
	public void createFile(HttpServletRequest request) {
		try {
			String finalRoute = "\\ArchivosCargueExcel";

			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setSizeThreshold(1024);
			factory.setRepository(new File(finalRoute));
			ServletFileUpload upload = new ServletFileUpload(factory);

			List<FileItem> parts = upload.parseRequest(request);

			for (FileItem items : parts) {
				if (null != items.getName()) {
					File file = new File(finalRoute, items.getName());
					items.write(file);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		// Get the printwriter object from response to write the required json object to
		// the output stream
		PrintWriter out = response.getWriter();
		// Assuming your json object is **jsonObject**, perform the following, it will
		// return your json object

		createFile(request);
		out.print("{\"respuesta\": \"Ok\",\"estatus\": \"Ok\"}");
		out.flush();

	}

}
