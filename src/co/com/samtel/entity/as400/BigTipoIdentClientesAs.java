package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1411F34", schema = "DAMCYFILES")
public class BigTipoIdentClientesAs extends Consecutivo implements Serializable {

	private static final long serialVersionUID = 1L;

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
