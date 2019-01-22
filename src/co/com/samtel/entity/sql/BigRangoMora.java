package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "i_id_rango", schema = "dbo")
public class BigRangoMora implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "i_id_rango")
	private Short i_id_rango;
	
	@Column(name = "i_limite_inicio")
	private Integer i_limite_i;
	
	@Column(name = "i_limite_fin")
	private Integer i_limite_f;
	
	@Column(name = "s_descripcion_rango")
	private String s_des_rang;
	
	@Column(name = "s_nombre_rango")
	private String s_nom_rang;

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
}
