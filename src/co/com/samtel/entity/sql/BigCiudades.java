package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CIUDADES", schema = "dbo")
public class BigCiudades implements Serializable{
	
	@EmbeddedId
	private BigCiudadesId id;
	
	@Column(name = "s_nombre_ciudad")
	private String nombre_ciu;	

	public String getNombre_ciu() {
		return nombre_ciu;
	}

	public void setNombre_ciu(String nombre_ciu) {
		this.nombre_ciu = nombre_ciu;
	}

	public BigCiudadesId getId() {
		return id;
	}

	public void setId(BigCiudadesId id) {
		this.id = id;
	}
	
}
