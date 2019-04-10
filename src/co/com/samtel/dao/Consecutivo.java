package co.com.samtel.dao;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import co.com.samtel.migration.IConsecutivo;

@MappedSuperclass
public class Consecutivo implements IConsecutivo{

	@Column(name = "consecuti")
	private Long secuencia;

	public Long getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(Long secuencia) {
		this.secuencia = secuencia;
	}
	
}
