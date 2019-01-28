package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CRM1412F", schema = "DAMCYFILES")
public class BigOficinaAs implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	private Short codofc;
	
	@Column(name = "nmeofc")
	private String nmeofc;
	
	@Column(name = "codciu")
	private String codciu;
	
	@Column(name = "codreg")
	private String codreg;
	
	@Column(name = "codzon")
	private String codzon;
	
	@Column(name = "coddep")
	private String coddep;
	
	@Column(name = "migrar")
	private String migrado;

	public Short getCodofc() {
		return codofc;
	}

	public void setCodofc(Short codofc) {
		this.codofc = codofc;
	}

	public String getNmeofc() {
		return nmeofc;
	}

	public void setNmeofc(String nmeofc) {
		this.nmeofc = nmeofc;
	}

	public String getCodciu() {
		return codciu;
	}

	public void setCodciu(String codciu) {
		this.codciu = codciu;
	}

	public String getCodreg() {
		return codreg;
	}

	public void setCodreg(String codreg) {
		this.codreg = codreg;
	}

	public String getCodzon() {
		return codzon;
	}

	public void setCodzon(String codzon) {
		this.codzon = codzon;
	}

	public String getCoddep() {
		return coddep;
	}

	public void setCoddep(String coddep) {
		this.coddep = coddep;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
