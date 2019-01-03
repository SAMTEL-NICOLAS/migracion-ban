package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "CRM1411FUR", schema = "DAMCYFILES")
public class BigBarriosAs implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigBarriosIdAs id;

	public BigBarriosIdAs getId() {
		return id;
	}

	public void setId(BigBarriosIdAs id) {
		this.id = id;
	}
	
	
}
