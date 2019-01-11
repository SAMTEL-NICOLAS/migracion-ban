package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigTipoTransaccionIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "cod_transa")
	private String i_codigo_transaccion;

	@Column(name = "des_transa")
	private String s_descripcion_transaccion;

	@Column(name = "llave_iva")
	private String s_llave_iva;

	public BigTipoTransaccionIdAs() {
		super();
	
	}
	
	public BigTipoTransaccionIdAs(String i_codigo_transaccion, String s_descripcion_transaccion, String s_llave_iva) {
		super();
		this.i_codigo_transaccion = i_codigo_transaccion;
		this.s_descripcion_transaccion = s_descripcion_transaccion;
		this.s_llave_iva = s_llave_iva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_codigo_transaccion == null) ? 0 : i_codigo_transaccion.hashCode());
		result = prime * result + ((s_descripcion_transaccion == null) ? 0 : s_descripcion_transaccion.hashCode());
		result = prime * result + ((s_llave_iva == null) ? 0 : s_llave_iva.hashCode());
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
		BigTipoTransaccionIdAs other = (BigTipoTransaccionIdAs) obj;
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
		if (s_llave_iva == null) {
			if (other.s_llave_iva != null)
				return false;
		} else if (!s_llave_iva.equals(other.s_llave_iva))
			return false;
		return true;
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

	public String getS_llave_iva() {
		return s_llave_iva;
	}

	public void setS_llave_iva(String s_llave_iva) {
		this.s_llave_iva = s_llave_iva;
	}
	
}
