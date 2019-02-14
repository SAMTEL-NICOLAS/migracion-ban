package co.com.samtel.cargue.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.Stateless;

import co.com.samtel.cargue.service.IReadResource;

@Stateless(name = "csvRead")
public class CsvRead extends AbsRead implements IReadResource {

	@Override
	public Boolean readFile() {
		if (validateResource()) {
			fileRows();
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public void fileRows() {
		init();
		try (BufferedReader br = new BufferedReader(new FileReader(getUrl()))) {

			String sCurrentLine;
			int i = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				if (getRows() == null) {
					setRows(new ArrayList<>());
				}
				getRows().add(sCurrentLine);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
