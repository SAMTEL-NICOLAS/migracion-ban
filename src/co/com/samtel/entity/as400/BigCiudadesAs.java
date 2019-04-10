package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1411F84", schema = "DAMCYFILES")
public class BigCiudadesAs extends Consecutivo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigCiudadesIdAs id;
	
	@Column(name = "nombre_ciu")
	private String nombre_ciu;	
	
	@Column(name = "migrar")
	private String migrado;

	public String getNombre_ciu() {
		return nombre_ciu;
	}

	public void setNombre_ciu(String nombre_ciu) {
		this.nombre_ciu = nombre_ciu;
	}

	public BigCiudadesIdAs getId() {
		return id;
	}

	public void setId(BigCiudadesIdAs id) {
		this.id = id;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
	
}
