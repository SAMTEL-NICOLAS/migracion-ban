package co.com.samtel.entity.manual.csv;

import java.math.BigDecimal;
import java.util.Date;

public class BigInfoFinancieraCsv {

	private String I_cod_oficina;
	private BigDecimal M_gasto_administrativo;
	private BigDecimal M_gasto_personal;
	private BigDecimal M_gasto_neto_provision;
	private BigDecimal M_gasto_asignado;
	private BigDecimal M_costo_patrimonio_riesgo;
	private Date D_fecha_corte;
	private BigDecimal M_ingresos_totales;
	private BigDecimal M_egresos_totales;

	public String getI_cod_oficina() {
		return I_cod_oficina;
	}

	public void setI_cod_oficina(String i_cod_oficina) {
		I_cod_oficina = i_cod_oficina;
	}

	public BigDecimal getM_gasto_administrativo() {
		return M_gasto_administrativo;
	}

	public void setM_gasto_administrativo(BigDecimal m_gasto_administrativo) {
		M_gasto_administrativo = m_gasto_administrativo;
	}

	public BigDecimal getM_gasto_personal() {
		return M_gasto_personal;
	}

	public void setM_gasto_personal(BigDecimal m_gasto_personal) {
		M_gasto_personal = m_gasto_personal;
	}

	public BigDecimal getM_gasto_neto_provision() {
		return M_gasto_neto_provision;
	}

	public void setM_gasto_neto_provision(BigDecimal m_gasto_neto_provision) {
		M_gasto_neto_provision = m_gasto_neto_provision;
	}

	public BigDecimal getM_gasto_asignado() {
		return M_gasto_asignado;
	}

	public void setM_gasto_asignado(BigDecimal m_gasto_asignado) {
		M_gasto_asignado = m_gasto_asignado;
	}

	public BigDecimal getM_costo_patrimonio_riesgo() {
		return M_costo_patrimonio_riesgo;
	}

	public void setM_costo_patrimonio_riesgo(BigDecimal m_costo_patrimonio_riesgo) {
		M_costo_patrimonio_riesgo = m_costo_patrimonio_riesgo;
	}

	public Date getD_fecha_corte() {
		return D_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		D_fecha_corte = d_fecha_corte;
	}

	public BigDecimal getM_ingresos_totales() {
		return M_ingresos_totales;
	}

	public void setM_ingresos_totales(BigDecimal m_ingresos_totales) {
		M_ingresos_totales = m_ingresos_totales;
	}

	public BigDecimal getM_egresos_totales() {
		return M_egresos_totales;
	}

	public void setM_egresos_totales(BigDecimal m_egresos_totales) {
		M_egresos_totales = m_egresos_totales;
	}

	@Override
	public String toString() {
		return "BigInfoFinancieraDto [I_cod_oficina=" + I_cod_oficina + ", M_gasto_administrativo="
				+ M_gasto_administrativo + ", M_gasto_personal=" + M_gasto_personal + ", M_gasto_neto_provision="
				+ M_gasto_neto_provision + ", M_gasto_asignado=" + M_gasto_asignado + ", M_costo_patrimonio_riesgo="
				+ M_costo_patrimonio_riesgo + ", D_fecha_corte=" + D_fecha_corte + ", M_ingresos_totales="
				+ M_ingresos_totales + ", M_egresos_totales=" + M_egresos_totales + "]";
	}

}
