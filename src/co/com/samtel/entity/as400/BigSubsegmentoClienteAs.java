package co.com.samtel.entity.as400;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FNI", schema = "DAMCYFILES")
public class BigSubsegmentoClienteAs {
	
	@EmbeddedId
	private BigSubsegmentoClienteIdAs id;
	
	@Column(name = "des_nicho")
	private String des_nicho;
	
	@Column(name = "migrar")
	private String migrado;

	public BigSubsegmentoClienteIdAs getId() {
		return id;
	}

	public void setId(BigSubsegmentoClienteIdAs id) {
		this.id = id;
	}

	public String getDes_nicho() {
		return des_nicho;
	}

	public void setDes_nicho(String des_nicho) {
		this.des_nicho = des_nicho;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
