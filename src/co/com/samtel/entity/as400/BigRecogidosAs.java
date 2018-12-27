package co.com.samtel.entity.as400;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "CRM1407F", schema = "DAMCYFILES")
public class BigRecogidosAs implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigRecogidosIdAs id;

	@Column(name = "feccorte")
	private Integer feccorte;

	@Column(name = "mumnewcred")
	private long munewcred;

	@Column(name = "asesor")
	private String asesor;
	
	@Formula(value=" ROW_NUMBER()over(ORDER BY 1 ASC) ")
	private String contador;

	public BigRecogidosIdAs getId() {
		return id;
	}

	public void setId(BigRecogidosIdAs id) {
		this.id = id;
	}

	public long getMunewcred() {
		return munewcred;
	}

	public void setMunewcred(long munewcred) {
		this.munewcred = munewcred;
	}

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

//	@Column(name = "fecapertur")
//	private int fecapertur;
//
//	@Column(name = "valorgiro")
//	private long valorgiro;
//
//	@Column(name = "numcredrec")
//	private long numcredrec;
//
//	@Column(name = "feccancrec")
//	private int feccancrec;
//
//	@Column(name = "saldcaprec")
//	private long saldcaprec;
//
//	@Column(name = "asesor")
//	private String asesor;
//
//	@Column(name = "codsucursa")
//	private short codsucursa;
//
//	@Column(name = "regional")
//	private String regional;
//
//	@Column(name = "modalidad")
//	private String modalidad;
//
//	@Column(name = "lineacred")
//	private String lineacred;
//
//	@Column(name = "tipolinea")
//	private String tipolinea;
//
//	@Column(name = "feccorte")
//	private short feccorte;
//
//	@Column(name = "zonacomerc")
//	private String zonacomerc;

}
