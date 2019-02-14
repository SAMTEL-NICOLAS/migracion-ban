package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_SEGUROS", schema = "dbo")
public class BigSeguros implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigSegurosId id;

	@Column(name = "s_territorial")
	private String s_territorial;
	
	@Column(name = "s_cod_oficina")
	private Short s_cod_oficina;
	
	@Column(name = "s_nom_oficina")
	private String s_nom_oficina;
	
	@Column(name = "d_fecha")
	private Date d_fecha;	
	
	@Column(name = "s_id_vendedor")
	private String s_id_vendedor;
	
	@Column(name = "s_nombre_vendedor")
	private String s_nombre_vendedor;
	
	@Column(name = "s_cargo_asesor")
	private String s_cargo_asesor;
	
	@Column(name = "s_id_aprobador")
	private String s_id_aprobador;
	
	@Column(name = "s_nombre_aprobador")
	private String s_nombre_aprobador;
	
	@Column(name = "s_id_cliente")
	private String s_id_cliente;
	
	@Column(name = "s_nombre_cliente")
	private String s_nombre_cliente;
	
	@Column(name = "m_valor_mensual")
	private BigDecimal m_valor_mensual;	
	
	@Column(name = "m_total_plan")
	private BigDecimal m_total_plan;
	
	@Column(name = "i_numero_meses")
	private Integer i_numero_meses;
	
	@Column(name = "s_forma_pago")
	private String s_forma_pago;
	
	@Column(name = "s_origen_venta")
	private String s_origen_venta;
	
	@Column(name = "m_total_pagado")
	private BigDecimal m_total_pagado;
	
	@Column(name = "s_status")
	private String s_status;
	
	@Column(name = "d_cobertura_hasta")
	private Date d_cobertura_hasta;
	
	@Column(name = "m_num_ctaxpagar")
	private Integer m_num_ctaxpagar;	
	
	@Column(name = "i_grupo")
	private Integer i_grupo;
	
	@Column(name = "i_codigo_asesor")
	private Integer i_codigo_asesor;
	
	@Column(name = "i_producto_asociado")
	private Long i_producto_asociado;

	public BigSegurosId getId() {
		return id;
	}

	public void setId(BigSegurosId id) {
		this.id = id;
	}

	public String getS_territorial() {
		return s_territorial;
	}

	public void setS_territorial(String s_territorial) {
		this.s_territorial = s_territorial;
	}

	public Short getS_cod_oficina() {
		return s_cod_oficina;
	}

	public void setS_cod_oficina(Short s_cod_oficina) {
		this.s_cod_oficina = s_cod_oficina;
	}

	public String getS_nom_oficina() {
		return s_nom_oficina;
	}

	public void setS_nom_oficina(String s_nom_oficina) {
		this.s_nom_oficina = s_nom_oficina;
	}

	public Date getD_fecha() {
		return d_fecha;
	}

	public void setD_fecha(Date d_fecha) {
		this.d_fecha = d_fecha;
	}

	public String getS_id_vendedor() {
		return s_id_vendedor;
	}

	public void setS_id_vendedor(String s_id_vendedor) {
		this.s_id_vendedor = s_id_vendedor;
	}

	public String getS_nombre_vendedor() {
		return s_nombre_vendedor;
	}

	public void setS_nombre_vendedor(String s_nombre_vendedor) {
		this.s_nombre_vendedor = s_nombre_vendedor;
	}

	public String getS_cargo_asesor() {
		return s_cargo_asesor;
	}

	public void setS_cargo_asesor(String s_cargo_asesor) {
		this.s_cargo_asesor = s_cargo_asesor;
	}

	public String getS_id_aprobador() {
		return s_id_aprobador;
	}

	public void setS_id_aprobador(String s_id_aprobador) {
		this.s_id_aprobador = s_id_aprobador;
	}

	public String getS_nombre_aprobador() {
		return s_nombre_aprobador;
	}

	public void setS_nombre_aprobador(String s_nombre_aprobador) {
		this.s_nombre_aprobador = s_nombre_aprobador;
	}

	public String getS_id_cliente() {
		return s_id_cliente;
	}

	public void setS_id_cliente(String s_id_cliente) {
		this.s_id_cliente = s_id_cliente;
	}

	public String getS_nombre_cliente() {
		return s_nombre_cliente;
	}

	public void setS_nombre_cliente(String s_nombre_cliente) {
		this.s_nombre_cliente = s_nombre_cliente;
	}

	public BigDecimal getM_valor_mensual() {
		return m_valor_mensual;
	}

	public void setM_valor_mensual(BigDecimal m_valor_mensual) {
		this.m_valor_mensual = m_valor_mensual;
	}

	public BigDecimal getM_total_plan() {
		return m_total_plan;
	}

	public void setM_total_plan(BigDecimal m_total_plan) {
		this.m_total_plan = m_total_plan;
	}

	public Integer getI_numero_meses() {
		return i_numero_meses;
	}

	public void setI_numero_meses(Integer i_numero_meses) {
		this.i_numero_meses = i_numero_meses;
	}

	public String getS_forma_pago() {
		return s_forma_pago;
	}

	public void setS_forma_pago(String s_forma_pago) {
		this.s_forma_pago = s_forma_pago;
	}

	public String getS_origen_venta() {
		return s_origen_venta;
	}

	public void setS_origen_venta(String s_origen_venta) {
		this.s_origen_venta = s_origen_venta;
	}

	public BigDecimal getM_total_pagado() {
		return m_total_pagado;
	}

	public void setM_total_pagado(BigDecimal m_total_pagado) {
		this.m_total_pagado = m_total_pagado;
	}

	public String getS_status() {
		return s_status;
	}

	public void setS_status(String s_status) {
		this.s_status = s_status;
	}

	public Date getD_cobertura_hasta() {
		return d_cobertura_hasta;
	}

	public void setD_cobertura_hasta(Date d_cobertura_hasta) {
		this.d_cobertura_hasta = d_cobertura_hasta;
	}

	public Integer getM_num_ctaxpagar() {
		return m_num_ctaxpagar;
	}

	public void setM_num_ctaxpagar(Integer m_num_ctaxpagar) {
		this.m_num_ctaxpagar = m_num_ctaxpagar;
	}

	public Integer getI_grupo() {
		return i_grupo;
	}

	public void setI_grupo(Integer i_grupo) {
		this.i_grupo = i_grupo;
	}

	public Integer getI_codigo_asesor() {
		return i_codigo_asesor;
	}

	public void setI_codigo_asesor(Integer i_codigo_asesor) {
		this.i_codigo_asesor = i_codigo_asesor;
	}

	public Long getI_producto_asociado() {
		return i_producto_asociado;
	}

	public void setI_producto_asociado(Long i_producto_asociado) {
		this.i_producto_asociado = i_producto_asociado;
	}
	}
