package co.com.samtel.entity.manual.csv;

import java.math.BigDecimal;
import java.util.Date;

public class BigMetasOficinaCsv {

	private BigDecimal m_valor_meta;	
	private String s_cod_oficina;
	private Integer i_cod_segmento_producto;
	private String s_nombre_meta;
	private Date d_fecha;

	
	public String getS_cod_oficina() {
		return s_cod_oficina;
	}

	public void setS_cod_oficina(String s_cod_oficina) {
		this.s_cod_oficina = s_cod_oficina;
	}

	public Integer getI_cod_segmento_producto() {
		return i_cod_segmento_producto;
	}

	public void setI_cod_segmento_producto(Integer i_cod_segmento_producto) {
		this.i_cod_segmento_producto = i_cod_segmento_producto;
	}

	public String getS_nombre_meta() {
		return s_nombre_meta;
	}

	public void setS_nombre_meta(String s_nombre_meta) {
		this.s_nombre_meta = s_nombre_meta;
	}

	public Date getD_fecha() {
		return d_fecha;
	}

	public void setD_fecha(Date d_fecha) {
		this.d_fecha = d_fecha;
	}

	public BigDecimal getM_valor_meta() {
		return m_valor_meta;
	}

	public void setM_valor_meta(BigDecimal m_valor_meta) {
		this.m_valor_meta = m_valor_meta;
	}

	@Override
	public String toString() {
		return "BigMetasOficinaCsv [m_valor_meta=" + m_valor_meta + ", s_cod_oficina=" + s_cod_oficina
				+ ", i_cod_segmento_producto=" + i_cod_segmento_producto + ", s_nombre_meta=" + s_nombre_meta
				+ ", d_fecha=" + d_fecha + "]";
	}

}
