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
@Table(name = "CRM1419F", schema = "DAMCYFILES")
public class BigClientesAs  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id	
	private Long nui;
	
	@Column(name = "codnatucli")
	private String codnatucli;
	
	@Column(name = "codtipiden")
	private String codtipiden;
	
	@Column(name = "codocupaci")
	private String codocupaci;
	
	@Column(name = "numidentif")
	private String numidentif;
	
	@Column(name = "fechaexdoc")
	private Integer fechaexdocAux;
	@Transient
	private Date fechaexdoc;
	
	@Column(name = "lugarexped")
	private String lugarexped;
	
	@Column(name = "nombcomprs")
	private String nombcomprs;
	
	@Column(name = "numemplead")
	private Long numemplead;
	
	@Column(name = "numemplern")
	private BigDecimal numemplern;
	
	@Column(name = "numemplnrn")
	private BigDecimal numemplnrn;
	
	@Column(name = "codregionl")
	private String codregionl;
	
	@Column(name = "codzoncomr")
	private String codzoncomr;
	
	@Column(name = "codofiactl")
	private Short codofiactl;
	
	@Column(name = "fechcrecli")
	private Integer fechcrecliAux;
	@Transient
	private Date fechcrecli;
	
	@Column(name = "tienemicro")
	private String tienemicro;
	
	@Column(name = "nombremicr")
	private String nombremicr;
	
	@Column(name = "fechconsem")
	private Integer fechconsemAux;
	@Transient
	private Date fechconsem;
	
	@Column(name = "expnegocio")
	private String expnegocio;
	
	@Column(name = "posnegocio")
	private String posnegocio;
	
	@Column(name = "anticlient")
	private Integer anticlient;
	
	@Column(name = "antigempre")
	private Integer antigempre;
	
	@Column(name = "codejecuti")
	private String codejecuti;
	
	@Column(name = "codsectec1")
	private String codsectec1;
	
	@Column(name = "codsectec2")
	private String codsectec2;
	
	@Column(name = "codactiec1")
	private String codactiec1;
	
	@Column(name = "codintace1")
	private String codintace1;
	
	@Column(name = "codactiec2")
	private String codactiec2;
	
	@Column(name = "codintace2")
	private String codintace2;
	
	@Column(name = "codagencre")
	private String codagencre;
	
	@Column(name = "correoelec")
	private String correoelec;	

	@Column(name = "totalactiv")
	private BigDecimal totalactiv;
	
	@Column(name = "totalpasiv")	
	private BigDecimal totalpasiv;
	
	@Column(name = "totalpatri")
	private BigDecimal totalpatri;
	
	@Column(name = "totalvents")
	private BigDecimal totalvents;
	
	@Column(name = "totalcsven")
	private BigDecimal totalcsven;
	
	@Column(name = "totaloting")
	private BigDecimal totaloting;
	
	@Column(name = "totalegres")
	private BigDecimal totalegres;
	
	@Column(name = "utilidbrut")
	private BigDecimal utilidbrut;
	
	@Column(name = "utilidneta")
	private BigDecimal utilidneta;
	
	@Column(name = "utilidoper")
	private BigDecimal utilidoper;
	
	@Column(name = "descrpotri")
	private String descrpotri;
	
	@Column(name = "expactivid")
	private String expactivid;
	
	@Column(name = "codigenero")
	private String codigenero;
	
	@Column(name = "codestaciv")
	private String codestaciv;
	
	@Column(name = "paisorigen")
	private String paisorigen;
	
	@Column(name = "edad")
	private Short edad;
	
	@Column(name = "fechanacim")
	private Integer fechanacimAux;
	@Transient
	private Date fechanacim;
	
	@Column(name = "nrohijos")
	private Integer nrohijos;
	
	@Column(name = "codniveduc")
	private String codniveduc;
	
	@Column(name = "codprofesi")
	private String codprofesi;
	
	@Column(name = "codcobersa")
	private String codcobersa;
	
	@Column(name = "codcajcomp")
	private String codcajcomp;
	
	@Column(name = "codjefefam")
	private String codjefefam;
	
	@Column(name = "numperscar")
	private Short numperscar;
	
	@Column(name = "fechaultac")
	private Integer fechaultacAux;
	@Transient
	private Date fechaultac;
	
	@Column(name = "codtipcont")
	private String codtipcont;
	
	@Column(name = "cargodesem")
	private String cargodesem;
	
	@Column(name = "empretrabj")
	private String empretrabj;
	
	@Column(name = "antigenemp")
	private Short antigenemp;
	
	@Column(name = "salario")
	private BigDecimal salario;
	
	@Column(name = "estrato")
	private String estrato;
	
	@Column(name = "codtipvivi")
	private String codtipvivi;
	
	@Column(name = "codtiplocl")
	private String codtiplocl;
	
	@Column(name = "locviviend")
	private String locviviend;
	
	@Column(name = "codsegment")
	private String codsegment;
	
	@Column(name = "codsubsegm")
	private String codsubsegm;
	
	@Column(name = "codcnlvinc")
	private String codcnlvinc;
	
	@Column(name = "codmdenvio")
	private String codmdenvio;
	
	@Column(name = "victconfli")
	private String victconfli;
	
	@Column(name = "codvincent")
	private String codvincent;
	
	@Column(name = "menoredad")
	private String menoredad;
	
	@Column(name = "declararen")
	private String declararen;
	
	@Column(name = "pep")
	private String pep;
	
	@Column(name = "camppoliti")
	private String camppoliti;
	
	@Column(name = "opermndext")
	private String opermndext;
	
	@Column(name = "actitotneg")
	private BigDecimal actitotneg;
	
	@Column(name = "nivelendeu")
	private BigDecimal nivelendeu;
	
	@Column(name = "codtpempre")
	private String codtpempre;
	
	@Column(name = "codregimen")
	private String codregimen;
	
	@Column(name = "numrsocios")
	private Short numrsocios;
	
	@Column(name = "nombrepleg")
	private String nombrepleg;
	
	@Column(name = "codtprpleg")
	private String codtprpleg;
	
	@Column(name = "regbiometr")
	private String regbiometr;
	
	@Column(name = "nrofinraiz")
	private Integer nrofinraiz;
	
	@Column(name = "nrovehicul")
	private Short nrovehicul;
	
	@Column(name = "tipcontrib")
	private String tipcontrib;
	
	@Column(name = "nropersgrf")
	private Integer nropersgrf;
	
	@Column(name = "nrppercppg")
	private Integer nrppercppg;
	
	@Column(name = "nivelconsl")
	private Short nivelconsl;
	
	@Column(name = "tipgruende")
	private String tipgruende;
	
	@Column(name = "secgruende")
	private Integer secgruende;
	
	@Column(name = "codcliecab")
	private Integer codcliecab;
	
	@Column(name = "nrofilgren")
	private Short nrofilgren;
	
	@Column(name = "migrar")
	private String migrado;

	public Long getNui() {
		return nui;
	}

	public void setNui(Long nui) {
		this.nui = nui;
	}

	public String getCodnatucli() {
		return codnatucli;
	}

	public void setCodnatucli(String codnatucli) {
		this.codnatucli = codnatucli;
	}

	public String getCodtipiden() {
		return codtipiden;
	}

	public void setCodtipiden(String codtipiden) {
		this.codtipiden = codtipiden;
	}

	public String getCodocupaci() {
		return codocupaci;
	}

	public void setCodocupaci(String codocupaci) {
		this.codocupaci = codocupaci;
	}

	public String getNumidentif() {
		return numidentif;
	}

	public void setNumidentif(String numidentif) {
		this.numidentif = numidentif;
	}

	public Integer getFechaexdocAux() {
		return fechaexdocAux;
	}

	public void setFechaexdocAux(Integer fechaexdocAux) {
		this.fechaexdocAux = fechaexdocAux;
	}

	public Date getFechaexdoc() {
		return fechaexdoc;
	}

	public void setFechaexdoc(Date fechaexdoc) {
		this.fechaexdoc = fechaexdoc;
	}

	public String getLugarexped() {
		return lugarexped;
	}

	public void setLugarexped(String lugarexped) {
		this.lugarexped = lugarexped;
	}

	public String getNombcomprs() {
		return nombcomprs;
	}

	public void setNombcomprs(String nombcomprs) {
		this.nombcomprs = nombcomprs;
	}

	public Long getNumemplead() {
		return numemplead;
	}

	public void setNumemplead(Long numemplead) {
		this.numemplead = numemplead;
	}

	public BigDecimal getNumemplern() {
		return numemplern;
	}

	public void setNumemplern(BigDecimal numemplern) {
		this.numemplern = numemplern;
	}

	public BigDecimal getNumemplnrn() {
		return numemplnrn;
	}

	public void setNumemplnrn(BigDecimal numemplnrn) {
		this.numemplnrn = numemplnrn;
	}

	public String getCodregionl() {
		return codregionl;
	}

	public void setCodregionl(String codregionl) {
		this.codregionl = codregionl;
	}

	public String getCodzoncomr() {
		return codzoncomr;
	}

	public void setCodzoncomr(String codzoncomr) {
		this.codzoncomr = codzoncomr;
	}

	public Short getCodofiactl() {
		return codofiactl;
	}

	public void setCodofiactl(Short codofiactl) {
		this.codofiactl = codofiactl;
	}

	public Integer getFechcrecliAux() {
		return fechcrecliAux;
	}

	public void setFechcrecliAux(Integer fechcrecliAux) {
		this.fechcrecliAux = fechcrecliAux;
	}

	public Date getFechcrecli() {
		return fechcrecli;
	}

	public void setFechcrecli(Date fechcrecli) {
		this.fechcrecli = fechcrecli;
	}

	public String getTienemicro() {
		return tienemicro;
	}

	public void setTienemicro(String tienemicro) {
		this.tienemicro = tienemicro;
	}

	public String getNombremicr() {
		return nombremicr;
	}

	public void setNombremicr(String nombremicr) {
		this.nombremicr = nombremicr;
	}

	public Integer getFechconsemAux() {
		return fechconsemAux;
	}

	public void setFechconsemAux(Integer fechconsemAux) {
		this.fechconsemAux = fechconsemAux;
	}

	public Date getFechconsem() {
		return fechconsem;
	}

	public void setFechconsem(Date fechconsem) {
		this.fechconsem = fechconsem;
	}

	public String getExpnegocio() {
		return expnegocio;
	}

	public void setExpnegocio(String expnegocio) {
		this.expnegocio = expnegocio;
	}

	public String getPosnegocio() {
		return posnegocio;
	}

	public void setPosnegocio(String posnegocio) {
		this.posnegocio = posnegocio;
	}

	public Integer getAnticlient() {
		return anticlient;
	}

	public void setAnticlient(Integer anticlient) {
		this.anticlient = anticlient;
	}

	public Integer getAntigempre() {
		return antigempre;
	}

	public void setAntigempre(Integer antigempre) {
		this.antigempre = antigempre;
	}

	public String getCodejecuti() {
		return codejecuti;
	}

	public void setCodejecuti(String codejecuti) {
		this.codejecuti = codejecuti;
	}

	public String getCodsectec1() {
		return codsectec1;
	}

	public void setCodsectec1(String codsectec1) {
		this.codsectec1 = codsectec1;
	}

	public String getCodsectec2() {
		return codsectec2;
	}

	public void setCodsectec2(String codsectec2) {
		this.codsectec2 = codsectec2;
	}

	public String getCodactiec1() {
		return codactiec1;
	}

	public void setCodactiec1(String codactiec1) {
		this.codactiec1 = codactiec1;
	}

	public String getCodintace1() {
		return codintace1;
	}

	public void setCodintace1(String codintace1) {
		this.codintace1 = codintace1;
	}

	public String getCodactiec2() {
		return codactiec2;
	}

	public void setCodactiec2(String codactiec2) {
		this.codactiec2 = codactiec2;
	}

	public String getCodintace2() {
		return codintace2;
	}

	public void setCodintace2(String codintace2) {
		this.codintace2 = codintace2;
	}

	public String getCodagencre() {
		return codagencre;
	}

	public void setCodagencre(String codagencre) {
		this.codagencre = codagencre;
	}

	public String getCorreoelec() {
		return correoelec;
	}

	public void setCorreoelec(String correoelec) {
		this.correoelec = correoelec;
	}

	public BigDecimal getTotalactiv() {
		return totalactiv;
	}

	public void setTotalactiv(BigDecimal totalactiv) {
		this.totalactiv = totalactiv;
	}

	public BigDecimal getTotalpasiv() {
		return totalpasiv;
	}

	public void setTotalpasiv(BigDecimal totalpasiv) {
		this.totalpasiv = totalpasiv;
	}

	public BigDecimal getTotalpatri() {
		return totalpatri;
	}

	public void setTotalpatri(BigDecimal totalpatri) {
		this.totalpatri = totalpatri;
	}

	public BigDecimal getTotalvents() {
		return totalvents;
	}

	public void setTotalvents(BigDecimal totalvents) {
		this.totalvents = totalvents;
	}

	public BigDecimal getTotalcsven() {
		return totalcsven;
	}

	public void setTotalcsven(BigDecimal totalcsven) {
		this.totalcsven = totalcsven;
	}

	public BigDecimal getTotaloting() {
		return totaloting;
	}

	public void setTotaloting(BigDecimal totaloting) {
		this.totaloting = totaloting;
	}

	public BigDecimal getTotalegres() {
		return totalegres;
	}

	public void setTotalegres(BigDecimal totalegres) {
		this.totalegres = totalegres;
	}

	public BigDecimal getUtilidbrut() {
		return utilidbrut;
	}

	public void setUtilidbrut(BigDecimal utilidbrut) {
		this.utilidbrut = utilidbrut;
	}

	public BigDecimal getUtilidneta() {
		return utilidneta;
	}

	public void setUtilidneta(BigDecimal utilidneta) {
		this.utilidneta = utilidneta;
	}

	public BigDecimal getUtilidoper() {
		return utilidoper;
	}

	public void setUtilidoper(BigDecimal utilidoper) {
		this.utilidoper = utilidoper;
	}

	public String getDescrpotri() {
		return descrpotri;
	}

	public void setDescrpotri(String descrpotri) {
		this.descrpotri = descrpotri;
	}

	public String getExpactivid() {
		return expactivid;
	}

	public void setExpactivid(String expactivid) {
		this.expactivid = expactivid;
	}

	public String getCodigenero() {
		return codigenero;
	}

	public void setCodigenero(String codigenero) {
		this.codigenero = codigenero;
	}

	public String getCodestaciv() {
		return codestaciv;
	}

	public void setCodestaciv(String codestaciv) {
		this.codestaciv = codestaciv;
	}

	public String getPaisorigen() {
		return paisorigen;
	}

	public void setPaisorigen(String paisorigen) {
		this.paisorigen = paisorigen;
	}

	public Short getEdad() {
		return edad;
	}

	public void setEdad(Short edad) {
		this.edad = edad;
	}

	

	public Integer getNrohijos() {
		return nrohijos;
	}

	public void setNrohijos(Integer nrohijos) {
		this.nrohijos = nrohijos;
	}

	public String getCodniveduc() {
		return codniveduc;
	}

	public void setCodniveduc(String codniveduc) {
		this.codniveduc = codniveduc;
	}

	public String getCodprofesi() {
		return codprofesi;
	}

	public void setCodprofesi(String codprofesi) {
		this.codprofesi = codprofesi;
	}

	public String getCodcobersa() {
		return codcobersa;
	}

	public void setCodcobersa(String codcobersa) {
		this.codcobersa = codcobersa;
	}

	public String getCodcajcomp() {
		return codcajcomp;
	}

	public void setCodcajcomp(String codcajcomp) {
		this.codcajcomp = codcajcomp;
	}

	public String getCodjefefam() {
		return codjefefam;
	}

	public void setCodjefefam(String codjefefam) {
		this.codjefefam = codjefefam;
	}

	public Short getNumperscar() {
		return numperscar;
	}

	public void setNumperscar(Short numperscar) {
		this.numperscar = numperscar;
	}

	public Integer getFechaultacAux() {
		return fechaultacAux;
	}

	public void setFechaultacAux(Integer fechaultacAux) {
		this.fechaultacAux = fechaultacAux;
	}

	public Date getFechaultac() {
		return fechaultac;
	}

	public void setFechaultac(Date fechaultac) {
		this.fechaultac = fechaultac;
	}

	public String getCodtipcont() {
		return codtipcont;
	}

	public void setCodtipcont(String codtipcont) {
		this.codtipcont = codtipcont;
	}

	public String getCargodesem() {
		return cargodesem;
	}

	public void setCargodesem(String cargodesem) {
		this.cargodesem = cargodesem;
	}

	public String getEmpretrabj() {
		return empretrabj;
	}

	public void setEmpretrabj(String empretrabj) {
		this.empretrabj = empretrabj;
	}

	public Short getAntigenemp() {
		return antigenemp;
	}

	public void setAntigenemp(Short antigenemp) {
		this.antigenemp = antigenemp;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getCodtipvivi() {
		return codtipvivi;
	}

	public void setCodtipvivi(String codtipvivi) {
		this.codtipvivi = codtipvivi;
	}

	public String getCodtiplocl() {
		return codtiplocl;
	}

	public void setCodtiplocl(String codtiplocl) {
		this.codtiplocl = codtiplocl;
	}

	public String getLocviviend() {
		return locviviend;
	}

	public void setLocviviend(String locviviend) {
		this.locviviend = locviviend;
	}

	public String getCodsegment() {
		return codsegment;
	}

	public void setCodsegment(String codsegment) {
		this.codsegment = codsegment;
	}

	public String getCodsubsegm() {
		return codsubsegm;
	}

	public void setCodsubsegm(String codsubsegm) {
		this.codsubsegm = codsubsegm;
	}

	public String getCodcnlvinc() {
		return codcnlvinc;
	}

	public void setCodcnlvinc(String codcnlvinc) {
		this.codcnlvinc = codcnlvinc;
	}

	public String getCodmdenvio() {
		return codmdenvio;
	}

	public void setCodmdenvio(String codmdenvio) {
		this.codmdenvio = codmdenvio;
	}

	public String getVictconfli() {
		return victconfli;
	}

	public void setVictconfli(String victconfli) {
		this.victconfli = victconfli;
	}

	public String getCodvincent() {
		return codvincent;
	}

	public void setCodvincent(String codvincent) {
		this.codvincent = codvincent;
	}

	public String getMenoredad() {
		return menoredad;
	}

	public void setMenoredad(String menoredad) {
		this.menoredad = menoredad;
	}

	public String getDeclararen() {
		return declararen;
	}

	public void setDeclararen(String declararen) {
		this.declararen = declararen;
	}

	public String getPep() {
		return pep;
	}

	public void setPep(String pep) {
		this.pep = pep;
	}

	public String getCamppoliti() {
		return camppoliti;
	}

	public void setCamppoliti(String camppoliti) {
		this.camppoliti = camppoliti;
	}

	public String getOpermndext() {
		return opermndext;
	}

	public void setOpermndext(String opermndext) {
		this.opermndext = opermndext;
	}

	public BigDecimal getActitotneg() {
		return actitotneg;
	}

	public void setActitotneg(BigDecimal actitotneg) {
		this.actitotneg = actitotneg;
	}

	public BigDecimal getNivelendeu() {
		return nivelendeu;
	}

	public void setNivelendeu(BigDecimal nivelendeu) {
		this.nivelendeu = nivelendeu;
	}

	public String getCodtpempre() {
		return codtpempre;
	}

	public void setCodtpempre(String codtpempre) {
		this.codtpempre = codtpempre;
	}

	public String getCodregimen() {
		return codregimen;
	}

	public void setCodregimen(String codregimen) {
		this.codregimen = codregimen;
	}

	public Short getNumrsocios() {
		return numrsocios;
	}

	public void setNumrsocios(Short numrsocios) {
		this.numrsocios = numrsocios;
	}

	public String getNombrepleg() {
		return nombrepleg;
	}

	public void setNombrepleg(String nombrepleg) {
		this.nombrepleg = nombrepleg;
	}

	public String getCodtprpleg() {
		return codtprpleg;
	}

	public void setCodtprpleg(String codtprpleg) {
		this.codtprpleg = codtprpleg;
	}

	public String getRegbiometr() {
		return regbiometr;
	}

	public void setRegbiometr(String regbiometr) {
		this.regbiometr = regbiometr;
	}

	public Integer getNrofinraiz() {
		return nrofinraiz;
	}

	public void setNrofinraiz(Integer nrofinraiz) {
		this.nrofinraiz = nrofinraiz;
	}

	public Short getNrovehicul() {
		return nrovehicul;
	}

	public void setNrovehicul(Short nrovehicul) {
		this.nrovehicul = nrovehicul;
	}

	public String getTipcontrib() {
		return tipcontrib;
	}

	public void setTipcontrib(String tipcontrib) {
		this.tipcontrib = tipcontrib;
	}

	public Integer getNropersgrf() {
		return nropersgrf;
	}

	public void setNropersgrf(Integer nropersgrf) {
		this.nropersgrf = nropersgrf;
	}

	public Integer getNrppercppg() {
		return nrppercppg;
	}

	public void setNrppercppg(Integer nrppercppg) {
		this.nrppercppg = nrppercppg;
	}

	public Short getNivelconsl() {
		return nivelconsl;
	}

	public void setNivelconsl(Short nivelconsl) {
		this.nivelconsl = nivelconsl;
	}

	public String getTipgruende() {
		return tipgruende;
	}

	public void setTipgruende(String tipgruende) {
		this.tipgruende = tipgruende;
	}

	public Integer getSecgruende() {
		return secgruende;
	}

	public void setSecgruende(Integer secgruende) {
		this.secgruende = secgruende;
	}

	public Integer getCodcliecab() {
		return codcliecab;
	}

	public void setCodcliecab(Integer codcliecab) {
		this.codcliecab = codcliecab;
	}

	public Short getNrofilgren() {
		return nrofilgren;
	}

	public void setNrofilgren(Short nrofilgren) {
		this.nrofilgren = nrofilgren;
	}

	public Integer getFechanacimAux() {
		return fechanacimAux;
	}

	public void setFechanacimAux(Integer fechanacimAux) {
		this.fechanacimAux = fechanacimAux;
	}

	public Date getFechanacim() {
		return fechanacim;
	}

	public void setFechanacim(Date fechanacim) {
		this.fechanacim = fechanacim;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
	
}
