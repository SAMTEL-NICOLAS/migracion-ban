package co.com.samtel.entity.as400;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CRM1415F", schema = "DAMCYFILES")
public class BigCupoRotativoAs  implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigCupoRotativoIdAs id;	

	@Column(name = "feccor")
	private Integer feccor_Aux;
	
	@Column(name = "numcli")
	private Long numcli;
	
	@Column(name = "modali")
	private String modali;
	
	@Column(name = "codsbp")
	private String codsbp;
	
	@Column(name = "trjasc")
	private String trjasc;
	
	@Column(name = "cntasc")
	private String cntasc;
	
	@Column(name = "trjsta")
	private String trjsta;
	
	@Column(name = "cupsta")
	private String cupsta;
	
	@Column(name = "cupval")
	private BigDecimal cupval;
	
	@Column(name = "feccup")
	private Integer feccupAux;
	@Transient
	private Date feccup;
	
	@Column(name = "fecluc")
	private Integer feclucAux;
	@Transient
	private Date fecluc;	
	
	@Column(name = "numutv")
	private Short numutv;
	
	@Column(name = "monutl")
	private BigDecimal monutl;
	
	@Column(name = "monven")
	private BigDecimal monven;
	
	@Column(name = "diamor")
	private Short diamor;
	
	@Column(name = "cuoman")
	private String cuoman;
	
	@Column(name = "valcuo")
	private BigDecimal valcuo;
	
	@Column(name = "codase")
	private String codase;
	
	@Column(name = "codagn")
	private Short codagn;
	
	@Column(name = "pordis")
	private BigDecimal pordis;
	
	@Column(name = "porprm")
	private BigDecimal porprm;

	public BigCupoRotativoIdAs getId() {
		return id;
	}

	public void setId(BigCupoRotativoIdAs id) {
		this.id = id;
	}

	public Integer getFeccor_Aux() {
		return feccor_Aux;
	}

	public void setFeccor_Aux(Integer feccor_Aux) {
		this.feccor_Aux = feccor_Aux;
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
	
	public Integer getFeccupAux() {
		return feccupAux;
	}

	public void setFeccupAux(Integer feccupAux) {
		this.feccupAux = feccupAux;
	}

	public Date getFeccup() {
		return feccup;
	}

	public void setFeccup(Date feccup) {
		this.feccup = feccup;
	}

	public Integer getFeclucAux() {
		return feclucAux;
	}

	public void setFeclucAux(Integer feclucAux) {
		this.feclucAux = feclucAux;
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
