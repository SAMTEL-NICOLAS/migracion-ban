
package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigActivosId implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column
	private String i_nro_credito;
	
	@Column
	private Date d_fecha_corte;

	public BigActivosId() {
		super();
		
	}

	public BigActivosId(String i_nro_credito, Date d_fecha_corte) {
		super();
		this.i_nro_credito = i_nro_credito;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_nro_credito == null) ? 0 : i_nro_credito.hashCode());
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
		BigActivosId other = (BigActivosId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_nro_credito == null) {
			if (other.i_nro_credito != null)
				return false;
		} else if (!i_nro_credito.equals(other.i_nro_credito))
			return false;
		return true;
	}

	public String getI_nro_credito() {
		return i_nro_credito;
	}

	public void setI_nro_credito(String i_nro_credito) {
		this.i_nro_credito = i_nro_credito;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}
	
	
}
