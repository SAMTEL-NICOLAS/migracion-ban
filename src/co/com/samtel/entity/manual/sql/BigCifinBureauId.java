package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigCifinBureauId implements Serializable {
		
		private static final long serialVersionUID = 1L;

		@Column		
		private Integer i_codigo_cliente;
		
		@Column
		private Date d_fecha_corte;

		public BigCifinBureauId() {
			super();			
		}

		public BigCifinBureauId(Integer i_codigo_cliente, Date d_fecha_corte) {
			super();
			this.i_codigo_cliente = i_codigo_cliente;
			this.d_fecha_corte = d_fecha_corte;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((d_fecha_corte == null) ? 0 : d_fecha_corte.hashCode());
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
			BigCifinBureauId other = (BigCifinBureauId) obj;
			if (d_fecha_corte == null) {
				if (other.d_fecha_corte != null)
					return false;
			} else if (!d_fecha_corte.equals(other.d_fecha_corte))
				return false;
			if (i_codigo_cliente == null) {
				if (other.i_codigo_cliente != null)
					return false;
			} else if (!i_codigo_cliente.equals(other.i_codigo_cliente))
				return false;
			return true;
		}

		public Integer getI_codigo_cliente() {
			return i_codigo_cliente;
		}

		public void setI_codigo_cliente(Integer i_codigo_cliente) {
			this.i_codigo_cliente = i_codigo_cliente;
		}

		public Date getD_fecha_corte() {
			return d_fecha_corte;
		}

		public void setD_fecha_corte(Date d_fecha_corte) {
			this.d_fecha_corte = d_fecha_corte;
		}	
		
}
