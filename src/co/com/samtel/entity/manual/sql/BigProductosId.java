package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigProductosId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column		
	private Integer i_cod_sub_producto;
	
	@Column
	private Date d_fecha_corte;

	public BigProductosId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigProductosId(Integer i_cod_sub_producto, Date d_fecha_corte) {
		super();
		this.i_cod_sub_producto = i_cod_sub_producto;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_cod_sub_producto == null) ? 0 : i_cod_sub_producto.hashCode());
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
		BigProductosId other = (BigProductosId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_cod_sub_producto == null) {
			if (other.i_cod_sub_producto != null)
				return false;
		} else if (!i_cod_sub_producto.equals(other.i_cod_sub_producto))
			return false;
		return true;
	}

	public Integer getI_cod_sub_producto() {
		return i_cod_sub_producto;
	}

	public void setI_cod_sub_producto(Integer i_cod_sub_producto) {
		this.i_cod_sub_producto = i_cod_sub_producto;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}
	
	

}
