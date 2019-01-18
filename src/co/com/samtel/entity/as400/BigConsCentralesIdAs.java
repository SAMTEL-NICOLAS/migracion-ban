package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigConsCentralesIdAs implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "crcnpo")
	private Long i_prod_onbase;
	
	@Column(name = "crcnui")
	private Long i_identificacion_cliente;

	public BigConsCentralesIdAs() {
		super();		
	}

	public BigConsCentralesIdAs(Long i_prod_onbase, Long i_identificacion_cliente) {
		super();
		this.i_prod_onbase = i_prod_onbase;
		this.i_identificacion_cliente = i_identificacion_cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_identificacion_cliente == null) ? 0 : i_identificacion_cliente.hashCode());
		result = prime * result + ((i_prod_onbase == null) ? 0 : i_prod_onbase.hashCode());
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
		BigConsCentralesIdAs other = (BigConsCentralesIdAs) obj;
		if (i_identificacion_cliente == null) {
			if (other.i_identificacion_cliente != null)
				return false;
		} else if (!i_identificacion_cliente.equals(other.i_identificacion_cliente))
			return false;
		if (i_prod_onbase == null) {
			if (other.i_prod_onbase != null)
				return false;
		} else if (!i_prod_onbase.equals(other.i_prod_onbase))
			return false;
		return true;
	}

	public Long getI_prod_onbase() {
		return i_prod_onbase;
	}

	public void setI_prod_onbase(Long i_prod_onbase) {
		this.i_prod_onbase = i_prod_onbase;
	}

	public Long getI_identificacion_cliente() {
		return i_identificacion_cliente;
	}

	public void setI_identificacion_cliente(Long i_identificacion_cliente) {
		this.i_identificacion_cliente = i_identificacion_cliente;
	}	

}
