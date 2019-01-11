package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_PASIVOS_CONSOLIDADO", schema = "dbo")
public class BigPasivosConsolidado implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigPasivosConsolidadoId id;
		
	@Column(name = "i_activas")
	private Short crcact;
	
	@Column(name = "i_inactivas")
	private Short crciat;
	
	@Column(name = "i_canceladas_mes")
	private Short crccms;
	
	@Column(name = "i_bloqueadas_mes")
	private Short crcbms;
	
	@Column(name = "m_saldo_producto")
	private BigDecimal crslpr;
	
	@Column(name = "i_nro_depositos")
	private Long crnrde;
	
	@Column(name = "i_nro_retiros")
	private Long crnrre;
	
	@Column(name = "i_cantidad_aperturadas_mes")
	private Short crctms;
	
	@Column(name = "i_cantidad_cdt_renovado")
	private Short crccdt;
	
	@Column(name = "i_numero_tarjetas")
	private Short crntrj;

	public BigPasivosConsolidadoId getId() {
		return id;
	}

	public void setId(BigPasivosConsolidadoId id) {
		this.id = id;
	}

	public Short getCrcact() {
		return crcact;
	}

	public void setCrcact(Short crcact) {
		this.crcact = crcact;
	}

	public Short getCrciat() {
		return crciat;
	}

	public void setCrciat(Short crciat) {
		this.crciat = crciat;
	}

	public Short getCrccms() {
		return crccms;
	}

	public void setCrccms(Short crccms) {
		this.crccms = crccms;
	}

	public Short getCrcbms() {
		return crcbms;
	}

	public void setCrcbms(Short crcbms) {
		this.crcbms = crcbms;
	}

	public BigDecimal getCrslpr() {
		return crslpr;
	}

	public void setCrslpr(BigDecimal crslpr) {
		this.crslpr = crslpr;
	}

	public Long getCrnrde() {
		return crnrde;
	}

	public void setCrnrde(Long crnrde) {
		this.crnrde = crnrde;
	}

	public Long getCrnrre() {
		return crnrre;
	}

	public void setCrnrre(Long crnrre) {
		this.crnrre = crnrre;
	}

	public Short getCrctms() {
		return crctms;
	}

	public void setCrctms(Short crctms) {
		this.crctms = crctms;
	}

	public Short getCrccdt() {
		return crccdt;
	}

	public void setCrccdt(Short crccdt) {
		this.crccdt = crccdt;
	}

	public Short getCrntrj() {
		return crntrj;
	}

	public void setCrntrj(Short crntrj) {
		this.crntrj = crntrj;
	}
}
