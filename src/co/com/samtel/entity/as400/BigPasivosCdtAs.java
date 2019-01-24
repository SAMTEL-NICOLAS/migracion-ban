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
@Table(name = "CRM1416F", schema = "DAMCYFILES")
public class BigPasivosCdtAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigPasivosCdtIdAs id;
	
	@Column(name = "fech_corte")
	private Integer fech_corteAux;
	
	@Column(name = "num_fs_cdt")
	private String num_fs_cdt;
	
	@Column(name = "fech_emisi")
	private Integer fech_emisiAux;
	@Transient
	private Date fech_emisi;
	
	@Column(name = "per_pag_in")
	private Short per_pag_in;
	
	@Column(name = "itipo_tasa")
	private String itipo_tasa;
	
	@Column(name = "fecha_venc")
	private Integer fecha_vencAux;
	@Transient
	private Date fecha_venc;
	
	@Column(name = "mod_titulo")
	private String mod_titulo;
	
	@Column(name = "valor_cdt")
	private BigDecimal valor_cdt;
	
	@Column(name = "plazo_cdt")
	private Integer plazo_cdt;	
	
	@Column(name = "tas_ot_cdt")
	private BigDecimal tas_ot_cdt;
	
	@Column(name = "tasa_efect")
	private BigDecimal tasa_efect;
	
	@Column(name = "margen_dft")
	private BigDecimal margen_dft;	
	
	@Column(name = "ind_desmat")
	private String ind_desmat;
	
	@Column(name = "estado_cdt")
	private String estado_cdt;
	
	@Column(name = "cod_sub_pr")
	private String cod_sub_pr;
	
	@Column(name = "clase_tasa")
	private String clase_tasa;
	
	@Column(name = "oficina")
	private Integer oficina;
	
	@Column(name = "cod_operac")
	private String cod_operac;
	
	@Column(name = "valor_dtfi")
	private BigDecimal valor_dtfi;
	
	@Column(name = "num_client")
	private Long num_client;
	
	@Column(name = "cod_asesor")
	private String cod_asesor;
	
	@Column(name = "titulo_nor")
	private String titulo_nor;
	
	@Column(name = "capital_ot")
	private BigDecimal capital_ot;
	
	@Column(name = "capital_ap")
	private BigDecimal capital_ap;
	
	@Column(name = "codigo_pro")
	private String codigo_pro;
	
	@Column(name = "monto_paga")
	private BigDecimal monto_paga;
	
	@Column(name = "mon_pag_in")
	private BigDecimal mon_pag_in;
	
	@Column(name = "monto_rete")
	private BigDecimal monto_rete;
	
	@Column(name = "estado_cli")
	private String estado_cli;
	
	@Column(name = "migrado")
	private String migrado;

	

	public BigPasivosCdtIdAs getId() {
		return id;
	}

	public void setId(BigPasivosCdtIdAs id) {
		this.id = id;
	}

	public Integer getFech_corteAux() {
		return fech_corteAux;
	}

	public void setFech_corteAux(Integer fech_corteAux) {
		this.fech_corteAux = fech_corteAux;
	}

	public String getNum_fs_cdt() {
		return num_fs_cdt;
	}

	public void setNum_fs_cdt(String num_fs_cdt) {
		this.num_fs_cdt = num_fs_cdt;
	}

	public Integer getFech_emisiAux() {
		return fech_emisiAux;
	}

	public void setFech_emisiAux(Integer fech_emisiAux) {
		this.fech_emisiAux = fech_emisiAux;
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

	public Integer getFecha_vencAux() {
		return fecha_vencAux;
	}

	public void setFecha_vencAux(Integer fecha_vencAux) {
		this.fecha_vencAux = fecha_vencAux;
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

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	

}
