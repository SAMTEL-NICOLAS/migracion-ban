package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CUPO_ROTATIVO", schema = "dbo")
public class BigCupoRotativo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigCupoRotativoId id;
	
	@Column(name = "i_identificacion_cliente")
	private Long numcli;
	
	@Column(name = "i_cod_tipo_linea_credito")
	private String modali;
	
	@Column(name = "s_cod_subproducto")
	private String codsbp;
	
	@Column(name = "b_tiene_tarjeta_asociada")
	private String trjasc;
	
	@Column(name = "b_tiene_cuenta_asociada")
	private String cntasc;
	
	@Column(name = "s_estado_tarjeta")
	private String trjsta;
	
	@Column(name = "s_estado_cupo")
	private String cupsta;
	
	@Column(name = "m_valor_cupo")
	private BigDecimal cupval;
	
	@Column(name = "d_fecha_otorgamiento")
	private Date feccup;
	
	@Column(name = "d_fecha_ult_util_cupo")
	private Date fecluc;
	
	@Column(name = "i_util_vigentes")
	private Short numutv;
	
	@Column(name = "m_monto_utilizado")
	private BigDecimal monutl;
	
	@Column(name = "m_monto_vencido")
	private BigDecimal monven;
	
	@Column(name = "i_dias_mora")
	private Short diamor;
	
	@Column(name = "b_cuota_manejo")
	private String cuoman;
	
	@Column(name = "m_cuota_manejo")
	private BigDecimal valcuo;
	
	@Column(name = "i_codigo_asesor_creacion")
	private String codase;
	
	@Column(name = "i_codigo_agencia_creacion")
	private Short codagn;
	
	@Column(name = "m_porcentaje_disponible")
	private BigDecimal pordis;
	
	@Column(name = "i_plazo_prom_utilizaciones")
	private BigDecimal porprm;

	public BigCupoRotativoId getId() {
		return id;
	}

	public void setId(BigCupoRotativoId id) {
		this.id = id;
	}

	public Long getNumcli() {
		return numcli;
	}

	public void setNumcli(Long numcli) {
		this.numcli = numcli;
	}

	public String getModali() {
		return modali;
	}

	public void setModali(String modali) {
		this.modali = modali;
	}

	public String getCodsbp() {
		return codsbp;
	}

	public void setCodsbp(String codsbp) {
		this.codsbp = codsbp;
	}

	public String getTrjasc() {
		return trjasc;
	}

	public void setTrjasc(String trjasc) {
		this.trjasc = trjasc;
	}

	public String getCntasc() {
		return cntasc;
	}

	public void setCntasc(String cntasc) {
		this.cntasc = cntasc;
	}

	public String getTrjsta() {
		return trjsta;
	}

	public void setTrjsta(String trjsta) {
		this.trjsta = trjsta;
	}

	public String getCupsta() {
		return cupsta;
	}

	public void setCupsta(String cupsta) {
		this.cupsta = cupsta;
	}

	public BigDecimal getCupval() {
		return cupval;
	}

	public void setCupval(BigDecimal cupval) {
		this.cupval = cupval;
	}

	public Date getFeccup() {
		return feccup;
	}

	public void setFeccup(Date feccup) {
		this.feccup = feccup;
	}

	public Date getFecluc() {
		return fecluc;
	}

	public void setFecluc(Date fecluc) {
		this.fecluc = fecluc;
	}

	public Short getNumutv() {
		return numutv;
	}

	public void setNumutv(Short numutv) {
		this.numutv = numutv;
	}

	public BigDecimal getMonutl() {
		return monutl;
	}

	public void setMonutl(BigDecimal monutl) {
		this.monutl = monutl;
	}

	public BigDecimal getMonven() {
		return monven;
	}

	public void setMonven(BigDecimal monven) {
		this.monven = monven;
	}

	public Short getDiamor() {
		return diamor;
	}

	public void setDiamor(Short diamor) {
		this.diamor = diamor;
	}

	public String getCuoman() {
		return cuoman;
	}

	public void setCuoman(String cuoman) {
		this.cuoman = cuoman;
	}

	public BigDecimal getValcuo() {
		return valcuo;
	}

	public void setValcuo(BigDecimal valcuo) {
		this.valcuo = valcuo;
	}

	public String getCodase() {
		return codase;
	}

	public void setCodase(String codase) {
		this.codase = codase;
	}

	public Short getCodagn() {
		return codagn;
	}

	public void setCodagn(Short codagn) {
		this.codagn = codagn;
	}

	public BigDecimal getPordis() {
		return pordis;
	}

	public void setPordis(BigDecimal pordis) {
		this.pordis = pordis;
	}

	public BigDecimal getPorprm() {
		return porprm;
	}

	public void setPorprm(BigDecimal porprm) {
		this.porprm = porprm;
	}

	
}
