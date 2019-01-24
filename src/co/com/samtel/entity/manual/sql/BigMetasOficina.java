package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_METAS_OFICINA", schema = "dbo")
public class BigMetasOficina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigMetasOficinaId id;
	
	@Column(name = "m_valor_meta")
	private BigDecimal m_valor_meta;

	public BigMetasOficinaId getId() {
		return id;
	}

	public void setId(BigMetasOficinaId id) {
		this.id = id;
	}

	public BigDecimal getM_valor_meta() {
		return m_valor_meta;
	}

	public void setM_valor_meta(BigDecimal m_valor_meta) {
		this.m_valor_meta = m_valor_meta;
	} 
}
