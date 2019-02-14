package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CIFIN_BUREAU", schema = "dbo")
public class BigCifinBureau implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigCifinBureauId id;

	@Column(name = "i_tipo_persona")
	private String i_tipo_persona;	
	
	@Column(name = "s_codigo_persona")
	private String s_codigo_persona;
	
	@Column(name = "s_nombre_persona")
	private String s_nombre_persona;
	
	@Column(name = "s_fecha_expedicion")
	private String s_fecha_expedicion;
	
	@Column(name = "s_ciudad_expedicion_dto")
	private String s_ciudad_expedicion_dto;	
	
	@Column(name = "s_depto_expedicion_dto")
	private String s_depto_expedicion_dto;
	
	@Column(name = "s_estado_dto")
	private String s_estado_dto;
	
	@Column(name = "s_rango_edad")
	private String s_rango_edad;

	@Column(name = "i_codigo_ciiu")
	private String i_codigo_ciiu;	
	
	@Column(name = "s_actividad_economica")
	private String s_actividad_economica;
	
	@Column(name = "s_nombre_producto")
	private String s_nombre_producto;
	
	@Column(name = "s_nombre_entidad")
	private String s_nombre_entidad;
	
	@Column(name = "s_tipo_contrato")
	private String s_tipo_contrato;	
	
	@Column(name = "i_numero_obligacion")
	private Long i_numero_obligacion;
	
	@Column(name = "s_ciudad")
	private String s_ciudad;
	
	@Column(name = "s_tipo_cuenta")
	private String s_tipo_cuenta;
	
	@Column(name = "d_fecha_apertura")
	private Date d_fecha_apertura;	
	
	@Column(name = "d_fecha_terminacion")
	private Date d_fecha_terminacion;
	
	@Column(name = "m_cupo_sobregiro")
	private BigDecimal m_cupo_sobregiro;
	
	@Column(name = "i_dias_autorizados")
	private Integer i_dias_autorizados;

	@Column(name = "i_no_cheques_devueltos")
	private Integer i_no_cheques_devueltos;	
	
	@Column(name = "s_estado")
	private String s_estado;
	
	@Column(name = "s_marca_tarjeta")
	private String s_marca_tarjeta;
	
	@Column(name = "s_clase_tarjeta")
	private String s_clase_tarjeta;
	
	@Column(name = "m_valor_cuota")
	private BigDecimal m_valor_cuota;	
	
	@Column(name = "m_cupo")
	private BigDecimal m_cupo;
	
	@Column(name = "m_saldo")
	private BigDecimal m_saldo;
	
	@Column(name = "s_modalidad_credito")
	private String s_modalidad_credito;
	
	@Column(name = "s_cod_producto")
	private String s_cod_producto;	
	
	@Column(name = "m_valor_inicial")
	private BigDecimal m_valor_inicial;
	
	@Column(name = "m_valor_mora")
	private BigDecimal m_valor_mora;
	
	@Column(name = "s_altura_mora")
	private String s_altura_mora;

	@Column(name = "s_periodicidad")
	private String s_periodicidad;	
	
	@Column(name = "s_tipo_garantia")
	private String s_tipo_garantia;
	
	@Column(name = "m_cubrimiento")
	private BigDecimal m_cubrimiento;
	
	@Column(name = "s_calidad")
	private String s_calidad;
	
	@Column(name = "s_calificacion")
	private String s_calificacion;
	
	@Column(name = "s_modo_extincion")
	private String s_modo_extincion;
	
	@Column(name = "i_cuotas_pactadas_plazo")
	private Integer i_cuotas_pactadas_plazo;
	
	@Column(name = "i_cuotas_pagadas")
	private Integer i_cuotas_pagadas;
	
	@Column(name = "i_cuotas_en_mora")
	private Integer i_cuotas_en_mora;
	
	@Column(name = "s_vector_de_comportamiento")
	private String s_vector_de_comportamiento;
	
	@Column(name = "d_fecha_permanencia")
	private Date d_fecha_permanencia;
	
	@Column(name = "s_calif_endeuda_global_tri_iii")
	private String s_calif_endeuda_global_tri_iii;
	
	@Column(name = "s_calif_endeuda_global_tri_ii")
	private String s_calif_endeuda_global_tri_ii;
	
	@Column(name = "m_total_vr_mora_principal")
	private BigDecimal m_total_vr_mora_principal;
	
	@Column(name = "m_total_saldo_principal")
	private BigDecimal m_total_saldo_principal;
	
	@Column(name = "m_total_cuotas_principal")
	private BigDecimal m_total_cuotas_principal;
	
	@Column(name = "m_total_vr_mora_codeudor")
	private BigDecimal m_total_vr_mora_codeudor;
	
	@Column(name = "m_total_saldo_codeudor")
	private BigDecimal m_total_saldo_codeudor;
	
	@Column(name = "m_total_cuotas_codeudor")
	private BigDecimal m_total_cuotas_codeudor;
	
	@Column(name = "m_total_saldo_obligaciones")
	private BigDecimal m_total_saldo_obligaciones;
	
	@Column(name = "i_puntaje_score")
	private Integer i_puntaje_score;
	
	@Column(name = "i_probabilidad_de_mora_score")
	private Integer i_probabilidad_de_mora_score;
	
	@Column(name = "i_probabilidad_de_incumplimiento_score")
	private Integer i_probabilidad_de_incumplimiento_score;
	
	@Column(name = "s_campana")
	private String s_campana;
	
	@Column(name = "i_codigo_fuerza_comercial")
	private String i_codigo_fuerza_comercial;
	
	@Column(name = "i_codigo_oficina")
	private Short i_codigo_oficina;

	public BigCifinBureauId getId() {
		return id;
	}

	public void setId(BigCifinBureauId id) {
		this.id = id;
	}

	public String getI_tipo_persona() {
		return i_tipo_persona;
	}

	public void setI_tipo_persona(String i_tipo_persona) {
		this.i_tipo_persona = i_tipo_persona;
	}

	public String getS_codigo_persona() {
		return s_codigo_persona;
	}

	public void setS_codigo_persona(String s_codigo_persona) {
		this.s_codigo_persona = s_codigo_persona;
	}

	public String getS_nombre_persona() {
		return s_nombre_persona;
	}

	public void setS_nombre_persona(String s_nombre_persona) {
		this.s_nombre_persona = s_nombre_persona;
	}

	public String getS_fecha_expedicion() {
		return s_fecha_expedicion;
	}

	public void setS_fecha_expedicion(String s_fecha_expedicion) {
		this.s_fecha_expedicion = s_fecha_expedicion;
	}

	public String getS_ciudad_expedicion_dto() {
		return s_ciudad_expedicion_dto;
	}

	public void setS_ciudad_expedicion_dto(String s_ciudad_expedicion_dto) {
		this.s_ciudad_expedicion_dto = s_ciudad_expedicion_dto;
	}

	public String getS_depto_expedicion_dto() {
		return s_depto_expedicion_dto;
	}

	public void setS_depto_expedicion_dto(String s_depto_expedicion_dto) {
		this.s_depto_expedicion_dto = s_depto_expedicion_dto;
	}

	public String getS_estado_dto() {
		return s_estado_dto;
	}

	public void setS_estado_dto(String s_estado_dto) {
		this.s_estado_dto = s_estado_dto;
	}

	public String getS_rango_edad() {
		return s_rango_edad;
	}

	public void setS_rango_edad(String s_rango_edad) {
		this.s_rango_edad = s_rango_edad;
	}

	public String getI_codigo_ciiu() {
		return i_codigo_ciiu;
	}

	public void setI_codigo_ciiu(String i_codigo_ciiu) {
		this.i_codigo_ciiu = i_codigo_ciiu;
	}

	public String getS_actividad_economica() {
		return s_actividad_economica;
	}

	public void setS_actividad_economica(String s_actividad_economica) {
		this.s_actividad_economica = s_actividad_economica;
	}

	public String getS_nombre_producto() {
		return s_nombre_producto;
	}

	public void setS_nombre_producto(String s_nombre_producto) {
		this.s_nombre_producto = s_nombre_producto;
	}

	public String getS_nombre_entidad() {
		return s_nombre_entidad;
	}

	public void setS_nombre_entidad(String s_nombre_entidad) {
		this.s_nombre_entidad = s_nombre_entidad;
	}

	public String getS_tipo_contrato() {
		return s_tipo_contrato;
	}

	public void setS_tipo_contrato(String s_tipo_contrato) {
		this.s_tipo_contrato = s_tipo_contrato;
	}

	public Long getI_numero_obligacion() {
		return i_numero_obligacion;
	}

	public void setI_numero_obligacion(Long i_numero_obligacion) {
		this.i_numero_obligacion = i_numero_obligacion;
	}

	public String getS_ciudad() {
		return s_ciudad;
	}

	public void setS_ciudad(String s_ciudad) {
		this.s_ciudad = s_ciudad;
	}

	public String getS_tipo_cuenta() {
		return s_tipo_cuenta;
	}

	public void setS_tipo_cuenta(String s_tipo_cuenta) {
		this.s_tipo_cuenta = s_tipo_cuenta;
	}

	public Date getD_fecha_apertura() {
		return d_fecha_apertura;
	}

	public void setD_fecha_apertura(Date d_fecha_apertura) {
		this.d_fecha_apertura = d_fecha_apertura;
	}

	public Date getD_fecha_terminacion() {
		return d_fecha_terminacion;
	}

	public void setD_fecha_terminacion(Date d_fecha_terminacion) {
		this.d_fecha_terminacion = d_fecha_terminacion;
	}

	public BigDecimal getM_cupo_sobregiro() {
		return m_cupo_sobregiro;
	}

	public void setM_cupo_sobregiro(BigDecimal m_cupo_sobregiro) {
		this.m_cupo_sobregiro = m_cupo_sobregiro;
	}

	public Integer getI_dias_autorizados() {
		return i_dias_autorizados;
	}

	public void setI_dias_autorizados(Integer i_dias_autorizados) {
		this.i_dias_autorizados = i_dias_autorizados;
	}

	public Integer getI_no_cheques_devueltos() {
		return i_no_cheques_devueltos;
	}

	public void setI_no_cheques_devueltos(Integer i_no_cheques_devueltos) {
		this.i_no_cheques_devueltos = i_no_cheques_devueltos;
	}

	public String getS_estado() {
		return s_estado;
	}

	public void setS_estado(String s_estado) {
		this.s_estado = s_estado;
	}

	public String getS_marca_tarjeta() {
		return s_marca_tarjeta;
	}

	public void setS_marca_tarjeta(String s_marca_tarjeta) {
		this.s_marca_tarjeta = s_marca_tarjeta;
	}

	public String getS_clase_tarjeta() {
		return s_clase_tarjeta;
	}

	public void setS_clase_tarjeta(String s_clase_tarjeta) {
		this.s_clase_tarjeta = s_clase_tarjeta;
	}

	public BigDecimal getM_valor_cuota() {
		return m_valor_cuota;
	}

	public void setM_valor_cuota(BigDecimal m_valor_cuota) {
		this.m_valor_cuota = m_valor_cuota;
	}

	public BigDecimal getM_cupo() {
		return m_cupo;
	}

	public void setM_cupo(BigDecimal m_cupo) {
		this.m_cupo = m_cupo;
	}

	public BigDecimal getM_saldo() {
		return m_saldo;
	}

	public void setM_saldo(BigDecimal m_saldo) {
		this.m_saldo = m_saldo;
	}

	public String getS_modalidad_credito() {
		return s_modalidad_credito;
	}

	public void setS_modalidad_credito(String s_modalidad_credito) {
		this.s_modalidad_credito = s_modalidad_credito;
	}

	public String getS_cod_producto() {
		return s_cod_producto;
	}

	public void setS_cod_producto(String s_cod_producto) {
		this.s_cod_producto = s_cod_producto;
	}

	public BigDecimal getM_valor_inicial() {
		return m_valor_inicial;
	}

	public void setM_valor_inicial(BigDecimal m_valor_inicial) {
		this.m_valor_inicial = m_valor_inicial;
	}

	public BigDecimal getM_valor_mora() {
		return m_valor_mora;
	}

	public void setM_valor_mora(BigDecimal m_valor_mora) {
		this.m_valor_mora = m_valor_mora;
	}

	public String getS_altura_mora() {
		return s_altura_mora;
	}

	public void setS_altura_mora(String s_altura_mora) {
		this.s_altura_mora = s_altura_mora;
	}

	public String getS_periodicidad() {
		return s_periodicidad;
	}

	public void setS_periodicidad(String s_periodicidad) {
		this.s_periodicidad = s_periodicidad;
	}

	public String getS_tipo_garantia() {
		return s_tipo_garantia;
	}

	public void setS_tipo_garantia(String s_tipo_garantia) {
		this.s_tipo_garantia = s_tipo_garantia;
	}

	public BigDecimal getM_cubrimiento() {
		return m_cubrimiento;
	}

	public void setM_cubrimiento(BigDecimal m_cubrimiento) {
		this.m_cubrimiento = m_cubrimiento;
	}

	public String getS_calidad() {
		return s_calidad;
	}

	public void setS_calidad(String s_calidad) {
		this.s_calidad = s_calidad;
	}

	public String getS_calificacion() {
		return s_calificacion;
	}

	public void setS_calificacion(String s_calificacion) {
		this.s_calificacion = s_calificacion;
	}

	public String getS_modo_extincion() {
		return s_modo_extincion;
	}

	public void setS_modo_extincion(String s_modo_extincion) {
		this.s_modo_extincion = s_modo_extincion;
	}

	public Integer getI_cuotas_pactadas_plazo() {
		return i_cuotas_pactadas_plazo;
	}

	public void setI_cuotas_pactadas_plazo(Integer i_cuotas_pactadas_plazo) {
		this.i_cuotas_pactadas_plazo = i_cuotas_pactadas_plazo;
	}

	public Integer getI_cuotas_pagadas() {
		return i_cuotas_pagadas;
	}

	public void setI_cuotas_pagadas(Integer i_cuotas_pagadas) {
		this.i_cuotas_pagadas = i_cuotas_pagadas;
	}

	public Integer getI_cuotas_en_mora() {
		return i_cuotas_en_mora;
	}

	public void setI_cuotas_en_mora(Integer i_cuotas_en_mora) {
		this.i_cuotas_en_mora = i_cuotas_en_mora;
	}

	public String getS_vector_de_comportamiento() {
		return s_vector_de_comportamiento;
	}

	public void setS_vector_de_comportamiento(String s_vector_de_comportamiento) {
		this.s_vector_de_comportamiento = s_vector_de_comportamiento;
	}

	public Date getD_fecha_permanencia() {
		return d_fecha_permanencia;
	}

	public void setD_fecha_permanencia(Date d_fecha_permanencia) {
		this.d_fecha_permanencia = d_fecha_permanencia;
	}

	public String getS_calif_endeuda_global_tri_iii() {
		return s_calif_endeuda_global_tri_iii;
	}

	public void setS_calif_endeuda_global_tri_iii(String s_calif_endeuda_global_tri_iii) {
		this.s_calif_endeuda_global_tri_iii = s_calif_endeuda_global_tri_iii;
	}

	public String getS_calif_endeuda_global_tri_ii() {
		return s_calif_endeuda_global_tri_ii;
	}

	public void setS_calif_endeuda_global_tri_ii(String s_calif_endeuda_global_tri_ii) {
		this.s_calif_endeuda_global_tri_ii = s_calif_endeuda_global_tri_ii;
	}

	public BigDecimal getM_total_vr_mora_principal() {
		return m_total_vr_mora_principal;
	}

	public void setM_total_vr_mora_principal(BigDecimal m_total_vr_mora_principal) {
		this.m_total_vr_mora_principal = m_total_vr_mora_principal;
	}

	public BigDecimal getM_total_saldo_principal() {
		return m_total_saldo_principal;
	}

	public void setM_total_saldo_principal(BigDecimal m_total_saldo_principal) {
		this.m_total_saldo_principal = m_total_saldo_principal;
	}

	public BigDecimal getM_total_cuotas_principal() {
		return m_total_cuotas_principal;
	}

	public void setM_total_cuotas_principal(BigDecimal m_total_cuotas_principal) {
		this.m_total_cuotas_principal = m_total_cuotas_principal;
	}

	public BigDecimal getM_total_vr_mora_codeudor() {
		return m_total_vr_mora_codeudor;
	}

	public void setM_total_vr_mora_codeudor(BigDecimal m_total_vr_mora_codeudor) {
		this.m_total_vr_mora_codeudor = m_total_vr_mora_codeudor;
	}

	public BigDecimal getM_total_saldo_codeudor() {
		return m_total_saldo_codeudor;
	}

	public void setM_total_saldo_codeudor(BigDecimal m_total_saldo_codeudor) {
		this.m_total_saldo_codeudor = m_total_saldo_codeudor;
	}

	public BigDecimal getM_total_cuotas_codeudor() {
		return m_total_cuotas_codeudor;
	}

	public void setM_total_cuotas_codeudor(BigDecimal m_total_cuotas_codeudor) {
		this.m_total_cuotas_codeudor = m_total_cuotas_codeudor;
	}

	public BigDecimal getM_total_saldo_obligaciones() {
		return m_total_saldo_obligaciones;
	}

	public void setM_total_saldo_obligaciones(BigDecimal m_total_saldo_obligaciones) {
		this.m_total_saldo_obligaciones = m_total_saldo_obligaciones;
	}

	public Integer getI_puntaje_score() {
		return i_puntaje_score;
	}

	public void setI_puntaje_score(Integer i_puntaje_score) {
		this.i_puntaje_score = i_puntaje_score;
	}

	public Integer getI_probabilidad_de_mora_score() {
		return i_probabilidad_de_mora_score;
	}

	public void setI_probabilidad_de_mora_score(Integer i_probabilidad_de_mora_score) {
		this.i_probabilidad_de_mora_score = i_probabilidad_de_mora_score;
	}

	public Integer getI_probabilidad_de_incumplimiento_score() {
		return i_probabilidad_de_incumplimiento_score;
	}

	public void setI_probabilidad_de_incumplimiento_score(Integer i_probabilidad_de_incumplimiento_score) {
		this.i_probabilidad_de_incumplimiento_score = i_probabilidad_de_incumplimiento_score;
	}

	public String getS_campana() {
		return s_campana;
	}

	public void setS_campana(String s_campana) {
		this.s_campana = s_campana;
	}

	public String getI_codigo_fuerza_comercial() {
		return i_codigo_fuerza_comercial;
	}

	public void setI_codigo_fuerza_comercial(String i_codigo_fuerza_comercial) {
		this.i_codigo_fuerza_comercial = i_codigo_fuerza_comercial;
	}

	public Short getI_codigo_oficina() {
		return i_codigo_oficina;
	}

	public void setI_codigo_oficina(Short i_codigo_oficina) {
		this.i_codigo_oficina = i_codigo_oficina;
	}
}
