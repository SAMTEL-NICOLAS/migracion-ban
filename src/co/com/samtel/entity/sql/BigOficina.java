package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_OFICINA", schema = "dbo")
public class BigOficina implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "i_codigo_oficina")
	private Short codofc;
	
	@Column(name = "s_nombre_oficina")
	private String nmeofc;
	
	@Column(name = "i_codigo_municipio")
	private String codciu;
	
	@Column(name = "i_codigo_region")
	private String codreg;
	
	@Column(name = "i_codigo_zona")
	private String codzon;
	
	@Column(name = "i_codigo_departamento")
	private String coddep;	

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
}
