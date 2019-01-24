package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CRM1481F", schema = "DAMCYFILES")
public class BigCredipremiumAs implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id	
	private Long crcnui;
	
	@Column(name = "crcmmc")
	private Short crcmmc;
	
	@Column(name = "crcpcr")
	private String crcpcr;
	
	@Column(name = "crccar")
	private String crccar;
	
	@Column(name = "crcncc")
	private Short crcncc;
	
	@Column(name = "crcmms")
	private Short crcmms;
	
	@Column(name = "crctic")
	private String crctic;
	
	@Column(name = "crclcr")
	private String crclcr;
	
	@Column(name = "crcfdc")
	private Integer crcfdcAux;
	@Transient
	private Date crcfdc;
	
	@Column(name = "crcmdc")
	private BigDecimal crcmdc;
	
	@Column(name = "crcpdc")
	private Integer crcpdc;
	
	@Column(name = "crccap")
	private BigDecimal crccap;
	
	@Column(name = "crcatc")
	private BigDecimal crcatc;
	
	@Column(name = "crcfvc")
	private Integer crcfvcAux;
	@Transient
	private Date crcfvc;
	
	@Column(name = "crcmpc")
	private Short crcmpc;	

	@Column(name = "crcmmr")
	private Short crcmmr;
	
	@Column(name = "crcpic")
	private Short crcpic;
	
	@Column(name = "crcmpl")
	private Short crcmpl;
	
	@Column(name = "crcmml")
	private Short crcmml;
	
	@Column(name = "crcace")
	private String crcace;
	
	@Column(name = "crcsci")
	private String crcsci;
	
	@Column(name = "crcrpp")
	private String crcrpp;
	
	@Column(name = "crcrso")
	private String crcrso;
	
	@Column(name = "crcfpc")
	private Integer crcfpcAux;
	@Transient
	private Date crcfpc;
	
	@Column(name = "crcfcr")
	private Integer crcfcrAux;
	@Transient
	private Date crcfcr;
	
	@Column(name = "crcmdu")
	private BigDecimal crcmdu;
	
	@Column(name = "crcclc")
	private String crcclc;
	
	@Column(name = "crcpar")
	private String crcpar;
	
	@Column(name = "crcenm")
	private Integer crcenm;
	
	@Column(name = "crcscs")
	private Short crcscs;
	
	@Column(name = "crcpin")
	private BigDecimal crcpin;
	
	@Column(name = "crcsjv")
	private String crcsjv;	
	
	@Column(name = "crcpcc")
	private BigDecimal crcpcc;	
	
	@Column(name = "crcptt")
	private BigDecimal crcptt;
	
	@Column(name = "crcesc")
	private String crcesc;
	
	@Column(name = "crcm15")
	private Short crcm15;
	
	@Column(name = "crcm30")
	private Short crcm30;
	
	@Column(name = "crcm60")
	private Short crcm60;
	
	@Column(name = "crcnca")
	private Short crcnca;
	
	@Column(name = "crcmcu")
	private Short crcmcu;
	
	@Column(name = "crcnco")
	private Short crcnco;
	
	@Column(name = "crcacc")
	private Long crcacc;
	
	@Column(name = "crcase")
	private String  crcase;
	
	@Column(name = "crcnre")
	private Short crcnre;
	
	@Column(name = "crccuv")
	private Short crccuv;
	
	@Column(name = "crcpep")
	private String crcpep;
	
	@Column(name = "crcgar")
	private String crcgar;
	
	
	@Column(name = "migrado")
	private String migrado;

	public Long getCrcnui() {
		return crcnui;
	}

	public void setCrcnui(Long crcnui) {
		this.crcnui = crcnui;
	}

	public Short getCrcmmc() {
		return crcmmc;
	}

	public void setCrcmmc(Short crcmmc) {
		this.crcmmc = crcmmc;
	}

	public String getCrcpcr() {
		return crcpcr;
	}

	public void setCrcpcr(String crcpcr) {
		this.crcpcr = crcpcr;
	}

	public String getCrccar() {
		return crccar;
	}

	public void setCrccar(String crccar) {
		this.crccar = crccar;
	}

	public Short getCrcncc() {
		return crcncc;
	}

	public void setCrcncc(Short crcncc) {
		this.crcncc = crcncc;
	}

	public Short getCrcmms() {
		return crcmms;
	}

	public void setCrcmms(Short crcmms) {
		this.crcmms = crcmms;
	}

	public String getCrctic() {
		return crctic;
	}

	public void setCrctic(String crctic) {
		this.crctic = crctic;
	}

	public String getCrclcr() {
		return crclcr;
	}

	public void setCrclcr(String crclcr) {
		this.crclcr = crclcr;
	}

	public Integer getCrcfdcAux() {
		return crcfdcAux;
	}

	public void setCrcfdcAux(Integer crcfdcAux) {
		this.crcfdcAux = crcfdcAux;
	}

	public Date getCrcfdc() {
		return crcfdc;
	}

	public void setCrcfdc(Date crcfdc) {
		this.crcfdc = crcfdc;
	}

	public BigDecimal getCrcmdc() {
		return crcmdc;
	}

	public void setCrcmdc(BigDecimal crcmdc) {
		this.crcmdc = crcmdc;
	}

	public Integer getCrcpdc() {
		return crcpdc;
	}

	public void setCrcpdc(Integer crcpdc) {
		this.crcpdc = crcpdc;
	}

	public BigDecimal getCrccap() {
		return crccap;
	}

	public void setCrccap(BigDecimal crccap) {
		this.crccap = crccap;
	}

	public BigDecimal getCrcatc() {
		return crcatc;
	}

	public void setCrcatc(BigDecimal crcatc) {
		this.crcatc = crcatc;
	}

	public Integer getCrcfvcAux() {
		return crcfvcAux;
	}

	public void setCrcfvcAux(Integer crcfvcAux) {
		this.crcfvcAux = crcfvcAux;
	}

	public Date getCrcfvc() {
		return crcfvc;
	}

	public void setCrcfvc(Date crcfvc) {
		this.crcfvc = crcfvc;
	}

	public Short getCrcmpc() {
		return crcmpc;
	}

	public void setCrcmpc(Short crcmpc) {
		this.crcmpc = crcmpc;
	}

	public Short getCrcmmr() {
		return crcmmr;
	}

	public void setCrcmmr(Short crcmmr) {
		this.crcmmr = crcmmr;
	}

	public Short getCrcpic() {
		return crcpic;
	}

	public void setCrcpic(Short crcpic) {
		this.crcpic = crcpic;
	}

	public Short getCrcmpl() {
		return crcmpl;
	}

	public void setCrcmpl(Short crcmpl) {
		this.crcmpl = crcmpl;
	}

	public Short getCrcmml() {
		return crcmml;
	}

	public void setCrcmml(Short crcmml) {
		this.crcmml = crcmml;
	}

	public String getCrcace() {
		return crcace;
	}

	public void setCrcace(String crcace) {
		this.crcace = crcace;
	}

	public String getCrcsci() {
		return crcsci;
	}

	public void setCrcsci(String crcsci) {
		this.crcsci = crcsci;
	}

	public String getCrcrpp() {
		return crcrpp;
	}

	public void setCrcrpp(String crcrpp) {
		this.crcrpp = crcrpp;
	}

	public String getCrcrso() {
		return crcrso;
	}

	public void setCrcrso(String crcrso) {
		this.crcrso = crcrso;
	}

	public Integer getCrcfpcAux() {
		return crcfpcAux;
	}

	public void setCrcfpcAux(Integer crcfpcAux) {
		this.crcfpcAux = crcfpcAux;
	}

	public Date getCrcfpc() {
		return crcfpc;
	}

	public void setCrcfpc(Date crcfpc) {
		this.crcfpc = crcfpc;
	}

	public Integer getCrcfcrAux() {
		return crcfcrAux;
	}

	public void setCrcfcrAux(Integer crcfcrAux) {
		this.crcfcrAux = crcfcrAux;
	}

	public Date getCrcfcr() {
		return crcfcr;
	}

	public void setCrcfcr(Date crcfcr) {
		this.crcfcr = crcfcr;
	}

	public BigDecimal getCrcmdu() {
		return crcmdu;
	}

	public void setCrcmdu(BigDecimal crcmdu) {
		this.crcmdu = crcmdu;
	}

	public String getCrcclc() {
		return crcclc;
	}

	public void setCrcclc(String crcclc) {
		this.crcclc = crcclc;
	}

	public String getCrcpar() {
		return crcpar;
	}

	public void setCrcpar(String crcpar) {
		this.crcpar = crcpar;
	}

	public Integer getCrcenm() {
		return crcenm;
	}

	public void setCrcenm(Integer crcenm) {
		this.crcenm = crcenm;
	}

	public Short getCrcscs() {
		return crcscs;
	}

	public void setCrcscs(Short crcscs) {
		this.crcscs = crcscs;
	}

	public BigDecimal getCrcpin() {
		return crcpin;
	}

	public void setCrcpin(BigDecimal crcpin) {
		this.crcpin = crcpin;
	}

	public String getCrcsjv() {
		return crcsjv;
	}

	public void setCrcsjv(String crcsjv) {
		this.crcsjv = crcsjv;
	}

	public BigDecimal getCrcpcc() {
		return crcpcc;
	}

	public void setCrcpcc(BigDecimal crcpcc) {
		this.crcpcc = crcpcc;
	}

	public BigDecimal getCrcptt() {
		return crcptt;
	}

	public void setCrcptt(BigDecimal crcptt) {
		this.crcptt = crcptt;
	}

	public String getCrcesc() {
		return crcesc;
	}

	public void setCrcesc(String crcesc) {
		this.crcesc = crcesc;
	}

	public Short getCrcm15() {
		return crcm15;
	}

	public void setCrcm15(Short crcm15) {
		this.crcm15 = crcm15;
	}

	public Short getCrcm30() {
		return crcm30;
	}

	public void setCrcm30(Short crcm30) {
		this.crcm30 = crcm30;
	}

	public Short getCrcm60() {
		return crcm60;
	}

	public void setCrcm60(Short crcm60) {
		this.crcm60 = crcm60;
	}

	public Short getCrcnca() {
		return crcnca;
	}

	public void setCrcnca(Short crcnca) {
		this.crcnca = crcnca;
	}

	public Short getCrcmcu() {
		return crcmcu;
	}

	public void setCrcmcu(Short crcmcu) {
		this.crcmcu = crcmcu;
	}

	public Short getCrcnco() {
		return crcnco;
	}

	public void setCrcnco(Short crcnco) {
		this.crcnco = crcnco;
	}

	public Long getCrcacc() {
		return crcacc;
	}

	public void setCrcacc(Long crcacc) {
		this.crcacc = crcacc;
	}

	public String getCrcase() {
		return crcase;
	}

	public void setCrcase(String crcase) {
		this.crcase = crcase;
	}

	public Short getCrcnre() {
		return crcnre;
	}

	public void setCrcnre(Short crcnre) {
		this.crcnre = crcnre;
	}

	public Short getCrccuv() {
		return crccuv;
	}

	public void setCrccuv(Short crccuv) {
		this.crccuv = crccuv;
	}

	public String getCrcpep() {
		return crcpep;
	}

	public void setCrcpep(String crcpep) {
		this.crcpep = crcpep;
	}

	public String getCrcgar() {
		return crcgar;
	}

	public void setCrcgar(String crcgar) {
		this.crcgar = crcgar;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
