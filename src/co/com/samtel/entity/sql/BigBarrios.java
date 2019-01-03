package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "BIG_BARRIOS", schema = "dbo")
public class BigBarrios   implements Serializable{	

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigBarriosId id;

	public BigBarriosId getId() {
		return id;
	}

	public void setId(BigBarriosId id) {
		this.id = id;
	}
	
}
