package co.com.samtel.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import co.com.samtel.service.IParametrosService;

@Stateless
public class ParametrosService implements IParametrosService{
	
	private Long numRecordsToProcess;
	private InputStream inputS;
	private Properties props;
	
	@PostConstruct
	private void init() {
		props = new Properties();
		try {
			inputS = new FileInputStream("/properties/configuration.properties");
			props.load(inputS);
			setNumRecordsToProcess(Long.valueOf(props.getProperty("NUMBER_RECORD_PROCESS")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public Long getNumRecordsToProcess() {
		return numRecordsToProcess;
	}

	public void setNumRecordsToProcess(Long numRecordsToProcess) {
		this.numRecordsToProcess = numRecordsToProcess;
	}

	public InputStream getInputS() {
		return inputS;
	}

	public void setInputS(InputStream inputS) {
		this.inputS = inputS;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
	

}
