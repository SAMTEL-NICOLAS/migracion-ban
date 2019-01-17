package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BigInfoAdicionalClientesIdAs  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "crcnui")
	private Long i_identificacion_cliente;
	
	@Transient
	private Date d_fecha_corte;

	public BigInfoAdicionalClientesIdAs() {
		super();		
	}

	public BigInfoAdicionalClientesIdAs(Long i_identificacion_cliente, Date d_fecha_corte) {
		super();
		this.i_identificacion_cliente = i_identificacion_cliente;
		this.d_fecha_corte = d_fecha_corte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
		result = prime * result + ((i_identificacion_cliente == null) ? 0 : i_identificacion_cliente.hashCode());
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
		BigInfoAdicionalClientesIdAs other = (BigInfoAdicionalClientesIdAs) obj;
		if (d_fecha_corte == null) {
			if (other.d_fecha_corte != null)
				return false;
		} else if (!d_fecha_corte.equals(other.d_fecha_corte))
			return false;
		if (i_identificacion_cliente == null) {
			if (other.i_identificacion_cliente != null)
				return false;
		} else if (!i_identificacion_cliente.equals(other.i_identificacion_cliente))
			return false;
		return true;
	}

	public Long getI_identificacion_cliente() {
		return i_identificacion_cliente;
	}

	public void setI_identificacion_cliente(Long i_identificacion_cliente) {
		this.i_identificacion_cliente = i_identificacion_cliente;
	}

	public Date getD_fecha_corte() {
		return d_fecha_corte;
	}

	public void setD_fecha_corte(Date d_fecha_corte) {
		this.d_fecha_corte = d_fecha_corte;
	}
	
}
