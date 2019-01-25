package co.com.samtel.cargue.service.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.samtel.cargue.service.IAccessParameters;
import co.com.samtel.cargue.service.IManageResource;

@Stateless(name = "manageResource")
public class ManageResource implements IManageResource {
	
	@EJB
	IAccessParameters accessParameters;
	
	private String urlServer;
	@PostConstruct
	public void init() {
		setUrlServer(accessParameters.getParameter(IAccessParameters.TYPEPARAMETER.URL)
				.concat("nicolas")
				.concat(".")
				.concat(accessParameters.getParameter(IAccessParameters.TYPEPARAMETER.TYPE_FILE)));
	}

	@SuppressWarnings("null")
	@Override
	public Boolean copyResourceServer(InputStream resource) {
		Boolean respuesta = Boolean.TRUE;
		try {			
			Files.copy(resource, new File(getUrlDestination()).toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			respuesta = Boolean.FALSE;
			e.printStackTrace();
		} finally {
			try {
				resource.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return respuesta;
	}

	@Override
	public String getUrlDestination() {
		return getUrlServer();
	}

	public String getUrlServer() {
		return urlServer;
	}

	public void setUrlServer(String urlServer) {
		this.urlServer = urlServer;
	}

}
