package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BigSubsegmentoClienteId implements Serializable{

	private static final long serialVersionUID = 1L;

	private String i_codigo_segmento;	

	private String i_codigo_subsegmento;
	

	public BigSubsegmentoClienteId(String i_codigo_segmento, String i_codigo_subsegmento) {
		super();
		this.i_codigo_segmento = i_codigo_segmento;
		this.i_codigo_subsegmento = i_codigo_subsegmento;
	}

	public BigSubsegmentoClienteId() {
		super();
	}

	public String getI_codigo_segmento() {
		return i_codigo_segmento;
	}

	public void setI_codigo_segmento(String i_codigo_segmento) {
		this.i_codigo_segmento = i_codigo_segmento;
	}

	public String getI_codigo_subsegmento() {
		return i_codigo_subsegmento;
	}

	public void setI_codigo_subsegmento(String i_codigo_subsegmento) {
		this.i_codigo_subsegmento = i_codigo_subsegmento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i_codigo_segmento == null) ? 0 : i_codigo_segmento.hashCode());
		result = prime * result + ((i_codigo_subsegmento == null) ? 0 : i_codigo_subsegmento.hashCode());
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
		BigSubsegmentoClienteId other = (BigSubsegmentoClienteId) obj;
		if (i_codigo_segmento == null) {
			if (other.i_codigo_segmento != null)
				return false;
		} else if (!i_codigo_segmento.equals(other.i_codigo_segmento))
			return false;
		if (i_codigo_subsegmento == null) {
			if (other.i_codigo_subsegmento != null)
				return false;
		} else if (!i_codigo_subsegmento.equals(other.i_codigo_subsegmento))
			return false;
		return true;
	}
	
}
