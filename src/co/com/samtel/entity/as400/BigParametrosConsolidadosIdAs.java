package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigParametrosConsolidadosIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "cod_bander")
	private String s_nombre_tabla;
	
	@Column(name = "cod_refenc")
	private String s_codigo_referencia;
	
	@Column(name = "llave_iva")
	private String s_llave_iva;

	
	public BigParametrosConsolidadosIdAs() {
		super();		
	}

	
	public BigParametrosConsolidadosIdAs(String s_nombre_tabla, String s_codigo_referencia, String s_llave_iva) {
		super();
		this.s_nombre_tabla = s_nombre_tabla;
		this.s_codigo_referencia = s_codigo_referencia;
		this.s_llave_iva = s_llave_iva;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s_codigo_referencia == null) ? 0 : s_codigo_referencia.hashCode());
		result = prime * result + ((s_llave_iva == null) ? 0 : s_llave_iva.hashCode());
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
		BigParametrosConsolidadosIdAs other = (BigParametrosConsolidadosIdAs) obj;
		if (s_codigo_referencia == null) {
			if (other.s_codigo_referencia != null)
				return false;
		} else if (!s_codigo_referencia.equals(other.s_codigo_referencia))
			return false;
		if (s_llave_iva == null) {
			if (other.s_llave_iva != null)
				return false;
		} else if (!s_llave_iva.equals(other.s_llave_iva))
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


	public String getS_llave_iva() {
		return s_llave_iva;
	}


	public void setS_llave_iva(String s_llave_iva) {
		this.s_llave_iva = s_llave_iva;
	}
	
}
