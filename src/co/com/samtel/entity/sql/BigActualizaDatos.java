package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_ACTUALIZA_DATOS", schema = "dbo")
public class BigActualizaDatos implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigActualizaDatosId id;		
	
	@Column(name = "s_canal_gestion")
	private String f01fuerza;
	
	@Column(name = "s_estado_cliente")
	private String f01bd1tse;
	
	@Column(name = "s_estado_cli_actualiz")
	private String f01bd1ax5;
	
	@Column(name = "i_nro_cred_activos")
	private Short f01numacc;
	
	@Column(name = "i_mora_max_credito")
	private Short f01mordys;
	
	@Column(name = "s_estado_ahorros")
	private String f01stscta;
	
	@Column(name = "i_numero_cdts_activos")
	private Short f01numcdt;
	
	@Column(name = "i_numero_ahorros_vig")
	private Short f01numcta;
	
	@Column(name = "i_codigo_oficina")
	private Short f01b01bra;
	
	@Column(name = "d_fecha_actualizacion")
	private Date f01fecact;

	public BigActualizaDatosId getId() {
		return id;
	}

	public void setId(BigActualizaDatosId id) {
		this.id = id;
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

	public Date getF01fecact() {
		return f01fecact;
	}

	public void setF01fecact(Date f01fecact) {
		this.f01fecact = f01fecact;
	}

}
