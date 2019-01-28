package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CRM1421F", schema = "DAMCYFILES")
public class BigClienteEstadosAs implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigClienteEstadosIdAs id;
	
	@Column(name = "fecha_cor")
	private Integer fecha_cor;
	
	@Column(name = "cod_client")
	private String cod_client;	
	
	@Column(name = "cod_estado")
	private String cod_estado;
	
	@Column(name = "fecha_actu")
	private Integer fecha_actuAux;
	@Transient
	private Date fecha_actu;
	
	@Column(name = "tipo_vincu")
	private String tipo_vincu;
	
	@Column(name = "estado_ibs")
	private String estado_ibs;
	
	@Column(name = "migrar")
	private String migrado;

	public BigClienteEstadosIdAs getId() {
		return id;
	}

	public void setId(BigClienteEstadosIdAs id) {
		this.id = id;
	}

	public Integer getFecha_cor() {
		return fecha_cor;
	}

	public void setFecha_cor(Integer fecha_cor) {
		this.fecha_cor = fecha_cor;
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

	public Integer getFecha_actuAux() {
		return fecha_actuAux;
	}

	public void setFecha_actuAux(Integer fecha_actuAux) {
		this.fecha_actuAux = fecha_actuAux;
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

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}	
	
}
