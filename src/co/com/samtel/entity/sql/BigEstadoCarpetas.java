package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_ESTADOS_CARPETAS", schema = "dbo")
public class BigEstadoCarpetas implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "s_codigo_estado")
	private String codigo_est;
	
	@Column(name = "s_descripcion")
	private String descripcio;
	
	@Column(name = "s_cierre_carpeta")
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
