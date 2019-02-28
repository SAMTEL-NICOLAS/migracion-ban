package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CnofcIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "cnocfl")
	private String cnocfl;
	
	@Column(name = "cnorcd")
	private String codigo_asesor;

	public CnofcIdAs() {
		super();
	}

	public CnofcIdAs(String cnocfl, String codigo_asesor) {
		super();
		this.cnocfl = cnocfl;
		this.codigo_asesor = codigo_asesor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnocfl == null) ? 0 : cnocfl.hashCode());
		result = prime * result + ((codigo_asesor == null) ? 0 : codigo_asesor.hashCode());
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
		CnofcIdAs other = (CnofcIdAs) obj;
		if (cnocfl == null) {
			if (other.cnocfl != null)
				return false;
		} else if (!cnocfl.equals(other.cnocfl))
			return false;
		if (codigo_asesor == null) {
			if (other.codigo_asesor != null)
				return false;
		} else if (!codigo_asesor.equals(other.codigo_asesor))
			return false;
		return true;
	}

	public String getCnocfl() {
		return cnocfl;
	}

	public void setCnocfl(String cnocfl) {
		this.cnocfl = cnocfl;
	}

	public String getCodigo_asesor() {
		return codigo_asesor;
	}

	public void setCodigo_asesor(String codigo_asesor) {
		this.codigo_asesor = codigo_asesor;
	}
}
