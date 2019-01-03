package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1409F", schema = "DAMCYFILES")
public class BigClienteProductoAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigClienteProductoIdAs id;

	@Column(name = "crfecc")
	private Integer crfeccAux;
	@Column(name = "CRCNUI")
	private BigDecimal crcnui;

	public BigClienteProductoIdAs getId() {
		return id;
	}

	public void setId(BigClienteProductoIdAs id) {
		this.id = id;
	}

	public Integer getCrfeccAux() {
		return crfeccAux;
	}

	public void setCrfeccAux(Integer crfeccAux) {
		this.crfeccAux = crfeccAux;
	}

	public BigDecimal getCrcnui() {
		return crcnui;
	}

	public void setCrcnui(BigDecimal crcnui) {
		this.crcnui = crcnui;
	}

}