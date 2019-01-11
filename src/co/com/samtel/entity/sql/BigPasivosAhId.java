package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigPasivosAhId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private Long i_codigo_cuenta;
	
	@Column
	private Date d_fecha_corte;

	public BigPasivosAhId() {
		super();
		
	}

	public BigPasivosAhId(Long i_codigo_cuenta, Date d_fecha_corte) {
		super();
		this.i_codigo_cuenta = i_codigo_cuenta;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_codigo_cuenta == null) ? 0 : i_codigo_cuenta.hashCode());
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
		BigPasivosAhId other = (BigPasivosAhId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_codigo_cuenta == null) {
			if (other.i_codigo_cuenta != null)
				return false;
		} else if (!i_codigo_cuenta.equals(other.i_codigo_cuenta))
			return false;
		return true;
	}

	public Long getI_codigo_cuenta() {
		return i_codigo_cuenta;
	}

	public void setI_codigo_cuenta(Long i_codigo_cuenta) {
		this.i_codigo_cuenta = i_codigo_cuenta;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}	

}
