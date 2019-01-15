package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "BIG_CREDIPREMIUM", schema = "dbo")
public class BigCredipremium implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "i_codigo_cliente")
	private Long crcnui;
	
	@Column(name = "i_mora_maxima_cliente")
	private Long crcmmc; // short -- long
	
	@Column(name = "s_peor_calif_riesgo")
	private String crcpcr;
	
	@Column(name = "s_calif_riesgo")
	private String crccar;
	
	@Column(name = "i_nro_cred_corte")
	private Short crcncc;
	
	@Column(name = "i_mora_max_6_mes")
	private Short crcmms;
	
	@Column(name = "s_tipo_cliente")
	private String crctic;
	
	@Column(name = "s_cod_producto")
	private String crclcr;
	
	@Column(name = "d_fecha_desem_credito")
	private Date crcfdc;
	
	@Column(name = "m_monto_desem_cred")
	private BigDecimal crcmdc;
	
	@Column(name = "i_plazo_cred")
	private Integer crcpdc;
	
	@Column(name = "m_capac_pago")
	private BigDecimal crccap;
	
	@Column(name = "m_activos_total_clte")
	private BigDecimal crcatc;
	
	@Column(name = "d_fecha_venc_cred")
	private Date crcfvc;
	
	@Column(name = "i_mora_prome_cred")
	private Short crcmpc;	

	@Column(name = "i_mora_maxim_cred")
	private Short crcmmr;
	
	@Column(name = "i_periodo_int_cred")
	private Short crcpic;
	
	@Column(name = "i_mora_prome_clte")
	private Integer crcmpl; // short a int
	
	@Column(name = "i_mora_maxim_clte")
	private Short crcmml;// short a int
	
	@Column(name = "i_actividad_econo")
	private String crcace;
	
	@Column(name = "i_score_inter")
	private String crcsci;
	
	@Column(name = "i_resultado_preci")
	private String crcrpp;
	
	@Column(name = "i_resultado_otorg")
	private String crcrso;
	
	@Column(name = "d_fecha_prim_cred")	
	private Date crcfpc;
	
	@Column(name = "d_fecha_cred_rec")	
	private Date crcfcr;
	
	@Column(name = "m_monto_desem_cred_ult")
	private BigDecimal crcmdu;
	
	@Column(name = "s_cliente_castigado")
	private String crcclc;
	
	@Column(name = "s_perfil_riesgo_cred")
	private String crcpar;
	
	@Column(name = "i_endeuda_modalidad")
	private Long crcenm; // integer - Long
	
	@Column(name = "i_behavescore_segui")
	private Short crcscs;
	
	@Column(name = "i_probabilidad_incum")
	private BigDecimal crcpin;
	
	@Column(name = "s_sujeto_visit")
	private String crcsjv;	
	
	@Column(name = "m_porcentaje_capi_canc")
	private BigDecimal crcpcc;	
	
	@Column(name = "i_porc_tiempo_transc")
	private BigDecimal crcptt;
	
	@Column(name = "i_nro_clie_d_de")
	private String crcesc;
	
	@Column(name = "i_nro_mora_1_15")
	private Short crcm15;
	
	@Column(name = "i_nro_mora_16_30")
	private Short crcm30;
	
	@Column(name = "i_nro_mora_31_60")
	private Short crcm60;
	
	@Column(name = "i_nro_crediprem_activos")
	private Short crcnca;
	
	@Column(name = "i_nro_meses_cancel_oper")
	private Short crcmcu;
	
	@Column(name = "i_nro_condonac")
	private Short crcnco;
	
	@Column(name = "i_nro_cred_selecc")
	private Long crcacc; // long - long(bigint)
	
	@Column(name = "i_codigo_ejec_act")
	private String  crcase;
	
	@Column(name = "i_nro_cred_renovados")
	private Short crcnre;
	
	@Column(name = "i_cuotas_vencidas")
	private Short crccuv;
	
	@Column(name = "s_periodo_pago")
	private Short crcpep; // String - short
	
	@Column(name = "s_tipo_garantia")
	private String crcgar;

	public Long getCrcnui() {
		return crcnui;
	}

	public void setCrcnui(Long crcnui) {
		this.crcnui = crcnui;
	}

	public Long getCrcmmc() {
		return crcmmc;
	}

	public void setCrcmmc(Long crcmmc) {
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

	public Integer getCrcmpl() {
		return crcmpl;
	}

	public void setCrcmpl(Integer crcmpl) {
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

	public Date getCrcfpc() {
		return crcfpc;
	}

	public void setCrcfpc(Date crcfpc) {
		this.crcfpc = crcfpc;
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

	public Long getCrcenm() {
		return crcenm;
	}

	public void setCrcenm(Long crcenm) {
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

	public Short getCrcpep() {
		return crcpep;
	}

	public void setCrcpep(Short crcpep) {
		this.crcpep = crcpep;
	}

	public String getCrcgar() {
		return crcgar;
	}

	public void setCrcgar(String crcgar) {
		this.crcgar = crcgar;
	}
	
	
}
