package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "BIG_RECOGIDOS")
public class BigRecogidosAs implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private BigRecogidosIdAs id;
	@Column(name = "s_tipo_linea")
	private String s_tipo_linea;

	@Column(name = "d_fecha_prueba")
	private Integer fechaPrueba;
	@Transient
	private Date fechaPruebaTra;

	public BigRecogidosIdAs getId() {
		return id;
	}

	public void setId(BigRecogidosIdAs id) {
		this.id = id;
	}

	public String getS_tipo_linea() {
		return s_tipo_linea;
	}

	public void setS_tipo_linea(String s_tipo_linea) {
		this.s_tipo_linea = s_tipo_linea;
	}

	public Integer getFechaPrueba() {
		return fechaPrueba;
	}

	public void setFechaPrueba(Integer fechaPrueba) {
		this.fechaPrueba = fechaPrueba;
	}

	public Date getFechaPruebaTra() {
		return fechaPruebaTra;
	}

	public void setFechaPruebaTra(Date fechaPruebaTra) {
		this.fechaPruebaTra = fechaPruebaTra;
	}

}
