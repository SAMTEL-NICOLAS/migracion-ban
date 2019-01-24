package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1418F", schema = "DAMCYFILES")
public class BigPasivosConsolidadoAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigPasivosConsolidadoIdAs id;
	
	@Column(name = "crfecc")
	private Integer crfeccAux;
	
	@Column(name = "crcact")
	private Short crcact;
	
	@Column(name = "crciat")
	private Short crciat;
	
	@Column(name = "crccms")
	private Short crccms;
	
	@Column(name = "crcbms")
	private Short crcbms;
	
	@Column(name = "crslpr")
	private BigDecimal crslpr;
	
	@Column(name = "crnrde")
	private Long crnrde;
	
	@Column(name = "crnrre")
	private Long crnrre;
	
	@Column(name = "crctms")
	private Short crctms;
	
	@Column(name = "crccdt")
	private Short crccdt;
	
	@Column(name = "crntrj")
	private Short crntrj;
	
	@Column(name = "migrado")
	private String migrado;

	public BigPasivosConsolidadoIdAs getId() {
		return id;
	}

	public void setId(BigPasivosConsolidadoIdAs id) {
		this.id = id;
	}

	public Integer getCrfeccAux() {
		return crfeccAux;
	}

	public void setCrfeccAux(Integer crfeccAux) {
		this.crfeccAux = crfeccAux;
	}

	public Short getCrcact() {
		return crcact;
	}

	public void setCrcact(Short crcact) {
		this.crcact = crcact;
	}

	public Short getCrciat() {
		return crciat;
	}

	public void setCrciat(Short crciat) {
		this.crciat = crciat;
	}

	public Short getCrccms() {
		return crccms;
	}

	public void setCrccms(Short crccms) {
		this.crccms = crccms;
	}

	public Short getCrcbms() {
		return crcbms;
	}

	public void setCrcbms(Short crcbms) {
		this.crcbms = crcbms;
	}

	public BigDecimal getCrslpr() {
		return crslpr;
	}

	public void setCrslpr(BigDecimal crslpr) {
		this.crslpr = crslpr;
	}

	public Long getCrnrde() {
		return crnrde;
	}

	public void setCrnrde(Long crnrde) {
		this.crnrde = crnrde;
	}

	public Long getCrnrre() {
		return crnrre;
	}

	public void setCrnrre(Long crnrre) {
		this.crnrre = crnrre;
	}

	public Short getCrctms() {
		return crctms;
	}

	public void setCrctms(Short crctms) {
		this.crctms = crctms;
	}

	public Short getCrccdt() {
		return crccdt;
	}

	public void setCrccdt(Short crccdt) {
		this.crccdt = crccdt;
	}

	public Short getCrntrj() {
		return crntrj;
	}

	public void setCrntrj(Short crntrj) {
		this.crntrj = crntrj;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	

}
