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
@Table(name = "CRM1413F", schema = "DAMCYFILES")
public class BigActivosAs  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActivosIdAs id;
	
	@Column(name = "feccigeinf")
	private Integer feccigeinf;
	
	@Column(name = "line_credi")
	private String line_credi;
	
	@Column(name = "cali_credI")
	private String cali_credi;
	
	@Column(name = "cod_identi")
	private String cod_identi;
	
	@Column(name = "num_idclie")
	private Long num_idclie;
	
	@Column(name = "cod_oficin")
	private Short cod_oficin;
	
	@Column(name = "fec_vencre")
	private Integer fec_vencreAux;
	@Transient
	private Date fec_vencre;
	
	@Column(name = "tas_nomina")
	private BigDecimal tas_nomina;
	
	@Column(name = "sal_capido")
	private BigDecimal sal_capido;
	
	@Column(name = "salcapnoid")
	private BigDecimal salcapnoid;
	
	@Column(name = "sal_capcre")
	private BigDecimal sal_capcre;
	
	@Column(name = "dia_morcre")
	private Short dia_morcre;
	
	@Column(name = "pro_indcap")
	private BigDecimal pro_indcap;
	
	@Column(name = "pro_genera")
	private BigDecimal pro_genera;
	
	@Column(name = "pro_indcar")
	private BigDecimal pro_indcar;
	
	@Column(name = "proincaran")
	private BigDecimal proincaran;
	
	@Column(name = "int_crrido")
	private BigDecimal int_crrido;
	
	@Column(name = "int_crnido")
	private BigDecimal int_crnido;
	
	@Column(name = "intcormora")
	private BigDecimal intcormora;
	
	@Column(name = "incomonoid")
	private BigDecimal incomonoid;
	
	@Column(name = "ctaxcobmyp")
	private BigDecimal ctaxcobmyp;
	
	@Column(name = "prosacomyp")
	private BigDecimal prosacomyp;
	
	@Column(name = "ctaxcoivpy")
	private BigDecimal ctaxcoivpy;
	
	@Column(name = "proivamype")
	private BigDecimal proivamype;
	
	@Column(name = "provi_inte")
	private BigDecimal provi_inte;
	
	@Column(name = "provinmora")
	private String provinmora;
	
	@Column(name = "valgarhipo")
	private BigDecimal valgarhipo;
	
	@Column(name = "vagannohip")
	private BigDecimal vagannohip;
	
	@Column(name = "valgartfng")
	private BigDecimal valgartfng;
	
	@Column(name = "valgausaid")
	private BigDecimal valgausaid;
	
	@Column(name = "valganoidh")
	private BigDecimal valganoidh;
	
	@Column(name = "vganoidhgn")
	private BigDecimal vganoidhgn;
	
	@Column(name = "ccocogfnag")
	private BigDecimal ccocogfnag;
	
	@Column(name = "prcogafnag")
	private BigDecimal prcogafnag;
	
	@Column(name = "cuecoifnag")
	private BigDecimal cuecoifnag;
	
	@Column(name = "proivgfnag")
	private BigDecimal proivgfnag;
	
	@Column(name = "cocomfonng")
	private BigDecimal cocomfonng;
	
	@Column(name = "cuencoboco")
	private BigDecimal cuencoboco;
	
	@Column(name = "provcucooc")
	private BigDecimal provcucooc;
	
	@Column(name = "cuencobseg")
	private BigDecimal cuencobseg;
	
	@Column(name = "provseguro")
	private BigDecimal provseguro;
	
	@Column(name = "clacartrte")
	private String clacartrte;
	
	@Column(name = "intcorcont")
	private BigDecimal intcorcont;
	
	@Column(name = "intmorcont")
	private BigDecimal intmorcont;
	
	@Column(name = "codasesasi")
	private String codasesasi;
	
	@Column(name = "fulprecrca")
	private Integer fulprecrcaAux;
	@Transient
	private Date fulprecrca;
	
	@Column(name = "fukorecrin")
	private Integer fukorecrinAux;
	@Transient
	private Date fukorecrin;
	
	@Column(name = "numpagascr")
	private String numpagascr;
	
	@Column(name = "fecinicred")
	private Integer fecinicredAux;
	@Transient
	private Date fecinicred;
	
	@Column(name = "numcupacre")
	private Long numcupacre;
	
	@Column(name = "plaztotcre")
	private Integer plaztotcre;
	
	@Column(name = "modalcredi")
	private String modalcredi;
	
	@Column(name = "perpaginte")
	private Short perpaginte;
	
	@Column(name = "tasamorccl")
	private BigDecimal tasamorccl;
	
	@Column(name = "valcredocl")
	private BigDecimal valcredocl;
	
	@Column(name = "feccredmor")
	private Integer feccredmorAux;
	@Transient
	private Date feccredmor;
	
	@Column(name = "tipogatcre")
	private String tipogatcre;
	
	@Column(name = "idncuentga")
	private String idncuentga;
	
	@Column(name = "codfuentre")
	private String codfuentre;
	
	@Column(name = "credgestju")
	private String credgestju;
	
	@Column(name = "credreestr")
	private String credreestr;
	// ----------------------------
	@Column(name = "secpertcli")
	private String secpertcli;
	
	@Column(name = "codactintc")
	private String codactintc;
	
	@Column(name = "nomabogado")
	private String nomabogado;
	
	@Column(name = "tipoclient")
	private String tipoclient;
	
	@Column(name = "tipoempres")
	private String tipoempres;
	
	@Column(name = "clasclient") // ok
	private String clasclient;
	
	@Column(name = "fechinimor")
	private Integer fechinimorAux;
	@Transient
	private Date fechinimor;
	
	@Column(name = "fechapaguc")
	private Integer fechapagucAux;
	@Transient
	private Date fechapaguc;
	
	@Column(name = "morcobracl")
	private BigDecimal morcobracl;
	
	@Column(name = "valfngefga")
	private BigDecimal valfngefga;
	
	@Column(name = "fecfngefga")
	private Integer fecfngefgaAux;
	@Transient
	private Date fecfngefga;
	
	@Column(name = "valusaefga")
	private BigDecimal valusaefga;
		
	@Column(name = "fecusaefga")
	private Integer fecusaefgaAux;
	@Transient
	private Date fecusaefga;
	
	@Column(name = "valcadinco")
	private BigDecimal valcadinco;
	
	@Column(name = "valcadinmo")
	private BigDecimal valcadinmo;
		
	@Column(name = "califriesg")
	private String califriesg;
	
	@Column(name = "calriesgba")
	private String calriesgba;
	
	@Column(name = "salcapcupe")
	private BigDecimal salcapcupe; 
		
	@Column(name = "sacapv1_30")
	private BigDecimal sacapv1_30;
	
	@Column(name = "scapv31_90")
	private BigDecimal scapv31_90;
	
	@Column(name = "scav91_180")
	private BigDecimal scav91_180;
		
	@Column(name = "scv181_360")
	private BigDecimal scv181_360;
	
	@Column(name = "sacapvm360")
	private BigDecimal sacapvm360;
	
	@Column(name = "numcuotcan")
	private BigDecimal numcuotcan;
		
	@Column(name = "numcuomora")
	private BigDecimal numcuomora;
	
	@Column(name = "valtcomipy")
	private BigDecimal valtcomipy;
	
	@Column(name = "commipytcr")
	private BigDecimal commipytcr;
		
	@Column(name = "valtivamip")
	private BigDecimal valtivamip;
	
	@Column(name = "ivamipytcr")
	private BigDecimal ivamipytcr;
	
	@Column(name = "valpenmipy")
	private BigDecimal valpenmipy;
		
	@Column(name = "ivapenmipy")
	private BigDecimal IVAPENMIPY;
	
	@Column(name = "canrefclcr")
	private Long canrefclcr;
	
	@Column(name = "nombcatccr")
	private String nombcatccr;
		
	@Column(name = "ctasccrota")
	private BigDecimal ctasccrota;
	
	@Column(name = "proctacrot")
	private BigDecimal proctacrot;
	
	@Column(name = "contccrota")
	private BigDecimal contccrota;
		
	@Column(name = "ctascivaro")
	private BigDecimal ctascivaro;
	
	@Column(name = "provivacro")
	private BigDecimal provivacro;
	
	@Column(name = "contivaccr")
	private BigDecimal contivaccr;
		
	@Column(name = "tasacoloca")
	private BigDecimal tasacoloca;

	@Column(name = "interescre")
	private String interescre;
	
	@Column(name = "fecintcred")
	private Integer fecintcredAux;
	@Transient
	private Date fecintcred;
		
	@Column(name = "provcacicl")
	private BigDecimal provcacicl;

	@Column(name = "provintcic")
	private BigDecimal provintcic;
	
	@Column(name = "provmorcic")
	private BigDecimal provmorcic;
		
	@Column(name = "provmipyci")
	private BigDecimal provmipyci;
	
	@Column(name = "provinmici")
	private BigDecimal provinmici;
	
	@Column(name = "provfngcic")
	private BigDecimal provfngcic;
		
	@Column(name = "privafngci")
	private BigDecimal privafngci;
	
	@Column(name = "provsegcic")
	private BigDecimal provsegcic;
	
	@Column(name = "provotrcic") 
	private BigDecimal provotrcic;
		
	@Column(name = "provcumcic")
	private BigDecimal provcumcic;
	
	@Column(name = "proivaccic")
	private BigDecimal proivaccic;
	
	@Column(name = "moncomcfag")
	private BigDecimal moncomcfag;
		
	@Column(name = "ivacomcfag")
	private BigDecimal ivacomcfag;
	
	@Column(name = "mcomcfagsc")
	private BigDecimal mcomcfagsc;
	
	@Column(name = "icomcfagsc")
	private BigDecimal icomcfagsc;
		
	@Column(name = "procomcfag")
	private BigDecimal procomcfag;	
	
	@Column(name = "proivacfag")
	private BigDecimal proivacfag;
	
	@Column(name = "provccicfa")
	private BigDecimal provccicfa;
		
	@Column(name = "proivaccfa")
	private BigDecimal proivaccfa;	
	
	@Column(name = "fecproxpcr")
	private Integer fecproxpcrAux;
	@Transient
	private Date fecproxpcr;
	
	@Column(name = "numconacre")
	private String numconacre;
		
	@Column(name = "codpagacon")
	private Short codpagacon;	
	
	@Column(name = "valgafagga")
	private BigDecimal valgafagga;
	
	@Column(name = "tacreefanu")
	private BigDecimal tacreefanu;
		
	@Column(name = "credintdtf")
	private BigDecimal credintdtf;
	
	@Column(name = "tasbaindtf")
	private BigDecimal tasbaindtf;
	
	@Column(name = "tasdtfindc")
	private BigDecimal tasdtfindc;
		
	@Column(name = "montsegcsc")
	private BigDecimal montsegcsc;
	
	@Column(name = "feccredcas")
	private Integer feccredcasAux;
	@Transient
	private Date feccredcas;
	
	@Column(name = "credredesc")
	private Long credredesc;
		
	@Column(name = "credirenov")
	private Short credirenov;
	
	@Column(name = "identgaran")
	private Long identgaran;
	
	@Column(name = "valgarfnga")
	private BigDecimal valgarfnga;
		
	@Column(name = "vacanfngeg")
	private BigDecimal vacanfngeg;
	
	@Column(name = "feccafngeg")
	private Integer feccafngegAux;
	@Transient
	private Date feccafngeg;
	
	@Column(name = "valpprxccl")
	private BigDecimal valpprxccl;
		
	@Column(name = "codiasesor")
	private String codiasesor;
	
	@Column(name = "codsucursa")
	private Short codsucursa;
	
	@Column(name = "codfuercom")
	private String codfuercom;
	
	@Column(name = "numctaacre")
	private Long numctaacre;
	
	@Column(name = "vencicredi")
	private Long vencicredi;
	
	@Column(name = "numecuotas")
	private Integer numecuotas;
	
	@Column(name = "porccclipc")
	private BigDecimal porccclipc;
	
	@Column(name = "portcllipc")
	private BigDecimal portcllipc;
	
	@Column(name = "numgonbase")
	private String numgonbase;
	
	@Column(name = "migrado")
	private String migrado;

	public BigActivosIdAs getId() {
		return id;
	}

	public void setId(BigActivosIdAs id) {
		this.id = id;
	}

	public Integer getFeccigeinf() {
		return feccigeinf;
	}

	public void setFeccigeinf(Integer feccigeinf) {
		this.feccigeinf = feccigeinf;
	}

	public Long getNumctaacre() {
		return numctaacre;
	}

	public void setNumctaacre(Long numctaacre) {
		this.numctaacre = numctaacre;
	}

	public Long getVencicredi() {
		return vencicredi;
	}

	public void setVencicredi(Long vencicredi) {
		this.vencicredi = vencicredi;
	}

	public Integer getNumecuotas() {
		return numecuotas;
	}

	public void setNumecuotas(Integer numecuotas) {
		this.numecuotas = numecuotas;
	}

	public BigDecimal getPorccclipc() {
		return porccclipc;
	}

	public void setPorccclipc(BigDecimal porccclipc) {
		this.porccclipc = porccclipc;
	}

	public BigDecimal getPortcllipc() {
		return portcllipc;
	}

	public void setPortcllipc(BigDecimal portcllipc) {
		this.portcllipc = portcllipc;
	}

	public String getNumgonbase() {
		return numgonbase;
	}

	public void setNumgonbase(String numgonbase) {
		this.numgonbase = numgonbase;
	}

	public BigDecimal getVacanfngeg() {
		return vacanfngeg;
	}

	public void setVacanfngeg(BigDecimal vacanfngeg) {
		this.vacanfngeg = vacanfngeg;
	}

	public Integer getFeccafngegAux() {
		return feccafngegAux;
	}

	public void setFeccafngegAux(Integer feccafngegAux) {
		this.feccafngegAux = feccafngegAux;
	}

	public Date getFeccafngeg() {
		return feccafngeg;
	}

	public void setFeccafngeg(Date feccafngeg) {
		this.feccafngeg = feccafngeg;
	}

	public BigDecimal getValpprxccl() {
		return valpprxccl;
	}

	public void setValpprxccl(BigDecimal valpprxccl) {
		this.valpprxccl = valpprxccl;
	}

	public String getCodiasesor() {
		return codiasesor;
	}

	public void setCodiasesor(String codiasesor) {
		this.codiasesor = codiasesor;
	}

	public Short getCodsucursa() {
		return codsucursa;
	}

	public void setCodsucursa(Short codsucursa) {
		this.codsucursa = codsucursa;
	}

	public String getCodfuercom() {
		return codfuercom;
	}

	public void setCodfuercom(String codfuercom) {
		this.codfuercom = codfuercom;
	}

	public Short getCodpagacon() {
		return codpagacon;
	}

	public void setCodpagacon(Short codpagacon) {
		this.codpagacon = codpagacon;
	}

	public BigDecimal getValgafagga() {
		return valgafagga;
	}

	public void setValgafagga(BigDecimal valgafagga) {
		this.valgafagga = valgafagga;
	}

	public BigDecimal getTacreefanu() {
		return tacreefanu;
	}

	public void setTacreefanu(BigDecimal tacreefanu) {
		this.tacreefanu = tacreefanu;
	}

	public BigDecimal getCredintdtf() {
		return credintdtf;
	}

	public void setCredintdtf(BigDecimal credintdtf) {
		this.credintdtf = credintdtf;
	}

	public BigDecimal getTasbaindtf() {
		return tasbaindtf;
	}

	public void setTasbaindtf(BigDecimal tasbaindtf) {
		this.tasbaindtf = tasbaindtf;
	}

	public BigDecimal getTasdtfindc() {
		return tasdtfindc;
	}

	public void setTasdtfindc(BigDecimal tasdtfindc) {
		this.tasdtfindc = tasdtfindc;
	}

	public BigDecimal getMontsegcsc() {
		return montsegcsc;
	}

	public void setMontsegcsc(BigDecimal montsegcsc) {
		this.montsegcsc = montsegcsc;
	}

	public Integer getFeccredcasAux() {
		return feccredcasAux;
	}

	public void setFeccredcasAux(Integer feccredcasAux) {
		this.feccredcasAux = feccredcasAux;
	}

	public Date getFeccredcas() {
		return feccredcas;
	}

	public void setFeccredcas(Date feccredcas) {
		this.feccredcas = feccredcas;
	}

	public Long getCredredesc() {
		return credredesc;
	}

	public void setCredredesc(Long credredesc) {
		this.credredesc = credredesc;
	}

	public Short getCredirenov() {
		return credirenov;
	}

	public void setCredirenov(Short credirenov) {
		this.credirenov = credirenov;
	}

	public Long getIdentgaran() {
		return identgaran;
	}

	public void setIdentgaran(Long identgaran) {
		this.identgaran = identgaran;
	}

	public BigDecimal getValgarfnga() {
		return valgarfnga;
	}

	public void setValgarfnga(BigDecimal valgarfnga) {
		this.valgarfnga = valgarfnga;
	}

	public BigDecimal getProvotrcic() {
		return provotrcic;
	}

	public void setProvotrcic(BigDecimal provotrcic) {
		this.provotrcic = provotrcic;
	}

	public BigDecimal getProvcumcic() {
		return provcumcic;
	}

	public void setProvcumcic(BigDecimal provcumcic) {
		this.provcumcic = provcumcic;
	}

	public BigDecimal getProivaccic() {
		return proivaccic;
	}

	public void setProivaccic(BigDecimal proivaccic) {
		this.proivaccic = proivaccic;
	}

	public BigDecimal getMoncomcfag() {
		return moncomcfag;
	}

	public void setMoncomcfag(BigDecimal moncomcfag) {
		this.moncomcfag = moncomcfag;
	}

	public BigDecimal getIvacomcfag() {
		return ivacomcfag;
	}

	public void setIvacomcfag(BigDecimal ivacomcfag) {
		this.ivacomcfag = ivacomcfag;
	}

	public BigDecimal getMcomcfagsc() {
		return mcomcfagsc;
	}

	public void setMcomcfagsc(BigDecimal mcomcfagsc) {
		this.mcomcfagsc = mcomcfagsc;
	}

	public BigDecimal getIcomcfagsc() {
		return icomcfagsc;
	}

	public void setIcomcfagsc(BigDecimal icomcfagsc) {
		this.icomcfagsc = icomcfagsc;
	}

	public BigDecimal getProcomcfag() {
		return procomcfag;
	}

	public void setProcomcfag(BigDecimal procomcfag) {
		this.procomcfag = procomcfag;
	}

	public BigDecimal getProivacfag() {
		return proivacfag;
	}

	public void setProivacfag(BigDecimal proivacfag) {
		this.proivacfag = proivacfag;
	}

	public BigDecimal getProvccicfa() {
		return provccicfa;
	}

	public void setProvccicfa(BigDecimal provccicfa) {
		this.provccicfa = provccicfa;
	}

	public BigDecimal getProivaccfa() {
		return proivaccfa;
	}

	public void setProivaccfa(BigDecimal proivaccfa) {
		this.proivaccfa = proivaccfa;
	}

	public Integer getFecproxpcrAux() {
		return fecproxpcrAux;
	}

	public void setFecproxpcrAux(Integer fecproxpcrAux) {
		this.fecproxpcrAux = fecproxpcrAux;
	}

	public Date getFecproxpcr() {
		return fecproxpcr;
	}

	public void setFecproxpcr(Date fecproxpcr) {
		this.fecproxpcr = fecproxpcr;
	}

	public String getNumconacre() {
		return numconacre;
	}

	public void setNumconacre(String numconacre) {
		this.numconacre = numconacre;
	}

	public BigDecimal getSalcapcupe() {
		return salcapcupe;
	}

	public void setSalcapcupe(BigDecimal salcapcupe) {
		this.salcapcupe = salcapcupe;
	}

	public BigDecimal getSacapv1_30() {
		return sacapv1_30;
	}

	public void setSacapv1_30(BigDecimal sacapv1_30) {
		this.sacapv1_30 = sacapv1_30;
	}

	public BigDecimal getScapv31_90() {
		return scapv31_90;
	}

	public void setScapv31_90(BigDecimal scapv31_90) {
		this.scapv31_90 = scapv31_90;
	}

	public BigDecimal getScav91_180() {
		return scav91_180;
	}

	public void setScav91_180(BigDecimal scav91_180) {
		this.scav91_180 = scav91_180;
	}

	public BigDecimal getScv181_360() {
		return scv181_360;
	}

	public void setScv181_360(BigDecimal scv181_360) {
		this.scv181_360 = scv181_360;
	}

	public BigDecimal getSacapvm360() {
		return sacapvm360;
	}

	public void setSacapvm360(BigDecimal sacapvm360) {
		this.sacapvm360 = sacapvm360;
	}

	public BigDecimal getNumcuotcan() {
		return numcuotcan;
	}

	public void setNumcuotcan(BigDecimal numcuotcan) {
		this.numcuotcan = numcuotcan;
	}

	public BigDecimal getNumcuomora() {
		return numcuomora;
	}

	public void setNumcuomora(BigDecimal numcuomora) {
		this.numcuomora = numcuomora;
	}

	public BigDecimal getValtcomipy() {
		return valtcomipy;
	}

	public void setValtcomipy(BigDecimal valtcomipy) {
		this.valtcomipy = valtcomipy;
	}

	public BigDecimal getCommipytcr() {
		return commipytcr;
	}

	public void setCommipytcr(BigDecimal commipytcr) {
		this.commipytcr = commipytcr;
	}

	public BigDecimal getValtivamip() {
		return valtivamip;
	}

	public void setValtivamip(BigDecimal valtivamip) {
		this.valtivamip = valtivamip;
	}

	public BigDecimal getIvamipytcr() {
		return ivamipytcr;
	}

	public void setIvamipytcr(BigDecimal ivamipytcr) {
		this.ivamipytcr = ivamipytcr;
	}

	public BigDecimal getValpenmipy() {
		return valpenmipy;
	}

	public void setValpenmipy(BigDecimal valpenmipy) {
		this.valpenmipy = valpenmipy;
	}

	public BigDecimal getIVAPENMIPY() {
		return IVAPENMIPY;
	}

	public void setIVAPENMIPY(BigDecimal iVAPENMIPY) {
		IVAPENMIPY = iVAPENMIPY;
	}

	public Long getCanrefclcr() {
		return canrefclcr;
	}

	public void setCanrefclcr(Long canrefclcr) {
		this.canrefclcr = canrefclcr;
	}

	public String getNombcatccr() {
		return nombcatccr;
	}

	public void setNombcatccr(String nombcatccr) {
		this.nombcatccr = nombcatccr;
	}

	public BigDecimal getCtasccrota() {
		return ctasccrota;
	}

	public void setCtasccrota(BigDecimal ctasccrota) {
		this.ctasccrota = ctasccrota;
	}

	public BigDecimal getProctacrot() {
		return proctacrot;
	}

	public void setProctacrot(BigDecimal proctacrot) {
		this.proctacrot = proctacrot;
	}

	public BigDecimal getContccrota() {
		return contccrota;
	}

	public void setContccrota(BigDecimal contccrota) {
		this.contccrota = contccrota;
	}

	public BigDecimal getCtascivaro() {
		return ctascivaro;
	}

	public void setCtascivaro(BigDecimal ctascivaro) {
		this.ctascivaro = ctascivaro;
	}

	public BigDecimal getProvivacro() {
		return provivacro;
	}

	public void setProvivacro(BigDecimal provivacro) {
		this.provivacro = provivacro;
	}

	public BigDecimal getContivaccr() {
		return contivaccr;
	}

	public void setContivaccr(BigDecimal contivaccr) {
		this.contivaccr = contivaccr;
	}

	public BigDecimal getTasacoloca() {
		return tasacoloca;
	}

	public void setTasacoloca(BigDecimal tasacoloca) {
		this.tasacoloca = tasacoloca;
	}

	public String getInterescre() {
		return interescre;
	}

	public void setInterescre(String interescre) {
		this.interescre = interescre;
	}

	public Integer getFecintcredAux() {
		return fecintcredAux;
	}

	public void setFecintcredAux(Integer fecintcredAux) {
		this.fecintcredAux = fecintcredAux;
	}

	public Date getFecintcred() {
		return fecintcred;
	}

	public void setFecintcred(Date fecintcred) {
		this.fecintcred = fecintcred;
	}

	public BigDecimal getProvcacicl() {
		return provcacicl;
	}

	public void setProvcacicl(BigDecimal provcacicl) {
		this.provcacicl = provcacicl;
	}

	public BigDecimal getProvintcic() {
		return provintcic;
	}

	public void setProvintcic(BigDecimal provintcic) {
		this.provintcic = provintcic;
	}

	public BigDecimal getProvmorcic() {
		return provmorcic;
	}

	public void setProvmorcic(BigDecimal provmorcic) {
		this.provmorcic = provmorcic;
	}

	public BigDecimal getProvmipyci() {
		return provmipyci;
	}

	public void setProvmipyci(BigDecimal provmipyci) {
		this.provmipyci = provmipyci;
	}

	public BigDecimal getProvinmici() {
		return provinmici;
	}

	public void setProvinmici(BigDecimal provinmici) {
		this.provinmici = provinmici;
	}

	public BigDecimal getProvfngcic() {
		return provfngcic;
	}

	public void setProvfngcic(BigDecimal provfngcic) {
		this.provfngcic = provfngcic;
	}

	public BigDecimal getPrivafngci() {
		return privafngci;
	}

	public void setPrivafngci(BigDecimal privafngci) {
		this.privafngci = privafngci;
	}

	public BigDecimal getProvsegcic() {
		return provsegcic;
	}

	public void setProvsegcic(BigDecimal provsegcic) {
		this.provsegcic = provsegcic;
	}



	public BigDecimal getMorcobracl() {
		return morcobracl;
	}

	public void setMorcobracl(BigDecimal morcobracl) {
		this.morcobracl = morcobracl;
	}

	public BigDecimal getValfngefga() {
		return valfngefga;
	}

	public void setValfngefga(BigDecimal valfngefga) {
		this.valfngefga = valfngefga;
	}

	public Integer getFecfngefgaAux() {
		return fecfngefgaAux;
	}

	public void setFecfngefgaAux(Integer fecfngefgaAux) {
		this.fecfngefgaAux = fecfngefgaAux;
	}

	public Date getFecfngefga() {
		return fecfngefga;
	}

	public void setFecfngefga(Date fecfngefga) {
		this.fecfngefga = fecfngefga;
	}

	public BigDecimal getValusaefga() {
		return valusaefga;
	}

	public void setValusaefga(BigDecimal valusaefga) {
		this.valusaefga = valusaefga;
	}

	public Integer getFecusaefgaAux() {
		return fecusaefgaAux;
	}

	public void setFecusaefgaAux(Integer fecusaefgaAux) {
		this.fecusaefgaAux = fecusaefgaAux;
	}

	public Date getFecusaefga() {
		return fecusaefga;
	}

	public void setFecusaefga(Date fecusaefga) {
		this.fecusaefga = fecusaefga;
	}

	public BigDecimal getValcadinco() {
		return valcadinco;
	}

	public void setValcadinco(BigDecimal valcadinco) {
		this.valcadinco = valcadinco;
	}

	public BigDecimal getValcadinmo() {
		return valcadinmo;
	}

	public void setValcadinmo(BigDecimal valcadinmo) {
		this.valcadinmo = valcadinmo;
	}

	public String getCalifriesg() {
		return califriesg;
	}

	public void setCalifriesg(String califriesg) {
		this.califriesg = califriesg;
	}

	public String getCalriesgba() {
		return calriesgba;
	}

	public void setCalriesgba(String calriesgba) {
		this.calriesgba = calriesgba;
	}

	public String getClasclient() {
		return clasclient;
	}

	public void setClasclient(String clasclient) {
		this.clasclient = clasclient;
	}

	public Integer getFechinimorAux() {
		return fechinimorAux;
	}

	public void setFechinimorAux(Integer fechinimorAux) {
		this.fechinimorAux = fechinimorAux;
	}

	public Date getFechinimor() {
		return fechinimor;
	}

	public void setFechinimor(Date fechinimor) {
		this.fechinimor = fechinimor;
	}

	public Integer getFechapagucAux() {
		return fechapagucAux;
	}

	public void setFechapagucAux(Integer fechapagucAux) {
		this.fechapagucAux = fechapagucAux;
	}

	public Date getFechapaguc() {
		return fechapaguc;
	}

	public void setFechapaguc(Date fechapaguc) {
		this.fechapaguc = fechapaguc;
	}

	public String getSecpertcli() {
		return secpertcli;
	}

	public void setSecpertcli(String secpertcli) {
		this.secpertcli = secpertcli;
	}

	public String getCodactintc() {
		return codactintc;
	}

	public void setCodactintc(String codactintc) {
		this.codactintc = codactintc;
	}

	public String getNomabogado() {
		return nomabogado;
	}

	public void setNomabogado(String nomabogado) {
		this.nomabogado = nomabogado;
	}

	public String getTipoclient() {
		return tipoclient;
	}

	public void setTipoclient(String tipoclient) {
		this.tipoclient = tipoclient;
	}

	public String getTipoempres() {
		return tipoempres;
	}

	public void setTipoempres(String tipoempres) {
		this.tipoempres = tipoempres;
	}

	public String getLine_credi() {
		return line_credi;
	}

	public void setLine_credi(String line_credi) {
		this.line_credi = line_credi;
	}

	public String getCali_credi() {
		return cali_credi;
	}

	public void setCali_credi(String cali_credi) {
		this.cali_credi = cali_credi;
	}

	public String getCod_identi() {
		return cod_identi;
	}

	public void setCod_identi(String cod_identi) {
		this.cod_identi = cod_identi;
	}

	public Long getNum_idclie() {
		return num_idclie;
	}

	public void setNum_idclie(Long num_idclie) {
		this.num_idclie = num_idclie;
	}

	public Short getCod_oficin() {
		return cod_oficin;
	}

	public void setCod_oficin(Short cod_oficin) {
		this.cod_oficin = cod_oficin;
	}

	public Integer getFec_vencreAux() {
		return fec_vencreAux;
	}

	public void setFec_vencreAux(Integer fec_vencreAux) {
		this.fec_vencreAux = fec_vencreAux;
	}

	public Date getFec_vencre() {
		return fec_vencre;
	}

	public void setFec_vencre(Date fec_vencre) {
		this.fec_vencre = fec_vencre;
	}

	public BigDecimal getTas_nomina() {
		return tas_nomina;
	}

	public void setTas_nomina(BigDecimal tas_nomina) {
		this.tas_nomina = tas_nomina;
	}

	public BigDecimal getSal_capido() {
		return sal_capido;
	}

	public void setSal_capido(BigDecimal sal_capido) {
		this.sal_capido = sal_capido;
	}

	public BigDecimal getSalcapnoid() {
		return salcapnoid;
	}

	public void setSalcapnoid(BigDecimal salcapnoid) {
		this.salcapnoid = salcapnoid;
	}

	public BigDecimal getSal_capcre() {
		return sal_capcre;
	}

	public void setSal_capcre(BigDecimal sal_capcre) {
		this.sal_capcre = sal_capcre;
	}

	public Short getDia_morcre() {
		return dia_morcre;
	}

	public void setDia_morcre(Short dia_morcre) {
		this.dia_morcre = dia_morcre;
	}

	public BigDecimal getPro_indcap() {
		return pro_indcap;
	}

	public void setPro_indcap(BigDecimal pro_indcap) {
		this.pro_indcap = pro_indcap;
	}

	public BigDecimal getPro_genera() {
		return pro_genera;
	}

	public void setPro_genera(BigDecimal pro_genera) {
		this.pro_genera = pro_genera;
	}

	public BigDecimal getPro_indcar() {
		return pro_indcar;
	}

	public void setPro_indcar(BigDecimal pro_indcar) {
		this.pro_indcar = pro_indcar;
	}

	public BigDecimal getProincaran() {
		return proincaran;
	}

	public void setProincaran(BigDecimal proincaran) {
		this.proincaran = proincaran;
	}

	public BigDecimal getInt_crrido() {
		return int_crrido;
	}

	public void setInt_crrido(BigDecimal int_crrido) {
		this.int_crrido = int_crrido;
	}

	public BigDecimal getInt_crnido() {
		return int_crnido;
	}

	public void setInt_crnido(BigDecimal int_crnido) {
		this.int_crnido = int_crnido;
	}

	public BigDecimal getIntcormora() {
		return intcormora;
	}

	public void setIntcormora(BigDecimal intcormora) {
		this.intcormora = intcormora;
	}

	public BigDecimal getIncomonoid() {
		return incomonoid;
	}

	public void setIncomonoid(BigDecimal incomonoid) {
		this.incomonoid = incomonoid;
	}

	public BigDecimal getCtaxcobmyp() {
		return ctaxcobmyp;
	}

	public void setCtaxcobmyp(BigDecimal ctaxcobmyp) {
		this.ctaxcobmyp = ctaxcobmyp;
	}

	public BigDecimal getProsacomyp() {
		return prosacomyp;
	}

	public void setProsacomyp(BigDecimal prosacomyp) {
		this.prosacomyp = prosacomyp;
	}

	public BigDecimal getCtaxcoivpy() {
		return ctaxcoivpy;
	}

	public void setCtaxcoivpy(BigDecimal ctaxcoivpy) {
		this.ctaxcoivpy = ctaxcoivpy;
	}

	public BigDecimal getProivamype() {
		return proivamype;
	}

	public void setProivamype(BigDecimal proivamype) {
		this.proivamype = proivamype;
	}

	public BigDecimal getProvi_inte() {
		return provi_inte;
	}

	public void setProvi_inte(BigDecimal provi_inte) {
		this.provi_inte = provi_inte;
	}

	public String getProvinmora() {
		return provinmora;
	}

	public void setProvinmora(String provinmora) {
		this.provinmora = provinmora;
	}

	public BigDecimal getValgarhipo() {
		return valgarhipo;
	}

	public void setValgarhipo(BigDecimal valgarhipo) {
		this.valgarhipo = valgarhipo;
	}

	public BigDecimal getVagannohip() {
		return vagannohip;
	}

	public void setVagannohip(BigDecimal vagannohip) {
		this.vagannohip = vagannohip;
	}

	public BigDecimal getValgartfng() {
		return valgartfng;
	}

	public void setValgartfng(BigDecimal valgartfng) {
		this.valgartfng = valgartfng;
	}

	public BigDecimal getValgausaid() {
		return valgausaid;
	}

	public void setValgausaid(BigDecimal valgausaid) {
		this.valgausaid = valgausaid;
	}

	public BigDecimal getValganoidh() {
		return valganoidh;
	}

	public void setValganoidh(BigDecimal valganoidh) {
		this.valganoidh = valganoidh;
	}

	public BigDecimal getVganoidhgn() {
		return vganoidhgn;
	}

	public void setVganoidhgn(BigDecimal vganoidhgn) {
		this.vganoidhgn = vganoidhgn;
	}

	public BigDecimal getCcocogfnag() {
		return ccocogfnag;
	}

	public void setCcocogfnag(BigDecimal ccocogfnag) {
		this.ccocogfnag = ccocogfnag;
	}

	public BigDecimal getPrcogafnag() {
		return prcogafnag;
	}

	public void setPrcogafnag(BigDecimal prcogafnag) {
		this.prcogafnag = prcogafnag;
	}

	public BigDecimal getCuecoifnag() {
		return cuecoifnag;
	}

	public void setCuecoifnag(BigDecimal cuecoifnag) {
		this.cuecoifnag = cuecoifnag;
	}

	public BigDecimal getProivgfnag() {
		return proivgfnag;
	}

	public void setProivgfnag(BigDecimal proivgfnag) {
		this.proivgfnag = proivgfnag;
	}

	public BigDecimal getCocomfonng() {
		return cocomfonng;
	}

	public void setCocomfonng(BigDecimal cocomfonng) {
		this.cocomfonng = cocomfonng;
	}

	public BigDecimal getCuencoboco() {
		return cuencoboco;
	}

	public void setCuencoboco(BigDecimal cuencoboco) {
		this.cuencoboco = cuencoboco;
	}

	public BigDecimal getProvcucooc() {
		return provcucooc;
	}

	public void setProvcucooc(BigDecimal provcucooc) {
		this.provcucooc = provcucooc;
	}

	public BigDecimal getCuencobseg() {
		return cuencobseg;
	}

	public void setCuencobseg(BigDecimal cuencobseg) {
		this.cuencobseg = cuencobseg;
	}

	public BigDecimal getProvseguro() {
		return provseguro;
	}

	public void setProvseguro(BigDecimal provseguro) {
		this.provseguro = provseguro;
	}

	public String getClacartrte() {
		return clacartrte;
	}

	public void setClacartrte(String clacartrte) {
		this.clacartrte = clacartrte;
	}

	public BigDecimal getIntcorcont() {
		return intcorcont;
	}

	public void setIntcorcont(BigDecimal intcorcont) {
		this.intcorcont = intcorcont;
	}

	public BigDecimal getIntmorcont() {
		return intmorcont;
	}

	public void setIntmorcont(BigDecimal intmorcont) {
		this.intmorcont = intmorcont;
	}

	public String getCodasesasi() {
		return codasesasi;
	}

	public void setCodasesasi(String codasesasi) {
		this.codasesasi = codasesasi;
	}

	public Integer getFulprecrcaAux() {
		return fulprecrcaAux;
	}

	public void setFulprecrcaAux(Integer fulprecrcaAux) {
		this.fulprecrcaAux = fulprecrcaAux;
	}

	public Date getFulprecrca() {
		return fulprecrca;
	}

	public void setFulprecrca(Date fulprecrca) {
		this.fulprecrca = fulprecrca;
	}

	public Integer getFukorecrinAux() {
		return fukorecrinAux;
	}

	public void setFukorecrinAux(Integer fukorecrinAux) {
		this.fukorecrinAux = fukorecrinAux;
	}

	public Date getFukorecrin() {
		return fukorecrin;
	}

	public void setFukorecrin(Date fukorecrin) {
		this.fukorecrin = fukorecrin;
	}

	public String getNumpagascr() {
		return numpagascr;
	}

	public void setNumpagascr(String numpagascr) {
		this.numpagascr = numpagascr;
	}

	public Integer getFecinicredAux() {
		return fecinicredAux;
	}

	public void setFecinicredAux(Integer fecinicredAux) {
		this.fecinicredAux = fecinicredAux;
	}

	public Date getFecinicred() {
		return fecinicred;
	}

	public void setFecinicred(Date fecinicred) {
		this.fecinicred = fecinicred;
	}

	public Long getNumcupacre() {
		return numcupacre;
	}

	public void setNumcupacre(Long numcupacre) {
		this.numcupacre = numcupacre;
	}

	public Integer getPlaztotcre() {
		return plaztotcre;
	}

	public void setPlaztotcre(Integer plaztotcre) {
		this.plaztotcre = plaztotcre;
	}

	public String getModalcredi() {
		return modalcredi;
	}

	public void setModalcredi(String modalcredi) {
		this.modalcredi = modalcredi;
	}

	public Short getPerpaginte() {
		return perpaginte;
	}

	public void setPerpaginte(Short perpaginte) {
		this.perpaginte = perpaginte;
	}

	public BigDecimal getTasamorccl() {
		return tasamorccl;
	}

	public void setTasamorccl(BigDecimal tasamorccl) {
		this.tasamorccl = tasamorccl;
	}

	public BigDecimal getValcredocl() {
		return valcredocl;
	}

	public void setValcredocl(BigDecimal valcredocl) {
		this.valcredocl = valcredocl;
	}

	public Integer getFeccredmorAux() {
		return feccredmorAux;
	}

	public void setFeccredmorAux(Integer feccredmorAux) {
		this.feccredmorAux = feccredmorAux;
	}

	public Date getFeccredmor() {
		return feccredmor;
	}

	public void setFeccredmor(Date feccredmor) {
		this.feccredmor = feccredmor;
	}

	public String getTipogatcre() {
		return tipogatcre;
	}

	public void setTipogatcre(String tipogatcre) {
		this.tipogatcre = tipogatcre;
	}

	public String getIdncuentga() {
		return idncuentga;
	}

	public void setIdncuentga(String idncuentga) {
		this.idncuentga = idncuentga;
	}

	public String getCodfuentre() {
		return codfuentre;
	}

	public void setCodfuentre(String codfuentre) {
		this.codfuentre = codfuentre;
	}

	public String getCredgestju() {
		return credgestju;
	}

	public void setCredgestju(String credgestju) {
		this.credgestju = credgestju;
	}

	public String getCredreestr() {
		return credreestr;
	}

	public void setCredreestr(String credreestr) {
		this.credreestr = credreestr;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}


		
}
