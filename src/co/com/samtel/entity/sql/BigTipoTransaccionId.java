package co.com.samtel.entity.sql;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BigTipoTransaccionId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private String i_codigo_transaccion;

	@Column
	private String s_descripcion_transaccion;

	@Column
	private String s_llave_iva;

	public BigTipoTransaccionId() {
		super();		
	}

	public BigTipoTransaccionId(String i_codigo_transaccion, String s_descripcion_transaccion, String s_llave_iva) {
		super();
		this.i_codigo_transaccion = i_codigo_transaccion;
		this.s_descripcion_transaccion = s_descripcion_transaccion;
		this.s_llave_iva = s_llave_iva;
	}

	public String getI_codigo_transaccion() {
		return i_codigo_transaccion;
	}

	public void setI_codigo_transaccion(String i_codigo_transaccion) {
		this.i_codigo_transaccion = i_codigo_transaccion;
	}

	public String getS_descripcion_transaccion() {
		return s_descripcion_transaccion;
	}

	public void setS_descripcion_transaccion(String s_descripcion_transaccion) {
		this.s_descripcion_transaccion = s_descripcion_transaccion;
	}

	public String getS_llave_iva() {
		return s_llave_iva;
	}

	public void setS_llave_iva(String s_llave_iva) {
		this.s_llave_iva = s_llave_iva;
	}	 

}
