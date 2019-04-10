package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1409F", schema = "DAMCYFILES")
public class BigClienteProductoAs extends Consecutivo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigClienteProductoIdAs id;
	
	@Column(name = "crfecc")
	private Integer crfeccAux;	
	
	@Column(name = "crcspr")
	private String crcspr;	
	
	@Column(name = "crcdof")
	private Short crcdof;	
	
	@Column(name = "crvlde")
	private BigDecimal crvlde;	
	
	@Column(name = "crvlcr")
	private BigDecimal crvlcr;	
	
	@Column(name = "crsald")
	private BigDecimal crsald;	
	
	@Column(name = "crcnui")
	private Long crcnui;	
	
	@Column(name = "crcdas")
	private String crcdas;	
	
	@Column(name = "crireg")
	private Long crireg;	
	
	@Column(name = "migrar")
	private String migrado;

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

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
}
