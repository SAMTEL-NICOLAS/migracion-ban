package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1417F", schema = "DAMCYFILES")
public class BigPasivosAhAs extends Consecutivo implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigPasivosAhIdAs id;	

	@Column(name = "feccorte")
	private Integer feccorteAux;	

	@Column(name = "codsubpro")
	private String codsubpro;	

	@Column(name = "codclient")
	private Long codclient;	

	@Column(name = "fecconsti")
	private Integer fecconstiAux;
	@Transient
	private Date fecconsti;
	
	@Column(name = "salcapita")
	private BigDecimal salcapita;	

	@Column(name = "salrendim")
	private BigDecimal salrendim;	

	@Column(name = "codesante")
	private String codesante;	

	@Column(name = "saldispon")
	private BigDecimal saldispon;
	
	@Column(name = "codsucurs")
	private Short codsucurs;	

	@Column(name = "codestcor")
	private String codestcor;	

	@Column(name = "adiccapit")
	private BigDecimal adiccapit;	

	@Column(name = "retcapita")
	private BigDecimal retcapita;

	@Column(name = "inddesemb")
	private String inddesemb;	

	@Column(name = "fecultran")
	private Integer fecultranAux;	
	@Transient
	private Date fecultran;	
	
	@Column(name = "fecactiva")
	private Integer fecactivaAux;	
	@Transient
	private Date fecactiva;	
	
	@Column(name = "condmanej")
	private String condmanej;
	
	@Column(name = "codejecut")
	private String codejecut;	

	@Column(name = "tipcuenta")
	private Short tipcuenta;	

	@Column(name = "prommensu")
	private BigDecimal prommensu;	

	@Column(name = "tasainter")
	private BigDecimal tasainter;	

	@Column(name = "valcompah")
	private BigDecimal valcompah;	

	@Column(name = "porcomaho")
	private BigDecimal porcomaho;	

	@Column(name = "valreahoc")
	private BigDecimal valreahoc;	

	@Column(name = "porreahoc")
	private BigDecimal porreahoc;
	
	@Column(name = "mondepmen")
	private Short mondepmen;	

	@Column(name = "tarjdebit")
	private String tarjdebit;	

	@Column(name = "codfuerco")
	private String codfuerco;	

	@Column(name = "esttarjet")
	private String esttarjet;	

	@Column(name = "multtrans")
	private Short multtrans;	

	@Column(name = "canal")
	private String canal;	

	@Column(name = "numopcred")
	private Long numopcred;	

	@Column(name = "cuotmanej")
	private String cuotmanej;
	
	@Column(name = "valcuotma")
	private BigDecimal valcuotma;
	
	@Column(name = "codproduc")
	private String codproduc;
	
	@Column(name = "migrar")
	private String migrado;

	public BigPasivosAhIdAs getId() {
		return id;
	}

	public void setId(BigPasivosAhIdAs id) {
		this.id = id;
	}

	public Integer getFeccorteAux() {
		return feccorteAux;
	}

	public void setFeccorteAux(Integer feccorteAux) {
		this.feccorteAux = feccorteAux;
	}

	public String getCodsubpro() {
		return codsubpro;
	}

	public void setCodsubpro(String codsubpro) {
		this.codsubpro = codsubpro;
	}

	public Long getCodclient() {
		return codclient;
	}

	public void setCodclient(Long codclient) {
		this.codclient = codclient;
	}

	public Integer getFecconstiAux() {
		return fecconstiAux;
	}

	public void setFecconstiAux(Integer fecconstiAux) {
		this.fecconstiAux = fecconstiAux;
	}

	public Date getFecconsti() {
		return fecconsti;
	}

	public void setFecconsti(Date fecconsti) {
		this.fecconsti = fecconsti;
	}

	public BigDecimal getSalcapita() {
		return salcapita;
	}

	public void setSalcapita(BigDecimal salcapita) {
		this.salcapita = salcapita;
	}

	public BigDecimal getSalrendim() {
		return salrendim;
	}

	public void setSalrendim(BigDecimal salrendim) {
		this.salrendim = salrendim;
	}

	public String getCodesante() {
		return codesante;
	}

	public void setCodesante(String codesante) {
		this.codesante = codesante;
	}

	public BigDecimal getSaldispon() {
		return saldispon;
	}

	public void setSaldispon(BigDecimal saldispon) {
		this.saldispon = saldispon;
	}

	public Short getCodsucurs() {
		return codsucurs;
	}

	public void setCodsucurs(Short codsucurs) {
		this.codsucurs = codsucurs;
	}

	public String getCodestcor() {
		return codestcor;
	}

	public void setCodestcor(String codestcor) {
		this.codestcor = codestcor;
	}

	public BigDecimal getAdiccapit() {
		return adiccapit;
	}

	public void setAdiccapit(BigDecimal adiccapit) {
		this.adiccapit = adiccapit;
	}

	public BigDecimal getRetcapita() {
		return retcapita;
	}

	public void setRetcapita(BigDecimal retcapita) {
		this.retcapita = retcapita;
	}

	public String getInddesemb() {
		return inddesemb;
	}

	public void setInddesemb(String inddesemb) {
		this.inddesemb = inddesemb;
	}

	public Integer getFecultranAux() {
		return fecultranAux;
	}

	public void setFecultranAux(Integer fecultranAux) {
		this.fecultranAux = fecultranAux;
	}

	public Date getFecultran() {
		return fecultran;
	}

	public void setFecultran(Date fecultran) {
		this.fecultran = fecultran;
	}

	public Integer getFecactivaAux() {
		return fecactivaAux;
	}

	public void setFecactivaAux(Integer fecactivaAux) {
		this.fecactivaAux = fecactivaAux;
	}

	public Date getFecactiva() {
		return fecactiva;
	}

	public void setFecactiva(Date fecactiva) {
		this.fecactiva = fecactiva;
	}

	public String getCondmanej() {
		return condmanej;
	}

	public void setCondmanej(String condmanej) {
		this.condmanej = condmanej;
	}

	public String getCodejecut() {
		return codejecut;
	}

	public void setCodejecut(String codejecut) {
		this.codejecut = codejecut;
	}

	public Short getTipcuenta() {
		return tipcuenta;
	}

	public void setTipcuenta(Short tipcuenta) {
		this.tipcuenta = tipcuenta;
	}

	public BigDecimal getPrommensu() {
		return prommensu;
	}

	public void setPrommensu(BigDecimal prommensu) {
		this.prommensu = prommensu;
	}

	public BigDecimal getTasainter() {
		return tasainter;
	}

	public void setTasainter(BigDecimal tasainter) {
		this.tasainter = tasainter;
	}

	public BigDecimal getValcompah() {
		return valcompah;
	}

	public void setValcompah(BigDecimal valcompah) {
		this.valcompah = valcompah;
	}

	public BigDecimal getPorcomaho() {
		return porcomaho;
	}

	public void setPorcomaho(BigDecimal porcomaho) {
		this.porcomaho = porcomaho;
	}

	public BigDecimal getValreahoc() {
		return valreahoc;
	}

	public void setValreahoc(BigDecimal valreahoc) {
		this.valreahoc = valreahoc;
	}

	public BigDecimal getPorreahoc() {
		return porreahoc;
	}

	public void setPorreahoc(BigDecimal porreahoc) {
		this.porreahoc = porreahoc;
	}

	public Short getMondepmen() {
		return mondepmen;
	}

	public void setMondepmen(Short mondepmen) {
		this.mondepmen = mondepmen;
	}

	public String getTarjdebit() {
		return tarjdebit;
	}

	public void setTarjdebit(String tarjdebit) {
		this.tarjdebit = tarjdebit;
	}

	public String getCodfuerco() {
		return codfuerco;
	}

	public void setCodfuerco(String codfuerco) {
		this.codfuerco = codfuerco;
	}

	public String getEsttarjet() {
		return esttarjet;
	}

	public void setEsttarjet(String esttarjet) {
		this.esttarjet = esttarjet;
	}

	public Short getMulttrans() {
		return multtrans;
	}

	public void setMulttrans(Short multtrans) {
		this.multtrans = multtrans;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public Long getNumopcred() {
		return numopcred;
	}

	public void setNumopcred(Long numopcred) {
		this.numopcred = numopcred;
	}

	public String getCuotmanej() {
		return cuotmanej;
	}

	public void setCuotmanej(String cuotmanej) {
		this.cuotmanej = cuotmanej;
	}

	public BigDecimal getValcuotma() {
		return valcuotma;
	}

	public void setValcuotma(BigDecimal valcuotma) {
		this.valcuotma = valcuotma;
	}

	public String getCodproduc() {
		return codproduc;
	}

	public void setCodproduc(String codproduc) {
		this.codproduc = codproduc;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}

}
