package co.com.samtel.entity.manual.csv;

import java.math.BigDecimal;
import java.util.Date;

public class BigInfFinancieraCsv {

	private String i_cod_oficina;	
	private BigDecimal m_gasto_administrativo;		
	private BigDecimal m_gasto_personal;	
	private BigDecimal m_gasto_neto_provision;	
	private BigDecimal m_gasto_asignado;	
	private BigDecimal m_costo_patrimonio_riesgo;	
	private Date d_fecha_corte;
	private BigDecimal m_ingresos_totales;	
	private BigDecimal m_egresos_totales;
	public String getI_cod_oficina() {
		return i_cod_oficina;
	}
	public void setI_cod_oficina(String i_cod_oficina) {
		this.i_cod_oficina = i_cod_oficina;
	}
	public BigDecimal getM_gasto_administrativo() {
		return m_gasto_administrativo;
	}
	public void setM_gasto_administrativo(BigDecimal m_gasto_administrativo) {
		this.m_gasto_administrativo = m_gasto_administrativo;
	}
	public BigDecimal getM_gasto_personal() {
		return m_gasto_personal;
	}
	public void setM_gasto_personal(BigDecimal m_gasto_personal) {
		this.m_gasto_personal = m_gasto_personal;
	}
	public BigDecimal getM_gasto_neto_provision() {
		return m_gasto_neto_provision;
	}
	public void setM_gasto_neto_provision(BigDecimal m_gasto_neto_provision) {
		this.m_gasto_neto_provision = m_gasto_neto_provision;
	}
	public BigDecimal getM_gasto_asignado() {
		return m_gasto_asignado;
	}
	public void setM_gasto_asignado(BigDecimal m_gasto_asignado) {
		this.m_gasto_asignado = m_gasto_asignado;
	}
	public BigDecimal getM_costo_patrimonio_riesgo() {
		return m_costo_patrimonio_riesgo;
	}
	public void setM_costo_patrimonio_riesgo(BigDecimal m_costo_patrimonio_riesgo) {
		this.m_costo_patrimonio_riesgo = m_costo_patrimonio_riesgo;
	}
	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}
	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}
	public BigDecimal getM_ingresos_totales() {
		return m_ingresos_totales;
	}
	public void setM_ingresos_totales(BigDecimal m_ingresos_totales) {
		this.m_ingresos_totales = m_ingresos_totales;
	}
	public BigDecimal getM_egresos_totales() {
		return m_egresos_totales;
	}
	public void setM_egresos_totales(BigDecimal m_egresos_totales) {
		this.m_egresos_totales = m_egresos_totales;
	}	
}
