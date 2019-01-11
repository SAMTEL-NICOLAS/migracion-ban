package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigPasivosCdtId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private Long i_portafolio;
	
	@Column
	private Date d_fecha_cierre;

	public BigPasivosCdtId() {
		super();		
	}

	public BigPasivosCdtId(Long i_portafolio, Date d_fecha_cierre) {
		super();
		this.i_portafolio = i_portafolio;
		this.d_fecha_cierre = d_fecha_cierre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_cierre == null) ? 0 : d_fecha_cierre.hashCode());
		result = prime * result + ((i_portafolio == null) ? 0 : i_portafolio.hashCode());
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
		BigPasivosCdtId other = (BigPasivosCdtId) obj;
		if (d_fecha_cierre == null) {
			if (other.d_fecha_cierre != null)
				return false;
		} else if (!d_fecha_cierre.equals(other.d_fecha_cierre))
			return false;
		if (i_portafolio == null) {
			if (other.i_portafolio != null)
				return false;
		} else if (!i_portafolio.equals(other.i_portafolio))
			return false;
		return true;
	}

	public Long getI_portafolio() {
		return i_portafolio;
	}

	public void setI_portafolio(Long i_portafolio) {
		this.i_portafolio = i_portafolio;
	}

	public Date getD_fecha_cierre() {
		return d_fecha_cierre;
	}

	public void setD_fecha_cierre(Date d_fecha_cierre) {
		this.d_fecha_cierre = d_fecha_cierre;
	}
	
}
