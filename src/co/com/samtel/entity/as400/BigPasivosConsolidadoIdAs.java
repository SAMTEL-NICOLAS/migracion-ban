package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class BigPasivosConsolidadoIdAs implements Serializable {
		
		private static final long serialVersionUID = 1L;

		@Column(name = "crcnui")
		private Long i_identificacion_cliente;	

		@Column(name = "crcpro")
		private String s_codigo_tipo;
		
		@Column(name = "crcspr")
		private String s_codigo_subproducto_core;
			
		@Transient
		private Date d_fecha_cierre;

		public BigPasivosConsolidadoIdAs() {
			super();
		
		}

		public BigPasivosConsolidadoIdAs(Long i_identificacion_cliente, String s_codigo_tipo,
				String s_codigo_subproducto_core, Date d_fecha_cierre) {
			super();
			this.i_identificacion_cliente = i_identificacion_cliente;
			this.s_codigo_tipo = s_codigo_tipo;
			this.s_codigo_subproducto_core = s_codigo_subproducto_core;
			this.d_fecha_cierre = d_fecha_cierre;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((d_fecha_cierre == null) ? 0 : d_fecha_cierre.hashCode());
			result = prime * result + ((i_identificacion_cliente == null) ? 0 : i_identificacion_cliente.hashCode());
			result = prime * result + ((s_codigo_subproducto_core == null) ? 0 : s_codigo_subproducto_core.hashCode());
			result = prime * result + ((s_codigo_tipo == null) ? 0 : s_codigo_tipo.hashCode());
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
			BigPasivosConsolidadoIdAs other = (BigPasivosConsolidadoIdAs) obj;
			if (d_fecha_cierre == null) {
				if (other.d_fecha_cierre != null)
					return false;
			} else if (!d_fecha_cierre.equals(other.d_fecha_cierre))
				return false;
			if (i_identificacion_cliente == null) {
				if (other.i_identificacion_cliente != null)
					return false;
			} else if (!i_identificacion_cliente.equals(other.i_identificacion_cliente))
				return false;
			if (s_codigo_subproducto_core == null) {
				if (other.s_codigo_subproducto_core != null)
					return false;
			} else if (!s_codigo_subproducto_core.equals(other.s_codigo_subproducto_core))
				return false;
			if (s_codigo_tipo == null) {
				if (other.s_codigo_tipo != null)
					return false;
			} else if (!s_codigo_tipo.equals(other.s_codigo_tipo))
				return false;
			return true;
		}

		public Long getI_identificacion_cliente() {
			return i_identificacion_cliente;
		}

		public void setI_identificacion_cliente(Long i_identificacion_cliente) {
			this.i_identificacion_cliente = i_identificacion_cliente;
		}

		public String getS_codigo_tipo() {
			return s_codigo_tipo;
		}

		public void setS_codigo_tipo(String s_codigo_tipo) {
			this.s_codigo_tipo = s_codigo_tipo;
		}

		public String getS_codigo_subproducto_core() {
			return s_codigo_subproducto_core;
		}

		public void setS_codigo_subproducto_core(String s_codigo_subproducto_core) {
			this.s_codigo_subproducto_core = s_codigo_subproducto_core;
		}

		public Date getD_fecha_cierre() {
			return d_fecha_cierre;
		}

		public void setD_fecha_cierre(Date d_fecha_cierre) {
			this.d_fecha_cierre = d_fecha_cierre;
		}
}
