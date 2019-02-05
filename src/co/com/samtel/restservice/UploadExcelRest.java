package co.com.samtel.restservice;

import java.util.HashMap;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.dto.ResponseRest;
import co.com.samtel.enumeraciones.TypeErrors;
import co.com.samtel.enumeraciones.TypeMigration;
import co.com.samtel.migration.IUploadMigration;

@Stateless
@Path("/v.1/uploadExcel")
public class UploadExcelRest {

	private HashMap<String, String> listDelimiters;

	private String delimiter;

	@EJB(beanName = "executeUpload")
	IUploadMigration executeUpload;

	@EJB(beanName = "executePersistTable")
	IExecutePersistTable executePersistTable;

	@GET
	@Path("/{user}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response generateUpload(@PathParam("user") String user) {
		System.out.println("Parametro: " + user);
		Boolean result = executeUpload.generateMigration(TypeMigration.PRUEBA, user);
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

	@GET
	@Path("/realizarProceso")
	@Produces(MediaType.APPLICATION_JSON)
	public String prueba(@PathParam("user") String user) {
		String proceso = "";
		try {
			System.out.println("001");

			Boolean result = executeUpload.generateMigration(TypeMigration.PRUEBA, user);

			// String url = "C:\\ArchivosExcel\\BIG_DESENDEUDESE.csv";
			String url = "C:\\ArchivosExcel\\BIG_CALIFICACION_CARTERA_CLIENTE.csv";
			// String url = "C:\\ArchivosExcel\\BIG_PARA_INDICADORES.csv";
			// String url = "C:\\ArchivosExcel\\BIG_PROSPECTOS.csv";
			// String url = "C:\\ArchivosExcel\\BIG_METAS_OFICINA.csv";
			// String url = "C:\\ArchivosExcel\\BIG_METAS_FUERZA_COMERCIAL.csv";
			// String url = "C:\\ArchivosExcel\\BIG_INFO_FINANCIERA.csv";
			// String url = "C:\\ArchivosExcel\\BIG_GEOREFERENCIAR_PROSPECTO.csv";

			setDelimiter(",");

			System.out.println("002");
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_DESENDEUDESE, getDelimiter());
			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_CALIFICACION_CARTERA_CLIENTE,
					getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_PARA_INDICADORES, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_PROSPECTOS, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_METAS_OFICINA, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_METAS_FUERZA_COMERCIAL, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_INFO_FINANCIERA, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_GEOREFERENCIAR_PROSPECTO, getDelimiter());

			System.out.println("005");
			if (respuesta) {
				System.out.println("MAPEO REALIZADO CORRECTAMENTE");
				proceso = "MAPEO REALIZADO CORRECTAMENTE";
			} else {
				System.out.println("Error al mapear el excel");
				proceso = "Error al mapear el excel";
			}

		} catch (Exception e) {
			System.out.println("003");
			e.printStackTrace();
		}

		return proceso;
	}

	public String prueba() {
		String proceso = "";
		try {
			System.out.println("001");

			// String url = "C:\\ArchivosExcel\\BIG_DESENDEUDESE.csv";
			String url = "C:\\ArchivosExcel\\BIG_CALIFICACION_CARTERA_CLIENTE.csv";
			// String url = "C:\\ArchivosExcel\\BIG_PARA_INDICADORES.csv";
			// String url = "C:\\ArchivosExcel\\BIG_PROSPECTOS.csv";
			// String url = "C:\\ArchivosExcel\\BIG_METAS_OFICINA.csv";
			// String url = "C:\\ArchivosExcel\\BIG_METAS_FUERZA_COMERCIAL.csv";
			// String url = "C:\\ArchivosExcel\\BIG_INFO_FINANCIERA.csv";
			// String url = "C:\\ArchivosExcel\\BIG_GEOREFERENCIAR_PROSPECTO.csv";

			setDelimiter(",");

			System.out.println("002");
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_DESENDEUDESE, getDelimiter());
			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_CALIFICACION_CARTERA_CLIENTE,
					getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_PARA_INDICADORES, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_PROSPECTOS, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_METAS_OFICINA, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_METAS_FUERZA_COMERCIAL, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_INFO_FINANCIERA, getDelimiter());
//			Boolean respuesta = executePersistTable.executeProcess(url, TypeFile.BIG_GEOREFERENCIAR_PROSPECTO, getDelimiter());

			System.out.println("005");
			if (respuesta) {
				System.out.println("MAPEO REALIZADO CORRECTAMENTE");
				proceso = "MAPEO REALIZADO CORRECTAMENTE";
			} else {
				System.out.println("Error al mapear el excel");
				proceso = "Error al mapear el excel";
			}

		} catch (Exception e) {
			System.out.println("003");
			e.printStackTrace();
		}

		return proceso;

	}

	public HashMap<String, String> getListDelimiters() {
		return listDelimiters;
	}

	public void setListDelimiters(HashMap<String, String> listDelimiters) {
		this.listDelimiters = listDelimiters;
	}

	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

}
