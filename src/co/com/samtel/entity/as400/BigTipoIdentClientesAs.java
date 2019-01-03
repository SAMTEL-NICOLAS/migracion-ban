package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CRM1411F34", schema = "DAMCYFILES")
public class BigTipoIdentClientesAs implements Serializable {
	
	@Id	
	private String tipo_perso;
	
	@Column(name = "clase_tipo")
	private String clase_tipo;
	
	@Column(name = "nombre_tip")
	private String nombre_tip;

	public String getTipo_perso() {
		return tipo_perso;
	}

	public void setTipo_perso(String tipo_perso) {
		this.tipo_perso = tipo_perso;
	}

	public String getClase_tipo() {
		return clase_tipo;
	}

	public void setClase_tipo(String clase_tipo) {
		this.clase_tipo = clase_tipo;
	}

	public String getNombre_tip() {
		return nombre_tip;
	}

	public void setNombre_tip(String nombre_tip) {
		this.nombre_tip = nombre_tip;
	}
	
	
}
