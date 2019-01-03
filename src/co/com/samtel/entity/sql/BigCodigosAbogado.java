package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "BIG_CODIGOS_ABOGADO", schema = "dbo")
public class BigCodigosAbogado implements Serializable  {
	
	@Id	
	@Column(name = "i_codigo_ente")
	private String cod_ente;
	
	@Column(name = "i_tipo_id")
	private String tipo_id;
	
	@Column(name = "s_id_ente")
	private String id_ente;
	
	@Column(name = "s_primer_nombre")
	private String prim_nom;
	
	@Column(name = "s_segundo_nombre")
	private String segu_nom;

	@Column(name = "s_primer_apellido")
	private String prim_ape;
	
	@Column(name = "s_segundo_apellido")
	private String segu_ape;

	public String getCod_ente() {
		return cod_ente;
	}

	public void setCod_ente(String cod_ente) {
		this.cod_ente = cod_ente;
	}

	public String getTipo_id() {
		return tipo_id;
	}

	public void setTipo_id(String tipo_id) {
		this.tipo_id = tipo_id;
	}

	public String getId_ente() {
		return id_ente;
	}

	public void setId_ente(String id_ente) {
		this.id_ente = id_ente;
	}

	public String getPrim_nom() {
		return prim_nom;
	}

	public void setPrim_nom(String prim_nom) {
		this.prim_nom = prim_nom;
	}

	public String getSegu_nom() {
		return segu_nom;
	}

	public void setSegu_nom(String segu_nom) {
		this.segu_nom = segu_nom;
	}

	public String getPrim_ape() {
		return prim_ape;
	}

	public void setPrim_ape(String prim_ape) {
		this.prim_ape = prim_ape;
	}

	public String getSegu_ape() {
		return segu_ape;
	}

	public void setSegu_ape(String segu_ape) {
		this.segu_ape = segu_ape;
	}
	
	
}
