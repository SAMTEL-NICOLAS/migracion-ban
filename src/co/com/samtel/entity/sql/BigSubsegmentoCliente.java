package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_SUBSEGMENTO_CLIENTE", schema = "dbo")
public class BigSubsegmentoCliente implements Serializable{

	@EmbeddedId
	private BigSubsegmentoClienteId id;
	
	@Column(name = "s_descripcion_subsegmento")
	private String des_nicho;

	public BigSubsegmentoClienteId getId() {
		return id;
	}

	public void setId(BigSubsegmentoClienteId id) {
		this.id = id;
	}

	public String getDes_nicho() {
		return des_nicho;
	}

	public void setDes_nicho(String des_nicho) {
		this.des_nicho = des_nicho;
	}
	
	

}
