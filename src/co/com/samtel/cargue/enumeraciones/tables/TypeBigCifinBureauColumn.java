package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigCifinBureauColumn implements IColumn {	
	
	I_TIPO_PERSONA(0,"I_tipo_persona",String.class),	
	S_CODIGO_PERSONA(1, "S_codigo_persona",String.class),	
	S_NOMBRE_PERSONA(2,"S_nombre_persona",String.class),	
	S_FECHA_EXPEDICION(3,"S_fecha_expedicion",String.class),
	S_CIUDAD_EXPEDICION_DTO(4,"S_ciudad_expedicion_dto",String.class),		
	S_DEPTO_EXPEDICION_DTO(5,"S_depto_expedicion_dto",String.class),
	S_ESTADO_DTO(6,"S_estado_dto",String.class),
	S_RANGO_EDAD(7,"S_rango_edad",String.class),
	I_CODIGO_CIIU(8,"I_codigo_ciiu",String.class ),	
	S_ACTIVIDAD_ECONOMICA(9,"S_actividad_economica",String.class),
	S_NOMBRE_PRODUCTO(10,"S_nombre_producto",String.class),
	S_NOMBRE_ENTIDAD(11,"S_nombre_entidad",String.class),
	S_TIPO_CONTRATO(12,"S_tipo_contrato",String.class),	
	I_NUMERO_OBLIGACION(13,"I_numero_obligacion",Long.class),	
	S_CIUDAD(14,"S_ciudad",String.class),
	S_TIPO_CUENTA(15,"S_tipo_cuenta",String.class),	
	D_FECHA_APERTURA(16,"D_fecha_apertura",Date.class),	
	D_FECHA_TERMINACION(17,"D_fecha_terminacion",Date.class),	
	M_CUPO_SOBREGIRO(18,"M_cupo_sobregiro", BigDecimal.class),
	I_DIAS_AUTORIZADOS(19,"I_dias_autorizados",  Integer.class),
	I_NO_CHEQUES_DEVUELTOS(20,"I_no_cheques_devueltos", Integer.class),	
	S_ESTADO(21,"S_estado",String.class),
	S_MARCA_TARJETA(22,"S_marca_tarjeta",String.class),
	S_CLASE_TARJETA(23,"S_clase_tarjeta",String.class),
	M_VALOR_CUOTA(24,"M_valor_cuota",BigDecimal.class),
	M_CUPO(25,"M_cupo",BigDecimal.class),
	M_SALDO(26,"M_saldo",BigDecimal.class),
	S_MODALIDAD_CREDITO(27,"S_modalidad_credito",String.class),
	S_COD_PRODUCTO(28,"S_cod_producto",String.class),
	M_VALOR_INICIAL(29,"M_valor_inicial",BigDecimal.class),
	M_VALOR_MORA(30,"M_valor_mora",BigDecimal.class),
	S_ALTURA_MORA(31,"S_altura_mora",String.class),	
	S_PERIODICIDAD(32,"S_periodicidad",String.class),
	S_TIPO_GARANTIA(33,"S_tipo_garantia",String.class),	
	M_CUBRIMIENTO(34,"M_cubrimiento",BigDecimal.class),
	S_CALIDAD(35,"S_calidad",String.class),
	S_CALIFICACION(36,"S_calificacion",String.class),
	S_MODO_EXTINCION(37,"S_modo_extincion",String.class),
	I_CUOTAS_PACTADAS_PLAZO(38,"I_cuotas_pactadas_plazo",Integer.class),
	I_CUOTAS_PAGADAS(39,"I_cuotas_pagadas",Integer.class),
	I_CUOTAS_EN_MORA(40,"I_cuotas_en_mora",Integer.class),	
	S_VECTOR_DE_COMPORTAMIENTO(41,"S_vector_de_comportamiento",String.class),
	D_FECHA_PERMANENCIA(42,"D_fecha_permanencia",Date.class),
	D_FECHA_CORTE(43,"D_fecha_corte",Date.class),	
	S_CALIF_ENDEUDA_GLOBAL_TRI_III(44,"S_calif_endeuda_global_tri_iii",String.class),
	S_CALIF_ENDEUDA_GLOBAL_TRI_II(45,"S_calif_endeuda_global_tri_ii",String.class),
	M_TOTAL_VR_MORA_PRINCIPAL(46,"M_total_vr_mora_principal",BigDecimal.class),
	M_TOTAL_SALDO_PRINCIPAL(47,"M_total_saldo_principal",BigDecimal.class),
	M_TOTAL_CUOTAS_PRINCIPAL(48,"M_total_cuotas_principal",BigDecimal.class),
	M_TOTAL_VR_MORA_CODEUDOR(49,"M_total_vr_mora_codeudor",BigDecimal.class),
	M_TOTAL_SALDO_CODEUDOR(50,"M_total_saldo_codeudor",BigDecimal.class),
	M_TOTAL_CUOTAS_CODEUDOR(51,"M_total_cuotas_codeudor",BigDecimal.class),
	M_TOTAL_SALDO_OBLIGACIONES(52,"M_total_saldo_obligaciones",BigDecimal.class),
	I_PUNTAJE_SCORE(53,"I_puntaje_score",Integer.class),
	I_PROBABILIDAD_DE_MORA_SCORE(54,"I_probabilidad_de_mora_score",Integer.class),
	I_PROBABILIDAD_DE_INCUMPLIMIENTO_SCORE(55,"I_probabilidad_de_incumplimiento_score",Integer.class),
	S_CAMPANA(56,"S_campana",String.class),
	I_CODIGO_CLIENTE(57,"I_codigo_cliente",Integer.class),
	I_CODIGO_FUERZA_COMERCIAL(58,"I_codigo_fuerza_comercial",String.class),
	I_CODIGO_OFICINA(59,"I_codigo_oficina",Short.class);	
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigCifinBureauColumn(int indice, String nombreColumna, Class typeColumn) {
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
