package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_RECOGIDOS", schema = "dmc")
public class BigRecogidos implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigRecogidosId id;

	@Column(name = "d_fecha_inicio")
	private Date fecapertur;

	@Column(name = "m_valor_giro")
	private BigDecimal valorgiro;

	@Column(name = "d_fecha_cancelacion")
	private Date feccancrec;

	@Column(name = "m_saldo_capital")
	private BigDecimal saldcaprec;

	@Column(name = "i_id_asesor")
	private String asesor;

	@Column(name = "i_id_oficina")
	private Short codsucursa;

	@Column(name = "s_cod_regional")
	private String regional;

	@Column(name = "s_modalidad")
	private String modalidad;

	@Column(name = "s_cod_producto")
	private String lineacred;

	@Column(name = "s_tipo_linea")
	private String tipolinea;

	@Column(name = "i_zona_comercial")
	private String zonacomerc;

	@Column(name = "i_numero_credito_cancelado")
	private Long numcredcanc;

	public String getAsesor() {
		return asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public BigRecogidosId getId() {
		return id;
	}

	public void setId(BigRecogidosId id) {
		this.id = id;
	}

	public BigDecimal getValorgiro() {
		return valorgiro;
	}

	public void setValorgiro(BigDecimal valorgiro) {
		this.valorgiro = valorgiro;
	}

	public Date getFecapertur() {
		return fecapertur;
	}

	public void setFecapertur(Date fecapertur) {
		this.fecapertur = fecapertur;
	}

	public Date getFeccancrec() {
		return feccancrec;
	}

	public void setFeccancrec(Date feccancrec) {
		this.feccancrec = feccancrec;
	}

	public BigDecimal getSaldcaprec() {
		return saldcaprec;
	}

	public void setSaldcaprec(BigDecimal saldcaprec) {
		this.saldcaprec = saldcaprec;
	}

	public Short getCodsucursa() {
		return codsucursa;
	}

	public void setCodsucursa(Short codsucursa) {
		this.codsucursa = codsucursa;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getLineacred() {
		return lineacred;
	}

	public void setLineacred(String lineacred) {
		this.lineacred = lineacred;
	}

	public String getTipolinea() {
		return tipolinea;
	}

	public void setTipolinea(String tipolinea) {
		this.tipolinea = tipolinea;
	}

	public String getZonacomerc() {
		return zonacomerc;
	}

	public void setZonacomerc(String zonacomerc) {
		this.zonacomerc = zonacomerc;
	}

	public Long getNumcredcanc() {
		return numcredcanc;
	}

	public void setNumcredcanc(Long numcredcanc) {
		this.numcredcanc = numcredcanc;
	}

}
