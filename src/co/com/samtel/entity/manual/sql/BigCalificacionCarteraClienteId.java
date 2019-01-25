package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigCalificacionCarteraClienteId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String i_codigo_cliente;
	
	@Column
	private Long i_cod_operacion;
	
	@Column
	private Date d_fecha_carga;

	public BigCalificacionCarteraClienteId() {
		super();		
	}

	public BigCalificacionCarteraClienteId(String i_codigo_cliente, Long i_cod_operacion, Date d_fecha_carga) {
		super();
		this.i_codigo_cliente = i_codigo_cliente;
		this.i_cod_operacion = i_cod_operacion;
		this.d_fecha_carga = d_fecha_carga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_carga == null) ? 0 : d_fecha_carga.hashCode());
		result = prime * result + ((i_cod_operacion == null) ? 0 : i_cod_operacion.hashCode());
		result = prime * result + ((i_codigo_cliente == null) ? 0 : i_codigo_cliente.hashCode());
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
		BigCalificacionCarteraClienteId other = (BigCalificacionCarteraClienteId) obj;
		if (d_fecha_carga == null) {
			if (other.d_fecha_carga != null)
				return false;
		} else if (!d_fecha_carga.equals(other.d_fecha_carga))
			return false;
		if (i_cod_operacion == null) {
			if (other.i_cod_operacion != null)
				return false;
		} else if (!i_cod_operacion.equals(other.i_cod_operacion))
			return false;
		if (i_codigo_cliente == null) {
			if (other.i_codigo_cliente != null)
				return false;
		} else if (!i_codigo_cliente.equals(other.i_codigo_cliente))
			return false;
		return true;
	}

	public String getI_codigo_cliente() {
		return i_codigo_cliente;
	}

	public void setI_codigo_cliente(String i_codigo_cliente) {
		this.i_codigo_cliente = i_codigo_cliente;
	}

	public Long getI_cod_operacion() {
		return i_cod_operacion;
	}

	public void setI_cod_operacion(Long i_cod_operacion) {
		this.i_cod_operacion = i_cod_operacion;
	}

	public Date getD_fecha_carga() {
		return d_fecha_carga;
	}

	public void setD_fecha_carga(Date d_fecha_carga) {
		this.d_fecha_carga = d_fecha_carga;
	}

}
