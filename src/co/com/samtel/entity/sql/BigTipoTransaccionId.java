package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigTipoTransaccionId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private String i_codigo_transaccion;

	@Column
	private String s_descripcion_transaccion;

	public BigTipoTransaccionId() {
		super();		
	}

	public BigTipoTransaccionId(String i_codigo_transaccion, String s_descripcion_transaccion) {
		super();
		this.i_codigo_transaccion = i_codigo_transaccion;
		this.s_descripcion_transaccion = s_descripcion_transaccion;
	
	}

	public String getI_codigo_transaccion() {
		return i_codigo_transaccion;
	}

	public void setI_codigo_transaccion(String i_codigo_transaccion) {
		this.i_codigo_transaccion = i_codigo_transaccion;
	}

	public String getS_descripcion_transaccion() {
		return s_descripcion_transaccion;
	}

	public void setS_descripcion_transaccion(String s_descripcion_transaccion) {
		this.s_descripcion_transaccion = s_descripcion_transaccion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_codigo_transaccion == null) ? 0 : i_codigo_transaccion.hashCode());
		result = prime * result + ((s_descripcion_transaccion == null) ? 0 : s_descripcion_transaccion.hashCode());
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
		BigTipoTransaccionId other = (BigTipoTransaccionId) obj;
		if (i_codigo_transaccion == null) {
			if (other.i_codigo_transaccion != null)
				return false;
		} else if (!i_codigo_transaccion.equals(other.i_codigo_transaccion))
			return false;
		if (s_descripcion_transaccion == null) {
			if (other.s_descripcion_transaccion != null)
				return false;
		} else if (!s_descripcion_transaccion.equals(other.s_descripcion_transaccion))
			return false;		
		return true;
	}
	
	

}
