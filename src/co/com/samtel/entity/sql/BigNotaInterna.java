package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_NOTA_INTERNA", schema = "dbo")
public class BigNotaInterna implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigNotaInternaId id;
	
	@Column(name = "s_nota_interna")
	private String notcliente;

	public BigNotaInternaId getId() {
		return id;
	}

	public void setId(BigNotaInternaId id) {
		this.id = id;
	}

	public String getNotcliente() {
		return notcliente;
	}

	public void setNotcliente(String notcliente) {
		this.notcliente = notcliente;
	}
	
	
}
