package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1423F", schema = "DAMCYFILES")
public class BigInfoAdicionalClientesAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigInfoAdicionalClientesIdAs id;

	@Column(name = "crfecc")
	private Integer crfecc;
	
	@Column(name = "crctaa")
	private Short crctaa;
	
	@Column(name = "crctai")
	private Short crctai;
	
	@Column(name = "crctab")
	private Short crctab;
	
	@Column(name = "crctav")
	private Short crctav;
	
	@Column(name = "crcdte")
	private Short crcdte;
	
	@Column(name = "crccro")
	private Short crccro;
	
	@Column(name = "crctar")
	private Integer crctar;
	
	@Column(name = "crptar")
	private BigDecimal crptar;
	
	@Column(name = "crtlmc")
	private BigDecimal crtlmc;
	
	@Column(name = "crtlcv")
	private BigDecimal crtlcv;
	
	@Column(name = "crtlcc")
	private BigDecimal crtlcc;
	
	@Column(name = "crtlcm")
	private BigDecimal crtlcm;
	
	@Column(name = "crslcc")
	private BigDecimal crslcc;
	
	@Column(name = "crtlcd")
	private BigDecimal crtlcd;
	
	@Column(name = "crmtlc")
	private BigDecimal crmtlc;
	
	@Column(name = "crccvn")
	private Integer crccvn;
	
	@Column(name = "crccrv")
	private Integer crccrv;
	
	@Column(name = "crcccc")
	private Integer crcccc;
	
	@Column(name = "crppga")
	private String crppga;
	
	@Column(name = "crpdba")
	private String crpdba;

	public BigInfoAdicionalClientesIdAs getId() {
		return id;
	}

	public void setId(BigInfoAdicionalClientesIdAs id) {
		this.id = id;
	}

	public Integer getCrfecc() {
		return crfecc;
	}

	public void setCrfecc(Integer crfecc) {
		this.crfecc = crfecc;
	}

	public Short getCrctaa() {
		return crctaa;
	}

	public void setCrctaa(Short crctaa) {
		this.crctaa = crctaa;
	}

	public Short getCrctai() {
		return crctai;
	}

	public void setCrctai(Short crctai) {
		this.crctai = crctai;
	}

	public Short getCrctab() {
		return crctab;
	}

	public void setCrctab(Short crctab) {
		this.crctab = crctab;
	}

	public Short getCrctav() {
		return crctav;
	}

	public void setCrctav(Short crctav) {
		this.crctav = crctav;
	}

	public Short getCrcdte() {
		return crcdte;
	}

	public void setCrcdte(Short crcdte) {
		this.crcdte = crcdte;
	}

	public Short getCrccro() {
		return crccro;
	}

	public void setCrccro(Short crccro) {
		this.crccro = crccro;
	}

	public Integer getCrctar() {
		return crctar;
	}

	public void setCrctar(Integer crctar) {
		this.crctar = crctar;
	}

	public BigDecimal getCrptar() {
		return crptar;
	}

	public void setCrptar(BigDecimal crptar) {
		this.crptar = crptar;
	}

	public BigDecimal getCrtlmc() {
		return crtlmc;
	}

	public void setCrtlmc(BigDecimal crtlmc) {
		this.crtlmc = crtlmc;
	}

	public BigDecimal getCrtlcv() {
		return crtlcv;
	}

	public void setCrtlcv(BigDecimal crtlcv) {
		this.crtlcv = crtlcv;
	}

	public BigDecimal getCrtlcc() {
		return crtlcc;
	}

	public void setCrtlcc(BigDecimal crtlcc) {
		this.crtlcc = crtlcc;
	}

	public BigDecimal getCrtlcm() {
		return crtlcm;
	}

	public void setCrtlcm(BigDecimal crtlcm) {
		this.crtlcm = crtlcm;
	}

	public BigDecimal getCrslcc() {
		return crslcc;
	}

	public void setCrslcc(BigDecimal crslcc) {
		this.crslcc = crslcc;
	}

	public BigDecimal getCrtlcd() {
		return crtlcd;
	}

	public void setCrtlcd(BigDecimal crtlcd) {
		this.crtlcd = crtlcd;
	}

	public BigDecimal getCrmtlc() {
		return crmtlc;
	}

	public void setCrmtlc(BigDecimal crmtlc) {
		this.crmtlc = crmtlc;
	}

	public Integer getCrccvn() {
		return crccvn;
	}

	public void setCrccvn(Integer crccvn) {
		this.crccvn = crccvn;
	}

	public Integer getCrccrv() {
		return crccrv;
	}

	public void setCrccrv(Integer crccrv) {
		this.crccrv = crccrv;
	}

	public Integer getCrcccc() {
		return crcccc;
	}

	public void setCrcccc(Integer crcccc) {
		this.crcccc = crcccc;
	}

	public String getCrppga() {
		return crppga;
	}

	public void setCrppga(String crppga) {
		this.crppga = crppga;
	}

	public String getCrpdba() {
		return crpdba;
	}

	public void setCrpdba(String crpdba) {
		this.crpdba = crpdba;
	}
	


}
