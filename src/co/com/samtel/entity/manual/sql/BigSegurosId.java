package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class BigSegurosId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column		
	private String s_plan;
	
	@Column
	private Integer i_cod_producto;
	
	@Column
	private Long i_codigo_cliente;
	
	@Column
	private Date d_fecha_corte;

	public BigSegurosId() {
		super();		
	}

	public BigSegurosId(String s_plan, Integer i_cod_producto, Long i_codigo_cliente, Date d_fecha_corte) {
		super();
		this.s_plan = s_plan;
		this.i_cod_producto = i_cod_producto;
		this.i_codigo_cliente = i_codigo_cliente;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_cod_producto == null) ? 0 : i_cod_producto.hashCode());
		result = prime * result + ((i_codigo_cliente == null) ? 0 : i_codigo_cliente.hashCode());
		result = prime * result + ((s_plan == null) ? 0 : s_plan.hashCode());
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
		BigSegurosId other = (BigSegurosId) obj;
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
		if (i_codigo_cliente == null) {
			if (other.i_codigo_cliente != null)
				return false;
		} else if (!i_codigo_cliente.equals(other.i_codigo_cliente))
			return false;
		if (s_plan == null) {
			if (other.s_plan != null)
				return false;
		} else if (!s_plan.equals(other.s_plan))
			return false;
		return true;
	}

	public String getS_plan() {
		return s_plan;
	}

	public void setS_plan(String s_plan) {
		this.s_plan = s_plan;
	}

	public Integer getI_cod_producto() {
		return i_cod_producto;
	}

	public void setI_cod_producto(Integer i_cod_producto) {
		this.i_cod_producto = i_cod_producto;
	}

	public 	Long getI_codigo_cliente() {
		return i_codigo_cliente;
	}

	public void setI_codigo_cliente(Long i_codigo_cliente) {
		this.i_codigo_cliente = i_codigo_cliente;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}
}
