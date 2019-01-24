package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CRM1424F", schema = "DAMCYFILES")
public class BigConsCentralesAs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigConsCentralesIdAs id;
	
	@Column(name = "crctip")
	private String crctip;
	
	@Column(name = "crcnid")
	private String crcnid;
	
	@Column(name = "crcncn")
	private String crcncn;
	
	@Column(name = "crcecn")
	private String crcecn;
	
	@Column(name = "crcfcn")
	private Integer crcfcnAux;
	@Transient
	private Date crcfcn;
	
	@Column(name = "crccrc")
	private String crccrc;
	
	@Column(name = "crcspr")
	private String crcspr;
	
	@Column(name = "crcmon")
	private BigDecimal crcmon;
	
	@Column(name = "crcpla")
	private Integer crcpla;
	
	@Column(name = "crceso")
	private String crceso;
	
	@Column(name = "crcde1")
	private String crcde1;
	
	@Column(name = "crcde2")
	private String crcde2;
	
	@Column(name = "crcde3")
	private String crcde3;
	
	@Column(name = "crfecc")
	private Integer crfeccAux;
	@Transient
	private Date crfecc;
	
	@Column(name = "crcncr")
	private Long crcncr;
	
	@Column(name = "crccas")
	private String crccas;
	
	@Column(name = "crcevi")
	private String crcevi;
	
	@Column(name = "migrado")
	private String migrado;
	

	public BigConsCentralesIdAs getId() {
		return id;
	}

	public void setId(BigConsCentralesIdAs id) {
		this.id = id;
	}

	public String getCrctip() {
		return crctip;
	}

	public void setCrctip(String crctip) {
		this.crctip = crctip;
	}

	public String getCrcnid() {
		return crcnid;
	}

	public void setCrcnid(String crcnid) {
		this.crcnid = crcnid;
	}

	public String getCrcncn() {
		return crcncn;
	}

	public void setCrcncn(String crcncn) {
		this.crcncn = crcncn;
	}

	public String getCrcecn() {
		return crcecn;
	}

	public void setCrcecn(String crcecn) {
		this.crcecn = crcecn;
	}

	public Integer getCrcfcnAux() {
		return crcfcnAux;
	}

	public void setCrcfcnAux(Integer crcfcnAux) {
		this.crcfcnAux = crcfcnAux;
	}

	public Date getCrcfcn() {
		return crcfcn;
	}

	public void setCrcfcn(Date crcfcn) {
		this.crcfcn = crcfcn;
	}

	public String getCrccrc() {
		return crccrc;
	}

	public void setCrccrc(String crccrc) {
		this.crccrc = crccrc;
	}

	public String getCrcspr() {
		return crcspr;
	}

	public void setCrcspr(String crcspr) {
		this.crcspr = crcspr;
	}

	public BigDecimal getCrcmon() {
		return crcmon;
	}

	public void setCrcmon(BigDecimal crcmon) {
		this.crcmon = crcmon;
	}

	public Integer getCrcpla() {
		return crcpla;
	}

	public void setCrcpla(Integer crcpla) {
		this.crcpla = crcpla;
	}

	public String getCrceso() {
		return crceso;
	}

	public void setCrceso(String crceso) {
		this.crceso = crceso;
	}

	public String getCrcde1() {
		return crcde1;
	}

	public void setCrcde1(String crcde1) {
		this.crcde1 = crcde1;
	}

	public String getCrcde2() {
		return crcde2;
	}

	public void setCrcde2(String crcde2) {
		this.crcde2 = crcde2;
	}

	public String getCrcde3() {
		return crcde3;
	}

	public void setCrcde3(String crcde3) {
		this.crcde3 = crcde3;
	}

	public Integer getCrfeccAux() {
		return crfeccAux;
	}

	public void setCrfeccAux(Integer crfeccAux) {
		this.crfeccAux = crfeccAux;
	}

	public Date getCrfecc() {
		return crfecc;
	}

	public void setCrfecc(Date crfecc) {
		this.crfecc = crfecc;
	}

	public Long getCrcncr() {
		return crcncr;
	}

	public void setCrcncr(Long crcncr) {
		this.crcncr = crcncr;
	}

	public String getCrccas() {
		return crccas;
	}

	public void setCrccas(String crccas) {
		this.crccas = crccas;
	}

	public String getCrcevi() {
		return crcevi;
	}

	public void setCrcevi(String crcevi) {
		this.crcevi = crcevi;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}		

}
