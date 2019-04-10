package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CLIENTE_ESTADOS_FNC", schema = "dbo")
public class BigClienteEstados implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigClienteEstadosId id;
	
	@Column(name = "s_codigo_tipo_cliente")
	private String cod_client;	
	
	@Column(name = "s_estado_cliente")
	private String cod_estado;
	
	@Column(name = "d_fecha_ult_actualizacion")
	private Date fecha_actu;
	
	@Column(name = "s_tipo_vinculacion")
	private String tipo_vincu;
	
	@Column(name = "s_estado_ibs")
	private String estado_ibs;

	public BigClienteEstadosId getId() {
		return id;
	}

	public void setId(BigClienteEstadosId id) {
		this.id = id;
	}

	public String getCod_client() {
		return cod_client;
	}

	public void setCod_client(String cod_client) {
		this.cod_client = cod_client;
	}

	public String getCod_estado() {
		return cod_estado;
	}

	public void setCod_estado(String cod_estado) {
		this.cod_estado = cod_estado;
	}

	public Date getFecha_actu() {
		return fecha_actu;
	}

	public void setFecha_actu(Date fecha_actu) {
		this.fecha_actu = fecha_actu;
	}

	public String getTipo_vincu() {
		return tipo_vincu;
	}

	public void setTipo_vincu(String tipo_vincu) {
		this.tipo_vincu = tipo_vincu;
	}

	public String getEstado_ibs() {
		return estado_ibs;
	}

	public void setEstado_ibs(String estado_ibs) {
		this.estado_ibs = estado_ibs;
	}

}
