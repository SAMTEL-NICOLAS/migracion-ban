package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1411F20", schema = "DAMCYFILES")
public class BigTipoTransaccionAs extends Consecutivo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigTipoTransaccionIdAs id;
	
	@Column(name = "migrar")
	private String migrado;

	public BigTipoTransaccionIdAs getId() {
		return id;
	}

	public void setId(BigTipoTransaccionIdAs id) {
		this.id = id;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	

}
