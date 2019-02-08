package co.com.samtel.entity.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Auditoria", schema = "dbo")
public class Auditoria {

	@OneToMany(mappedBy = "idAudit")
	private List<DetailAudit> detailAudit = new ArrayList<DetailAudit>();
	
	@Id
	private Long id;

	@Column
	private String usuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(insertable = false)
	private Date fecha;



	public Auditoria() {
		super();
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

	public List<DetailAudit> getDetailAudit() {
		return detailAudit;
	}

	public void setDetailAudit(List<DetailAudit> detailAudit) {
		this.detailAudit = detailAudit;
	}

}
