package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CRM1480F", schema = "DAMCYFILES")
public class BigActualizaDatosAs implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActualizaDatosIdAs id;
	
	@Column(name = "f01fecsys")
	private Integer f01fecsys;
	
	@Column(name = "f01fuerza")
	private String f01fuerza;
	
	@Column(name = "f01bd1tse")
	private String f01bd1tse;
	
	@Column(name = "f01bd1ax5")
	private String f01bd1ax5;
	
	@Column(name = "f01numacc")
	private Short f01numacc;
	
	@Column(name = "f01mordys")
	private Short f01mordys;
	
	@Column(name = "f01stscta")
	private String f01stscta;
	
	@Column(name = "f01numcdt")
	private Short f01numcdt;
	
	@Column(name = "f01numcta")
	private Short f01numcta;
	
	@Column(name = "f01b01bra")
	private Short f01b01bra;
	
	@Column(name = "f01fecact")
	private Integer f01fecactAux;
	@Transient
	private Date f01fecact;
	
	@Column(name = "migrado")
	private String migrado;
	
	public BigActualizaDatosIdAs getId() {
		return id;
	}
	public void setId(BigActualizaDatosIdAs id) {
		this.id = id;
	}
	public Integer getF01fecsys() {
		return f01fecsys;
	}
	public void setF01fecsys(Integer f01fecsys) {
		this.f01fecsys = f01fecsys;
	}
	public String getF01fuerza() {
		return f01fuerza;
	}
	public void setF01fuerza(String f01fuerza) {
		this.f01fuerza = f01fuerza;
	}
	public String getF01bd1tse() {
		return f01bd1tse;
	}
	public void setF01bd1tse(String f01bd1tse) {
		this.f01bd1tse = f01bd1tse;
	}
	public String getF01bd1ax5() {
		return f01bd1ax5;
	}
	public void setF01bd1ax5(String f01bd1ax5) {
		this.f01bd1ax5 = f01bd1ax5;
	}
	public Short getF01numacc() {
		return f01numacc;
	}
	public void setF01numacc(Short f01numacc) {
		this.f01numacc = f01numacc;
	}
	public Short getF01mordys() {
		return f01mordys;
	}
	public void setF01mordys(Short f01mordys) {
		this.f01mordys = f01mordys;
	}
	public String getF01stscta() {
		return f01stscta;
	}
	public void setF01stscta(String f01stscta) {
		this.f01stscta = f01stscta;
	}
	public Short getF01numcdt() {
		return f01numcdt;
	}
	public void setF01numcdt(Short f01numcdt) {
		this.f01numcdt = f01numcdt;
	}
	public Short getF01numcta() {
		return f01numcta;
	}
	public void setF01numcta(Short f01numcta) {
		this.f01numcta = f01numcta;
	}
	public Short getF01b01bra() {
		return f01b01bra;
	}
	public void setF01b01bra(Short f01b01bra) {
		this.f01b01bra = f01b01bra;
	}
	public Integer getF01fecactAux() {
		return f01fecactAux;
	}
	public void setF01fecactAux(Integer f01fecactAux) {
		this.f01fecactAux = f01fecactAux;
	}
	public Date getF01fecact() {
		return f01fecact;
	}
	public void setF01fecact(Date f01fecact) {
		this.f01fecact = f01fecact;
	}
	public String getMigrado() {
		return migrado;
	}
	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
