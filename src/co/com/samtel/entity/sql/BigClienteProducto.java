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
	
	@Column(name = "i_codigo_sub_producto")
	private String crcspr;	
	
	@Column(name = "s_ceco")
	private Short crcdof;	
	
	@Column(name = "m_valor_debito")
	private BigDecimal crvlde;	
	
	@Column(name = "m_valor_credito")
	private BigDecimal crvlcr;	
	
	@Column(name = "m_saldo")
	private BigDecimal crsald;	
	
	@Column(name = "i_nui")
	private Long crcnui;	
	
	@Column(name = "i_codigo_asesor")
	private String crcdas;	
	
	@Column(name = "i_registro")
	private Long crireg;

	public BigClienteProductoId getId() {
		return id;
	}

	public void setId(BigClienteProductoId id) {
		this.id = id;
	}

	public String getCrcspr() {
		return crcspr;
	}

	public void setCrcspr(String crcspr) {
		this.crcspr = crcspr;
	}

	public Short getCrcdof() {
		return crcdof;
	}

	public void setCrcdof(Short crcdof) {
		this.crcdof = crcdof;
	}

	public BigDecimal getCrvlde() {
		return crvlde;
	}

	public void setCrvlde(BigDecimal crvlde) {
		this.crvlde = crvlde;
	}

	public BigDecimal getCrvlcr() {
		return crvlcr;
	}

	public void setCrvlcr(BigDecimal crvlcr) {
		this.crvlcr = crvlcr;
	}

	public BigDecimal getCrsald() {
		return crsald;
	}

	public void setCrsald(BigDecimal crsald) {
		this.crsald = crsald;
	}

	public Long getCrcnui() {
		return crcnui;
	}

	public void setCrcnui(Long crcnui) {
		this.crcnui = crcnui;
	}

	public String getCrcdas() {
		return crcdas;
	}

	public void setCrcdas(String crcdas) {
		this.crcdas = crcdas;
	}

	public Long getCrireg() {
		return crireg;
	}

	public void setCrireg(Long crireg) {
		this.crireg = crireg;
	}

}
