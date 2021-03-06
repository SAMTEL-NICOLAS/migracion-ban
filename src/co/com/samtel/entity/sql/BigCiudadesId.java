package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class BigCiudadesId implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
	private String i_cod_ciudad;	

	private String i_cod_depto;

	public BigCiudadesId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigCiudadesId(String i_cod_ciudad, String i_cod_depto) {
		super();
		this.i_cod_ciudad = i_cod_ciudad;
		this.i_cod_depto = i_cod_depto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_cod_ciudad == null) ? 0 : i_cod_ciudad.hashCode());
		result = prime * result + ((i_cod_depto == null) ? 0 : i_cod_depto.hashCode());
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
		BigCiudadesId other = (BigCiudadesId) obj;
		if (i_cod_ciudad == null) {
			if (other.i_cod_ciudad != null)
				return false;
		} else if (!i_cod_ciudad.equals(other.i_cod_ciudad))
			return false;
		if (i_cod_depto == null) {
			if (other.i_cod_depto != null)
				return false;
		} else if (!i_cod_depto.equals(other.i_cod_depto))
			return false;
		return true;
	}

	public String getI_cod_ciudad() {
		return i_cod_ciudad;
	}

	public void setI_cod_ciudad(String i_cod_ciudad) {
		this.i_cod_ciudad = i_cod_ciudad;
	}

	public String getI_cod_depto() {
		return i_cod_depto;
	}

	public void setI_cod_depto(String i_cod_depto) {
		this.i_cod_depto = i_cod_depto;
	}
}
