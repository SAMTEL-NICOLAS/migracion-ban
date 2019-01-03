package co.com.samtel.entity.sql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "BIG_TIPO_TRANSACCION", schema = "dbo")
public class BigTipoTransaccion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name = "i_codigo_transaccion")
	private String cod_transa;

	@Column(name = "s_descripcion_transaccion")
	private String des_transa;

	public String getCod_transa() {
		return cod_transa;
	}

	public void setCod_transa(String cod_transa) {
		this.cod_transa = cod_transa;
	}

	public String getDes_transa() {
		return des_transa;
	}

	public void setDes_transa(String des_transa) {
		this.des_transa = des_transa;
	}
}
