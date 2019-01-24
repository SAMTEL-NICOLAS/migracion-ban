package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_DESENDEUDESE", schema = "dbo")
public class BigDesendeudese implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigDesendeudeseId id;
	
	@Column(name = "i_tipo_documento")
	private Integer i_tipo_documento;	
	
	@Column(name = "s_identificacion_cliente")
	private String s_identificacion_cliente;	
	
	@Column(name = "i_fuerza_comercial")
	private Integer i_fuerza_comercial;	
	
	@Column(name = "i_oficina")
	private Integer i_oficina;	
	
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

	
	
	
	
	
	
	
	
	

}
