package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1413F", schema = "DAMCYFILES")
public class BigActivosAs  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActivosIdAs id;
	
	@Column(name = "feccigeinf")
	private Integer feccigeinf;

	public BigActivosIdAs getId() {
		return id;
	}

	public void setId(BigActivosIdAs id) {
		this.id = id;
	}

	public Integer getFeccigeinf() {
		return feccigeinf;
	}

	public void setFeccigeinf(Integer feccigeinf) {
		this.feccigeinf = feccigeinf;
	}


}
