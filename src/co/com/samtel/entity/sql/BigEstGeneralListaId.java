package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigEstGeneralListaId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Column
	private String s_nombre_tabla;
	@Column
	private String s_codigo_referencia;

	
	public BigEstGeneralListaId() {
		super();	
	}



	public BigEstGeneralListaId(String s_nombre_tabla, String s_codigo_referencia) {
		super();
		this.s_nombre_tabla = s_nombre_tabla;
		this.s_codigo_referencia = s_codigo_referencia;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s_codigo_referencia == null) ? 0 : s_codigo_referencia.hashCode());
		result = prime * result + ((s_nombre_tabla == null) ? 0 : s_nombre_tabla.hashCode());
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
		BigEstGeneralListaId other = (BigEstGeneralListaId) obj;
		if (s_codigo_referencia == null) {
			if (other.s_codigo_referencia != null)
				return false;
		} else if (!s_codigo_referencia.equals(other.s_codigo_referencia))
			return false;
		if (s_nombre_tabla == null) {
			if (other.s_nombre_tabla != null)
				return false;
		} else if (!s_nombre_tabla.equals(other.s_nombre_tabla))
			return false;
		return true;
	}



	public String getS_nombre_tabla() {
		return s_nombre_tabla;
	}



	public void setS_nombre_tabla(String s_nombre_tabla) {
		this.s_nombre_tabla = s_nombre_tabla;
	}



	public String getS_codigo_referencia() {
		return s_codigo_referencia;
	}



	public void setS_codigo_referencia(String s_codigo_referencia) {
		this.s_codigo_referencia = s_codigo_referencia;
	}

	
	
}
