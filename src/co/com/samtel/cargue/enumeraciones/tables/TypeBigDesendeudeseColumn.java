package co.com.samtel.cargue.enumeraciones.tables;
import java.math.BigDecimal;


@SuppressWarnings("all")
public enum TypeBigDesendeudeseColumn implements IColumn {

	I_TIPO_DOCUMENTO(0,"I_tipo_documento",String.class),
	S_IDENTIFICACION_CLIENTE(1,"S_identificacion_cliente",String.class),
	I_CODIGO_CLIENTE(2,"I_codigo_cliente",Integer.class),
	I_FUERZA_COMERCIAL(3,"I_fuerza_comercial",String.class),
	I_OFICINA(4,"I_oficina",String.class),
	I_CREDITOS_CCIAL(5,"I_creditos_ccial",Integer.class),
	M_VLR_DESEM_CCIAL(6,"M_vlr_desem_ccial",BigDecimal.class),
	M_VLR_SALDO_CCIAL(7,"M_vlr_saldo_ccial",BigDecimal.class),
	M_VLR_CUOTA_CCIAL(8,"M_vlr_cuota_ccial",BigDecimal.class),
	I_PLAZO_CCIAL(9,"I_plazo_ccial",Integer.class),
	M_TNMV_CCIAL(10,"M_tnmv_ccial",BigDecimal.class),
	M_TNA_CCIAL(11,"M_tna_ccial",BigDecimal.class),
	I_TEA_CCIAL(12,"I_tea_ccial",Integer.class),
	I_CREDITOS_CONS(13,"I_creditos_cons",Integer.class),
	M_VLR_DESEM_CONS(14,"M_vlr_desem_cons",BigDecimal.class),
	M_VLR_SALDO_CONS(15,"M_vlr_saldo_cons",BigDecimal.class),
	M_VLR_CUOTA_CONS(16,"M_vlr_cuota_cons",BigDecimal.class),
	I_PLAZO_CONS(17,"I_plazo_cons",Integer.class),
	M_TNMV_CONS(18,"M_tnmv_cons",BigDecimal.class),
	M_TNA_CONS(19,"M_tna_cons",BigDecimal.class),
	M_TEA_CONS(20,"M_tea_cons",BigDecimal.class),
	I_CREDITOS_MICRO(21,"I_creditos_micro",Integer.class),
	M_VLR_DESEM_MICRO(22,"M_vlr_desem_micro",BigDecimal.class),
	M_VLR_SALDO_MICRO(23,"M_vlr_saldo_micro",BigDecimal.class),
	M_VLR_CUOTA_MICRO(24,"M_vlr_cuota_micro",BigDecimal.class),
	I_PLAZO_MICRO(25,"I_plazo_micro",Integer.class),
	M_TNMV_MICRO(26,"M_tnmv_micro",BigDecimal.class),
	M_TNA_MICRO(27,"M_tna_micro",BigDecimal.class),
	M_TEA_MICRO(28,"M_tea_micro",BigDecimal.class),
	I_TOTAL_CRED(29,"I_total_cred",Integer.class),
	M_SUMA_VLR_CRED(30,"M_suma_vlr_cred",BigDecimal.class),
	M_MONTO_CCIAL(31,"M_monto_ccial",BigDecimal.class),
	M_MONTO_CONS(32,"M_monto_cons",BigDecimal.class),
	M_MONTO_MICRO(33,"M_monto_micro",BigDecimal.class),
	M_SALDO_RECOGER(34,"M_saldo_recoger",BigDecimal.class),
	I_CRED_CCIAL_OTRAS(35,"I_cred_ccial_otras",Integer.class),
	M_VLR_DESEM_CCIAL_OTRAS(36,"M_vlr_desem_ccial_otras",BigDecimal.class),
	M_SALDOS_CAP_CCIAL_OTRAS(37,"M_saldos_cap_ccial_otras",BigDecimal.class),
	M_VLR_CUOTA_CCIAL_OTRAS(38,"M_vlr_cuota_ccial_otras",BigDecimal.class),
	I_PLAZO_CCIA_OTRAS(39,"I_plazo_ccia_otras",Integer.class),
	I_PLAZO_PAGAR_OTRAS(40,"I_plazo_pagar_otras",Integer.class),
	M_TNMV_CCIA_OTRAS(41,"M_tnmv_ccia_otras",BigDecimal.class),
	M_TEA_CCIAL_OTRAS(42,"M_tea_ccial_otras",BigDecimal.class),
	M_TNA_CCIAL_OTRAS(43,"M_tna_ccial_otras",BigDecimal.class),
	I_CRED_CONS_OTRAS(44,"I_cred_cons_otras",Integer.class),
	M_VLR_DESEM_CONS_OTRAS(45,"M_vlr_desem_cons_otras",BigDecimal.class),
	M_SALDOS_CAP_CONS_OTRAS(46,"M_saldos_cap_cons_otras",BigDecimal.class),
	M_VLR_CUOTA_CONS_OTRAS(47,"M_vlr_cuota_cons_otras",BigDecimal.class),
	I_PLAZO_CON_OTRAS(48,"I_plazo_con_otras",Integer.class),
	I_PLAZO_PAG_CONS_OTR(49,"I_plazo_pag_cons_otr",Integer.class),
	M_TNMV_CONS_OTRAS(50,"M_tnmv_cons_otras",BigDecimal.class),
	M_TNA_CONS_OTRAS(51,"M_tna_cons_otras",BigDecimal.class),
	M_TEA_CONS_OTRAS(52,"M_tea_cons_otras",BigDecimal.class),
	I_CRED_MICRO_OTRAS(53,"I_cred_micro_otras",Integer.class),
	M_VLR_DESEM_MICRO_OTRAS(54,"M_vlr_desem_micro_otras",BigDecimal.class),
	M_SALDO_CAP_MICRO_OTRAS(55,"M_saldo_cap_micro_otras",BigDecimal.class),
	M_CUOTA_MICRO_OTRAS(56,"M_cuota_micro_otras",BigDecimal.class),
	I_PLAZO_MICRO_OTRAS(57,"I_plazo_micro_otras",Integer.class),
	I_PLAZO_PEND_MICRO_OTRAS(58,"I_plazo_pend_micro_otras",Integer.class),
	M_TNMV_MICRO_OTRAS(59,"M_tnmv_micro_otras",BigDecimal.class),
	M_TNA_MICRO_OTRAS(60,"M_tna_micro_otras",BigDecimal.class),
	M_TEA_MICRO_OTRAS(61,"M_tea_micro_otras",BigDecimal.class),
	I_TOT_CRED_OTRAS(62,"I_tot_cred_otras",Integer.class),
	I_TOT_ENT_OTRAS(63,"I_tot_ent_otras",Integer.class),
	M_SUMA_VLR_CRED_OTRAS(64,"M_suma_vlr_cred_otras",BigDecimal.class),
	M_MONTO_CCIA_OTRAS(65,"M_monto_ccia_otras",BigDecimal.class),
	M_MONTO_CONS_OTRAS(66,"M_monto_cons_otras",BigDecimal.class),
	M_MONTO_MICRO_OTRAS(67,"M_monto_micro_otras",BigDecimal.class),
	M_SALDO_ENT_1_OTRAS(68,"M_saldo_ent_1_otras",BigDecimal.class),
	M_SALDO_ENT_2_OTRAS(69,"M_saldo_ent_2_otras",BigDecimal.class),
	M_SALDO_ENT_3_OTRAS(70,"M_saldo_ent_3_otras",BigDecimal.class),
	M_SALDO_ENT_4_OTRAS(71,"M_saldo_ent_4_otras",BigDecimal.class),
	M_SALDO_ENT_5_OTRAS(72,"M_saldo_ent_5_otras",BigDecimal.class),
	M_SALDO_RECOGER_OTRAS(73,"M_saldo_recoger_otras",BigDecimal.class),
	M_TOTAL_CREDITOS(74,"M_total_creditos",BigDecimal.class),
	M_SUMA_CREDITOS(75,"M_suma_creditos",BigDecimal.class),
	M_MONTO_CCIAL_OTROS(76,"M_monto_ccial_otros",BigDecimal.class),
	M_MONTO_CONS_OTROS(77,"M_monto_cons_otros",BigDecimal.class),
	M_MONTO_MICRO_OTROS(78,"M_monto_micro_otros",BigDecimal.class),
	M_VALOR_RECOGER_OTROS(79,"M_valor_recoger_otros",BigDecimal.class),
	M_OFERTA_CCIAL_3_VECES(80,"M_oferta_ccial_3_veces",BigDecimal.class),
	M_OFERTA_CONS_3_VECES(81,"M_oferta_cons_3_veces",BigDecimal.class),
	M_OFERTA_MICRO_3_VECES(82,"M_oferta_micro_3_veces",BigDecimal.class),
	S_MODALIDAD(83,"S_modalidad",String.class),
	M_VLR_DESEMBOLSO(84,"M_vlr_desembolso",BigDecimal.class),
	M_VLR_MAX_PRESTAR(85,"M_vlr_max_prestar",BigDecimal.class),
	M_TNMV(86,"M_tnmv",BigDecimal.class),
	M_TNA(87,"M_tna",BigDecimal.class),
	M_TEA(88,"M_tea",BigDecimal.class),
	I_PLAZO(89,"I_plazo",Integer.class),
	M_VLR_TOT_CUOT_ACTUAL(90,"M_vlr_tot_cuot_actual",BigDecimal.class),
	M_CUOTA_PAGAR(91,"M_cuota_pagar",BigDecimal.class),
	M_CUOTA_PAG_VS_CUOT_ACTUAL(92,"M_cuota_pag_vs_cuot_actual",BigDecimal.class),
	M_CUOT_PAG_VLR_RECOGER(93,"M_cuot_pag_vlr_recoger",BigDecimal.class),
	M_CUOTA_PAG_VS_CUOT_ACT_REC(94,"M_cuota_pag_vs_cuot_act_rec",BigDecimal.class),
	D_FECHA_CORTE(95,"D_fecha_corte",BigDecimal.class);	

	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;

	

	private TypeBigDesendeudeseColumn(int indice, String nombreColumna, Class typeColumn) {
		this.indice = indice;
		this.nombreColumna = nombreColumna;
		this.typeColumn = typeColumn;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNombreColumna() {
		return nombreColumna;
	}

	public void setNombreColumna(String nombreColumna) {
		this.nombreColumna = nombreColumna;
	}

	public Class getTypeColumn() {
		return typeColumn;
	}

	public void setTypeColumn( Class typeColumn) {
		this.typeColumn = typeColumn;
	}

}
