package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_INF_FINANCIERA", schema = "dbo")
public class BigInfoFinanciera implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigInfoFinancieraId id;
	
	@Column(name = "m_gasto_administrativo")
	private BigDecimal m_gasto_administrativo;	
	
	@Column(name = "m_gasto_personal")
	private BigDecimal m_gasto_personal;
	
	@Column(name = "m_gasto_neto_provision")
	private BigDecimal m_gasto_neto_provision;	
	
	@Column(name = "m_gasto_asignado")
	private BigDecimal m_gasto_asignado;
	
	@Column(name = "m_costo_patrimonio_riesgo")
	private BigDecimal m_costo_patrimonio_riesgo;	
	
	@Column(name = "m_ingresos_totales")
	private BigDecimal m_ingresos_totales;
	
	@Column(name = "m_egresos_totales")
	private BigDecimal m_egresos_totales;

	public BigInfoFinancieraId getId() {
		return id;
	}

	public void setId(BigInfoFinancieraId id) {
		this.id = id;
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
