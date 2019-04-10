package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CNOFC", schema = "DAMCYFILES")
public class CnofcAs extends Consecutivo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private CnofcIdAs id;
	
	@Column(name = "cnorut")
	private String cnorut;

	public CnofcIdAs getId() {
		return id;
	}

	public void setId(CnofcIdAs id) {
		this.id = id;
	}

	public String getCnorut() {
		return cnorut;
	}

	public void setCnorut(String cnorut) {
		this.cnorut = cnorut;
	}	
}
