package co.com.samtel.entity.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGACTIVA", schema = "DAMCYFILES")
public class LogActivador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "logcon")
	private Long id;
	
	@Column(name = "lognum")
	private String nombreTabla;
	
	@Column(name = "logsts")
	private String estado;
	
	@Column(name = "logcrj")
	private Long regMig;
	
	@Column(name = "logddj")
	private Long dia;
	
	@Column(name = "logmmj")
	private Long mes;
	
	@Column(name = "logaaj")
	private Long anio;
	
	@Column(name = "loghoj")
	private Long hora;

	//--
	
	@Column(name = "lognom")
	private String nombreRPG;
	
	@Column(name = "logcr4")
	private Long cantRegistrosRX;
	
	@Column(name = "logdd4")
	private Short diaRX;
	
	@Column(name = "logmm4")
	private Short mesRX;
	
	@Column(name = "logaa4")
	private Short anioRX;
	
	@Column(name = "logho4")
	private Long horaRX;	
	
	@Column(name = "logsca")
	private String logsca;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreTabla() {
		return nombreTabla;
	}

	public void setNombreTabla(String nombreTabla) {
		this.nombreTabla = nombreTabla;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getRegMig() {
		return regMig;
	}

	public void setRegMig(Long regMig) {
		this.regMig = regMig;
	}

	public Long getDia() {
		return dia;
	}

	public void setDia(Long dia) {
		this.dia = dia;
	}

	public Long getMes() {
		return mes;
	}

	public void setMes(Long mes) {
		this.mes = mes;
	}

	public Long getAnio() {
		return anio;
	}

	public void setAnio(Long anio) {
		this.anio = anio;
	}

	public Long getHora() {
		return hora;
	}

	public void setHora(Long hora) {
		this.hora = hora;
	}
   //-----------------------

	public String getNombreRPG() {
		return nombreRPG;
	}

	public void setNombreRPG(String nombreRPG) {
		this.nombreRPG = nombreRPG;
	}

	public Long getCantRegistrosRX() {
		return cantRegistrosRX;
	}

	public void setCantRegistrosRX(Long cantRegistrosRX) {
		this.cantRegistrosRX = cantRegistrosRX;
	}

	public Short getDiaRX() {
		return diaRX;
	}

	public void setDiaRX(Short diaRX) {
		this.diaRX = diaRX;
	}

	public Short getMesRX() {
		return mesRX;
	}

	public void setMesRX(Short mesRX) {
		this.mesRX = mesRX;
	}

	public Short getAnioRX() {
		return anioRX;
	}

	public void setAnioRX(Short anioRX) {
		this.anioRX = anioRX;
	}

	public Long getHoraRX() {
		return horaRX;
	}

	public void setHoraRX(Long horaRX) {
		this.horaRX = horaRX;
	}

	public String getLogsca() {
		return logsca;
	}

	public void setLogsca(String logsca) {
		this.logsca = logsca;
	}
	
}
