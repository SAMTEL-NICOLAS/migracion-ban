package co.com.samtel.entity.manual.csv;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Jeferson
 */
@Entity
@Table(name = "Big Calificacion Cartera Cliente")
public class BigCalificacionCarteraClienteCsv implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigCalificacionCarteraClienteIdCsv id;

	@Column(name = "s_identificacion_cliente")
	private String s_identificacion_cliente;

	@Column(name = "i_tipo_identificacion")
	private String i_tipo_identificacion;

	@Column(name = "i_fuerza_comercial")
	private String i_fuerza_comercial;

	@Column(name = "i_oficina")
	private String i_oficina;

	@Column(name = "s_descripcion_linea")
	private String s_descripcion_linea;

	@Column(name = "s_calificacion_anterior")
	private String s_calificacion_anterior;

	@Column(name = "s_calificacion_actual")
	private String s_calificacion_actual;

	@Column(name = "d_fecha_inicio_cre")
	private Date d_fecha_inicio_cre;

	@Column(name = "d_fecha_vcto")
	private Date d_fecha_vcto;

	@Column(name = "i_dias_de_mora")
	private Integer i_dias_de_mora;

	@Column(name = "m_capital")
	private BigDecimal m_capital;

	@Column(name = "i_re_estado")
	private Integer i_re_estado;

	public BigCalificacionCarteraClienteIdCsv getId() {
		return id;
	}

	public void setId(BigCalificacionCarteraClienteIdCsv id) {
		this.id = id;
	}

	public String getS_identificacion_cliente() {
		return s_identificacion_cliente;
	}

	public void setS_identificacion_cliente(String s_identificacion_cliente) {
		this.s_identificacion_cliente = s_identificacion_cliente;
	}

	public String getS_descripcion_linea() {
		return s_descripcion_linea;
	}

	public void setS_descripcion_linea(String s_descripcion_linea) {
		this.s_descripcion_linea = s_descripcion_linea;
	}

	public String getS_calificacion_anterior() {
		return s_calificacion_anterior;
	}

	public void setS_calificacion_anterior(String s_calificacion_anterior) {
		this.s_calificacion_anterior = s_calificacion_anterior;
	}

	public String getS_calificacion_actual() {
		return s_calificacion_actual;
	}

	public void setS_calificacion_actual(String s_calificacion_actual) {
		this.s_calificacion_actual = s_calificacion_actual;
	}

	public Date getD_fecha_inicio_cre() {
		return d_fecha_inicio_cre;
	}

	public void setD_fecha_inicio_cre(Date d_fecha_inicio_cre) {
		this.d_fecha_inicio_cre = d_fecha_inicio_cre;
	}

	public Date getD_fecha_vcto() {
		return d_fecha_vcto;
	}

	public void setD_fecha_vcto(Date d_fecha_vcto) {
		this.d_fecha_vcto = d_fecha_vcto;
	}

	public Integer getI_dias_de_mora() {
		return i_dias_de_mora;
	}

	public void setI_dias_de_mora(Integer i_dias_de_mora) {
		this.i_dias_de_mora = i_dias_de_mora;
	}

	public BigDecimal getM_capital() {
		return m_capital;
	}

	public void setM_capital(BigDecimal m_capital) {
		this.m_capital = m_capital;
	}

	public Integer getI_re_estado() {
		return i_re_estado;
	}

	public void setI_re_estado(Integer i_re_estado) {
		this.i_re_estado = i_re_estado;
	}

	public String getI_tipo_identificacion() {
		return i_tipo_identificacion;
	}

	public void setI_tipo_identificacion(String i_tipo_identificacion) {
		this.i_tipo_identificacion = i_tipo_identificacion;
	}

	public String getI_fuerza_comercial() {
		return i_fuerza_comercial;
	}

	public void setI_fuerza_comercial(String i_fuerza_comercial) {
		this.i_fuerza_comercial = i_fuerza_comercial;
	}

	public String getI_oficina() {
		return i_oficina;
	}

	public void setI_oficina(String i_oficina) {
		this.i_oficina = i_oficina;
	}

}
