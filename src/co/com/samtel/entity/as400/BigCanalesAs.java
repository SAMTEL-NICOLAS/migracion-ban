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
@Table(name = "CRM1425F", schema = "DAMCYFILES")
public class BigCanalesAs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigCanalesIdAs id;
	
	@Column(name = "cod_produc")
	private String cod_produc;	
	
	@Column(name = "tim_transc")
	private Integer tim_transc;	

	@Column(name = "frec_uso_m")
	private Short frec_uso_m;	
	
	@Column(name = "frec_uso_d")
	private BigDecimal frec_uso_d;	
	
	@Column(name = "prm_mnt_um")
	private BigDecimal prm_mnt_um;	
	
	@Column(name = "prm_mnt_ud")
	private BigDecimal prm_mnt_ud;	
	
	@Column(name = "fecha_cort")
	private Integer fecha_cortAux;	
	@Transient
	private Date fecha_cort;
	
	@Column(name = "migrado")
	private String migrado;
	
	public BigCanalesIdAs getId() {
		return id;
	}
	public void setId(BigCanalesIdAs id) {
		this.id = id;
	}
	public String getCod_produc() {
		return cod_produc;
	}
	public void setCod_produc(String cod_produc) {
		this.cod_produc = cod_produc;
	}
	public Integer getTim_transc() {
		return tim_transc;
	}
	public void setTim_transc(Integer tim_transc) {
		this.tim_transc = tim_transc;
	}
	public Short getFrec_uso_m() {
		return frec_uso_m;
	}
	public void setFrec_uso_m(Short frec_uso_m) {
		this.frec_uso_m = frec_uso_m;
	}
	public BigDecimal getFrec_uso_d() {
		return frec_uso_d;
	}
	public void setFrec_uso_d(BigDecimal frec_uso_d) {
		this.frec_uso_d = frec_uso_d;
	}
	public BigDecimal getPrm_mnt_um() {
		return prm_mnt_um;
	}
	public void setPrm_mnt_um(BigDecimal prm_mnt_um) {
		this.prm_mnt_um = prm_mnt_um;
	}
	public BigDecimal getPrm_mnt_ud() {
		return prm_mnt_ud;
	}
	public void setPrm_mnt_ud(BigDecimal prm_mnt_ud) {
		this.prm_mnt_ud = prm_mnt_ud;
	}
	public Integer getFecha_cortAux() {
		return fecha_cortAux;
	}
	public void setFecha_cortAux(Integer fecha_cortAux) {
		this.fecha_cortAux = fecha_cortAux;
	}
	public Date getFecha_cort() {
		return fecha_cort;
	}
	public void setFecha_cort(Date fecha_cort) {
		this.fecha_cort = fecha_cort;
	}
	public String getMigrado() {
		return migrado;
	}
	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}		
	
}
