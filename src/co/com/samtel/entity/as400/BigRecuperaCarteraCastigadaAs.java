package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
@Entity
@Table(name = "CRM1408F", schema = "DAMCYFILES")
public class BigRecuperaCarteraCastigadaAs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigRecuperaCarteraCastigadaIdAs id;
	
//	@Column(name = "f01deaacc")  pk
//	private long f01deaacc;
	
	@Column(name = "f01fecpag")
	private Integer f01fecpagAux;	 
	@Transient
	private Date f01fecpag;

//	@Column(name = "f01traacr")  pk
//	private long f01traacr;	

	@Column(name = "f01tranar")
	private String f01tranar;	
   //---
	@Column(name = "f01feccas")
	private Integer f01feccasAux; 
	@Transient
	private Date f01feccas;

	@Column(name = "f01dscpro")
	private String f01dscpro;	
	
	@Column(name = "f01valcap")
	private BigDecimal f01valcap;
	//---
	
	@Column(name = "f01intcor")
	private BigDecimal f01intcor;
	
	@Column(name = "f01intctg")
	private BigDecimal f01intctg;
	
	@Column(name = "f01morctg")
	private BigDecimal f01morctg;
	
	@Column(name = "f01morcor")
	private BigDecimal f01morcor;
	
	@Column(name = "f01accfun")
	private BigDecimal f01accfun;
	//---	
	
	@Column(name = "f01mipyme")
	private BigDecimal f01mipyme;	
	
	@Column(name = "f01ivampy")
	private BigDecimal f01ivampy ;	
	
	@Column(name = "f01fongar")
	private BigDecimal f01fongar;
		
	@Column(name = "f01ivafon")
	private BigDecimal f01ivafon;	
	
	@Column(name = "f01seguro")
	private BigDecimal f01seguro;	
	
	@Column(name = "f01notros")
	private BigDecimal f01notros;
	
	@Column(name = "f01valpre")
	private BigDecimal f01valpre;
	
	@Column(name = "f01valjur")
	private BigDecimal f01valjur;
	
	@Column(name = "f01valges")
	private BigDecimal f01valges;
	
	@Column(name = "f01fcorte")
	private Integer f01fcorte;

	public BigRecuperaCarteraCastigadaIdAs getId() {
		return id;
	}
	public void setId(BigRecuperaCarteraCastigadaIdAs id) {
		this.id = id;
	}
	public Integer getF01fcorte() {
		return f01fcorte;
	}
	public void setF01fcorte(Integer f01fcorte) {
		this.f01fcorte = f01fcorte;
	}

	public String getF01tranar() {
		return f01tranar;
	}
	public void setF01tranar(String f01tranar) {
		this.f01tranar = f01tranar;
	}

	public String getF01dscpro() {
		return f01dscpro;
	}
	public void setF01dscpro(String f01dscpro) {
		this.f01dscpro = f01dscpro;
	}
	public BigDecimal getF01valcap() {
		return f01valcap;
	}
	public void setF01valcap(BigDecimal f01valcap) {
		this.f01valcap = f01valcap;
	}
	public Integer getF01fecpagAux() {
		return f01fecpagAux;
	}
	public void setF01fecpagAux(Integer f01fecpagAux) {
		this.f01fecpagAux = f01fecpagAux;
	}
	public Date getF01fecpag() {
		return f01fecpag;
	}
	public void setF01fecpag(Date f01fecpag) {
		this.f01fecpag = f01fecpag;
	}
	public BigDecimal getF01intcor() {
		return f01intcor;
	}
	public void setF01intcor(BigDecimal f01intcor) {
		this.f01intcor = f01intcor;
	}
	public BigDecimal getF01intctg() {
		return f01intctg;
	}
	public void setF01intctg(BigDecimal f01intctg) {
		this.f01intctg = f01intctg;
	}
	public BigDecimal getF01morctg() {
		return f01morctg;
	}
	public void setF01morctg(BigDecimal f01morctg) {
		this.f01morctg = f01morctg;
	}
	public BigDecimal getF01morcor() {
		return f01morcor;
	}
	public void setF01morcor(BigDecimal f01morcor) {
		this.f01morcor = f01morcor;
	}
	public BigDecimal getF01accfun() {
		return f01accfun;
	}
	public void setF01accfun(BigDecimal f01accfun) {
		this.f01accfun = f01accfun;
	}
	public BigDecimal getF01mipyme() {
		return f01mipyme;
	}
	public void setF01mipyme(BigDecimal f01mipyme) {
		this.f01mipyme = f01mipyme;
	}
	public BigDecimal getF01ivampy() {
		return f01ivampy;
	}
	public void setF01ivampy(BigDecimal f01ivampy) {
		this.f01ivampy = f01ivampy;
	}
	public BigDecimal getF01fongar() {
		return f01fongar;
	}
	public void setF01fongar(BigDecimal f01fongar) {
		this.f01fongar = f01fongar;
	}
	public BigDecimal getF01ivafon() {
		return f01ivafon;
	}
	public void setF01ivafon(BigDecimal f01ivafon) {
		this.f01ivafon = f01ivafon;
	}
	public BigDecimal getF01seguro() {
		return f01seguro;
	}
	public void setF01seguro(BigDecimal f01seguro) {
		this.f01seguro = f01seguro;
	}
	public BigDecimal getF01notros() {
		return f01notros;
	}
	public void setF01notros(BigDecimal f01notros) {
		this.f01notros = f01notros;
	}
	public BigDecimal getF01valpre() {
		return f01valpre;
	}
	public void setF01valpre(BigDecimal f01valpre) {
		this.f01valpre = f01valpre;
	}
	public BigDecimal getF01valjur() {
		return f01valjur;
	}
	public void setF01valjur(BigDecimal f01valjur) {
		this.f01valjur = f01valjur;
	}
	public BigDecimal getF01valges() {
		return f01valges;
	}
	public void setF01valges(BigDecimal f01valges) {
		this.f01valges = f01valges;
	}
	public Integer getF01feccasAux() {
		return f01feccasAux;
	}
	public void setF01feccasAux(Integer f01feccasAux) {
		this.f01feccasAux = f01feccasAux;
	}
	public Date getF01feccas() {
		return f01feccas;
	}
	public void setF01feccas(Date f01feccas) {
		this.f01feccas = f01feccas;
	}
	

}
