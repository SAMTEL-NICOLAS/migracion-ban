package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1426F", schema = "DAMCYFILES")
public class BigEjecutivoAs extends Consecutivo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigEjecutivoIdAs id;
	
	@Column(name = "nom_asesor")
	private String nom_asesor;
	
	@Column(name = "cod_fuerza")
	private String cod_fuerza;
	
	@Column(name = "cod_oficin")
	private Short cod_oficin;
	
	@Column(name = "cod_zona_g")
	private String cod_zona_g;
		
	@Column(name = "estado_eje")
	private String estado_eje;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "migrar")
	private String migrado;

	public BigEjecutivoIdAs getId() {
		return id;
	}

	public void setId(BigEjecutivoIdAs id) {
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

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
}
