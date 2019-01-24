package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigMetasFuerzaComercialId implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	@Column
	private Date d_fecha;
	
	@Column
	private Integer i_cod_fuerza_comercial;
	
	@Column
	private Integer i_cod_segmento_producto;
	
	@Column
	private String i_categoria_asesor;
	
	@Column
	private String s_nombre_meta;

	public BigMetasFuerzaComercialId() {
		super();	
	}

	public BigMetasFuerzaComercialId(Date d_fecha, Integer i_cod_fuerza_comercial, Integer i_cod_segmento_producto,
			String i_categoria_asesor, String s_nombre_meta) {
		super();
		this.d_fecha = d_fecha;
		this.i_cod_fuerza_comercial = i_cod_fuerza_comercial;
		this.i_cod_segmento_producto = i_cod_segmento_producto;
		this.i_categoria_asesor = i_categoria_asesor;
		this.s_nombre_meta = s_nombre_meta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha == null) ? 0 : d_fecha.hashCode());
		result = prime * result + ((i_categoria_asesor == null) ? 0 : i_categoria_asesor.hashCode());
		result = prime * result + ((i_cod_fuerza_comercial == null) ? 0 : i_cod_fuerza_comercial.hashCode());
		result = prime * result + ((i_cod_segmento_producto == null) ? 0 : i_cod_segmento_producto.hashCode());
		result = prime * result + ((s_nombre_meta == null) ? 0 : s_nombre_meta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BigMetasFuerzaComercialId other = (BigMetasFuerzaComercialId) obj;
		if (d_fecha == null) {
			if (other.d_fecha != null)
				return false;
		} else if (!d_fecha.equals(other.d_fecha))
			return false;
		if (i_categoria_asesor == null) {
			if (other.i_categoria_asesor != null)
				return false;
		} else if (!i_categoria_asesor.equals(other.i_categoria_asesor))
			return false;
		if (i_cod_fuerza_comercial == null) {
			if (other.i_cod_fuerza_comercial != null)
				return false;
		} else if (!i_cod_fuerza_comercial.equals(other.i_cod_fuerza_comercial))
			return false;
		if (i_cod_segmento_producto == null) {
			if (other.i_cod_segmento_producto != null)
				return false;
		} else if (!i_cod_segmento_producto.equals(other.i_cod_segmento_producto))
			return false;
		if (s_nombre_meta == null) {
			if (other.s_nombre_meta != null)
				return false;
		} else if (!s_nombre_meta.equals(other.s_nombre_meta))
			return false;
		return true;
	}

	public Date getD_fecha() {
		return d_fecha;
	}

	public void setD_fecha(Date d_fecha) {
		this.d_fecha = d_fecha;
	}

	public Integer getI_cod_fuerza_comercial() {
		return i_cod_fuerza_comercial;
	}

	public void setI_cod_fuerza_comercial(Integer i_cod_fuerza_comercial) {
		this.i_cod_fuerza_comercial = i_cod_fuerza_comercial;
	}

	public Integer getI_cod_segmento_producto() {
		return i_cod_segmento_producto;
	}

	public void setI_cod_segmento_producto(Integer i_cod_segmento_producto) {
		this.i_cod_segmento_producto = i_cod_segmento_producto;
	}

	public String getI_categoria_asesor() {
		return i_categoria_asesor;
	}

	public void setI_categoria_asesor(String i_categoria_asesor) {
		this.i_categoria_asesor = i_categoria_asesor;
	}

	public String getS_nombre_meta() {
		return s_nombre_meta;
	}

	public void setS_nombre_meta(String s_nombre_meta) {
		this.s_nombre_meta = s_nombre_meta;
	}
}
