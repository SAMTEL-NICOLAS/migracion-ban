package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_ACTIVO_CONSOLIDADO", schema = "dbo")
public class BigActivoConsolidado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActivoConsolidadoId id;	
	
	@Column(name = "s_cod_tipo_producto")
	private String mod_credit;	
	
	@Column(name = "i_cant_producto_vigente")
	private Short cant_provi;	
	
	@Column(name = "i_cant_otorgados")
	private Integer otorga_mes;	
	
	@Column(name = "m_monto_otorgado")
	private BigDecimal monto_otrg;
	
	@Column(name = "m_cupo_otrogado")
	private BigDecimal monto_cupo;
	
	@Column(name = "m_saldo_corte")
	private BigDecimal saldo_cort;
	
	@Column(name = "i_cancelados_mes")
	private Integer nr_can_mes;
	
	@Column(name = "m_tasa_int_corr_actual")
	private BigDecimal tasa_int;
	
	@Column(name = "i_castigos_mes")
	private Integer nro_cast_m;
	
	@Column(name = "m_plazo_prom_cred_vigente")
	private BigDecimal plazo_prom;
	
	@Column(name = "i_credito_vencido_dia")
	private Short nro_cred_v;
	
	@Column(name = "i_radicadas_corte_wf")
	private Integer nro_sol_cr;
	
	@Column(name = "i_aprobadas_corte_wf")
	private Integer nro_cred_a;
	
	@Column(name = "i_rechazadas_mes_wf")
	private Integer nro_cred_r;

	public BigActivoConsolidadoId getId() {
		return id;
	}

	public void setId(BigActivoConsolidadoId id) {
		this.id = id;
	}

	public String getMod_credit() {
		return mod_credit;
	}

	public void setMod_credit(String mod_credit) {
		this.mod_credit = mod_credit;
	}

	public Short getCant_provi() {
		return cant_provi;
	}

	public void setCant_provi(Short cant_provi) {
		this.cant_provi = cant_provi;
	}

	public Integer getOtorga_mes() {
		return otorga_mes;
	}

	public void setOtorga_mes(Integer otorga_mes) {
		this.otorga_mes = otorga_mes;
	}
	
	public Integer getNr_can_mes() {
		return nr_can_mes;
	}

	public void setNr_can_mes(Integer nr_can_mes) {
		this.nr_can_mes = nr_can_mes;
	}

	public Integer getNro_cast_m() {
		return nro_cast_m;
	}

	public void setNro_cast_m(Integer nro_cast_m) {
		this.nro_cast_m = nro_cast_m;
	}


	public Short getNro_cred_v() {
		return nro_cred_v;
	}

	public void setNro_cred_v(Short nro_cred_v) {
		this.nro_cred_v = nro_cred_v;
	}

	public Integer getNro_sol_cr() {
		return nro_sol_cr;
	}

	public void setNro_sol_cr(Integer nro_sol_cr) {
		this.nro_sol_cr = nro_sol_cr;
	}

	public Integer getNro_cred_a() {
		return nro_cred_a;
	}

	public void setNro_cred_a(Integer nro_cred_a) {
		this.nro_cred_a = nro_cred_a;
	}

	public Integer getNro_cred_r() {
		return nro_cred_r;
	}

	public void setNro_cred_r(Integer nro_cred_r) {
		this.nro_cred_r = nro_cred_r;
	}

	public BigDecimal getMonto_otrg() {
		return monto_otrg;
	}

	public void setMonto_otrg(BigDecimal monto_otrg) {
		this.monto_otrg = monto_otrg;
	}

	public BigDecimal getMonto_cupo() {
		return monto_cupo;
	}

	public void setMonto_cupo(BigDecimal monto_cupo) {
		this.monto_cupo = monto_cupo;
	}

	public BigDecimal getSaldo_cort() {
		return saldo_cort;
	}

	public void setSaldo_cort(BigDecimal saldo_cort) {
		this.saldo_cort = saldo_cort;
	}

	public BigDecimal getTasa_int() {
		return tasa_int;
	}

	public void setTasa_int(BigDecimal tasa_int) {
		this.tasa_int = tasa_int;
	}

	public BigDecimal getPlazo_prom() {
		return plazo_prom;
	}

	public void setPlazo_prom(BigDecimal plazo_prom) {
		this.plazo_prom = plazo_prom;
	}	
	
	
}
