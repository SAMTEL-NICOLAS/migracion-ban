package co.com.samtel.entity.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGACTIVA", schema = "DAMCYFILES")
public class LogActivador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "LOGCON")
	private Long id;
	@Column(name = "LOGNUM")
	private String nombreTabla;
	@Column(name = "LOGSTS")
	private String estado;
	@Column(name = "LOGCRJ")
	private Long regMig;
	@Column(name = "LOGDDJ")
	private Long dia;
	@Column(name = "LOGMMJ")
	private Long mes;
	@Column(name = "LOGAAJ")
	private Long anio;
	@Column(name = "LOGHOJ")
	private Long hora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreTabla() {
		return nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getRegMig() {
		return regMig;
	}

	public void setRegMig(Long regMig) {
		this.regMig = regMig;
	}

	public Long getDia() {
		return dia;
	}

	public void setDia(Long dia) {
		this.dia = dia;
	}

	public Long getMes() {
		return mes;
	}

	public void setMes(Long mes) {
		this.mes = mes;
	}

	public Long getAnio() {
		return anio;
	}

	public void setAnio(Long anio) {
		this.anio = anio;
	}

	public Long getHora() {
		return hora;
	}

	public void setHora(Long hora) {
		this.hora = hora;
	}

}
