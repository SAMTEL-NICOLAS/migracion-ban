package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_GENERA_ICS", schema = "dbo")
public class BigGeneraIcs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigGeneraIcsId id;

	@Column(name = "s_id_cliente")
	private String s_id_cliente;	
	
	@Column(name = "s_cod_ejecutivo")
	private String s_cod_ejecutivo;
	
	@Column(name = "m_mora")
	private BigDecimal m_mora;
	
	@Column(name = "m_saldo_capital")
	private BigDecimal m_saldo_capital;
	
	@Column(name = "m_interes_corriente")
	private BigDecimal m_interes_corriente;
	
	@Column(name = "m_capital_mora")
	private BigDecimal m_capital_mora;
	
	@Column(name = "m_interes_mora")
	private BigDecimal m_interes_mora;	
	
	@Column(name = "i_dias_mora")
	private Integer i_dias_mora;
	
	@Column(name = "d_fecha_pago")
	private Date d_fecha_pago;
	
	@Column(name = "i_cuota_vencida")
	private Integer i_cuota_vencida;
	
	@Column(name = "d_fecha_ult_gestion")
	private Date d_fecha_ult_gestion;
	
	@Column(name = "s_id_accion")
	private String s_id_accion;
	
	@Column(name = "s_id_respuesta")
	private String s_id_respuesta;	
	
	@Column(name = "s_observacion")
	private String s_observacion;
	
	@Column(name = "s_id_razon")
	private String s_id_razon;

	public BigGeneraIcsId getId() {
		return id;
	}

	public void setId(BigGeneraIcsId id) {
		this.id = id;
	}

	public String getS_id_cliente() {
		return s_id_cliente;
	}

	public void setS_id_cliente(String s_id_cliente) {
		this.s_id_cliente = s_id_cliente;
	}

	public String getS_cod_ejecutivo() {
		return s_cod_ejecutivo;
	}

	public void setS_cod_ejecutivo(String s_cod_ejecutivo) {
		this.s_cod_ejecutivo = s_cod_ejecutivo;
	}

	public BigDecimal getM_mora() {
		return m_mora;
	}

	public void setM_mora(BigDecimal m_mora) {
		this.m_mora = m_mora;
	}

	public BigDecimal getM_saldo_capital() {
		return m_saldo_capital;
	}

	public void setM_saldo_capital(BigDecimal m_saldo_capital) {
		this.m_saldo_capital = m_saldo_capital;
	}

	public BigDecimal getM_interes_corriente() {
		return m_interes_corriente;
	}

	public void setM_interes_corriente(BigDecimal m_interes_corriente) {
		this.m_interes_corriente = m_interes_corriente;
	}

	public BigDecimal getM_capital_mora() {
		return m_capital_mora;
	}

	public void setM_capital_mora(BigDecimal m_capital_mora) {
		this.m_capital_mora = m_capital_mora;
	}

	public BigDecimal getM_interes_mora() {
		return m_interes_mora;
	}

	public void setM_interes_mora(BigDecimal m_interes_mora) {
		this.m_interes_mora = m_interes_mora;
	}

	public Integer getI_dias_mora() {
		return i_dias_mora;
	}

	public void setI_dias_mora(Integer i_dias_mora) {
		this.i_dias_mora = i_dias_mora;
	}

	public Date getD_fecha_pago() {
		return d_fecha_pago;
	}

	public void setD_fecha_pago(Date d_fecha_pago) {
		this.d_fecha_pago = d_fecha_pago;
	}

	public Integer getI_cuota_vencida() {
		return i_cuota_vencida;
	}

	public void setI_cuota_vencida(Integer i_cuota_vencida) {
		this.i_cuota_vencida = i_cuota_vencida;
	}

	public Date getD_fecha_ult_gestion() {
		return d_fecha_ult_gestion;
	}

	public void setD_fecha_ult_gestion(Date d_fecha_ult_gestion) {
		this.d_fecha_ult_gestion = d_fecha_ult_gestion;
	}

	public String getS_id_accion() {
		return s_id_accion;
	}

	public void setS_id_accion(String s_id_accion) {
		this.s_id_accion = s_id_accion;
	}

	public String getS_id_respuesta() {
		return s_id_respuesta;
	}

	public void setS_id_respuesta(String s_id_respuesta) {
		this.s_id_respuesta = s_id_respuesta;
	}

	public String getS_observacion() {
		return s_observacion;
	}

	public void setS_observacion(String s_observacion) {
		this.s_observacion = s_observacion;
	}

	public String getS_id_razon() {
		return s_id_razon;
	}

	public void setS_id_razon(String s_id_razon) {
		this.s_id_razon = s_id_razon;
	}
}
