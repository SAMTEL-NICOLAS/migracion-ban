package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "BIG_TIPO_TRANSACCION", schema = "dbo")
public class BigTipoTransaccion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigTipoTransaccionId id;

	public BigTipoTransaccionId getId() {
		return id;
	}

	public void setId(BigTipoTransaccionId id) {
		this.id = id;
	}
	
	

}
