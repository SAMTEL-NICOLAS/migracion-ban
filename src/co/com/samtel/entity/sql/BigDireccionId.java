package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class BigDireccionId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long i_identificacion_cliente;	

	private String s_cod_tipo_direccion;

	public BigDireccionId() {
		super();		
	}

	public BigDireccionId(Long i_identificacion_cliente, String s_cod_tipo_direccion) {
		super();
		this.i_identificacion_cliente = i_identificacion_cliente;
		this.s_cod_tipo_direccion = s_cod_tipo_direccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_identificacion_cliente == null) ? 0 : i_identificacion_cliente.hashCode());
		result = prime * result + ((s_cod_tipo_direccion == null) ? 0 : s_cod_tipo_direccion.hashCode());
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
		BigDireccionId other = (BigDireccionId) obj;
		if (i_identificacion_cliente == null) {
			if (other.i_identificacion_cliente != null)
				return false;
		} else if (!i_identificacion_cliente.equals(other.i_identificacion_cliente))
			return false;
		if (s_cod_tipo_direccion == null) {
			if (other.s_cod_tipo_direccion != null)
				return false;
		} else if (!s_cod_tipo_direccion.equals(other.s_cod_tipo_direccion))
			return false;
		return true;
	}

	public Long getI_identificacion_cliente() {
		return i_identificacion_cliente;
	}

	public void setI_identificacion_cliente(Long i_identificacion_cliente) {
		this.i_identificacion_cliente = i_identificacion_cliente;
	}

	public String getS_cod_tipo_direccion() {
		return s_cod_tipo_direccion;
	}

	public void setS_cod_tipo_direccion(String s_cod_tipo_direccion) {
		this.s_cod_tipo_direccion = s_cod_tipo_direccion;
	}
	
}
