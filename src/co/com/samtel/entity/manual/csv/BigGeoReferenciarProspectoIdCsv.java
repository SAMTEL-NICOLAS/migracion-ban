package co.com.samtel.entity.manual.csv;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

/**
*
* @author Jeferson
*/
public class BigGeoReferenciarProspectoIdCsv implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private String i_tipo_persona;

	@Column
	private String s_codigo_persona;

	@Column
	private Date d_fecha_corte;

	public BigGeoReferenciarProspectoIdCsv() {
		super();
	}

	public BigGeoReferenciarProspectoIdCsv(String i_tipo_persona, String s_codigo_persona, Date d_fecha_corte) {
		super();
		this.i_tipo_persona = i_tipo_persona;
		this.s_codigo_persona = s_codigo_persona;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_tipo_persona == null) ? 0 : i_tipo_persona.hashCode());
		result = prime * result + ((s_codigo_persona == null) ? 0 : s_codigo_persona.hashCode());
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
		BigGeoReferenciarProspectoIdCsv other = (BigGeoReferenciarProspectoIdCsv) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_tipo_persona == null) {
			if (other.i_tipo_persona != null)
				return false;
		} else if (!i_tipo_persona.equals(other.i_tipo_persona))
			return false;
		if (s_codigo_persona == null) {
			if (other.s_codigo_persona != null)
				return false;
		} else if (!s_codigo_persona.equals(other.s_codigo_persona))
			return false;
		return true;
	}

	public String getI_tipo_persona() {
		return i_tipo_persona;
	}

	public void setI_tipo_persona(String i_tipo_persona) {
		this.i_tipo_persona = i_tipo_persona;
	}

	public String getS_codigo_persona() {
		return s_codigo_persona;
	}

	public void setS_codigo_persona(String s_codigo_persona) {
		this.s_codigo_persona = s_codigo_persona;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}

}
