package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigEstGeneralListaId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private String s_tipo_lista;
	
	@Column
	private String s_codigo;

	
	public BigEstGeneralListaId() {
		super();	
	}


	public BigEstGeneralListaId(String s_tipo_lista, String s_codigo) {
		super();
		this.s_tipo_lista = s_tipo_lista;
		this.s_codigo = s_codigo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s_codigo == null) ? 0 : s_codigo.hashCode());
		result = prime * result + ((s_tipo_lista == null) ? 0 : s_tipo_lista.hashCode());
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
		BigEstGeneralListaId other = (BigEstGeneralListaId) obj;
		if (s_codigo == null) {
			if (other.s_codigo != null)
				return false;
		} else if (!s_codigo.equals(other.s_codigo))
			return false;
		if (s_tipo_lista == null) {
			if (other.s_tipo_lista != null)
				return false;
		} else if (!s_tipo_lista.equals(other.s_tipo_lista))
			return false;
		return true;
	}


	public String getS_tipo_lista() {
		return s_tipo_lista;
	}


	public void setS_tipo_lista(String s_tipo_lista) {
		this.s_tipo_lista = s_tipo_lista;
	}


	public String getS_codigo() {
		return s_codigo;
	}


	public void setS_codigo(String s_codigo) {
		this.s_codigo = s_codigo;
	}	
	
}
