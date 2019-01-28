package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "CRM1411F34", schema = "DAMCYFILES")
public class BigTipoIdentClientesAs implements Serializable {
	
	@EmbeddedId
	private BigTipoIdentClientesIdAs id;
			
	@Column(name = "nombre_tip")
	private String nombre_tip;	
	
	@Column(name = "migrar")
	private String migrado;

	
	public String getNombre_tip() {
		return nombre_tip;
	}

	public void setNombre_tip(String nombre_tip) {
		this.nombre_tip = nombre_tip;
	}

	public BigTipoIdentClientesIdAs getId() {
		return id;
	}

	public void setId(BigTipoIdentClientesIdAs id) {
		this.id = id;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
	
}
