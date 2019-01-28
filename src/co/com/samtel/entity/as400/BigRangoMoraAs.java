package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FMO", schema = "DAMCYFILES")
public class BigRangoMoraAs  implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id	
	private Short i_id_rango;
	
	@Column(name = "i_limite_i")
	private Integer i_limite_i;
	
	@Column(name = "i_limite_f")
	private Integer i_limite_f;
	
	@Column(name = "s_des_rang")
	private String s_des_rang;
	
	@Column(name = "s_nom_rang")
	private String s_nom_rang;
	
	@Column(name = "migrar")
	private String migrado;

	public Short getI_id_rango() {
		return i_id_rango;
	}

	public void setI_id_rango(Short i_id_rango) {
		this.i_id_rango = i_id_rango;
	}

	public Integer getI_limite_i() {
		return i_limite_i;
	}

	public void setI_limite_i(Integer i_limite_i) {
		this.i_limite_i = i_limite_i;
	}

	public Integer getI_limite_f() {
		return i_limite_f;
	}

	public void setI_limite_f(Integer i_limite_f) {
		this.i_limite_f = i_limite_f;
	}

	public String getS_des_rang() {
		return s_des_rang;
	}

	public void setS_des_rang(String s_des_rang) {
		this.s_des_rang = s_des_rang;
	}

	public String getS_nom_rang() {
		return s_nom_rang;
	}

	public void setS_nom_rang(String s_nom_rang) {
		this.s_nom_rang = s_nom_rang;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
}
