package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1410F", schema = "DAMCYFILES")
public class BigEstGeneralListaAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigEstGeneralListaIdAs id;

	@Column(name = "cod_descri")
	private String cod_descri;
	
	@Column(name = "migrar")
	private String migrado;

	public BigEstGeneralListaIdAs getId() {
		return id;
	}

	public void setId(BigEstGeneralListaIdAs id) {
		this.id = id;
	}

	public String getCod_descri() {
		return cod_descri;
	}

	public void setCod_descri(String cod_descri) {
		this.cod_descri = cod_descri;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}

}
