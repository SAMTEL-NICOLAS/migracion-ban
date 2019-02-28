package co.com.samtel.entity.manual.csv;

import java.math.BigDecimal;
import java.util.Date;

public class BigCalificacionCarteraClienteCsv {

	private String S_identificacion_cliente;
	private String I_tipo_identificacion;
	private String I_codigo_cliente;
	private String I_fuerza_comercial;
	private Integer I_oficina;
	private String S_descripcion_linea;
	private Double I_cod_operacion;
	private String S_calificacion_anterior;
	private String S_calificacion_actual;
	private Date D_fecha_inicio_cre;
	private Date D_fecha_vcto;
	private Integer I_dias_de_mora;
	private BigDecimal M_capital;
	private Integer I_re_estado;
	private Date D_fecha_carga;
	
	public String getS_identificacion_cliente() {
		return S_identificacion_cliente;
	}
	public void setS_identificacion_cliente(String s_identificacion_cliente) {
		S_identificacion_cliente = s_identificacion_cliente;
	}
	public String getI_tipo_identificacion() {
		return I_tipo_identificacion;
	}
	public void setI_tipo_identificacion(String i_tipo_identificacion) {
		I_tipo_identificacion = i_tipo_identificacion;
	}
	public String getI_codigo_cliente() {
		return I_codigo_cliente;
	}
	public void setI_codigo_cliente(String i_codigo_cliente) {
		I_codigo_cliente = i_codigo_cliente;
	}
	public String getI_fuerza_comercial() {
		return I_fuerza_comercial;
	}
	public void setI_fuerza_comercial(String i_fuerza_comercial) {
		I_fuerza_comercial = i_fuerza_comercial;
	}
	public Integer getI_oficina() {
		return I_oficina;
	}
	public void setI_oficina(Integer i_oficina) {
		I_oficina = i_oficina;
	}
	public String getS_descripcion_linea() {
		return S_descripcion_linea;
	}
	public void setS_descripcion_linea(String s_descripcion_linea) {
		S_descripcion_linea = s_descripcion_linea;
	}	
	public String getS_calificacion_anterior() {
		return S_calificacion_anterior;
	}
	public void setS_calificacion_anterior(String s_calificacion_anterior) {
		S_calificacion_anterior = s_calificacion_anterior;
	}
	public String getS_calificacion_actual() {
		return S_calificacion_actual;
	}
	public void setS_calificacion_actual(String s_calificacion_actual) {
		S_calificacion_actual = s_calificacion_actual;
	}
	public Date getD_fecha_inicio_cre() {
		return D_fecha_inicio_cre;
	}
	public void setD_fecha_inicio_cre(Date d_fecha_inicio_cre) {
		D_fecha_inicio_cre = d_fecha_inicio_cre;
	}
	public Date getD_fecha_vcto() {
		return D_fecha_vcto;
	}
	public void setD_fecha_vcto(Date d_fecha_vcto) {
		D_fecha_vcto = d_fecha_vcto;
	}
	public Integer getI_dias_de_mora() {
		return I_dias_de_mora;
	}
	public void setI_dias_de_mora(Integer i_dias_de_mora) {
		I_dias_de_mora = i_dias_de_mora;
	}
	public BigDecimal getM_capital() {
		return M_capital;
	}
	public void setM_capital(BigDecimal m_capital) {
		M_capital = m_capital;
	}
	public Integer getI_re_estado() {
		return I_re_estado;
	}
	public void setI_re_estado(Integer i_re_estado) {
		I_re_estado = i_re_estado;
	}
	public Date getD_fecha_carga() {
		return D_fecha_carga;
	}
	public void setD_fecha_carga(Date d_fecha_carga) {
		D_fecha_carga = d_fecha_carga;
	}
	
	public Double getI_cod_operacion() {
		return I_cod_operacion;
	}
	public void setI_cod_operacion(Double i_cod_operacion) {
		I_cod_operacion = i_cod_operacion;
	}
	@Override
	public String toString() {
		return "BigCalificacionCarteraClienteDto [S_identificacion_cliente=" + S_identificacion_cliente
				+ ", I_tipo_identificacion=" + I_tipo_identificacion + ", I_codigo_cliente=" + I_codigo_cliente
				+ ", I_fuerza_comercial=" + I_fuerza_comercial + ", I_oficina=" + I_oficina + ", S_descripcion_linea="
				+ S_descripcion_linea + ", I_cod_operacion=" + I_cod_operacion + ", S_calificacion_anterior="
				+ S_calificacion_anterior + ", S_calificacion_actual=" + S_calificacion_actual + ", D_fecha_inicio_cre="
				+ D_fecha_inicio_cre + ", D_fecha_vcto=" + D_fecha_vcto + ", I_dias_de_mora=" + I_dias_de_mora
				+ ", M_capital=" + M_capital + ", I_re_estado=" + I_re_estado + ", D_fecha_carga=" + D_fecha_carga
				+ "]";
	}
	
	
	
}
