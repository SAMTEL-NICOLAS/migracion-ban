package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_BARRIOS", schema = "dbo")
public class BigBarrios implements Serializable{	

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigBarriosId id;
	
	@Column(name = "i_cod_depto")
	private String cod_depurb;
	
	@Column(name = "s_nombre_barrio")
	private String nom_ciurba;

	public BigBarriosId getId() {
		return id;
	}

	public void setId(BigBarriosId id) {
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
	 
}
