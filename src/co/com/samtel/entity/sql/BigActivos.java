package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_ACTIVOS", schema = "dbo")
public class BigActivos implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActivosId id;	
	
	@Column(name = "s_cod_producto")
	private String line_credi;
	
	@Column(name = "s_calificacion")
	private String cali_credi;
	
	@Column(name = "i_Tipo_linea")
	private String cod_identi;
	
	@Column(name = "i_nui")
	private Long num_idclie;
	
	@Column(name = "i_codigo_sucursal")
	private Short cod_oficin;
	
	@Column(name = "d_fecha_vcto")
	private Date fec_vencre;
	
	@Column(name = "m_tasa")
	private BigDecimal tas_nomina;
	
	@Column(name = "m_cxc_cap_adm")
	private BigDecimal sal_capido;
	
	@Column(name = "m_cxc_cap_no_adm")
	private BigDecimal salcapnoid;
	
	@Column(name = "m_capital")
	private BigDecimal sal_capcre;
	
	@Column(name = "i_dias_de_mora")
	private Short dia_morcre;
	
	@Column(name = "m_prov_cap")
	private BigDecimal pro_indcap;
	
	@Column(name = "m_prov_gral")
	private BigDecimal pro_genera;	
	
	@Column(name = "m_prov_alicuota_mes")
	private BigDecimal pro_indcar;
	
	@Column(name = "m_prov_alicuota_mes_ant")
	private BigDecimal proincaran;
	
	@Column(name = "m_int_corr_idoneos")
	private BigDecimal int_crrido;
	
	@Column(name = "m_int_corr_no_idoneos")
	private BigDecimal int_crnido;
	
	@Column(name = "m_cxc_mora_idoneos")
	private BigDecimal intcormora;
	
	@Column(name = "m_cxc_mora_no_idoneos")
	private BigDecimal incomonoid;
	
	@Column(name = "m_cxc_mipyme")
	private BigDecimal ctaxcobmyp;
	
	@Column(name = "m_prov_mipyme")
	private BigDecimal prosacomyp;
	
	@Column(name = "m_cxc_iva_mipyme")
	private BigDecimal ctaxcoivpy;
	
	@Column(name = "m_prov_iva_mipyme")
	private BigDecimal proivamype;
	
	@Column(name = "m_provis_int")
	private BigDecimal provi_inte;
	
	@Column(name = "m_prov_int_mora")
	private String provinmora;
	
	@Column(name = "m_garantia_hipotecaria")
	private BigDecimal valgarhipo;
	
	@Column(name = "m_garantia_no_hipotecaria")
	private BigDecimal vagannohip;
	
	@Column(name = "m_garantia_fng")
	private BigDecimal valgartfng;
	
	@Column(name = "m_garantia_dca")
	private BigDecimal valgausaid;
	
	@Column(name = "m_ni_garantia_hip")
	private BigDecimal valganoidh;
	
	@Column(name = "m_ni_garantia_no_hip")
	private BigDecimal vganoidhgn;
	
	@Column(name = "m_cxc_fng")
	private BigDecimal ccocogfnag;
	
	@Column(name = "m_prv_fng")
	private BigDecimal prcogafnag;
	
	@Column(name = "m_cxc_iva_fng")
	private BigDecimal cuecoifnag;
	
	@Column(name = "m_prov_iva_fng")
	private BigDecimal proivgfnag;
	
	@Column(name = "m_ctgte_fng")
	private BigDecimal cocomfonng;
	
	@Column(name = "m_cxc_otros")
	private BigDecimal cuencoboco;
	
	@Column(name = "m_provision_otros_c")
	private BigDecimal provcucooc;
	
	@Column(name = "m_cxc_seguro")
	private BigDecimal cuencobseg;
	
	@Column(name = "m_prvseguro")
	private BigDecimal provseguro;
	
	@Column(name = "s_calificacion_temporalidad")
	private String clacartrte;
	
	@Column(name = "m_interes_contingente")
	private BigDecimal intcorcont;
	
	@Column(name = "m_int_conting_mora")
	private BigDecimal intmorcont;
	
	@Column(name = "i_cod_asesor")
	private String codasesasi;
	
	@Column(name = "d_fec_ult_p_cap")
	private Date fulprecrca;
	
	@Column(name = "d_fec_ult_p_int")
	private Date fukorecrin;
	
	@Column(name = "s_pagare")
	private String numpagascr;
	
	@Column(name = "d_fecha_inicio_cre")
	private Date fecinicred;
	
	@Column(name = "i_nro_cupo")
	private Long numcupacre;
	
	@Column(name = "i_plazo")
	private Integer plaztotcre;
	
	@Column(name = "s_modalidad_lin")
	private String modalcredi;
	
	@Column(name = "i_periodo_interes")
	private Short perpaginte;
	
	@Column(name = "i_tasa_mora_lin")
	private BigDecimal tasamorccl;
	
	@Column(name = "m_valor_desem")
	private BigDecimal valcredocl;
	
	@Column(name = "d_fecha_inicio_mora")
	private Date feccredmor;
	
	@Column(name = "i_tipo_gar")
	private String tipogatcre;
	
	@Column(name = "i_garantia")
	private String idncuentga;
	
	@Column(name = "i_fuente")
	private String codfuentre;
	
	@Column(name = "i_sw_abogado")
	private String credgestju;
	
	@Column(name = "i_re_est")
	private String credreestr;
	
	@Column(name = "s_sector") //Ok
	private String secpertcli;
	
	@Column(name = "s_cod_actividad")
	private String codactintc;
	
	@Column(name = "s_abogado")
	private String nomabogado;
	
	@Column(name = "s_tipo_persona")
	private String tipoclient;
	
	@Column(name = "s_tamaño_empresa")
	private String tipoempres;
	
	@Column(name = "s_tipo_cliente")
	private String clasclient;
	
	@Column(name = "d_fecha_mora")
	private Date fechinimor;
	
	@Column(name = "d_fecha_de_pago")
	private Date fechapaguc;
	
	@Column(name = "m_tasa_mora")
	private BigDecimal morcobracl;
	
	@Column(name = "m_pago_fng")
	private BigDecimal valfngefga;
	
	@Column(name = "d_fecha_pago_fng")
	private Date fecfngefga;
	
	@Column(name = "m_pago_dca")
	private BigDecimal valusaefga;
		
	@Column(name = "d_fecha_pago_dca")
	private Date fecusaefga;
	
	@Column(name = "m_caus_dia_corr")
	private BigDecimal valcadinco;
	
	@Column(name = "m_caus_dia_mora")
	private BigDecimal valcadinmo;
		
	@Column(name = "i_calif_riesgo_finamerica")
	private String califriesg;
	
	@Column(name = "i_calif_riesgo_banca")
	private String calriesgba;
	
	@Column(name = "m_cuota_capital_vigente")
	private BigDecimal salcapcupe;
		
	@Column(name = "m_cuotas_capital_venc_1_30")
	private BigDecimal sacapv1_30;
	
	@Column(name = "m_cuotas_capital_venc_31_90")
	private BigDecimal scapv31_90;
	
	@Column(name = "m_cuotas_capital_venc_91_180")
	private BigDecimal scav91_180;
		
	@Column(name = "m_cuotas_capital_venc_181_360")
	private BigDecimal scv181_360;
	
	@Column(name = "m_cuotas_capital_venc_mas_360")
	private BigDecimal sacapvm360;
	
	@Column(name = "i_cuota_actual")
	private BigDecimal numcuotcan;
		
	@Column(name = "i_cuota_desde_mora")
	private BigDecimal numcuomora;
	
	@Column(name = "m_ley_mipyme_total")
	private BigDecimal valtcomipy;
	
	@Column(name = "m_ley_mipyme_pagada")
	private BigDecimal commipytcr;
		
	@Column(name = "m_iva_mipyme_total")
	private BigDecimal valtivamip;
	
	@Column(name = "m_iva_mipyme_pagada")
	private BigDecimal ivamipytcr;
	
	@Column(name = "m_ctgte_ley_mipyme")
	private BigDecimal valpenmipy;
		
	@Column(name = "m_ctgte_iva_ley")
	private BigDecimal ivapenmipy;
	
	@Column(name = "s_referenciado_por")
	private Long canrefclcr;
	
	@Column(name = "s_proveedor")
	private String nombcatccr;
		
	@Column(name = "m_cxc_cuota_manejo")
	private BigDecimal ctasccrota;
	
	@Column(name = "m_provision_cuota_manejo")
	private BigDecimal proctacrot;
	
	@Column(name = "m_ctgte_cuota_manejo")
	private BigDecimal contccrota;
		
	@Column(name = "m_cxc_iva_cuota_manejo")
	private BigDecimal ctascivaro;
	
	@Column(name = "m_prov_iva_cuota_manejo")
	private BigDecimal provivacro;
	
	@Column(name = "m_ctgte_iva_cuota_manejo")
	private BigDecimal contivaccr;
		
	@Column(name = "m_tasa_colocacion")
	private BigDecimal tasacoloca;

	@Column(name = "i_ya_contigente")
	private String interescre;
	
	@Column(name = "d_fecha_contigente")
	private Date fecintcred;
		
	@Column(name = "m_prov_cap_cic")
	private BigDecimal provcacicl;

	@Column(name = "m_prov_int_cic")
	private BigDecimal provintcic;
	
	@Column(name = "m_prov_mora_cic")
	private BigDecimal provmorcic;
		
	@Column(name = "m_prov_mipyme_cic")
	private BigDecimal provmipyci;
	
	@Column(name = "m_prov_iva_mipyme_cic")
	private BigDecimal provinmici;
	
	@Column(name = "m_prov_fng_cic")
	private BigDecimal provfngcic;
		
	@Column(name = "m_prov_iva_fng_cic")
	private BigDecimal privafngci;
	
	@Column(name = "m_prov_seguro_cic")
	private BigDecimal provsegcic;
	
	@Column(name = "m_prov_otros_cic")
	private BigDecimal provotrcic;
		
	@Column(name = "m_prov_ctamanejo_cic")
	private BigDecimal provcumcic;
	
	@Column(name = "m_prov_iva_ctamanejo_cic")
	private BigDecimal proivaccic;
	
	@Column(name = "m_cxc_fag")
	private BigDecimal moncomcfag;
		
	@Column(name = "m_cxc_iva_fag")
	private BigDecimal ivacomcfag;
	
	@Column(name = "m_ctgte_fag")
	private BigDecimal mcomcfagsc;
	
	@Column(name = "m_ctgte_iva_fag")
	private BigDecimal icomcfagsc;
		
	@Column(name = "m_prov_fag")
	private BigDecimal procomcfag;	
	
	@Column(name = "m_prov_iva_fag")
	private BigDecimal proivacfag;
	
	@Column(name = "m_prov_fag_cic")
	private BigDecimal provccicfa;
		
	@Column(name = "m_prov_iva_fag_cic")
	private BigDecimal proivaccfa;	
	
	@Column(name = "d_fecha_prox_pago")
	private Date fecproxpcr;
	
	@Column(name = "i_codigo_convenio")
	private String numconacre;
		
	@Column(name = "i_codigo_pagaduria")
	private Short codpagacon;	
	
	@Column(name = "m_vlr_cubrimiento_fag")
	private BigDecimal valgafagga;
	
	@Column(name = "m_tasa_efec_real")
	private BigDecimal tacreefanu;
		
	@Column(name = "m_tipo_interes_lin")
	private BigDecimal credintdtf;
	
	@Column(name = "m_tasa_ordinaria_lin")
	private BigDecimal tasbaindtf;
	
	@Column(name = "m_dtf")
	private BigDecimal tasdtfindc;
		
	@Column(name = "m_ctgte_seguro")
	private BigDecimal montsegcsc;
	
	@Column(name = "d_fecha_cla_cal")
	private Date feccredcas;
	
	@Column(name = "i_nro_credito_pasivo")
	private Long credredesc;
		
	@Column(name = "i_renovado")
	private Short credirenov;
	
	@Column(name = "i_id_bien")
	private Long identgaran;
	
	@Column(name = "m_garantia_fga")
	private BigDecimal valgarfnga;
		
	@Column(name = "m_pago_fga")
	private BigDecimal vacanfngeg;
	
	@Column(name = "d_fecha_pago_fga")
	private Date feccafngeg;
	
	@Column(name = "m_proxima_cuota")
	private BigDecimal valpprxccl;
		
	@Column(name = "i_cod_ejecutivo_creacion")
	private String codiasesor;
	
	@Column(name = "i_codigo_agencia_creacion")
	private Short codsucursa;
	
	@Column(name = "i_cod_fuerza_comercial")
	private String codfuercom;
	
	@Column(name = "i_num_cuenta_ahorro_asociada")
	private Long numctaacre;
	
	@Column(name = "i_dias_vencimiento_oper")
	private Long vencicredi;
	
	@Column(name = "i_num_cuotas")
	private Integer numecuotas;
	
	@Column(name = "m_porc_cancelado_capital")
	private BigDecimal porccclipc;
	
	@Column(name = "m_porc_cancelado_tiempo")
	private BigDecimal portcllipc;
	
	@Column(name = "i_nro_consulta")
	private String numgonbase;

	public BigActivosId getId() {
		return id;
	}

	public void setId(BigActivosId id) {
		this.id = id;
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

	public BigDecimal getIvapenmipy() {
		return ivapenmipy;
	}

	public void setIvapenmipy(BigDecimal ivapenmipy) {
		this.ivapenmipy = ivapenmipy;
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

	public Date getFechinimor() {
		return fechinimor;
	}

	public void setFechinimor(Date fechinimor) {
		this.fechinimor = fechinimor;
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

	public Date getFulprecrca() {
		return fulprecrca;
	}

	public void setFulprecrca(Date fulprecrca) {
		this.fulprecrca = fulprecrca;
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

	public Date getFecinicred() {
		return fecinicred;
	}

	public void setFecinicred(Date fecinicred) {
		this.fecinicred = fecinicred;
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
	
	
}
