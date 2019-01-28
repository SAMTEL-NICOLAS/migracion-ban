package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FCA", schema = "DAMCYFILES")
public class BigCalificacionCarteraAs implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id	
	private Long i_cod_cali;
	
	@Column(name = "cod_califi")
	private String cod_califi;
	
	@Column(name = "des_califi")
	private String des_califi;
	
	@Column(name = "migrar")
	private String migrado;

	public Long getI_cod_cali() {
		return i_cod_cali;
	}

	public void setI_cod_cali(Long i_cod_cali) {
		this.i_cod_cali = i_cod_cali;
	}

	public String getCod_califi() {
		return cod_califi;
	}

	public void setCod_califi(String cod_califi) {
		this.cod_califi = cod_califi;
	}

	public String getDes_califi() {
		return des_califi;
	}

	public void setDes_califi(String des_califi) {
		this.des_califi = des_califi;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
