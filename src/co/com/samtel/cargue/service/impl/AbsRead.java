package co.com.samtel.cargue.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class AbsRead {

	private String url;
	private List<String> rows;
	
	public void init() {
		setRows(new ArrayList<>());
	}
	
	public Boolean validateResource() {
		File file = new File(getUrl());
		if(file.exists()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getRows() {
		return rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}

}
