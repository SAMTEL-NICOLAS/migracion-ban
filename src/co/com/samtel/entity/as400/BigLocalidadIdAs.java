package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigLocalidadIdAs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "cod_dept")
	private String i_cod_depto;	

	@Column(name = "cod_ciud")
	private String s_cod_ciudad;
	
	@Column(name = "cod_loca")
	private String i_cod_localidad;

	public BigLocalidadIdAs() {
		super();
	}

	public BigLocalidadIdAs(String i_cod_depto, String s_cod_ciudad, String i_cod_localidad) {
		super();
		this.i_cod_depto = i_cod_depto;
		this.s_cod_ciudad = s_cod_ciudad;
		this.i_cod_localidad = i_cod_localidad;
	}

	public String getI_cod_depto() {
		return i_cod_depto;
	}

	public void setI_cod_depto(String i_cod_depto) {
		this.i_cod_depto = i_cod_depto;
	}

	public String getS_cod_ciudad() {
		return s_cod_ciudad;
	}

	public void setS_cod_ciudad(String s_cod_ciudad) {
		this.s_cod_ciudad = s_cod_ciudad;
	}

	public String getI_cod_localidad() {
		return i_cod_localidad;
	}

	public void setI_cod_localidad(String i_cod_localidad) {
		this.i_cod_localidad = i_cod_localidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_cod_depto == null) ? 0 : i_cod_depto.hashCode());
		result = prime * result + ((i_cod_localidad == null) ? 0 : i_cod_localidad.hashCode());
		result = prime * result + ((s_cod_ciudad == null) ? 0 : s_cod_ciudad.hashCode());
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
		BigLocalidadIdAs other = (BigLocalidadIdAs) obj;
		if (i_cod_depto == null) {
			if (other.i_cod_depto != null)
				return false;
		} else if (!i_cod_depto.equals(other.i_cod_depto))
			return false;
		if (i_cod_localidad == null) {
			if (other.i_cod_localidad != null)
				return false;
		} else if (!i_cod_localidad.equals(other.i_cod_localidad))
			return false;
		if (s_cod_ciudad == null) {
			if (other.s_cod_ciudad != null)
				return false;
		} else if (!s_cod_ciudad.equals(other.s_cod_ciudad))
			return false;
		return true;
	}
	
	
}
