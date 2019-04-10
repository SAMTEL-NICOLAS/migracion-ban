package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1422F", schema = "DAMCYFILES")
public class BigNotaInternaAs extends Consecutivo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigNotaInternaIdAs id;

	@Column(name = "notcliente")
	private String notcliente;
	
	@Column(name = "feccorte")
	private Integer feccorte;
	
	@Column(name = "migrar")
	private String migrado;

	public BigNotaInternaIdAs getId() {
		return id;
	}

	public void setId(BigNotaInternaIdAs id) {
		this.id = id;
	}

	public String getNotcliente() {
		return notcliente;
	}

	public void setNotcliente(String notcliente) {
		this.notcliente = notcliente;
	}

	public Integer getFeccorte() {
		return feccorte;
	}

	public void setFeccorte(Integer feccorte) {
		this.feccorte = feccorte;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
	
}
