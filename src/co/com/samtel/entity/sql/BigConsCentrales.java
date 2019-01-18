package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CONS_CENTRALES", schema = "dbo")
public class BigConsCentrales implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigConsCentralesId id;
	
	@Column(name = "i_tipo_identificacion")
	private String crctip;
	
	@Column(name = "s_numero_identificacion")
	private String crcnid;
	
	@Column(name = "i_num_consulta")
	private String crcncn;
	
	@Column(name = "i_estado_consulta")
	private String crcecn;
	
	@Column(name = "d_fecha_consulta_central")
	private Date crcfcn;
	
	@Column(name = "s_resp_central")
	private String crccrc;
	
	@Column(name = "s_cod_producto")
	private String crcspr;
	
	@Column(name = "m_monto")
	private BigDecimal crcmon;
	
	@Column(name = "i_plazo")
	private Integer crcpla;
	
	@Column(name = "i_estado_solicitud")
	private String crceso;
	
	@Column(name = "s_causal_devolucion_1")
	private String crcde1;
	
	@Column(name = "s_causal_devolucion_2")
	private String crcde2;
	
	@Column(name = "s_causal_devolucion_3")
	private String crcde3;
	
	@Column(name = "d_fecha_corte")
	private Date crfecc;
	
	@Column(name = "i_nro_credito")
	private Long crcncr;
	
	@Column(name = "i_codigo_asesor")
	private String crccas;
	
	@Column(name = "s_requiere_visita")
	private String crcevi;

	public BigConsCentralesId getId() {
		return id;
	}

	public void setId(BigConsCentralesId id) {
		this.id = id;
	}

	public String getCrctip() {
		return crctip;
	}

	public void setCrctip(String crctip) {
		this.crctip = crctip;
	}

	public String getCrcnid() {
		return crcnid;
	}

	public void setCrcnid(String crcnid) {
		this.crcnid = crcnid;
	}

	public String getCrcncn() {
		return crcncn;
	}

	public void setCrcncn(String crcncn) {
		this.crcncn = crcncn;
	}

	public String getCrcecn() {
		return crcecn;
	}

	public void setCrcecn(String crcecn) {
		this.crcecn = crcecn;
	}

	public Date getCrcfcn() {
		return crcfcn;
	}

	public void setCrcfcn(Date crcfcn) {
		this.crcfcn = crcfcn;
	}

	public String getCrccrc() {
		return crccrc;
	}

	public void setCrccrc(String crccrc) {
		this.crccrc = crccrc;
	}

	public String getCrcspr() {
		return crcspr;
	}

	public void setCrcspr(String crcspr) {
		this.crcspr = crcspr;
	}

	public BigDecimal getCrcmon() {
		return crcmon;
	}

	public void setCrcmon(BigDecimal crcmon) {
		this.crcmon = crcmon;
	}

	public Integer getCrcpla() {
		return crcpla;
	}

	public void setCrcpla(Integer crcpla) {
		this.crcpla = crcpla;
	}

	public String getCrceso() {
		return crceso;
	}

	public void setCrceso(String crceso) {
		this.crceso = crceso;
	}

	public String getCrcde1() {
		return crcde1;
	}

	public void setCrcde1(String crcde1) {
		this.crcde1 = crcde1;
	}

	public String getCrcde2() {
		return crcde2;
	}

	public void setCrcde2(String crcde2) {
		this.crcde2 = crcde2;
	}

	public String getCrcde3() {
		return crcde3;
	}

	public void setCrcde3(String crcde3) {
		this.crcde3 = crcde3;
	}

	public Date getCrfecc() {
		return crfecc;
	}

	public void setCrfecc(Date crfecc) {
		this.crfecc = crfecc;
	}

	public Long getCrcncr() {
		return crcncr;
	}

	public void setCrcncr(Long crcncr) {
		this.crcncr = crcncr;
	}

	public String getCrccas() {
		return crccas;
	}

	public void setCrccas(String crccas) {
		this.crccas = crccas;
	}

	public String getCrcevi() {
		return crcevi;
	}

	public void setCrcevi(String crcevi) {
		this.crcevi = crcevi;
	}
	

}
