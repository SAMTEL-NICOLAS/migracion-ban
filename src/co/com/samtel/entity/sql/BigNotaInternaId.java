package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigNotaInternaId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private Long i_identificador_cliente;	
	
	@Column
	private Date d_fecha_corte;

	public BigNotaInternaId() {
		super();
	}

	public BigNotaInternaId(Long i_identificador_cliente, Date d_fecha_corte) {
		super();
		this.i_identificador_cliente = i_identificador_cliente;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_identificador_cliente == null) ? 0 : i_identificador_cliente.hashCode());
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
		BigNotaInternaId other = (BigNotaInternaId) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_identificador_cliente == null) {
			if (other.i_identificador_cliente != null)
				return false;
		} else if (!i_identificador_cliente.equals(other.i_identificador_cliente))
			return false;
		return true;
	}

	public Long getI_identificador_cliente() {
		return i_identificador_cliente;
	}

	public void setI_identificador_cliente(Long i_identificador_cliente) {
		this.i_identificador_cliente = i_identificador_cliente;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}	

}
