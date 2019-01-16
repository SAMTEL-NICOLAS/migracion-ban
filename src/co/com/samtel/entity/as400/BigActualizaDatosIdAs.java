package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BigActualizaDatosIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "f01b01cun")
	private Long i_codigo_cliente;	
	
	@Transient
	private Date d_fecha_carga;

	public BigActualizaDatosIdAs() {
		super();		
	}

	public BigActualizaDatosIdAs(Long i_codigo_cliente, Date d_fecha_carga) {
		super();
		this.i_codigo_cliente = i_codigo_cliente;
		this.d_fecha_carga = d_fecha_carga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d_fecha_carga == null) ? 0 : d_fecha_carga.hashCode());
		result = prime * result + ((i_codigo_cliente == null) ? 0 : i_codigo_cliente.hashCode());
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
		BigActualizaDatosIdAs other = (BigActualizaDatosIdAs) obj;
		if (d_fecha_carga == null) {
			if (other.d_fecha_carga != null)
				return false;
		} else if (!d_fecha_carga.equals(other.d_fecha_carga))
			return false;
		if (i_codigo_cliente == null) {
			if (other.i_codigo_cliente != null)
				return false;
		} else if (!i_codigo_cliente.equals(other.i_codigo_cliente))
			return false;
		return true;
	}

	public Long getI_codigo_cliente() {
		return i_codigo_cliente;
	}

	public void setI_codigo_cliente(Long i_codigo_cliente) {
		this.i_codigo_cliente = i_codigo_cliente;
	}

	public Date getD_fecha_carga() {
		return d_fecha_carga;
	}

	public void setD_fecha_carga(Date d_fecha_carga) {
		this.d_fecha_carga = d_fecha_carga;
	}

}
