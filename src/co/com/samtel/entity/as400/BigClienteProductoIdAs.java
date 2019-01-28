package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BigClienteProductoIdAs implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "crterc")
	private String s_tercero;
	
	@Column(name = "crnupr")
	private Long i_cod_producto;
	
	@Column(name = "crctac")
	private Long s_cuenta_contable;
	
	@Transient
	private Date d_fecha_corte;

	public BigClienteProductoIdAs() {
		super();	
	}

	public BigClienteProductoIdAs(String s_tercero, Long i_cod_producto, Long s_cuenta_contable, Date d_fecha_corte) {
		super();
		this.s_tercero = s_tercero;
		this.i_cod_producto = i_cod_producto;
		this.s_cuenta_contable = s_cuenta_contable;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_cod_producto == null) ? 0 : i_cod_producto.hashCode());
		result = prime * result + ((s_cuenta_contable == null) ? 0 : s_cuenta_contable.hashCode());
		result = prime * result + ((s_tercero == null) ? 0 : s_tercero.hashCode());
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
		BigClienteProductoIdAs other = (BigClienteProductoIdAs) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_cod_producto == null) {
			if (other.i_cod_producto != null)
				return false;
		} else if (!i_cod_producto.equals(other.i_cod_producto))
			return false;
		if (s_cuenta_contable == null) {
			if (other.s_cuenta_contable != null)
				return false;
		} else if (!s_cuenta_contable.equals(other.s_cuenta_contable))
			return false;
		if (s_tercero == null) {
			if (other.s_tercero != null)
				return false;
		} else if (!s_tercero.equals(other.s_tercero))
			return false;
		return true;
	}

	public String getS_tercero() {
		return s_tercero;
	}

	public void setS_tercero(String s_tercero) {
		this.s_tercero = s_tercero;
	}

	public Long getI_cod_producto() {
		return i_cod_producto;
	}

	public void setI_cod_producto(Long i_cod_producto) {
		this.i_cod_producto = i_cod_producto;
	}

	public Long getS_cuenta_contable() {
		return s_cuenta_contable;
	}

	public void setS_cuenta_contable(Long s_cuenta_contable) {
		this.s_cuenta_contable = s_cuenta_contable;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}	
}
