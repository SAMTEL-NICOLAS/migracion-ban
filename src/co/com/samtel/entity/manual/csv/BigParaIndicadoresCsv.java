package co.com.samtel.entity.manual.csv;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Jeferson
 */
@Entity
@Table(name = "Big Para Indicadores")
public class BigParaIndicadoresCsv implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigParaIndicadoresIdCsv id;

	@Column(name = "s_nombre_indicador")
	private String s_nombre_indicador;

	@Column(name = "m_limite_bajo")
	private BigDecimal m_limite_bajo;

	@Column(name = "s_color_limite_bajo")
	private String s_color_limite_bajo;

	@Column(name = "m_limite_medio")
	private BigDecimal m_limite_medio;

	@Column(name = "s_color_limite_medio")
	private String s_color_limite_medio;

	@Column(name = "m_limite_alto")
	private BigDecimal m_limite_alto;

	@Column(name = "s_color_limite_alto")
	private String s_color_limite_alto;

	public BigParaIndicadoresIdCsv getId() {
		return id;
	}

	public void setId(BigParaIndicadoresIdCsv id) {
		this.id = id;
	}

	public String getS_nombre_indicador() {
		return s_nombre_indicador;
	}

	public void setS_nombre_indicador(String s_nombre_indicador) {
		this.s_nombre_indicador = s_nombre_indicador;
	}

	public BigDecimal getM_limite_bajo() {
		return m_limite_bajo;
	}

	public void setM_limite_bajo(BigDecimal m_limite_bajo) {
		this.m_limite_bajo = m_limite_bajo;
	}

	public String getS_color_limite_bajo() {
		return s_color_limite_bajo;
	}

	public void setS_color_limite_bajo(String s_color_limite_bajo) {
		this.s_color_limite_bajo = s_color_limite_bajo;
	}

	public BigDecimal getM_limite_medio() {
		return m_limite_medio;
	}

	public void setM_limite_medio(BigDecimal m_limite_medio) {
		this.m_limite_medio = m_limite_medio;
	}

	public String getS_color_limite_medio() {
		return s_color_limite_medio;
	}

	public void setS_color_limite_medio(String s_color_limite_medio) {
		this.s_color_limite_medio = s_color_limite_medio;
	}

	public BigDecimal getM_limite_alto() {
		return m_limite_alto;
	}

	public void setM_limite_alto(BigDecimal m_limite_alto) {
		this.m_limite_alto = m_limite_alto;
	}

	public String getS_color_limite_alto() {
		return s_color_limite_alto;
	}

	public void setS_color_limite_alto(String s_color_limite_alto) {
		this.s_color_limite_alto = s_color_limite_alto;
	}

}
