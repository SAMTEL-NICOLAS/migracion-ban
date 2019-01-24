package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CANALES", schema = "dbo")
public class BigCanales implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigCanalesId id;
	
	@Column(name = "s_codigo_producto")
	private String cod_produc;	
	
	@Column(name = "i_tiempo_uso_canal")
	private Integer tim_transc;	

	@Column(name = "i_frecuancia_uso_mensual")
	private Short frec_uso_m;	
	
	@Column(name = "i_frecuencia_uso_diario")
	private BigDecimal frec_uso_d;	
	
	@Column(name = "m_prom_uso_mensual")
	private BigDecimal prm_mnt_um;	
	
	@Column(name = "m_prom_uso_diario")
	private BigDecimal prm_mnt_ud;	
	
	@Column(name = "d_fecha_corte")
	private Date fecha_cort;

	public BigCanalesId getId() {
		return id;
	}

	public void setId(BigCanalesId id) {
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

	public Date getFecha_cort() {
		return fecha_cort;
	}

	public void setFecha_cort(Date fecha_cort) {
		this.fecha_cort = fecha_cort;
	}
}
