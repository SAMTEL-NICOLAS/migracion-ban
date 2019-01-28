package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_RECUPERA_CARTERA_CASTIGADA", schema="dmc")
public class BigRecuperaCarteraCastigada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigRecuperaCarteraCastigadaId id;
	
	@Column(name="d_fecha_pago")
	private Date f01fecpag;
	
	@Column(name = "s_forma_pago")
	private String f01tranar;
	
	@Column(name = "d_fecha_castigo")
	private Date f01feccas;

	@Column(name = "s_cod_producto")
	private String f01dscpro;	
	
	@Column(name = "m_saldo_capital")
	private BigDecimal f01valcap;	
	
	@Column(name = "m_corrientes")
	private BigDecimal f01intcor;
	
	@Column(name = "m_corrientes_contingente")
	private BigDecimal f01intctg;
	
	@Column(name = "m_mora_contingente")
	private BigDecimal f01morctg;
	
	@Column(name = "m_mora")
	private BigDecimal f01morcor;
	
	@Column(name = "m_accfun")
	private Short f01accfun;
		
	@Column(name = "m_mipyme")
	private BigDecimal f01mipyme;	
	
	@Column(name = "m_iva_mipyme")
	private BigDecimal f01ivampy ;	
	
	@Column(name = "m_fng")
	private BigDecimal f01fongar;
		
	@Column(name = "m_iva_fng")
	private BigDecimal f01ivafon;	
	
	@Column(name = "m_seguros_vida")
	private BigDecimal f01seguro;	
	
	@Column(name = "m_otros")
	private BigDecimal f01notros;
	
	@Column(name = "m_vlr_prejuridico")
	private BigDecimal f01valpre;
	
	@Column(name = "m_vlr_juridico")
	private BigDecimal f01valjur;
	
	@Column(name = "m_vlr_gestion")
	private BigDecimal f01valges;
		

	public BigRecuperaCarteraCastigadaId getId() {
		return id;
	}

	public void setId(BigRecuperaCarteraCastigadaId id) {
		this.id = id;
	}

	public Date getF01fecpag() {
		return f01fecpag;
	}

	public void setF01fecpag(Date f01fecpag) {
		this.f01fecpag = f01fecpag;
	}

	public String getF01tranar() {
		return f01tranar;
	}

	public void setF01tranar(String f01tranar) {
		this.f01tranar = f01tranar;
	}

	public Date getF01feccas() {
		return f01feccas;
	}

	public void setF01feccas(Date f01feccas) {
		this.f01feccas = f01feccas;
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

	public Short getF01accfun() {
		return f01accfun;
	}

	public void setF01accfun(Short f01accfun) {
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

	
	
}
