package co.com.samtel.entity.manual.csv;

import java.math.BigDecimal;
import java.util.Date;

public class BigIndicadoresCsv {

	private Date D_fecha_inicio;
	private Date D_fecha_fin;
	private Integer I_id_indicador;
	private String S_nombre_indicador;
	private BigDecimal M_limite_bajo;
	private String S_color_limite_bajo;
	private BigDecimal M_limite_medio;
	private String S_color_limite_medio;
	private BigDecimal M_limite_alto;
	private String S_color_limite_alto;

	public Date getD_fecha_inicio() {
		return D_fecha_inicio;
	}

	public void setD_fecha_inicio(Date d_fecha_inicio) {
		D_fecha_inicio = d_fecha_inicio;
	}

	public Date getD_fecha_fin() {
		return D_fecha_fin;
	}

	public void setD_fecha_fin(Date d_fecha_fin) {
		D_fecha_fin = d_fecha_fin;
	}

	public Integer getI_id_indicador() {
		return I_id_indicador;
	}

	public void setI_id_indicador(Integer i_id_indicador) {
		I_id_indicador = i_id_indicador;
	}

	public String getS_nombre_indicador() {
		return S_nombre_indicador;
	}

	public void setS_nombre_indicador(String s_nombre_indicador) {
		S_nombre_indicador = s_nombre_indicador;
	}

	public BigDecimal getM_limite_bajo() {
		return M_limite_bajo;
	}

	public void setM_limite_bajo(BigDecimal m_limite_bajo) {
		M_limite_bajo = m_limite_bajo;
	}

	public String getS_color_limite_bajo() {
		return S_color_limite_bajo;
	}

	public void setS_color_limite_bajo(String s_color_limite_bajo) {
		S_color_limite_bajo = s_color_limite_bajo;
	}

	public BigDecimal getM_limite_medio() {
		return M_limite_medio;
	}

	public void setM_limite_medio(BigDecimal m_limite_medio) {
		M_limite_medio = m_limite_medio;
	}

	public String getS_color_limite_medio() {
		return S_color_limite_medio;
	}

	public void setS_color_limite_medio(String s_color_limite_medio) {
		S_color_limite_medio = s_color_limite_medio;
	}

	public BigDecimal getM_limite_alto() {
		return M_limite_alto;
	}

	public void setM_limite_alto(BigDecimal m_limite_alto) {
		M_limite_alto = m_limite_alto;
	}

	public String getS_color_limite_alto() {
		return S_color_limite_alto;
	}

	public void setS_color_limite_alto(String s_color_limite_alto) {
		S_color_limite_alto = s_color_limite_alto;
	}

	@Override
	public String toString() {
		return "BigIndicadoresDto [D_fecha_inicio=" + D_fecha_inicio + ", D_fecha_fin=" + D_fecha_fin
				+ ", I_id_indicador=" + I_id_indicador + ", S_nombre_indicador=" + S_nombre_indicador
				+ ", M_limite_bajo=" + M_limite_bajo + ", S_color_limite_bajo=" + S_color_limite_bajo
				+ ", M_limite_medio=" + M_limite_medio + ", S_color_limite_medio=" + S_color_limite_medio
				+ ", M_limite_alto=" + M_limite_alto + ", S_color_limite_alto=" + S_color_limite_alto + "]";
	}

}
