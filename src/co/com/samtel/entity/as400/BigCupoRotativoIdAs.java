package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BigCupoRotativoIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	@Column(name = "numpro")
	private Long s_cod_producto_core;	
	
	@Transient
	private Date d_fecha_corte;

	public BigCupoRotativoIdAs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigCupoRotativoIdAs(Long s_cod_producto_core, Date d_fecha_corte) {
		super();
		this.s_cod_producto_core = s_cod_producto_core;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((s_cod_producto_core == null) ? 0 : s_cod_producto_core.hashCode());
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
		BigCupoRotativoIdAs other = (BigCupoRotativoIdAs) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (s_cod_producto_core == null) {
			if (other.s_cod_producto_core != null)
				return false;
		} else if (!s_cod_producto_core.equals(other.s_cod_producto_core))
			return false;
		return true;
	}

	public Long getS_cod_producto_core() {
		return s_cod_producto_core;
	}

	public void setS_cod_producto_core(Long s_cod_producto_core) {
		this.s_cod_producto_core = s_cod_producto_core;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}

	
	
}
