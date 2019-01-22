package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigEjecutivoIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "codigo_ase")
	private String i_codigo_asesor;
			
	@Column(name = "tipo_estad")
	private String s_tipo_estado;

	public BigEjecutivoIdAs() {
		super();		
	}

	public BigEjecutivoIdAs(String i_codigo_asesor, String s_tipo_estado) {
		super();
		this.i_codigo_asesor = i_codigo_asesor;
		this.s_tipo_estado = s_tipo_estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_codigo_asesor == null) ? 0 : i_codigo_asesor.hashCode());
		result = prime * result + ((s_tipo_estado == null) ? 0 : s_tipo_estado.hashCode());
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
		BigEjecutivoIdAs other = (BigEjecutivoIdAs) obj;
		if (i_codigo_asesor == null) {
			if (other.i_codigo_asesor != null)
				return false;
		} else if (!i_codigo_asesor.equals(other.i_codigo_asesor))
			return false;
		if (s_tipo_estado == null) {
			if (other.s_tipo_estado != null)
				return false;
		} else if (!s_tipo_estado.equals(other.s_tipo_estado))
			return false;
		return true;
	}

	public String getI_codigo_asesor() {
		return i_codigo_asesor;
	}

	public void setI_codigo_asesor(String i_codigo_asesor) {
		this.i_codigo_asesor = i_codigo_asesor;
	}

	public String getS_tipo_estado() {
		return s_tipo_estado;
	}

	public void setS_tipo_estado(String s_tipo_estado) {
		this.s_tipo_estado = s_tipo_estado;
	}	

}
