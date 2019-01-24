package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FUR", schema = "DAMCYFILES")
public class BigBarriosAs implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigBarriosIdAs id;
	
	@Column(name = "cod_depurb")
	private String cod_depurb;
	
	@Column(name = "nom_ciurba")
	private String nom_ciurba;
	
	@Column(name = "migrado")
	private String migrado;

	public BigBarriosIdAs getId() {
		return id;
	}

	public void setId(BigBarriosIdAs id) {
		this.id = id;
	}

	public String getCod_depurb() {
		return cod_depurb;
	}

	public void setCod_depurb(String cod_depurb) {
		this.cod_depurb = cod_depurb;
	}

	public String getNom_ciurba() {
		return nom_ciurba;
	}

	public void setNom_ciurba(String nom_ciurba) {
		this.nom_ciurba = nom_ciurba;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
	
}
