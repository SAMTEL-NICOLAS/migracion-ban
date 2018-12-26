package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_RECOGIDOS" , schema="dmc")
public class BigRecogidos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigRecogidosId id;
	
	@Column(name = "i_id_asesor")
	private String asesor;

	public String getAsesor() {
		return asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public BigRecogidosId getId() {
		return id;
	}

	public void setId(BigRecogidosId id) {
		this.id = id;
	}
	
	

}
