package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigBarriosId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column
	private String i_cod_ciudad;	

	@Column
	private String i_cod_barrio;

	public BigBarriosId() {
		super();		
	}

	public BigBarriosId(String i_cod_ciudad, String i_cod_barrio) {
		super();
		this.i_cod_ciudad = i_cod_ciudad;
		this.i_cod_barrio = i_cod_barrio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_cod_barrio == null) ? 0 : i_cod_barrio.hashCode());
		result = prime * result + ((i_cod_ciudad == null) ? 0 : i_cod_ciudad.hashCode());
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
		BigBarriosId other = (BigBarriosId) obj;
		if (i_cod_barrio == null) {
			if (other.i_cod_barrio != null)
				return false;
		} else if (!i_cod_barrio.equals(other.i_cod_barrio))
			return false;
		if (i_cod_ciudad == null) {
			if (other.i_cod_ciudad != null)
				return false;
		} else if (!i_cod_ciudad.equals(other.i_cod_ciudad))
			return false;
		return true;
	}

	public String getI_cod_ciudad() {
		return i_cod_ciudad;
	}

	public void setI_cod_ciudad(String i_cod_ciudad) {
		this.i_cod_ciudad = i_cod_ciudad;
	}

	public String getI_cod_barrio() {
		return i_cod_barrio;
	}

	public void setI_cod_barrio(String i_cod_barrio) {
		this.i_cod_barrio = i_cod_barrio;
	}	

}
