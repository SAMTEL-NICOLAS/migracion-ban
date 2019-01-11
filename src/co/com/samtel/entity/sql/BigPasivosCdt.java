package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_PASIVOS_CDT", schema = "dbo")
public class BigPasivosCdt implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigPasivosCdtId id;
	
	@Column(name = "s_numero_titulo")
	private String num_fs_cdt;
	
	@Column(name = "s_emision")
	private Date fech_emisi;
	
	@Column(name = "i_pago_interes")
	private Short per_pag_in;
	
	@Column(name = "i_tipo_interes")
	private String itipo_tasa;
	
	@Column(name = "d_fecha_vencimiento")
	private Date fecha_venc;
	
	@Column(name = "s_modalidad")
	private String mod_titulo;
	
	@Column(name = "m_valor_nominal")
	private BigDecimal valor_cdt; /*long a BD*/
	
	@Column(name = "i_plazo")
	private Integer plazo_cdt;	
	
	@Column(name = "m_tasa_nominal")
	private BigDecimal tas_ot_cdt;
	
	@Column(name = "m_tasa_efectiva")
	private BigDecimal tasa_efect;
	
	@Column(name = "f_margen")
	private BigDecimal margen_dft;	
	
	@Column(name = "s_desmaterializado")
	private String ind_desmat;
	
	@Column(name = "s_estado")
	private String estado_cdt;
	
	@Column(name = "i_codigo_subproducto")
	private String cod_sub_pr;
	
	@Column(name = "f_tipo")
	private String clase_tasa;
	
	@Column(name = "i_codigo_sucursal")
	private Integer oficina;
	
	@Column(name = "i_cod_operacion")
	private String cod_operac;
	
	@Column(name = "s_dtf_vigente")
	private BigDecimal valor_dtfi;
	
	@Column(name = "i_identificacion_cliente")
	private Long num_client;
	
	@Column(name = "i_cod_asesor")
	private String cod_asesor;
	
	@Column(name = "s_es_renovado")
	private String titulo_nor;
	
	@Column(name = "m_valor_aper_otros")
	private BigDecimal capital_ot;
	
	@Column(name = "m_valor_apert_cdt")
	private BigDecimal capital_ap;
	
	@Column(name = "i_codigo_producto")
	private String codigo_pro;
	
	@Column(name = "m_mon_pagar")
	private BigDecimal monto_paga;
	
	@Column(name = "m_mon_interes")
	private BigDecimal mon_pag_in;
	
	@Column(name = "m_mon_rete_fuente")
	private BigDecimal monto_rete;
	
	@Column(name = "b_actualizado")
	private String estado_cli;

	public BigPasivosCdtId getId() {
		return id;
	}

	public void setId(BigPasivosCdtId id) {
		this.id = id;
	}

	public String getNum_fs_cdt() {
		return num_fs_cdt;
	}

	public void setNum_fs_cdt(String num_fs_cdt) {
		this.num_fs_cdt = num_fs_cdt;
	}

	public Date getFech_emisi() {
		return fech_emisi;
	}

	public void setFech_emisi(Date fech_emisi) {
		this.fech_emisi = fech_emisi;
	}

	public Short getPer_pag_in() {
		return per_pag_in;
	}

	public void setPer_pag_in(Short per_pag_in) {
		this.per_pag_in = per_pag_in;
	}

	public String getItipo_tasa() {
		return itipo_tasa;
	}

	public void setItipo_tasa(String itipo_tasa) {
		this.itipo_tasa = itipo_tasa;
	}

	public Date getFecha_venc() {
		return fecha_venc;
	}

	public void setFecha_venc(Date fecha_venc) {
		this.fecha_venc = fecha_venc;
	}

	public String getMod_titulo() {
		return mod_titulo;
	}

	public void setMod_titulo(String mod_titulo) {
		this.mod_titulo = mod_titulo;
	}

	public BigDecimal getValor_cdt() {
		return valor_cdt;
	}

	public void setValor_cdt(BigDecimal valor_cdt) {
		this.valor_cdt = valor_cdt;
	}

	public Integer getPlazo_cdt() {
		return plazo_cdt;
	}

	public void setPlazo_cdt(Integer plazo_cdt) {
		this.plazo_cdt = plazo_cdt;
	}

	public BigDecimal getTas_ot_cdt() {
		return tas_ot_cdt;
	}

	public void setTas_ot_cdt(BigDecimal tas_ot_cdt) {
		this.tas_ot_cdt = tas_ot_cdt;
	}

	public BigDecimal getTasa_efect() {
		return tasa_efect;
	}

	public void setTasa_efect(BigDecimal tasa_efect) {
		this.tasa_efect = tasa_efect;
	}

	public BigDecimal getMargen_dft() {
		return margen_dft;
	}

	public void setMargen_dft(BigDecimal margen_dft) {
		this.margen_dft = margen_dft;
	}

	public String getInd_desmat() {
		return ind_desmat;
	}

	public void setInd_desmat(String ind_desmat) {
		this.ind_desmat = ind_desmat;
	}

	public String getEstado_cdt() {
		return estado_cdt;
	}

	public void setEstado_cdt(String estado_cdt) {
		this.estado_cdt = estado_cdt;
	}

	public String getCod_sub_pr() {
		return cod_sub_pr;
	}

	public void setCod_sub_pr(String cod_sub_pr) {
		this.cod_sub_pr = cod_sub_pr;
	}

	public String getClase_tasa() {
		return clase_tasa;
	}

	public void setClase_tasa(String clase_tasa) {
		this.clase_tasa = clase_tasa;
	}

	public Integer getOficina() {
		return oficina;
	}

	public void setOficina(Integer oficina) {
		this.oficina = oficina;
	}

	public String getCod_operac() {
		return cod_operac;
	}

	public void setCod_operac(String cod_operac) {
		this.cod_operac = cod_operac;
	}

	public BigDecimal getValor_dtfi() {
		return valor_dtfi;
	}

	public void setValor_dtfi(BigDecimal valor_dtfi) {
		this.valor_dtfi = valor_dtfi;
	}

	public Long getNum_client() {
		return num_client;
	}

	public void setNum_client(Long num_client) {
		this.num_client = num_client;
	}

	public String getCod_asesor() {
		return cod_asesor;
	}

	public void setCod_asesor(String cod_asesor) {
		this.cod_asesor = cod_asesor;
	}

	public String getTitulo_nor() {
		return titulo_nor;
	}

	public void setTitulo_nor(String titulo_nor) {
		this.titulo_nor = titulo_nor;
	}

	public BigDecimal getCapital_ot() {
		return capital_ot;
	}

	public void setCapital_ot(BigDecimal capital_ot) {
		this.capital_ot = capital_ot;
	}

	public BigDecimal getCapital_ap() {
		return capital_ap;
	}

	public void setCapital_ap(BigDecimal capital_ap) {
		this.capital_ap = capital_ap;
	}

	public String getCodigo_pro() {
		return codigo_pro;
	}

	public void setCodigo_pro(String codigo_pro) {
		this.codigo_pro = codigo_pro;
	}

	public BigDecimal getMonto_paga() {
		return monto_paga;
	}

	public void setMonto_paga(BigDecimal monto_paga) {
		this.monto_paga = monto_paga;
	}

	public BigDecimal getMon_pag_in() {
		return mon_pag_in;
	}

	public void setMon_pag_in(BigDecimal mon_pag_in) {
		this.mon_pag_in = mon_pag_in;
	}

	public BigDecimal getMonto_rete() {
		return monto_rete;
	}

	public void setMonto_rete(BigDecimal monto_rete) {
		this.monto_rete = monto_rete;
	}

	public String getEstado_cli() {
		return estado_cli;
	}

	public void setEstado_cli(String estado_cli) {
		this.estado_cli = estado_cli;
	}
	
}
