package co.com.samtel.entity.as400;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.com.samtel.dao.Consecutivo;

@Entity
@Table(name = "CRM1420F", schema = "DAMCYFILES")
public class BigDireccionAs extends Consecutivo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BigDireccionIdAs id;
	
	@Column(name = "cod_direcc")
	private String cod_direcc;
	
	@Column(name = "cod_depart")
	private String cod_depart;
	
	@Column(name = "cod_ciumun")
	private String cod_ciumun;
	
	@Column(name = "cod_barver")
	private String cod_barver;
	
	@Column(name = "direccpred")
	private String direccpred;
	
	@Column(name = "est_georef")
	private String est_georef;
	
	@Column(name = "dir_pre_ge")
	private String dir_pre_ge;
	
	@Column(name = "loca_geore")
	private String loca_geore;
	
	@Column(name = "barr_geore")
	private String barr_geore;
	
	@Column(name = "ofi_georef")
	private String ofi_georef;
	
	@Column(name = "zona_geore")
	private String zona_geore;
	
	@Column(name = "sub_zon_re")
	private String sub_zon_re;
	
	@Column(name = "coordena_x")
	private String coordena_x;
	
	@Column(name = "coordena_y")
	private String coordena_y;	
	
	@Column(name = "codp_geore")
	private String codp_geore;
	
	@Column(name = "ref_direcc")
	private String ref_direcc;
	
	@Column(name = "telef_fijo")
	private Long telef_fijo;
	
	@Column(name = "tel_celula")
	private Long tel_celula;
	
	@Column(name = "direc_prin")
	private String direc_prin;
	
	@Column(name = "cc_zona_ge")
	private String cc_zona_ge;
	
	@Column(name = "cc_subzona")
	private String cc_subzona;
	
	@Column(name = "migrar")
	private String migrado;

	public BigDireccionIdAs getId() {
		return id;
	}

	public void setId(BigDireccionIdAs id) {
		this.id = id;
	}

	public String getCod_direcc() {
		return cod_direcc;
	}

	public void setCod_direcc(String cod_direcc) {
		this.cod_direcc = cod_direcc;
	}

	public String getCod_depart() {
		return cod_depart;
	}

	public void setCod_depart(String cod_depart) {
		this.cod_depart = cod_depart;
	}

	public String getCod_ciumun() {
		return cod_ciumun;
	}

	public void setCod_ciumun(String cod_ciumun) {
		this.cod_ciumun = cod_ciumun;
	}

	public String getCod_barver() {
		return cod_barver;
	}

	public void setCod_barver(String cod_barver) {
		this.cod_barver = cod_barver;
	}

	public String getDireccpred() {
		return direccpred;
	}

	public void setDireccpred(String direccpred) {
		this.direccpred = direccpred;
	}

	public String getEst_georef() {
		return est_georef;
	}

	public void setEst_georef(String est_georef) {
		this.est_georef = est_georef;
	}

	public String getDir_pre_ge() {
		return dir_pre_ge;
	}

	public void setDir_pre_ge(String dir_pre_ge) {
		this.dir_pre_ge = dir_pre_ge;
	}

	public String getLoca_geore() {
		return loca_geore;
	}

	public void setLoca_geore(String loca_geore) {
		this.loca_geore = loca_geore;
	}

	public String getBarr_geore() {
		return barr_geore;
	}

	public void setBarr_geore(String barr_geore) {
		this.barr_geore = barr_geore;
	}

	public String getOfi_georef() {
		return ofi_georef;
	}

	public void setOfi_georef(String ofi_georef) {
		this.ofi_georef = ofi_georef;
	}

	public String getZona_geore() {
		return zona_geore;
	}

	public void setZona_geore(String zona_geore) {
		this.zona_geore = zona_geore;
	}

	public String getSub_zon_re() {
		return sub_zon_re;
	}

	public void setSub_zon_re(String sub_zon_re) {
		this.sub_zon_re = sub_zon_re;
	}

	public String getCoordena_x() {
		return coordena_x;
	}

	public void setCoordena_x(String coordena_x) {
		this.coordena_x = coordena_x;
	}

	public String getCoordena_y() {
		return coordena_y;
	}

	public void setCoordena_y(String coordena_y) {
		this.coordena_y = coordena_y;
	}

	public String getCodp_geore() {
		return codp_geore;
	}

	public void setCodp_geore(String codp_geore) {
		this.codp_geore = codp_geore;
	}

	public String getRef_direcc() {
		return ref_direcc;
	}

	public void setRef_direcc(String ref_direcc) {
		this.ref_direcc = ref_direcc;
	}

	public Long getTelef_fijo() {
		return telef_fijo;
	}

	public void setTelef_fijo(Long telef_fijo) {
		this.telef_fijo = telef_fijo;
	}

	public Long getTel_celula() {
		return tel_celula;
	}

	public void setTel_celula(Long tel_celula) {
		this.tel_celula = tel_celula;
	}

	public String getDirec_prin() {
		return direc_prin;
	}

	public void setDirec_prin(String direc_prin) {
		this.direc_prin = direc_prin;
	}

	public String getCc_zona_ge() {
		return cc_zona_ge;
	}

	public void setCc_zona_ge(String cc_zona_ge) {
		this.cc_zona_ge = cc_zona_ge;
	}

	public String getCc_subzona() {
		return cc_subzona;
	}

	public void setCc_subzona(String cc_subzona) {
		this.cc_subzona = cc_subzona;
	}

	public String getMigrado() {
		return migrado;
	}

	public void setMigrado(String migrado) {
		this.migrado = migrado;
	}
	
}
