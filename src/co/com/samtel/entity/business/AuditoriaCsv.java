package co.com.samtel.entity.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "auditoriaCsv", schema = "dbo")
public class AuditoriaCsv{
	
	@Id
	private Long id;
	
	@Column
	private String usuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(insertable = true)	
	private Date fecha;
	
	@Column
	private String estadoActividad;
	
	@Column
	private String estado;


	public AuditoriaCsv(Long id, String usuario, Date fecha, String estadoActividad, String estado) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fecha = fecha;
		this.estadoActividad = estadoActividad;
		this.estado = estado;
	}

	public AuditoriaCsv() {
		super();
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstadoActividad() {
		return estadoActividad;
	}

	public void setEstadoActividad(String estadoActividad) {
		this.estadoActividad = estadoActividad;
	}

}
