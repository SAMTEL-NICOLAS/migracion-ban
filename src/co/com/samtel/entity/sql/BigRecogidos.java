package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_RECOGIDOSSQL")
public class BigRecogidos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private BigRecogidosId id;
	@Column(name = "s_tipo_linea")
	private String s_tipo_linea;
	@Column(name = "d_fecha_prueba")
	private Date fechaPruebaTra;

	public BigRecogidosId getId() {
		return id;
	}

	public void setId(BigRecogidosId id) {
		this.id = id;
	}

	public String getS_tipo_linea() {
		return s_tipo_linea;
	}

	public void setS_tipo_linea(String s_tipo_linea) {
		this.s_tipo_linea = s_tipo_linea;
	}

	public Date getFechaPruebaTra() {
		return fechaPruebaTra;
	}

	public void setFechaPruebaTra(Date fechaPruebaTra) {
		this.fechaPruebaTra = fechaPruebaTra;
	}
	
	

}
