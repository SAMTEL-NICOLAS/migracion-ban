package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "CRM1407F", schema = "DAMCYFILES")
public class BigRecogidosAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigRecogidosIdAs id;

	@Column(name = "fecapertur")
	private Integer fecaperturAux;
	@Transient
	private Date fecapertur;	
	
	@Column(name = "valorgiro")
	private BigDecimal valorgiro;	

	@Column(name = "feccancrec")
	private Integer feccancrecAux;
	@Transient
	private Date feccancrec;

	@Column(name = "saldcaprec")
	private BigDecimal saldcaprec;
	
	@Column(name = "asesor")
	private String asesor;

	@Column(name = "codsucursa")
	private Short codsucursa;
	//--
	@Column(name = "regional")
	private String regional;

	@Column(name = "modalidad")
	private String modalidad;

	@Column(name = "lineacred")
	private String lineacred;

	@Column(name = "tipolinea")
	private String tipolinea;
	
	@Column(name = "feccorte")
	private Integer feccorte;

	@Column(name = "zonacomerc")
	private String zonacomerc;
	
	@Column(name="numcredrec")
	private Long numcredcanc;
	
	@Column(name = "migrado")
	private String migrado;
	
	@Formula(value=" ROW_NUMBER()over(ORDER BY 1 ASC) ")
	private String contador;

	public BigRecogidosIdAs getId() {
		return id;
	}

	public void setId(BigRecogidosIdAs id) {
		this.id = id;
	}
	

/*	public Long getMunewcred() {
		return munewcred;
	}

	public void setMunewcred(Long munewcred) {
		this.munewcred = munewcred;
	}*/



	public String getAsesor() {
		return asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public Integer getFeccorte() {
		return feccorte;
	}

	public void setFeccorte(Integer feccorte) {
		this.feccorte = feccorte;
	}

	public String getContador() {
		return contador;
	}

	public void setContador(String contador) {
		this.contador = contador;
	}

	public BigDecimal getValorgiro() {
		return valorgiro;
	}

	public void setValorgiro(BigDecimal valorgiro) {
		this.valorgiro = valorgiro;
	}

	public Integer getFecaperturAux() {
		return fecaperturAux;
	}

	public void setFecaperturAux(Integer fecaperturAux) {
		this.fecaperturAux = fecaperturAux;
	}

	public Date getFecapertur() {
		return fecapertur;
	}

	public void setFecapertur(Date fecapertur) {
		this.fecapertur = fecapertur;
	}

	public Integer getFeccancrecAux() {
		return feccancrecAux;
	}

	public void setFeccancrecAux(Integer feccancrecAux) {
		this.feccancrecAux = feccancrecAux;
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

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
}
