package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigIndicadoresId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private Integer i_id_indicador;
	
	@Column
	private Date d_fecha_fin;
	
	@Column
	private Date d_fecha_inicio;

	public BigIndicadoresId() {
		super();		
	}

	public BigIndicadoresId(Integer i_id_indicador, Date d_fecha_fin, Date d_fecha_inicio) {
		super();
		this.i_id_indicador = i_id_indicador;
		this.d_fecha_fin = d_fecha_fin;
		this.d_fecha_inicio = d_fecha_inicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_fin == null) ? 0 : d_fecha_fin.hashCode());
		result = prime * result + ((d_fecha_inicio == null) ? 0 : d_fecha_inicio.hashCode());
		result = prime * result + ((i_id_indicador == null) ? 0 : i_id_indicador.hashCode());
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
		BigIndicadoresId other = (BigIndicadoresId) obj;
		if (d_fecha_fin == null) {
			if (other.d_fecha_fin != null)
				return false;
		} else if (!d_fecha_fin.equals(other.d_fecha_fin))
			return false;
		if (d_fecha_inicio == null) {
			if (other.d_fecha_inicio != null)
				return false;
		} else if (!d_fecha_inicio.equals(other.d_fecha_inicio))
			return false;
		if (i_id_indicador == null) {
			if (other.i_id_indicador != null)
				return false;
		} else if (!i_id_indicador.equals(other.i_id_indicador))
			return false;
		return true;
	}

	public Integer getI_id_indicador() {
		return i_id_indicador;
	}

	public void setI_id_indicador(Integer i_id_indicador) {
		this.i_id_indicador = i_id_indicador;
	}

	public Date getD_fecha_fin() {
		return d_fecha_fin;
	}

	public void setD_fecha_fin(Date d_fecha_fin) {
		this.d_fecha_fin = d_fecha_fin;
	}

	public Date getD_fecha_inicio() {
		return d_fecha_inicio;
	}

	public void setD_fecha_inicio(Date d_fecha_inicio) {
		this.d_fecha_inicio = d_fecha_inicio;
	}


}
