package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_PASIVOS_AH", schema = "dbo")
public class BigPasivosAh implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigPasivosAhId id;		

	@Column(name = "i_codigo_subproducto")
	private String codsubpro;	

	@Column(name = "i_identificacion_cliente")
	private Long codclient;	

	@Column(name = "d_fecha_constitucion")
	private Date fecconsti;
	
	@Column(name = "m_saldo_capital")
	private BigDecimal salcapita;	

	@Column(name = "m_saldo_rendimiento")
	private BigDecimal salrendim;	

	@Column(name = "s_cod_estado_anterior")
	private String codesante;	

	@Column(name = "m_saldo_disponible")
	private BigDecimal saldispon;
	
	@Column(name = "i_codigo_sucursal")
	private Short codsucurs;	

	@Column(name = "s_cod_estado_corte")
	private String codestcor;	

	@Column(name = "m_adicion_capital")
	private BigDecimal adiccapit;	

	@Column(name = "m_retiro_capital")
	private BigDecimal retcapita;

	@Column(name = "b_ind_desembolso")
	private String inddesemb;	

	@Column(name = "d_fecha_ultima_transaccion")
	private Date fecultran;	

	@Column(name = "d_fecha_activa")
	private Date fecactiva;	

	@Column(name = "s_condiciones_manejo")
	private String condmanej;
	
	@Column(name = "i_codigo_ejecutivo")
	private String codejecut;	

	@Column(name = "s_tipo_cuenta")
	private Short tipcuenta;	

	@Column(name = "m_promedio_mensual")
	private BigDecimal prommensu;	

	@Column(name = "f_tasa_interes")
	private BigDecimal tasainter;	

	@Column(name = "m_valor_compromiso_ahorrar")
	private BigDecimal valcompah;	

	@Column(name = "f_porc_compromiso_ahorrar")
	private BigDecimal porcomaho;	

	@Column(name = "m_valor_real_compromiso")
	private BigDecimal valreahoc;	

	@Column(name = "f_porc_real_compromiso")
	private BigDecimal porreahoc;
	
	@Column(name = "m_total_depositos_mensuales")
	private Short mondepmen;	

	@Column(name = "s_posee_tarjeta_debito")
	private String tarjdebit;	

	@Column(name = "i_codigo_fuerza_comercial")
	private String codfuerco;	

	@Column(name = "s_estado_tarjeta_debito")
	private String esttarjet;	

	@Column(name = "i_meses_ult_transaccion")
	private Short multtrans;	

	@Column(name = "s_cod_canal")
	private String canal;	

	@Column(name = "i_operacion_credito_asociadas")
	private Long numopcred;	

	@Column(name = "s_cuota_manejo")
	private String cuotmanej;
	
	@Column(name = "m_valor_cuota_manejo")
	private BigDecimal valcuotma;
	
	@Column(name = "i_codigo_producto")
	private String codproduc;

	public BigPasivosAhId getId() {
		return id;
	}

	public void setId(BigPasivosAhId id) {
		this.id = id;
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

	public Date getFecultran() {
		return fecultran;
	}

	public void setFecultran(Date fecultran) {
		this.fecultran = fecultran;
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

}
