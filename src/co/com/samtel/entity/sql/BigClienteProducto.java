package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CLIENTE_PRODUCTO", schema = "dmc")
public class BigClienteProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigClienteProductoId id;
	@Column(name = "i_nui")
	private BigDecimal crcnui;

	public BigClienteProductoId getId() {
		return id;
	}

	public void setId(BigClienteProductoId id) {
		this.id = id;
	}

	public BigDecimal getCrcnui() {
		return crcnui;
	}

	public void setCrcnui(BigDecimal crcnui) {
		this.crcnui = crcnui;
	}

}
