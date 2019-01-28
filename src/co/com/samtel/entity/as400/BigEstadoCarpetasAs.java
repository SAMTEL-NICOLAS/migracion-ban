package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FCE", schema = "DAMCYFILES")
public class BigEstadoCarpetasAs implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id	
	private String codigo_est;
	
	@Column(name = "descripcio")
	private String descripcio;
	
	@Column(name = "cierre_car")
	private String cierre_car;
	
	@Column(name = "migrar")
	private String migrado;
	

	public String getCodigo_est() {
		return codigo_est;
	}

	public void setCodigo_est(String codigo_est) {
		this.codigo_est = codigo_est;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public String getCierre_car() {
		return cierre_car;
	}

	public void setCierre_car(String cierre_car) {
		this.cierre_car = cierre_car;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
