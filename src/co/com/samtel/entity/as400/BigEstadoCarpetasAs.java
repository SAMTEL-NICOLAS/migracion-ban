package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FCE", schema = "DAMCYFILES")
public class BigEstadoCarpetasAs implements Serializable {
	
	@Id	
	private String codigo_est;
	
	@Column(name = "descripcio")
	private String descripcio;
	
	@Column(name = "cierre_car")
	private String cierre_car;

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
}
