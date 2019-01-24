package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigMetasOficinaId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String s_cod_oficina;
	
	@Column
	private Integer i_cod_segmento_producto;
	
	@Column
	private String s_nombre_meta;	
	
	@Column
	private Date d_fecha;

	public BigMetasOficinaId() {
		super();	
	}

	public BigMetasOficinaId(String s_cod_oficina, Integer i_cod_segmento_producto, String s_nombre_meta,
			Date d_fecha) {
		super();
		this.s_cod_oficina = s_cod_oficina;
		this.i_cod_segmento_producto = i_cod_segmento_producto;
		this.s_nombre_meta = s_nombre_meta;
		this.d_fecha = d_fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha == null) ? 0 : d_fecha.hashCode());
		result = prime * result + ((i_cod_segmento_producto == null) ? 0 : i_cod_segmento_producto.hashCode());
		result = prime * result + ((s_cod_oficina == null) ? 0 : s_cod_oficina.hashCode());
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
		BigMetasOficinaId other = (BigMetasOficinaId) obj;
		if (d_fecha == null) {
			if (other.d_fecha != null)
				return false;
		} else if (!d_fecha.equals(other.d_fecha))
			return false;
		if (i_cod_segmento_producto == null) {
			if (other.i_cod_segmento_producto != null)
				return false;
		} else if (!i_cod_segmento_producto.equals(other.i_cod_segmento_producto))
			return false;
		if (s_cod_oficina == null) {
			if (other.s_cod_oficina != null)
				return false;
		} else if (!s_cod_oficina.equals(other.s_cod_oficina))
			return false;
		if (s_nombre_meta == null) {
			if (other.s_nombre_meta != null)
				return false;
		} else if (!s_nombre_meta.equals(other.s_nombre_meta))
			return false;
		return true;
	}

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

}
