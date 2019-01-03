package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_TIPO_IDENT_CLIENTES", schema = "dbo")
public class BigTipoIdentClientes implements Serializable {

	@EmbeddedId
	private BigTipoIdentClientesId id;
	
	/*@Id
	@Column(name = "i_tipo_persona")
	private String tipo_perso;	*/
	

	@Column(name = "s_nombre_tipo")
	private String nombre_tip;

	public String getNombre_tip() {
		return nombre_tip;
	}

	public void setNombre_tip(String nombre_tip) {
		this.nombre_tip = nombre_tip;
	}

	public BigTipoIdentClientesId getId() {
		return id;
	}

	public void setId(BigTipoIdentClientesId id) {
		this.id = id;
	}
	
	
}
