package co.com.samtel.entity.manual.csv;

import java.math.BigDecimal;
import java.util.Date;

public class BigMetasFuerzaComercialCsv {
	
	private Date D_fecha;
	private String I_cod_fuerza_comercial;
	private Integer I_cod_segmento_producto;
	private String I_categoria_asesor;
	private String S_nombre_meta;
	private BigDecimal M_valor_meta;

	public Date getD_fecha() {
		return D_fecha;
	}

	public void setD_fecha(Date d_fecha) {
		D_fecha = d_fecha;
	}

	public String getI_cod_fuerza_comercial() {
		return I_cod_fuerza_comercial;
	}

	public void setI_cod_fuerza_comercial(String i_cod_fuerza_comercial) {
		I_cod_fuerza_comercial = i_cod_fuerza_comercial;
	}

	public Integer getI_cod_segmento_producto() {
		return I_cod_segmento_producto;
	}

	public void setI_cod_segmento_producto(Integer i_cod_segmento_producto) {
		I_cod_segmento_producto = i_cod_segmento_producto;
	}

	public String getI_categoria_asesor() {
		return I_categoria_asesor;
	}

	public void setI_categoria_asesor(String i_categoria_asesor) {
		I_categoria_asesor = i_categoria_asesor;
	}

	public String getS_nombre_meta() {
		return S_nombre_meta;
	}

	public void setS_nombre_meta(String s_nombre_meta) {
		S_nombre_meta = s_nombre_meta;
	}

	public BigDecimal getM_valor_meta() {
		return M_valor_meta;
	}

	public void setM_valor_meta(BigDecimal m_valor_meta) {
		M_valor_meta = m_valor_meta;
	}

	@Override
	public String toString() {
		return "BigMetasFuerzaComercialDto [D_fecha=" + D_fecha + ", I_cod_fuerza_comercial=" + I_cod_fuerza_comercial
				+ ", I_cod_segmento_producto=" + I_cod_segmento_producto + ", I_categoria_asesor=" + I_categoria_asesor
				+ ", S_nombre_meta=" + S_nombre_meta + ", M_valor_meta=" + M_valor_meta + "]";
	}

}
