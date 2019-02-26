package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigInfFinancieraId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String i_cod_oficina;
	
	@Column
	private Date d_fecha_corte;

	public BigInfFinancieraId() {
		super();
	}

	public BigInfFinancieraId(String i_cod_oficina, Date d_fecha_corte) {
		super();
		this.i_cod_oficina = i_cod_oficina;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_cod_oficina == null) ? 0 : i_cod_oficina.hashCode());
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
		BigInfFinancieraId other = (BigInfFinancieraId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_cod_oficina == null) {
			if (other.i_cod_oficina != null)
				return false;
		} else if (!i_cod_oficina.equals(other.i_cod_oficina))
			return false;
		return true;
	}

	public String getI_cod_oficina() {
		return i_cod_oficina;
	}

	public void setI_cod_oficina(String i_cod_oficina) {
		this.i_cod_oficina = i_cod_oficina;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}
}
