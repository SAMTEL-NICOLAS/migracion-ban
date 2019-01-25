package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_EST_GENERAL_LISTA", schema = "dbo")
public class BigEstGeneralLista  implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigEstGeneralListaId id;
		
	@Column(name = "s_descripcion")
	private String cod_descri;

	public BigEstGeneralListaId getId() {
		return id;
	}

	public void setId(BigEstGeneralListaId id) {
		this.id = id;
	}

	public String getCod_descri() {
		return cod_descri;
	}

	public void setCod_descri(String cod_descri) {
		this.cod_descri = cod_descri;
	}


}
