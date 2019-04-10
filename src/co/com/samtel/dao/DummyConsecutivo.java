package co.com.samtel.dao;

import javax.persistence.Transient;

import co.com.samtel.migration.IConsecutivo;

public class DummyConsecutivo implements IConsecutivo {
	
	@Transient
	private Long secuencia;
		
	public DummyConsecutivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}

}
