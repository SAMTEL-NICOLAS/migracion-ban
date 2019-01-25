package co.com.samtel.cargue.service.impl;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import co.com.samtel.cargue.service.IAccessParameters;

@Stateless(name = "accessParameters")
public class AccessParameters implements IAccessParameters {

	

	public String url;
	public String typeFile;

	@PostConstruct
	public void init() {
		setUrl("C:\\archivos\\");
		setTypeFile("csv");
	}

	@Override
	public String getParameter(TYPEPARAMETER key) {
		if(key.equals(TYPEPARAMETER.URL)) {
			return getUrl();
		}else if(key.equals(TYPEPARAMETER.TYPE_FILE)) {
			return getTypeFile();
		}
		return null;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(String typeFile) {
		this.typeFile = typeFile;
	}

}
