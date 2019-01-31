package co.com.samtel.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.apache.myfaces.custom.fileupload.UploadedFile;

import co.com.samtel.cargue.enumeraciones.TypeFile;
import co.com.samtel.cargue.service.IExecutePersistTable;
import co.com.samtel.cargue.service.IManageResource;

@ManagedBean(name = "cargueMB")
public class CargueMB implements IManagedBean {

	@EJB(beanName = "manageResource")
	IManageResource manageResource;

	@EJB(beanName = "executePersistTable")
	IExecutePersistTable executePersistTable;

	private HashMap<String, String> listDelimiters;

	private String delimiter;

	private UploadedFile uploadedFile;

	@PostConstruct
	public void init() {
		setListDelimiters(new HashMap<>());
		getListDelimiters().put("Coma", ",");
		getListDelimiters().put("Punto y Coma", ";");
	}

	public void prueba() {
		try {
			System.out.println("001");
		
			File origen = new File("C:\\BigDesendeudese.csv");
			InputStream in = new FileInputStream(origen);	
					
			if (manageResource.copyResourceServer(in)) {
				System.out.println("002");
				Boolean respuesta = executePersistTable.executeProcess(manageResource.getUrlDestination(),
						TypeFile.BIG_DESENDEUDESE, getDelimiter());
				System.out.println("005");
				if (respuesta) {
					addMessage(TYPEMESSAGE.SUCCESS, " MAPEO REALIZADO CORRECTAMENTE");
				} else {
					addMessage(TYPEMESSAGE.ERROR, " Error al mapear el excel");
				}
			} else {
				System.out.println("004");
				addMessage(TYPEMESSAGE.ERROR, " Error al copiar el archivo en el server");
			}
		} catch (Exception e) {
			System.out.println("003");
			e.printStackTrace();
		}
	}

	public String getDelimiter() {
		return delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public HashMap<String, String> getListDelimiters() {
		return listDelimiters;
	}

	public void setListDelimiters(HashMap<String, String> listDelimiters) {
		this.listDelimiters = listDelimiters;
	}

}
