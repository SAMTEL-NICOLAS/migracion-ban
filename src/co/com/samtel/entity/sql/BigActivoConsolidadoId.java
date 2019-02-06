package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigActivoConsolidadoId implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private Long i_identificacion_cliente;	
	
	@Column
	private String s_cod_producto;	
	
	@Column
	private Date d_fecha_corte;

	
	public BigActivoConsolidadoId() {
		super();	
	}	

	public BigActivoConsolidadoId(Long i_identificacion_cliente, String s_cod_producto, Date d_fecha_corte) {
		super();
		this.i_identificacion_cliente = i_identificacion_cliente;
		this.s_cod_producto = s_cod_producto;
		this.d_fecha_corte = d_fecha_corte;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_identificacion_cliente == null) ? 0 : i_identificacion_cliente.hashCode());
		result = prime * result + ((s_cod_producto == null) ? 0 : s_cod_producto.hashCode());
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
		BigActivoConsolidadoId other = (BigActivoConsolidadoId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_identificacion_cliente == null) {
			if (other.i_identificacion_cliente != null)
				return false;
		} else if (!i_identificacion_cliente.equals(other.i_identificacion_cliente))
			return false;
		if (s_cod_producto == null) {
			if (other.s_cod_producto != null)
				return false;
		} else if (!s_cod_producto.equals(other.s_cod_producto))
			return false;
		return true;
	}

	public Long getI_identificacion_cliente() {
		return i_identificacion_cliente;
	}

	public void setI_identificacion_cliente(Long i_identificacion_cliente) {
		this.i_identificacion_cliente = i_identificacion_cliente;
	}

	public String getS_cod_producto() {
		return s_cod_producto;
	}

	public void setS_cod_producto(String s_cod_producto) {
		this.s_cod_producto = s_cod_producto;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}	
}
