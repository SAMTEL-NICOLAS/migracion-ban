package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_PARAMETROS_CONSOLIDADOS", schema = "dbo")
public class BigParametrosConsolidados  implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigParametrosConsolidadosId id;
		
	@Column(name = "s_descripcion")
	private String cod_descri;

	public BigParametrosConsolidadosId getId() {
		return id;
	}

	public void setId(BigParametrosConsolidadosId id) {
		this.id = id;
	}

	public String getCod_descri() {
		return cod_descri;
	}

	public void setCod_descri(String cod_descri) {
		this.cod_descri = cod_descri;
	}


}
