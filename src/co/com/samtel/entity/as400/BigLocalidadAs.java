package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "CRM1411FRU", schema = "DAMCYFILES")
public class BigLocalidadAs  implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigLocalidadIdAs id;

	@Column(name = "nombre_r")
	private String nombre_r;
	
	@Column(name = "migrar")
	private String migrado;


	public BigLocalidadIdAs getId() {
		return id;
	}

	public void setId(BigLocalidadIdAs id) {
		this.id = id;
	}

	public String getNombre_r() {
		return nombre_r;
	}

	public void setNombre_r(String nombre_r) {
		this.nombre_r = nombre_r;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}

}
