package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1411FAP", schema = "DAMCYFILES")
public class BigSubproductosAs implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id	
	private String cod_subpro;
	
	@Column(name = "cod_produc")
	private String cod_produc;
	
	@Column(name = "nom_subpro")
	private String nom_subpro;

	public String getCod_subpro() {
		return cod_subpro;
	}

	public void setCod_subpro(String cod_subpro) {
		this.cod_subpro = cod_subpro;
	}

	public String getCod_produc() {
		return cod_produc;
	}

	public void setCod_produc(String cod_produc) {
		this.cod_produc = cod_produc;
	}

	public String getNom_subpro() {
		return nom_subpro;
	}

	public void setNom_subpro(String nom_subpro) {
		this.nom_subpro = nom_subpro;
	}	

}
