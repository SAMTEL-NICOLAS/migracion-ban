package co.com.samtel.entity.business;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Auditoria", schema = "dbo")
public class Auditoria {
	@Id
	private Long id;
	@Column
	private String usuario;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(insertable=false)
	private Date fecha;
	
	
	public Auditoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auditoria(Long id, String usuario, Date fecha) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fecha = fecha;
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

}
