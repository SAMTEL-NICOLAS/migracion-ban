package co.com.samtel.entity.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_auditoriaCsv", schema = "dbo")
public class DetailAuditCsv {
	
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
	
	@Column(name = "column_name")
	private String column_name;
	
	@Column(name = "row")
	private Long row;
	
	@Column(name = "columna")
	private Long columna;
	
	@Column(name = "message")
	private String message;

	public DetailAuditCsv() {
		super();
	}

	
	public DetailAuditCsv(Long id, String tabla, Long regOrigen, Long regDestino, String traza, Long idAudit,
			String column_name, Long row, Long columna, String message) {
		super();
		this.id = id;
		this.tabla = tabla;
		this.regOrigen = regOrigen;
		this.regDestino = regDestino;
		this.traza = traza;
		this.idAudit = idAudit;
		this.column_name = column_name;
		this.row = row;
		this.columna = columna;
		this.message = message;
	}


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

	public String getColumn_name() {
		return column_name;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}


	public Long getRow() {
		return row;
	}


	public void setRow(Long row) {
		this.row = row;
	}


	public Long getColumna() {
		return columna;
	}


	public void setColumna(Long columna) {
		this.columna = columna;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
