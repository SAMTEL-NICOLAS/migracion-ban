package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CRM1414F", schema = "DAMCYFILES")
public class BigActivoConsolidadoAs implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActivoConsolidadoIdAs id;
	
	@Column(name = "fecha_cort")
	private Integer fecha_cortAux;
	
	@Column(name = "mod_credit")
	private String mod_credit;	
	
	@Column(name = "cant_provi")
	private Short cant_provi;	
	
	@Column(name = "otorga_mes")
	private Integer otorga_mes;	
	
	@Column(name = "monto_otrg")
	private BigDecimal monto_otrg;
	
	@Column(name = "monto_cupo")
	private BigDecimal monto_cupo;
	
	@Column(name = "saldo_cort")
	private BigDecimal saldo_cort;
	
	@Column(name = "nr_can_mes")
	private Integer nr_can_mes;
	
	@Column(name = "tasa_int")
	private BigDecimal tasa_int;
	
	@Column(name = "nro_cast_m")
	private Integer nro_cast_m;
	
	@Column(name = "plazo_prom")
	private Integer plazo_prom;
	
	@Column(name = "nro_cred_v")
	private Short nro_cred_v;
	
	@Column(name = "nro_sol_cr")
	private Integer nro_sol_cr;
	
	@Column(name = "nro_cred_a")
	private Integer nro_cred_a;
	
	@Column(name = "nro_cred_r")
	private Integer nro_cred_r;

	@Column(name = "migrar")
	private String migrado;
	
	public BigActivoConsolidadoIdAs getId() {
		return id;
	}

	public void setId(BigActivoConsolidadoIdAs id) {
		this.id = id;
	}

	public Integer getFecha_cortAux() {
		return fecha_cortAux;
	}

	public void setFecha_cortAux(Integer fecha_cortAux) {
		this.fecha_cortAux = fecha_cortAux;
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

	public Integer getPlazo_prom() {
		return plazo_prom;
	}

	public void setPlazo_prom(Integer plazo_prom) {
		this.plazo_prom = plazo_prom;
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

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
