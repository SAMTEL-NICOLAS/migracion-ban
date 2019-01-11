package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411F20", schema = "DAMCYFILES")
public class BigTipoTransaccionAs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigTipoTransaccionIdAs id;

	public BigTipoTransaccionIdAs getId() {
		return id;
	}

	public void setId(BigTipoTransaccionIdAs id) {
		this.id = id;
	}	

}
