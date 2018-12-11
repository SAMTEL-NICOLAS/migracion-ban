package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_ACTIVOS")
public class BigActivos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private BigActivosId id;
	@Column(name = "s_cod_producto")
	private String s_cod_producto;

	public BigActivosId getId() {
		return id;
	}

	public void setId(BigActivosId id) {
		this.id = id;
	}

	public String getS_cod_producto() {
		return s_cod_producto;
	}

	public void setS_cod_producto(String s_cod_producto) {
		this.s_cod_producto = s_cod_producto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((s_cod_producto == null) ? 0 : s_cod_producto.hashCode());
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
		BigActivos other = (BigActivos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (s_cod_producto == null) {
			if (other.s_cod_producto != null)
				return false;
		} else if (!s_cod_producto.equals(other.s_cod_producto))
			return false;
		return true;
	}

}
