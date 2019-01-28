package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CRM1411FS3", schema = "DAMCYFILES")
public class BigActividadEconomicaInternaAs implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id	
	private String codigo_int;
	
	@Column(name = "codigo_ciu")
	private String codigo_ciu;
	
	@Column(name = "cod_sec_ec")
	private String cod_sec_ec;
	
	@Column(name = "des_act_in")
	private String des_act_in;
	
	@Column(name = "migrar")
	private String migrado;

	public String getCodigo_int() {
		return codigo_int;
	}

	public void setCodigo_int(String codigo_int) {
		this.codigo_int = codigo_int;
	}

	public String getCodigo_ciu() {
		return codigo_ciu;
	}

	public void setCodigo_ciu(String codigo_ciu) {
		this.codigo_ciu = codigo_ciu;
	}

	public String getCod_sec_ec() {
		return cod_sec_ec;
	}

	public void setCod_sec_ec(String cod_sec_ec) {
		this.cod_sec_ec = cod_sec_ec;
	}

	public String getDes_act_in() {
		return des_act_in;
	}

	public void setDes_act_in(String des_act_in) {
		this.des_act_in = des_act_in;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
	
}
