package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_INFOADICIONALCLIENTES", schema = "dbo")
public class BigInfoAdicionalClientes implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigInfoAdicionalClientesId id;

	@Column(name = "i_cta_ahorro_activa")
	private Short crctaa;
	
	@Column(name = "i_cta_ahorro_inactiva")
	private Short crctai;
	
	@Column(name = "i_cta_ahorro_bloqueada")
	private Short crctab;
	
	@Column(name = "i_cdt_activo")
	private Short crctav;
	
	@Column(name = "i_cdt_bloqueado")
	private Short crcdte;
	
	@Column(name = "i_cantidad_tarjeta")
	private Short crccro;
	
	@Column(name = "i_util_cupo_tarjeta_12_meses")
	private Integer crctar;
	
	@Column(name = "m_util_cupo_tarjeta_12_meses")
	private BigDecimal crptar;
	
	@Column(name = "m_total_microcredito")
	private BigDecimal crtlmc;
	
	@Column(name = "m_total_credito_vehicular")
	private BigDecimal crtlcv;
	
	@Column(name = "m_total_credito_consumo")
	private BigDecimal crtlcc;
	
	@Column(name = "m_total_credito_comercial")
	private BigDecimal crtlcm;
	
	@Column(name = "m_total_cuenta_ahorro")
	private BigDecimal crslcc;
	
	@Column(name = "m_total_dpf")
	private BigDecimal crtlcd;
	
	@Column(name = "m_total_lineas_creditos")
	private BigDecimal crmtlc;
	
	@Column(name = "i_cantidad_creditos_vencido")
	private Integer crccvn;
	
	@Column(name = "i_cantidad_creditos_vigente")
	private Integer crccrv;
	
	@Column(name = "i_cantidad_creditos_castigado")
	private Integer crcccc;
	
	@Column(name = "s_tiene_pago_automatico")
	private String crppga;
	
	@Column(name = "s_tiene_debito_automatico")
	private String crpdba;

	public BigInfoAdicionalClientesId getId() {
		return id;
	}

	public void setId(BigInfoAdicionalClientesId id) {
		this.id = id;
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
