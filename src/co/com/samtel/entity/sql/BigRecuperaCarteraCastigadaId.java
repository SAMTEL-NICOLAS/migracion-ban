package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class BigRecuperaCarteraCastigadaId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private Long i_numero_credito;
	
	@Column
	private Long i_numero_pago;	
	
	@Column
	private Date d_fecha_corte;

	public BigRecuperaCarteraCastigadaId(Long i_numero_credito, Long i_numero_pago, Date d_fecha_corte) {
		super();
		this.i_numero_credito = i_numero_credito;
		this.i_numero_pago = i_numero_pago;
		this.d_fecha_corte = d_fecha_corte;
	}

	public BigRecuperaCarteraCastigadaId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getI_numero_credito() {
		return i_numero_credito;
	}

	public void setI_numero_credito(Long i_numero_credito) {
		this.i_numero_credito = i_numero_credito;
	}

	public Long getI_numero_pago() {
		return i_numero_pago;
	}

	public void setI_numero_pago(Long i_numero_pago) {
		this.i_numero_pago = i_numero_pago;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_numero_credito == null) ? 0 : i_numero_credito.hashCode());
		result = prime * result + ((i_numero_pago == null) ? 0 : i_numero_pago.hashCode());
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
		BigRecuperaCarteraCastigadaId other = (BigRecuperaCarteraCastigadaId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_numero_credito == null) {
			if (other.i_numero_credito != null)
				return false;
		} else if (!i_numero_credito.equals(other.i_numero_credito))
			return false;
		if (i_numero_pago == null) {
			if (other.i_numero_pago != null)
				return false;
		} else if (!i_numero_pago.equals(other.i_numero_pago))
			return false;
		return true;
	}
	
	
	

	
	
}
	
	