package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigProspectosId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String s_codigo_tipo_identificacion;
	
	@Column
	private String s_numero_identificacion;
	
	@Column
	private Integer i_numero_carpeta;	
	
	@Column
	private Date d_fecha_cargue;

	public BigProspectosId() {
		super();
	}

	public BigProspectosId(String s_codigo_tipo_identificacion, String s_numero_identificacion,
			Integer i_numero_carpeta, Date d_fecha_cargue) {
		super();
		this.s_codigo_tipo_identificacion = s_codigo_tipo_identificacion;
		this.s_numero_identificacion = s_numero_identificacion;
		this.i_numero_carpeta = i_numero_carpeta;
		this.d_fecha_cargue = d_fecha_cargue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_cargue == null) ? 0 : d_fecha_cargue.hashCode());
		result = prime * result + ((i_numero_carpeta == null) ? 0 : i_numero_carpeta.hashCode());
		result = prime * result
				+ ((s_codigo_tipo_identificacion == null) ? 0 : s_codigo_tipo_identificacion.hashCode());
		result = prime * result + ((s_numero_identificacion == null) ? 0 : s_numero_identificacion.hashCode());
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
		BigProspectosId other = (BigProspectosId) obj;
		if (d_fecha_cargue == null) {
			if (other.d_fecha_cargue != null)
				return false;
		} else if (!d_fecha_cargue.equals(other.d_fecha_cargue))
			return false;
		if (i_numero_carpeta == null) {
			if (other.i_numero_carpeta != null)
				return false;
		} else if (!i_numero_carpeta.equals(other.i_numero_carpeta))
			return false;
		if (s_codigo_tipo_identificacion == null) {
			if (other.s_codigo_tipo_identificacion != null)
				return false;
		} else if (!s_codigo_tipo_identificacion.equals(other.s_codigo_tipo_identificacion))
			return false;
		if (s_numero_identificacion == null) {
			if (other.s_numero_identificacion != null)
				return false;
		} else if (!s_numero_identificacion.equals(other.s_numero_identificacion))
			return false;
		return true;
	}

	public String getS_codigo_tipo_identificacion() {
		return s_codigo_tipo_identificacion;
	}

	public void setS_codigo_tipo_identificacion(String s_codigo_tipo_identificacion) {
		this.s_codigo_tipo_identificacion = s_codigo_tipo_identificacion;
	}

	public String getS_numero_identificacion() {
		return s_numero_identificacion;
	}

	public void setS_numero_identificacion(String s_numero_identificacion) {
		this.s_numero_identificacion = s_numero_identificacion;
	}

	public Integer getI_numero_carpeta() {
		return i_numero_carpeta;
	}

	public void setI_numero_carpeta(Integer i_numero_carpeta) {
		this.i_numero_carpeta = i_numero_carpeta;
	}

	public Date getD_fecha_cargue() {
		return d_fecha_cargue;
	}

	public void setD_fecha_cargue(Date d_fecha_cargue) {
		this.d_fecha_cargue = d_fecha_cargue;
	}

}
