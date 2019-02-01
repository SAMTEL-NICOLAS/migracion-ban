package co.com.samtel.entity.manual.csv;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Big Desendeudese")
public class BigDesendeudeseCsv1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigDesendeudeseIdCsv id;

	@Column(name = "i_tipo_documento")
	private String i_tipo_documento;

	@Column(name = "s_identificacion_cliente")
	private String s_identificacion_cliente;

	@Column(name = "i_fuerza_comercial")
	private String i_fuerza_comercial;

	@Column(name = "i_oficina")
	private String i_oficina;

	@Column(name = "i_creditos_ccial")
	private Integer i_creditos_ccial;

	@Column(name = "m_vlr_desem_ccial")
	private BigDecimal m_vlr_desem_ccial;

	@Column(name = "m_vlr_saldo_ccial")
	private BigDecimal m_vlr_saldo_ccial;

	@Column(name = "m_vlr_cuota_ccial")
	private BigDecimal m_vlr_cuota_ccial;

	@Column(name = "i_plazo_ccial")
	private Integer i_plazo_ccial;

	@Column(name = "m_tnmv_ccial")
	private BigDecimal m_tnmv_ccial;

	@Column(name = "m_tna_ccial")
	private BigDecimal m_tna_ccial;

	@Column(name = "i_tea_ccial")
	private Integer i_tea_ccial;

	@Column(name = "i_creditos_cons")
	private Integer i_creditos_cons;

	@Column(name = "m_vlr_desem_cons")
	private BigDecimal m_vlr_desem_cons;

	@Column(name = "m_vlr_saldo_cons")
	private BigDecimal m_vlr_saldo_cons;

	@Column(name = "m_vlr_cuota_cons")
	private BigDecimal m_vlr_cuota_cons;

	@Column(name = "i_plazo_cons")
	private Integer i_plazo_cons;

	@Column(name = "m_tnmv_cons")
	private BigDecimal m_tnmv_cons;

	@Column(name = "m_tna_cons")
	private BigDecimal m_tna_cons;

	@Column(name = "m_tea_cons")
	private BigDecimal m_tea_cons;

	@Column(name = "i_creditos_micro")
	private Integer i_creditos_micro;

	@Column(name = "m_vlr_desem_micro")
	private BigDecimal m_vlr_desem_micro;

	@Column(name = "m_vlr_saldo_micro")
	private BigDecimal m_vlr_saldo_micro;

	@Column(name = "m_vlr_cuota_micro")
	private BigDecimal m_vlr_cuota_micro;

	@Column(name = "i_plazo_micro")
	private Integer i_plazo_micro;

	@Column(name = "m_tnmv_micro")
	private BigDecimal m_tnmv_micro;

	@Column(name = "m_tna_micro")
	private BigDecimal m_tna_micro;

	@Column(name = "m_tea_micro")
	private BigDecimal m_tea_micro;

	@Column(name = "i_total_cred")
	private Integer i_total_cred;

	@Column(name = "m_suma_vlr_cred")
	private BigDecimal m_suma_vlr_cred;

	@Column(name = "m_monto_ccial")
	private BigDecimal m_monto_ccial;

	@Column(name = "m_monto_cons")
	private BigDecimal m_monto_cons;

	@Column(name = "m_monto_micro")
	private BigDecimal m_monto_micro;

	@Column(name = "m_saldo_recoger")
	private BigDecimal m_saldo_recoger;

	@Column(name = "i_cred_ccial_otras")
	private Integer i_cred_ccial_otras;

	@Column(name = "m_vlr_desem_ccial_otras")
	private BigDecimal m_vlr_desem_ccial_otras;

	@Column(name = "m_saldos_cap_ccial_otras")
	private BigDecimal m_saldos_cap_ccial_otras;

	@Column(name = "m_vlr_cuota_ccial_otras")
	private BigDecimal m_vlr_cuota_ccial_otras;

	@Column(name = "i_plazo_ccia_otras")
	private Integer i_plazo_ccia_otras;

	@Column(name = "i_plazo_pagar_otras")
	private Integer i_plazo_pagar_otras;

	@Column(name = "m_tnmv_ccia_otras")
	private BigDecimal m_tnmv_ccia_otras;

	@Column(name = "m_tna_ccial_otras")
	private BigDecimal m_tna_ccial_otras;

	@Column(name = "m_tea_ccial_otras")
	private BigDecimal m_tea_ccial_otras;

	@Column(name = "i_cred_cons_otras")
	private Integer i_cred_cons_otras;

	@Column(name = "m_vlr_desem_cons_otras")
	private BigDecimal m_vlr_desem_cons_otras;

	@Column(name = "m_saldos_cap_cons_otras")
	private BigDecimal m_saldos_cap_cons_otras;

	@Column(name = "m_vlr_cuota_cons_otras")
	private BigDecimal m_vlr_cuota_cons_otras;

	@Column(name = "i_plazo_con_otras")
	private Integer i_plazo_con_otras;

	@Column(name = "i_plazo_pag_cons_otr")
	private Integer i_plazo_pag_cons_otr;

	@Column(name = "m_tnmv_cons_otras")
	private BigDecimal m_tnmv_cons_otras;

	@Column(name = "m_tna_cons_otras")
	private BigDecimal m_tna_cons_otras;

	@Column(name = "m_tea_cons_otras")
	private BigDecimal m_tea_cons_otras;

	@Column(name = "i_cred_micro_otras")
	private Integer i_cred_micro_otras;

	@Column(name = "m_vlr_desem_micro_otras")
	private BigDecimal m_vlr_desem_micro_otras;

	@Column(name = "m_saldo_cap_micro_otras")
	private BigDecimal m_saldo_cap_micro_otras;

	@Column(name = "m_cuota_micro_otras")
	private BigDecimal m_cuota_micro_otras;

	@Column(name = "i_plazo_micro_otras")
	private Integer i_plazo_micro_otras;

	@Column(name = "i_plazo_pend_micro_otras")
	private Integer i_plazo_pend_micro_otras;

	@Column(name = "m_tnmv_micro_otras")
	private BigDecimal m_tnmv_micro_otras;

	@Column(name = "m_tna_micro_otras")
	private BigDecimal m_tna_micro_otras;

	@Column(name = "m_tea_micro_otras")
	private BigDecimal m_tea_micro_otras;

	@Column(name = "i_tot_cred_otras")
	private Integer i_tot_cred_otras;

	@Column(name = "i_tot_ent_otras")
	private Integer i_tot_ent_otras;

	@Column(name = "m_suma_vlr_cred_otras")
	private BigDecimal m_suma_vlr_cred_otras;

	@Column(name = "m_monto_ccia_otras")
	private BigDecimal m_monto_ccia_otras;

	@Column(name = "m_monto_cons_otras")
	private BigDecimal m_monto_cons_otras;

	@Column(name = "m_monto_micro_otras")
	private BigDecimal m_monto_micro_otras;

	@Column(name = "m_saldo_ent_1_otras")
	private BigDecimal m_saldo_ent_1_otras;

	@Column(name = "m_saldo_ent_2_otras")
	private BigDecimal m_saldo_ent_2_otras;

	@Column(name = "m_saldo_ent_3_otras")
	private BigDecimal m_saldo_ent_3_otras;

	@Column(name = "m_saldo_ent_4_otras")
	private BigDecimal m_saldo_ent_4_otras;

	@Column(name = "m_saldo_ent_5_otras")
	private BigDecimal m_saldo_ent_5_otras;

	@Column(name = "m_saldo_recoger_otras")
	private BigDecimal m_saldo_recoger_otras;

	@Column(name = "m_total_creditos")
	private BigDecimal m_total_creditos;

	@Column(name = "m_suma_creditos")
	private BigDecimal m_suma_creditos;

	@Column(name = "m_monto_ccial_otros")
	private BigDecimal m_monto_ccial_otros;

	@Column(name = "m_monto_cons_otros")
	private BigDecimal m_monto_cons_otros;

	@Column(name = "m_monto_micro_otros")
	private BigDecimal m_monto_micro_otros;

	@Column(name = "m_valor_recoger_otros")
	private BigDecimal m_valor_recoger_otros;

	@Column(name = "m_oferta_ccial_3_veces")
	private BigDecimal m_oferta_ccial_3_veces;

	@Column(name = "m_oferta_cons_3_veces")
	private BigDecimal m_oferta_cons_3_veces;

	@Column(name = "m_oferta_micro_3_veces")
	private BigDecimal m_oferta_micro_3_veces;

	@Column(name = "s_modalidad")
	private String s_modalidad;

	@Column(name = "m_vlr_desembolso")
	private BigDecimal m_vlr_desembolso;

	@Column(name = "m_vlr_max_prestar")
	private BigDecimal m_vlr_max_prestar;

	@Column(name = "m_tnmv")
	private BigDecimal m_tnmv;

	@Column(name = "m_tna")
	private BigDecimal m_tna;

	@Column(name = "m_tea")
	private BigDecimal m_tea;

	@Column(name = "i_plazo")
	private Integer i_plazo;

	@Column(name = "m_vlr_tot_cuot_actual")
	private BigDecimal m_vlr_tot_cuot_actual;

	@Column(name = "m_cuota_pagar")
	private BigDecimal m_cuota_pagar;

	@Column(name = "m_cuota_pag_vs_cuot_actual")
	private BigDecimal m_cuota_pag_vs_cuot_actual;

	@Column(name = "m_cuot_pag_vlr_recoger")
	private BigDecimal m_cuot_pag_vlr_recoger;

	@Column(name = "m_cuota_pag_vs_cuot_act_rec")
	private BigDecimal m_cuota_pag_vs_cuot_act_rec;

	public BigDesendeudeseIdCsv getId() {
		return id;
	}

	public void setId(BigDesendeudeseIdCsv id) {
		this.id = id;
	}

	public String getI_tipo_documento() {
		return i_tipo_documento;
	}

	public void setI_tipo_documento(String i_tipo_documento) {
		this.i_tipo_documento = i_tipo_documento;
	}

	public String getS_identificacion_cliente() {
		return s_identificacion_cliente;
	}

	public void setS_identificacion_cliente(String s_identificacion_cliente) {
		this.s_identificacion_cliente = s_identificacion_cliente;
	}

	public String getI_fuerza_comercial() {
		return i_fuerza_comercial;
	}

	public void setI_fuerza_comercial(String i_fuerza_comercial) {
		this.i_fuerza_comercial = i_fuerza_comercial;
	}

	public String getI_oficina() {
		return i_oficina;
	}

	public void setI_oficina(String i_oficina) {
		this.i_oficina = i_oficina;
	}

	public Integer getI_creditos_ccial() {
		return i_creditos_ccial;
	}

	public void setI_creditos_ccial(Integer i_creditos_ccial) {
		this.i_creditos_ccial = i_creditos_ccial;
	}

	public BigDecimal getM_vlr_desem_ccial() {
		return m_vlr_desem_ccial;
	}

	public void setM_vlr_desem_ccial(BigDecimal m_vlr_desem_ccial) {
		this.m_vlr_desem_ccial = m_vlr_desem_ccial;
	}

	public BigDecimal getM_vlr_saldo_ccial() {
		return m_vlr_saldo_ccial;
	}

	public void setM_vlr_saldo_ccial(BigDecimal m_vlr_saldo_ccial) {
		this.m_vlr_saldo_ccial = m_vlr_saldo_ccial;
	}

	public BigDecimal getM_vlr_cuota_ccial() {
		return m_vlr_cuota_ccial;
	}

	public void setM_vlr_cuota_ccial(BigDecimal m_vlr_cuota_ccial) {
		this.m_vlr_cuota_ccial = m_vlr_cuota_ccial;
	}

	public Integer getI_plazo_ccial() {
		return i_plazo_ccial;
	}

	public void setI_plazo_ccial(Integer i_plazo_ccial) {
		this.i_plazo_ccial = i_plazo_ccial;
	}

	public BigDecimal getM_tnmv_ccial() {
		return m_tnmv_ccial;
	}

	public void setM_tnmv_ccial(BigDecimal m_tnmv_ccial) {
		this.m_tnmv_ccial = m_tnmv_ccial;
	}

	public BigDecimal getM_tna_ccial() {
		return m_tna_ccial;
	}

	public void setM_tna_ccial(BigDecimal m_tna_ccial) {
		this.m_tna_ccial = m_tna_ccial;
	}

	public Integer getI_tea_ccial() {
		return i_tea_ccial;
	}

	public void setI_tea_ccial(Integer i_tea_ccial) {
		this.i_tea_ccial = i_tea_ccial;
	}

	public Integer getI_creditos_cons() {
		return i_creditos_cons;
	}

	public void setI_creditos_cons(Integer i_creditos_cons) {
		this.i_creditos_cons = i_creditos_cons;
	}

	public BigDecimal getM_vlr_desem_cons() {
		return m_vlr_desem_cons;
	}

	public void setM_vlr_desem_cons(BigDecimal m_vlr_desem_cons) {
		this.m_vlr_desem_cons = m_vlr_desem_cons;
	}

	public BigDecimal getM_vlr_saldo_cons() {
		return m_vlr_saldo_cons;
	}

	public void setM_vlr_saldo_cons(BigDecimal m_vlr_saldo_cons) {
		this.m_vlr_saldo_cons = m_vlr_saldo_cons;
	}

	public BigDecimal getM_vlr_cuota_cons() {
		return m_vlr_cuota_cons;
	}

	public void setM_vlr_cuota_cons(BigDecimal m_vlr_cuota_cons) {
		this.m_vlr_cuota_cons = m_vlr_cuota_cons;
	}

	public Integer getI_plazo_cons() {
		return i_plazo_cons;
	}

	public void setI_plazo_cons(Integer i_plazo_cons) {
		this.i_plazo_cons = i_plazo_cons;
	}

	public BigDecimal getM_tnmv_cons() {
		return m_tnmv_cons;
	}

	public void setM_tnmv_cons(BigDecimal m_tnmv_cons) {
		this.m_tnmv_cons = m_tnmv_cons;
	}

	public BigDecimal getM_tna_cons() {
		return m_tna_cons;
	}

	public void setM_tna_cons(BigDecimal m_tna_cons) {
		this.m_tna_cons = m_tna_cons;
	}

	public BigDecimal getM_tea_cons() {
		return m_tea_cons;
	}

	public void setM_tea_cons(BigDecimal m_tea_cons) {
		this.m_tea_cons = m_tea_cons;
	}

	public Integer getI_creditos_micro() {
		return i_creditos_micro;
	}

	public void setI_creditos_micro(Integer i_creditos_micro) {
		this.i_creditos_micro = i_creditos_micro;
	}

	public BigDecimal getM_vlr_desem_micro() {
		return m_vlr_desem_micro;
	}

	public void setM_vlr_desem_micro(BigDecimal m_vlr_desem_micro) {
		this.m_vlr_desem_micro = m_vlr_desem_micro;
	}

	public BigDecimal getM_vlr_saldo_micro() {
		return m_vlr_saldo_micro;
	}

	public void setM_vlr_saldo_micro(BigDecimal m_vlr_saldo_micro) {
		this.m_vlr_saldo_micro = m_vlr_saldo_micro;
	}

	public BigDecimal getM_vlr_cuota_micro() {
		return m_vlr_cuota_micro;
	}

	public void setM_vlr_cuota_micro(BigDecimal m_vlr_cuota_micro) {
		this.m_vlr_cuota_micro = m_vlr_cuota_micro;
	}

	public Integer getI_plazo_micro() {
		return i_plazo_micro;
	}

	public void setI_plazo_micro(Integer i_plazo_micro) {
		this.i_plazo_micro = i_plazo_micro;
	}

	public BigDecimal getM_tnmv_micro() {
		return m_tnmv_micro;
	}

	public void setM_tnmv_micro(BigDecimal m_tnmv_micro) {
		this.m_tnmv_micro = m_tnmv_micro;
	}

	public BigDecimal getM_tna_micro() {
		return m_tna_micro;
	}

	public void setM_tna_micro(BigDecimal m_tna_micro) {
		this.m_tna_micro = m_tna_micro;
	}

	public BigDecimal getM_tea_micro() {
		return m_tea_micro;
	}

	public void setM_tea_micro(BigDecimal m_tea_micro) {
		this.m_tea_micro = m_tea_micro;
	}

	public Integer getI_total_cred() {
		return i_total_cred;
	}

	public void setI_total_cred(Integer i_total_cred) {
		this.i_total_cred = i_total_cred;
	}

	public BigDecimal getM_suma_vlr_cred() {
		return m_suma_vlr_cred;
	}

	public void setM_suma_vlr_cred(BigDecimal m_suma_vlr_cred) {
		this.m_suma_vlr_cred = m_suma_vlr_cred;
	}

	public BigDecimal getM_monto_ccial() {
		return m_monto_ccial;
	}

	public void setM_monto_ccial(BigDecimal m_monto_ccial) {
		this.m_monto_ccial = m_monto_ccial;
	}

	public BigDecimal getM_monto_cons() {
		return m_monto_cons;
	}

	public void setM_monto_cons(BigDecimal m_monto_cons) {
		this.m_monto_cons = m_monto_cons;
	}

	public BigDecimal getM_monto_micro() {
		return m_monto_micro;
	}

	public void setM_monto_micro(BigDecimal m_monto_micro) {
		this.m_monto_micro = m_monto_micro;
	}

	public BigDecimal getM_saldo_recoger() {
		return m_saldo_recoger;
	}

	public void setM_saldo_recoger(BigDecimal m_saldo_recoger) {
		this.m_saldo_recoger = m_saldo_recoger;
	}

	public Integer getI_cred_ccial_otras() {
		return i_cred_ccial_otras;
	}

	public void setI_cred_ccial_otras(Integer i_cred_ccial_otras) {
		this.i_cred_ccial_otras = i_cred_ccial_otras;
	}

	public BigDecimal getM_vlr_desem_ccial_otras() {
		return m_vlr_desem_ccial_otras;
	}

	public void setM_vlr_desem_ccial_otras(BigDecimal m_vlr_desem_ccial_otras) {
		this.m_vlr_desem_ccial_otras = m_vlr_desem_ccial_otras;
	}

	public BigDecimal getM_saldos_cap_ccial_otras() {
		return m_saldos_cap_ccial_otras;
	}

	public void setM_saldos_cap_ccial_otras(BigDecimal m_saldos_cap_ccial_otras) {
		this.m_saldos_cap_ccial_otras = m_saldos_cap_ccial_otras;
	}

	public BigDecimal getM_vlr_cuota_ccial_otras() {
		return m_vlr_cuota_ccial_otras;
	}

	public void setM_vlr_cuota_ccial_otras(BigDecimal m_vlr_cuota_ccial_otras) {
		this.m_vlr_cuota_ccial_otras = m_vlr_cuota_ccial_otras;
	}

	public Integer getI_plazo_ccia_otras() {
		return i_plazo_ccia_otras;
	}

	public void setI_plazo_ccia_otras(Integer i_plazo_ccia_otras) {
		this.i_plazo_ccia_otras = i_plazo_ccia_otras;
	}

	public Integer getI_plazo_pagar_otras() {
		return i_plazo_pagar_otras;
	}

	public void setI_plazo_pagar_otras(Integer i_plazo_pagar_otras) {
		this.i_plazo_pagar_otras = i_plazo_pagar_otras;
	}

	public BigDecimal getM_tnmv_ccia_otras() {
		return m_tnmv_ccia_otras;
	}

	public void setM_tnmv_ccia_otras(BigDecimal m_tnmv_ccia_otras) {
		this.m_tnmv_ccia_otras = m_tnmv_ccia_otras;
	}

	public BigDecimal getM_tna_ccial_otras() {
		return m_tna_ccial_otras;
	}

	public void setM_tna_ccial_otras(BigDecimal m_tna_ccial_otras) {
		this.m_tna_ccial_otras = m_tna_ccial_otras;
	}

	public BigDecimal getM_tea_ccial_otras() {
		return m_tea_ccial_otras;
	}

	public void setM_tea_ccial_otras(BigDecimal m_tea_ccial_otras) {
		this.m_tea_ccial_otras = m_tea_ccial_otras;
	}

	public Integer getI_cred_cons_otras() {
		return i_cred_cons_otras;
	}

	public void setI_cred_cons_otras(Integer i_cred_cons_otras) {
		this.i_cred_cons_otras = i_cred_cons_otras;
	}

	public BigDecimal getM_vlr_desem_cons_otras() {
		return m_vlr_desem_cons_otras;
	}

	public void setM_vlr_desem_cons_otras(BigDecimal m_vlr_desem_cons_otras) {
		this.m_vlr_desem_cons_otras = m_vlr_desem_cons_otras;
	}

	public BigDecimal getM_saldos_cap_cons_otras() {
		return m_saldos_cap_cons_otras;
	}

	public void setM_saldos_cap_cons_otras(BigDecimal m_saldos_cap_cons_otras) {
		this.m_saldos_cap_cons_otras = m_saldos_cap_cons_otras;
	}

	public BigDecimal getM_vlr_cuota_cons_otras() {
		return m_vlr_cuota_cons_otras;
	}

	public void setM_vlr_cuota_cons_otras(BigDecimal m_vlr_cuota_cons_otras) {
		this.m_vlr_cuota_cons_otras = m_vlr_cuota_cons_otras;
	}

	public Integer getI_plazo_con_otras() {
		return i_plazo_con_otras;
	}

	public void setI_plazo_con_otras(Integer i_plazo_con_otras) {
		this.i_plazo_con_otras = i_plazo_con_otras;
	}

	public Integer getI_plazo_pag_cons_otr() {
		return i_plazo_pag_cons_otr;
	}

	public void setI_plazo_pag_cons_otr(Integer i_plazo_pag_cons_otr) {
		this.i_plazo_pag_cons_otr = i_plazo_pag_cons_otr;
	}

	public BigDecimal getM_tnmv_cons_otras() {
		return m_tnmv_cons_otras;
	}

	public void setM_tnmv_cons_otras(BigDecimal m_tnmv_cons_otras) {
		this.m_tnmv_cons_otras = m_tnmv_cons_otras;
	}

	public BigDecimal getM_tna_cons_otras() {
		return m_tna_cons_otras;
	}

	public void setM_tna_cons_otras(BigDecimal m_tna_cons_otras) {
		this.m_tna_cons_otras = m_tna_cons_otras;
	}

	public BigDecimal getM_tea_cons_otras() {
		return m_tea_cons_otras;
	}

	public void setM_tea_cons_otras(BigDecimal m_tea_cons_otras) {
		this.m_tea_cons_otras = m_tea_cons_otras;
	}

	public Integer getI_cred_micro_otras() {
		return i_cred_micro_otras;
	}

	public void setI_cred_micro_otras(Integer i_cred_micro_otras) {
		this.i_cred_micro_otras = i_cred_micro_otras;
	}

	public BigDecimal getM_vlr_desem_micro_otras() {
		return m_vlr_desem_micro_otras;
	}

	public void setM_vlr_desem_micro_otras(BigDecimal m_vlr_desem_micro_otras) {
		this.m_vlr_desem_micro_otras = m_vlr_desem_micro_otras;
	}

	public BigDecimal getM_saldo_cap_micro_otras() {
		return m_saldo_cap_micro_otras;
	}

	public void setM_saldo_cap_micro_otras(BigDecimal m_saldo_cap_micro_otras) {
		this.m_saldo_cap_micro_otras = m_saldo_cap_micro_otras;
	}

	public BigDecimal getM_cuota_micro_otras() {
		return m_cuota_micro_otras;
	}

	public void setM_cuota_micro_otras(BigDecimal m_cuota_micro_otras) {
		this.m_cuota_micro_otras = m_cuota_micro_otras;
	}

	public Integer getI_plazo_micro_otras() {
		return i_plazo_micro_otras;
	}

	public void setI_plazo_micro_otras(Integer i_plazo_micro_otras) {
		this.i_plazo_micro_otras = i_plazo_micro_otras;
	}

	public Integer getI_plazo_pend_micro_otras() {
		return i_plazo_pend_micro_otras;
	}

	public void setI_plazo_pend_micro_otras(Integer i_plazo_pend_micro_otras) {
		this.i_plazo_pend_micro_otras = i_plazo_pend_micro_otras;
	}

	public BigDecimal getM_tnmv_micro_otras() {
		return m_tnmv_micro_otras;
	}

	public void setM_tnmv_micro_otras(BigDecimal m_tnmv_micro_otras) {
		this.m_tnmv_micro_otras = m_tnmv_micro_otras;
	}

	public BigDecimal getM_tna_micro_otras() {
		return m_tna_micro_otras;
	}

	public void setM_tna_micro_otras(BigDecimal m_tna_micro_otras) {
		this.m_tna_micro_otras = m_tna_micro_otras;
	}

	public BigDecimal getM_tea_micro_otras() {
		return m_tea_micro_otras;
	}

	public void setM_tea_micro_otras(BigDecimal m_tea_micro_otras) {
		this.m_tea_micro_otras = m_tea_micro_otras;
	}

	public Integer getI_tot_cred_otras() {
		return i_tot_cred_otras;
	}

	public void setI_tot_cred_otras(Integer i_tot_cred_otras) {
		this.i_tot_cred_otras = i_tot_cred_otras;
	}

	public Integer getI_tot_ent_otras() {
		return i_tot_ent_otras;
	}

	public void setI_tot_ent_otras(Integer i_tot_ent_otras) {
		this.i_tot_ent_otras = i_tot_ent_otras;
	}

	public BigDecimal getM_suma_vlr_cred_otras() {
		return m_suma_vlr_cred_otras;
	}

	public void setM_suma_vlr_cred_otras(BigDecimal m_suma_vlr_cred_otras) {
		this.m_suma_vlr_cred_otras = m_suma_vlr_cred_otras;
	}

	public BigDecimal getM_monto_ccia_otras() {
		return m_monto_ccia_otras;
	}

	public void setM_monto_ccia_otras(BigDecimal m_monto_ccia_otras) {
		this.m_monto_ccia_otras = m_monto_ccia_otras;
	}

	public BigDecimal getM_monto_cons_otras() {
		return m_monto_cons_otras;
	}

	public void setM_monto_cons_otras(BigDecimal m_monto_cons_otras) {
		this.m_monto_cons_otras = m_monto_cons_otras;
	}

	public BigDecimal getM_monto_micro_otras() {
		return m_monto_micro_otras;
	}

	public void setM_monto_micro_otras(BigDecimal m_monto_micro_otras) {
		this.m_monto_micro_otras = m_monto_micro_otras;
	}

	public BigDecimal getM_saldo_ent_1_otras() {
		return m_saldo_ent_1_otras;
	}

	public void setM_saldo_ent_1_otras(BigDecimal m_saldo_ent_1_otras) {
		this.m_saldo_ent_1_otras = m_saldo_ent_1_otras;
	}

	public BigDecimal getM_saldo_ent_2_otras() {
		return m_saldo_ent_2_otras;
	}

	public void setM_saldo_ent_2_otras(BigDecimal m_saldo_ent_2_otras) {
		this.m_saldo_ent_2_otras = m_saldo_ent_2_otras;
	}

	public BigDecimal getM_saldo_ent_3_otras() {
		return m_saldo_ent_3_otras;
	}

	public void setM_saldo_ent_3_otras(BigDecimal m_saldo_ent_3_otras) {
		this.m_saldo_ent_3_otras = m_saldo_ent_3_otras;
	}

	public BigDecimal getM_saldo_ent_4_otras() {
		return m_saldo_ent_4_otras;
	}

	public void setM_saldo_ent_4_otras(BigDecimal m_saldo_ent_4_otras) {
		this.m_saldo_ent_4_otras = m_saldo_ent_4_otras;
	}

	public BigDecimal getM_saldo_ent_5_otras() {
		return m_saldo_ent_5_otras;
	}

	public void setM_saldo_ent_5_otras(BigDecimal m_saldo_ent_5_otras) {
		this.m_saldo_ent_5_otras = m_saldo_ent_5_otras;
	}

	public BigDecimal getM_saldo_recoger_otras() {
		return m_saldo_recoger_otras;
	}

	public void setM_saldo_recoger_otras(BigDecimal m_saldo_recoger_otras) {
		this.m_saldo_recoger_otras = m_saldo_recoger_otras;
	}

	public BigDecimal getM_total_creditos() {
		return m_total_creditos;
	}

	public void setM_total_creditos(BigDecimal m_total_creditos) {
		this.m_total_creditos = m_total_creditos;
	}

	public BigDecimal getM_suma_creditos() {
		return m_suma_creditos;
	}

	public void setM_suma_creditos(BigDecimal m_suma_creditos) {
		this.m_suma_creditos = m_suma_creditos;
	}

	public BigDecimal getM_monto_ccial_otros() {
		return m_monto_ccial_otros;
	}

	public void setM_monto_ccial_otros(BigDecimal m_monto_ccial_otros) {
		this.m_monto_ccial_otros = m_monto_ccial_otros;
	}

	public BigDecimal getM_monto_cons_otros() {
		return m_monto_cons_otros;
	}

	public void setM_monto_cons_otros(BigDecimal m_monto_cons_otros) {
		this.m_monto_cons_otros = m_monto_cons_otros;
	}

	public BigDecimal getM_monto_micro_otros() {
		return m_monto_micro_otros;
	}

	public void setM_monto_micro_otros(BigDecimal m_monto_micro_otros) {
		this.m_monto_micro_otros = m_monto_micro_otros;
	}

	public BigDecimal getM_valor_recoger_otros() {
		return m_valor_recoger_otros;
	}

	public void setM_valor_recoger_otros(BigDecimal m_valor_recoger_otros) {
		this.m_valor_recoger_otros = m_valor_recoger_otros;
	}

	public BigDecimal getM_oferta_ccial_3_veces() {
		return m_oferta_ccial_3_veces;
	}

	public void setM_oferta_ccial_3_veces(BigDecimal m_oferta_ccial_3_veces) {
		this.m_oferta_ccial_3_veces = m_oferta_ccial_3_veces;
	}

	public BigDecimal getM_oferta_cons_3_veces() {
		return m_oferta_cons_3_veces;
	}

	public void setM_oferta_cons_3_veces(BigDecimal m_oferta_cons_3_veces) {
		this.m_oferta_cons_3_veces = m_oferta_cons_3_veces;
	}

	public BigDecimal getM_oferta_micro_3_veces() {
		return m_oferta_micro_3_veces;
	}

	public void setM_oferta_micro_3_veces(BigDecimal m_oferta_micro_3_veces) {
		this.m_oferta_micro_3_veces = m_oferta_micro_3_veces;
	}

	public String getS_modalidad() {
		return s_modalidad;
	}

	public void setS_modalidad(String s_modalidad) {
		this.s_modalidad = s_modalidad;
	}

	public BigDecimal getM_vlr_desembolso() {
		return m_vlr_desembolso;
	}

	public void setM_vlr_desembolso(BigDecimal m_vlr_desembolso) {
		this.m_vlr_desembolso = m_vlr_desembolso;
	}

	public BigDecimal getM_vlr_max_prestar() {
		return m_vlr_max_prestar;
	}

	public void setM_vlr_max_prestar(BigDecimal m_vlr_max_prestar) {
		this.m_vlr_max_prestar = m_vlr_max_prestar;
	}

	public BigDecimal getM_tnmv() {
		return m_tnmv;
	}

	public void setM_tnmv(BigDecimal m_tnmv) {
		this.m_tnmv = m_tnmv;
	}

	public BigDecimal getM_tna() {
		return m_tna;
	}

	public void setM_tna(BigDecimal m_tna) {
		this.m_tna = m_tna;
	}

	public BigDecimal getM_tea() {
		return m_tea;
	}

	public void setM_tea(BigDecimal m_tea) {
		this.m_tea = m_tea;
	}

	public Integer getI_plazo() {
		return i_plazo;
	}

	public void setI_plazo(Integer i_plazo) {
		this.i_plazo = i_plazo;
	}

	public BigDecimal getM_vlr_tot_cuot_actual() {
		return m_vlr_tot_cuot_actual;
	}

	public void setM_vlr_tot_cuot_actual(BigDecimal m_vlr_tot_cuot_actual) {
		this.m_vlr_tot_cuot_actual = m_vlr_tot_cuot_actual;
	}

	public BigDecimal getM_cuota_pagar() {
		return m_cuota_pagar;
	}

	public void setM_cuota_pagar(BigDecimal m_cuota_pagar) {
		this.m_cuota_pagar = m_cuota_pagar;
	}

	public BigDecimal getM_cuota_pag_vs_cuot_actual() {
		return m_cuota_pag_vs_cuot_actual;
	}

	public void setM_cuota_pag_vs_cuot_actual(BigDecimal m_cuota_pag_vs_cuot_actual) {
		this.m_cuota_pag_vs_cuot_actual = m_cuota_pag_vs_cuot_actual;
	}

	public BigDecimal getM_cuot_pag_vlr_recoger() {
		return m_cuot_pag_vlr_recoger;
	}

	public void setM_cuot_pag_vlr_recoger(BigDecimal m_cuot_pag_vlr_recoger) {
		this.m_cuot_pag_vlr_recoger = m_cuot_pag_vlr_recoger;
	}

	public BigDecimal getM_cuota_pag_vs_cuot_act_rec() {
		return m_cuota_pag_vs_cuot_act_rec;
	}

	public void setM_cuota_pag_vs_cuot_act_rec(BigDecimal m_cuota_pag_vs_cuot_act_rec) {
		this.m_cuota_pag_vs_cuot_act_rec = m_cuota_pag_vs_cuot_act_rec;
	}

}
