package co.com.samtel.entity.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_auditoria", schema = "dbo")
public class DetailAudit {



	@Id
	private Long id;

	@Column(name = "tabla")
	private String tabla;

	@Column(name = "reg_origen")
	private Long regOrigen;

	@Column(name = "reg_destino")
	private Long regDestino;

	@Column(name = "traza")
	private String traza;

	@Column(name = "idAudit")
	private Long idAudit;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public Long getRegOrigen() {
		return regOrigen;
	}

	public void setRegOrigen(Long regOrigen) {
		this.regOrigen = regOrigen;
	}

	public Long getRegDestino() {
		return regDestino;
	}

	public void setRegDestino(Long regDestino) {
		this.regDestino = regDestino;
	}

	public String getTraza() {
		return traza;
	}

	public void setTraza(String traza) {
		this.traza = traza;
	}

	public Long getIdAudit() {
		return idAudit;
	}

	public void setIdAudit(Long idAudit) {
		this.idAudit = idAudit;
	}

}
