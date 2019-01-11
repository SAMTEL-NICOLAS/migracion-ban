package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_LOCALIDAD", schema = "dbo")
public class BigLocalidad  implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigLocalidadId id;
	
	@Column(name = "s_nombre_localidad")
	private String nombre_r;

	public BigLocalidadId getId() {
		return id;
	}

	public void setId(BigLocalidadId id) {
		this.id = id;
	}

	public String getNombre_r() {
		return nombre_r;
	}

	public void setNombre_r(String nombre_r) {
		this.nombre_r = nombre_r;
	}
	

}
