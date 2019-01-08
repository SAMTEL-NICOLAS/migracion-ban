package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_SUBPRODUCTOS", schema = "dbo")
public class BigSubproductos implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "i_cod_subproducto")
	private String cod_subpro;
	
	@Column(name = "i_cod_producto")
	private String cod_produc;
	
	@Column(name = "s_nom_subproducto")
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
