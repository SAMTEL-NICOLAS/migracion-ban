package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_EJECUTIVO", schema = "dbo")
public class BigEjecutivo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigEjecutivoId id;
	
	@Column(name = "s_nombre_asesor")
	private String nom_asesor;
	
	@Column(name = "i_codigo_fuerza_comercial")
	private String cod_fuerza;
	
	@Column(name = "i_codigo_oficina")
	private Short cod_oficin;
	
	@Column(name = "i_codigo_zona_gestion")
	private String cod_zona_g;
		
	@Column(name = "s_estado_gestion")
	private String estado_eje;
	
	@Column(name = "s_categoria")
	private String categoria;

	public BigEjecutivoId getId() {
		return id;
	}

	public void setId(BigEjecutivoId id) {
		this.id = id;
	}

	public String getNom_asesor() {
		return nom_asesor;
	}

	public void setNom_asesor(String nom_asesor) {
		this.nom_asesor = nom_asesor;
	}

	public String getCod_fuerza() {
		return cod_fuerza;
	}

	public void setCod_fuerza(String cod_fuerza) {
		this.cod_fuerza = cod_fuerza;
	}

	public Short getCod_oficin() {
		return cod_oficin;
	}

	public void setCod_oficin(Short cod_oficin) {
		this.cod_oficin = cod_oficin;
	}

	public String getCod_zona_g() {
		return cod_zona_g;
	}

	public void setCod_zona_g(String cod_zona_g) {
		this.cod_zona_g = cod_zona_g;
	}

	public String getEstado_eje() {
		return estado_eje;
	}

	public void setEstado_eje(String estado_eje) {
		this.estado_eje = estado_eje;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
