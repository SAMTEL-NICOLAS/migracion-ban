package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigCanalesIdAs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "nui")
	private Long i_identificacion_cliente;
	
	@Column(name = "cod_canal")
	private String s_codigo_canal;
	
	@Column(name = "cod_tip_tr")
	private Long s_codigo_transaccion;
	
	@Column(name = "cod_subpro")
	private String s_codigo_subproducto;	

	public BigCanalesIdAs(Long i_identificacion_cliente, String s_codigo_canal, Long s_codigo_transaccion,
			String s_codigo_subproducto) {
		super();
		this.i_identificacion_cliente = i_identificacion_cliente;
		this.s_codigo_canal = s_codigo_canal;
		this.s_codigo_transaccion = s_codigo_transaccion;
		this.s_codigo_subproducto = s_codigo_subproducto;
	}

	public BigCanalesIdAs() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_identificacion_cliente == null) ? 0 : i_identificacion_cliente.hashCode());
		result = prime * result + ((s_codigo_canal == null) ? 0 : s_codigo_canal.hashCode());
		result = prime * result + ((s_codigo_subproducto == null) ? 0 : s_codigo_subproducto.hashCode());
		result = prime * result + ((s_codigo_transaccion == null) ? 0 : s_codigo_transaccion.hashCode());
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
		BigCanalesIdAs other = (BigCanalesIdAs) obj;
		if (i_identificacion_cliente == null) {
			if (other.i_identificacion_cliente != null)
				return false;
		} else if (!i_identificacion_cliente.equals(other.i_identificacion_cliente))
			return false;
		if (s_codigo_canal == null) {
			if (other.s_codigo_canal != null)
				return false;
		} else if (!s_codigo_canal.equals(other.s_codigo_canal))
			return false;
		if (s_codigo_subproducto == null) {
			if (other.s_codigo_subproducto != null)
				return false;
		} else if (!s_codigo_subproducto.equals(other.s_codigo_subproducto))
			return false;
		if (s_codigo_transaccion == null) {
			if (other.s_codigo_transaccion != null)
				return false;
		} else if (!s_codigo_transaccion.equals(other.s_codigo_transaccion))
			return false;
		return true;
	}

	public Long getI_identificacion_cliente() {
		return i_identificacion_cliente;
	}

	public void setI_identificacion_cliente(Long i_identificacion_cliente) {
		this.i_identificacion_cliente = i_identificacion_cliente;
	}

	public String getS_codigo_canal() {
		return s_codigo_canal;
	}

	public void setS_codigo_canal(String s_codigo_canal) {
		this.s_codigo_canal = s_codigo_canal;
	}

	public Long getS_codigo_transaccion() {
		return s_codigo_transaccion;
	}

	public void setS_codigo_transaccion(Long s_codigo_transaccion) {
		this.s_codigo_transaccion = s_codigo_transaccion;
	}

	public String getS_codigo_subproducto() {
		return s_codigo_subproducto;
	}

	public void setS_codigo_subproducto(String s_codigo_subproducto) {
		this.s_codigo_subproducto = s_codigo_subproducto;
	}	

}
