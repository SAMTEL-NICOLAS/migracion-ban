package co.com.samtel.entity.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_CLIENTES", schema = "dbo")
public class BigClientes implements Serializable {	
	
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name = "i_identificacion_cliente")
	private Long nui;
	
	@Column(name = "s_codigo_naturaleza_cliente")
	private String codnatucli;
	
	@Column(name = "s_codigo_tipo_ident")
	private String codtipiden;
	
	@Column(name = "i_codigo_ocupacion")
	private String codocupaci;
	
	@Column(name = "s_numero_identificacion")
	private String numidentif;
	
	@Column(name = "d_fecha_expedicion")
	private Date fechaexdoc;
	
	@Column(name = "s_lugar_expedicion")
	private String lugarexped;
	
	@Column(name = "s_nombre_completo")
	private String nombcomprs;
	
	@Column(name = "i_numero_empleados")
	private Long numemplead;
	
	@Column(name = "i_numero_remunerados")
	private BigDecimal numemplern;
	
	@Column(name = "i_no_remunerados")
	private BigDecimal numemplnrn;
	
	@Column(name = "i_cod_regional")
	private String codregionl;
	
	@Column(name = "i_cod_zona_comercial")
	private String codzoncomr;
	
	@Column(name = "i_cod_oficina_actual")
	private Short codofiactl;
	
	@Column(name = "d_fecha_creacion_cliente")
	private Date fechcrecli;
	
	@Column(name = "s_tiene_microempresa")
	private String tienemicro;
	
	@Column(name = "s_nombre_microempresa")
	private String nombremicr;
	
	@Column(name = "d_fecha_constitucion_empresa")
	private Date fechconsem;
	
	@Column(name = "i_experiencia_negocio_mes")
	private String expnegocio;
	
	@Column(name = "i_posecion_negocio_mes")
	private String posnegocio;
	
	@Column(name = "i_creacion_cliente_meses")
	private Integer anticlient;
	
	@Column(name = "i_constitucion_empresa_meses")
	private Integer antigempre;
	
	@Column(name = "i_codigo_asesor")
	private String codejecuti;
	
	@Column(name = "s_codigo_sector1")
	private String codsectec1;
	
	@Column(name = "s_codigo_sector2")
	private String codsectec2;
	
	@Column(name = "s_actividad_economica1")
	private String codactiec1;
	
	@Column(name = "s_int_actividad_economica1")
	private String codintace1;
	
	@Column(name = "s_actividad_economica2")
	private String codactiec2;
	
	@Column(name = "s_int_actividad_economica2")
	private String codintace2;
	
	@Column(name = "i_cod_oficina_creacion")
	private String codagencre;
	
	@Column(name = "s_correo_electronico")
	private String correoelec;	

	@Column(name = "m_total_activos")
	private BigDecimal totalactiv;
	
	@Column(name = "m_total_pasivos")	
	private BigDecimal totalpasiv;
	
	@Column(name = "m_total_patrimonio")
	private BigDecimal totalpatri;
	
	@Column(name = "m_total_ventas")
	private BigDecimal totalvents;
	
	@Column(name = "m_total_costo_ventas")
	private BigDecimal totalcsven;
	
	@Column(name = "m_total_otros_ingresos")
	private BigDecimal totaloting; 
	
	@Column(name = "m_total_egresos")
	private BigDecimal totalegres;
	
	@Column(name = "m_utilidad_bruta")
	private BigDecimal utilidbrut;
	
	@Column(name = "m_utilidad_neta")
	private BigDecimal utilidneta;
	
	@Column(name = "m_utilidad_operacional")
	private BigDecimal utilidoper;
	
	@Column(name = "s_otros_ingresos")
	private String descrpotri;
	
	@Column(name = "i_anios_experiencia")
	private String expactivid;
	
	@Column(name = "s_codigo_sexo")
	private String codigenero;
	
	@Column(name = "s_codigo_estado_civil")
	private String codestaciv;
	
	@Column(name = "s_pais_origen")
	private String paisorigen;
	
	@Column(name = "i_edad")
	private Short edad;
	
	@Column(name = "d_fecha_nacimiento")
	private Date fechanacim;
	
	@Column(name = "i_numero_hijos")
	private Integer nrohijos;
	
	@Column(name = "s_codigo_nivel_estudios")
	private String codniveduc;
	
	@Column(name = "s_cod_profesion")
	private String codprofesi;
	
	@Column(name = "s_cod_cobertura_salud")
	private String codcobersa;
	
	@Column(name = "s_cod_caja_compensacion")
	private String codcajcomp;
	
	@Column(name = "s_cod_jefe_familia")
	private String codjefefam;
	
	@Column(name = "i_personas_cargo")
	private Short numperscar;
	
	@Column(name = "d_fecha_ult_act")
	private Date fechaultac;
	
	@Column(name = "s_cod_tipo_contrato")
	private String codtipcont;
	
	@Column(name = "s_cargo")
	private String cargodesem;
	
	@Column(name = "s_empresa")
	private String empretrabj;
	
	@Column(name = "i_fecha_ingreso_empresa")
	private Short antigenemp;
	
	@Column(name = "m_salario")
	private BigDecimal salario;
	
	@Column(name = "i_estrato_socio_economico")
	private String estrato;
	
	@Column(name = "s_cod_tipo_vivienda")
	private String codtipvivi;
	
	@Column(name = "s_cod_tipo_local")
	private String codtiplocl;
	
	@Column(name = "s_local_vivienda")
	private String locviviend;
	
	@Column(name = "s_codigo_segmento")
	private String codsegment;
	
	@Column(name = "s_codigo_subsegmento")
	private String codsubsegm;
	
	@Column(name = "s_codigo_canal_vinc")
	private String codcnlvinc;
	
	@Column(name = "s_modo_envio")
	private String codmdenvio;
	
	@Column(name = "s_victima_conflicto")
	private String victconfli;
	
	@Column(name = "s_cod_vinculo")
	private String codvincent;
	
	@Column(name = "s_menor_edad")
	private String menoredad;
	
	@Column(name = "s_declara_renta")
	private String declararen;
	
	@Column(name = "s_pep")
	private String pep;
	
	@Column(name = "s_campana_politica")
	private String camppoliti;
	
	@Column(name = "s_oper_moneda_ext")
	private String opermndext;
	
	@Column(name = "m_activos_negocio")
	private BigDecimal actitotneg;
	
	@Column(name = "m_nivel_endeudamiento")
	private BigDecimal nivelendeu;
	
	@Column(name = "s_cod_tipo_empresa")
	private String codtpempre;
	
	@Column(name = "s_cod_regimen")
	private String codregimen;
	
	@Column(name = "i_numero_socios")
	private Short numrsocios;
	
	@Column(name = "s_nombre_completo_rep_legal")
	private String nombrepleg;
	
	@Column(name = "s_cod_tip_rep_legal")
	private String codtprpleg;
	
	@Column(name = "s_registro_biometria_s_n")
	private String regbiometr;
	
	@Column(name = "i_nro_finca_raiz")
	private Integer nrofinraiz;
	
	@Column(name = "i_nro_vehiculos")
	private Short nrovehicul;
	
	@Column(name = "s_tipo_contribuyente")
	private String tipcontrib;
	
	@Column(name = "i_nro_personas_grupo_familiar")
	private Integer nropersgrf;
	
	@Column(name = "i_nro_per_grupo_fami_cap_pago")
	private Integer nrppercppg;
	
	@Column(name = "i_nivel_consulta")
	private Short nivelconsl;
	
	@Column(name = "s_tipo_grupo_endeu_familia")
	private String tipgruende;
	
	@Column(name = "i_secuencia_grupo_endeu")
	private Integer secgruende;
	
	@Column(name = "i_codigo_cli_cabe_grup_endeu")
	private Integer codcliecab;
	
	@Column(name = "i_nro_filiales_grupo_endeu")
	private Short nrofilgren;

	public Long getNui() {
		return nui;
	}

	public void setNui(Long nui) {
		this.nui = nui;
	}

	public String getCodnatucli() {
		return codnatucli;
	}

	public void setCodnatucli(String codnatucli) {
		this.codnatucli = codnatucli;
	}

	public String getCodtipiden() {
		return codtipiden;
	}

	public void setCodtipiden(String codtipiden) {
		this.codtipiden = codtipiden;
	}

	public String getCodocupaci() {
		return codocupaci;
	}

	public void setCodocupaci(String codocupaci) {
		this.codocupaci = codocupaci;
	}

	public String getNumidentif() {
		return numidentif;
	}

	public void setNumidentif(String numidentif) {
		this.numidentif = numidentif;
	}

	public Date getFechaexdoc() {
		return fechaexdoc;
	}

	public void setFechaexdoc(Date fechaexdoc) {
		this.fechaexdoc = fechaexdoc;
	}

	public String getLugarexped() {
		return lugarexped;
	}

	public void setLugarexped(String lugarexped) {
		this.lugarexped = lugarexped;
	}

	public String getNombcomprs() {
		return nombcomprs;
	}

	public void setNombcomprs(String nombcomprs) {
		this.nombcomprs = nombcomprs;
	}

	public Long getNumemplead() {
		return numemplead;
	}

	public void setNumemplead(Long numemplead) {
		this.numemplead = numemplead;
	}

	public BigDecimal getNumemplern() {
		return numemplern;
	}

	public void setNumemplern(BigDecimal numemplern) {
		this.numemplern = numemplern;
	}

	public BigDecimal getNumemplnrn() {
		return numemplnrn;
	}

	public void setNumemplnrn(BigDecimal numemplnrn) {
		this.numemplnrn = numemplnrn;
	}

	public String getCodregionl() {
		return codregionl;
	}

	public void setCodregionl(String codregionl) {
		this.codregionl = codregionl;
	}

	public String getCodzoncomr() {
		return codzoncomr;
	}

	public void setCodzoncomr(String codzoncomr) {
		this.codzoncomr = codzoncomr;
	}

	public Short getCodofiactl() {
		return codofiactl;
	}

	public void setCodofiactl(Short codofiactl) {
		this.codofiactl = codofiactl;
	}

	public Date getFechcrecli() {
		return fechcrecli;
	}

	public void setFechcrecli(Date fechcrecli) {
		this.fechcrecli = fechcrecli;
	}

	public String getTienemicro() {
		return tienemicro;
	}

	public void setTienemicro(String tienemicro) {
		this.tienemicro = tienemicro;
	}

	public String getNombremicr() {
		return nombremicr;
	}

	public void setNombremicr(String nombremicr) {
		this.nombremicr = nombremicr;
	}

	public Date getFechconsem() {
		return fechconsem;
	}

	public void setFechconsem(Date fechconsem) {
		this.fechconsem = fechconsem;
	}

	public String getExpnegocio() {
		return expnegocio;
	}

	public void setExpnegocio(String expnegocio) {
		this.expnegocio = expnegocio;
	}

	public String getPosnegocio() {
		return posnegocio;
	}

	public void setPosnegocio(String posnegocio) {
		this.posnegocio = posnegocio;
	}

	public Integer getAnticlient() {
		return anticlient;
	}

	public void setAnticlient(Integer anticlient) {
		this.anticlient = anticlient;
	}

	public Integer getAntigempre() {
		return antigempre;
	}

	public void setAntigempre(Integer antigempre) {
		this.antigempre = antigempre;
	}

	public String getCodejecuti() {
		return codejecuti;
	}

	public void setCodejecuti(String codejecuti) {
		this.codejecuti = codejecuti;
	}

	public String getCodsectec1() {
		return codsectec1;
	}

	public void setCodsectec1(String codsectec1) {
		this.codsectec1 = codsectec1;
	}

	public String getCodsectec2() {
		return codsectec2;
	}

	public void setCodsectec2(String codsectec2) {
		this.codsectec2 = codsectec2;
	}

	public String getCodactiec1() {
		return codactiec1;
	}

	public void setCodactiec1(String codactiec1) {
		this.codactiec1 = codactiec1;
	}

	public String getCodintace1() {
		return codintace1;
	}

	public void setCodintace1(String codintace1) {
		this.codintace1 = codintace1;
	}

	public String getCodactiec2() {
		return codactiec2;
	}

	public void setCodactiec2(String codactiec2) {
		this.codactiec2 = codactiec2;
	}

	public String getCodintace2() {
		return codintace2;
	}

	public void setCodintace2(String codintace2) {
		this.codintace2 = codintace2;
	}

	public String getCodagencre() {
		return codagencre;
	}

	public void setCodagencre(String codagencre) {
		this.codagencre = codagencre;
	}

	public String getCorreoelec() {
		return correoelec;
	}

	public void setCorreoelec(String correoelec) {
		this.correoelec = correoelec;
	}

	public BigDecimal getTotalactiv() {
		return totalactiv;
	}

	public void setTotalactiv(BigDecimal totalactiv) {
		this.totalactiv = totalactiv;
	}

	public BigDecimal getTotalpasiv() {
		return totalpasiv;
	}

	public void setTotalpasiv(BigDecimal totalpasiv) {
		this.totalpasiv = totalpasiv;
	}

	public BigDecimal getTotalpatri() {
		return totalpatri;
	}

	public void setTotalpatri(BigDecimal totalpatri) {
		this.totalpatri = totalpatri;
	}

	public BigDecimal getTotalvents() {
		return totalvents;
	}

	public void setTotalvents(BigDecimal totalvents) {
		this.totalvents = totalvents;
	}

	public BigDecimal getTotalcsven() {
		return totalcsven;
	}

	public void setTotalcsven(BigDecimal totalcsven) {
		this.totalcsven = totalcsven;
	}

	public BigDecimal getTotaloting() {
		return totaloting;
	}

	public void setTotaloting(BigDecimal totaloting) {
		this.totaloting = totaloting;
	}

	public BigDecimal getTotalegres() {
		return totalegres;
	}

	public void setTotalegres(BigDecimal totalegres) {
		this.totalegres = totalegres;
	}

	public BigDecimal getUtilidbrut() {
		return utilidbrut;
	}

	public void setUtilidbrut(BigDecimal utilidbrut) {
		this.utilidbrut = utilidbrut;
	}

	public BigDecimal getUtilidneta() {
		return utilidneta;
	}

	public void setUtilidneta(BigDecimal utilidneta) {
		this.utilidneta = utilidneta;
	}

	public BigDecimal getUtilidoper() {
		return utilidoper;
	}

	public void setUtilidoper(BigDecimal utilidoper) {
		this.utilidoper = utilidoper;
	}

	public String getDescrpotri() {
		return descrpotri;
	}

	public void setDescrpotri(String descrpotri) {
		this.descrpotri = descrpotri;
	}

	public String getExpactivid() {
		return expactivid;
	}

	public void setExpactivid(String expactivid) {
		this.expactivid = expactivid;
	}

	public String getCodigenero() {
		return codigenero;
	}

	public void setCodigenero(String codigenero) {
		this.codigenero = codigenero;
	}

	public String getCodestaciv() {
		return codestaciv;
	}

	public void setCodestaciv(String codestaciv) {
		this.codestaciv = codestaciv;
	}

	public String getPaisorigen() {
		return paisorigen;
	}

	public void setPaisorigen(String paisorigen) {
		this.paisorigen = paisorigen;
	}

	public Short getEdad() {
		return edad;
	}

	public void setEdad(Short edad) {
		this.edad = edad;
	}

	public Date getFechanacim() {
		return fechanacim;
	}

	public void setFechanacim(Date fechanacim) {
		this.fechanacim = fechanacim;
	}

	public Integer getNrohijos() {
		return nrohijos;
	}

	public void setNrohijos(Integer nrohijos) {
		this.nrohijos = nrohijos;
	}

	public String getCodniveduc() {
		return codniveduc;
	}

	public void setCodniveduc(String codniveduc) {
		this.codniveduc = codniveduc;
	}

	public String getCodprofesi() {
		return codprofesi;
	}

	public void setCodprofesi(String codprofesi) {
		this.codprofesi = codprofesi;
	}

	public String getCodcobersa() {
		return codcobersa;
	}

	public void setCodcobersa(String codcobersa) {
		this.codcobersa = codcobersa;
	}

	public String getCodcajcomp() {
		return codcajcomp;
	}

	public void setCodcajcomp(String codcajcomp) {
		this.codcajcomp = codcajcomp;
	}

	public String getCodjefefam() {
		return codjefefam;
	}

	public void setCodjefefam(String codjefefam) {
		this.codjefefam = codjefefam;
	}

	public Short getNumperscar() {
		return numperscar;
	}

	public void setNumperscar(Short numperscar) {
		this.numperscar = numperscar;
	}

	public Date getFechaultac() {
		return fechaultac;
	}

	public void setFechaultac(Date fechaultac) {
		this.fechaultac = fechaultac;
	}

	public String getCodtipcont() {
		return codtipcont;
	}

	public void setCodtipcont(String codtipcont) {
		this.codtipcont = codtipcont;
	}

	public String getCargodesem() {
		return cargodesem;
	}

	public void setCargodesem(String cargodesem) {
		this.cargodesem = cargodesem;
	}

	public String getEmpretrabj() {
		return empretrabj;
	}

	public void setEmpretrabj(String empretrabj) {
		this.empretrabj = empretrabj;
	}

	public Short getAntigenemp() {
		return antigenemp;
	}

	public void setAntigenemp(Short antigenemp) {
		this.antigenemp = antigenemp;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getCodtipvivi() {
		return codtipvivi;
	}

	public void setCodtipvivi(String codtipvivi) {
		this.codtipvivi = codtipvivi;
	}

	public String getCodtiplocl() {
		return codtiplocl;
	}

	public void setCodtiplocl(String codtiplocl) {
		this.codtiplocl = codtiplocl;
	}

	public String getLocviviend() {
		return locviviend;
	}

	public void setLocviviend(String locviviend) {
		this.locviviend = locviviend;
	}

	public String getCodsegment() {
		return codsegment;
	}

	public void setCodsegment(String codsegment) {
		this.codsegment = codsegment;
	}

	public String getCodsubsegm() {
		return codsubsegm;
	}

	public void setCodsubsegm(String codsubsegm) {
		this.codsubsegm = codsubsegm;
	}

	public String getCodcnlvinc() {
		return codcnlvinc;
	}

	public void setCodcnlvinc(String codcnlvinc) {
		this.codcnlvinc = codcnlvinc;
	}

	public String getCodmdenvio() {
		return codmdenvio;
	}

	public void setCodmdenvio(String codmdenvio) {
		this.codmdenvio = codmdenvio;
	}

	public String getVictconfli() {
		return victconfli;
	}

	public void setVictconfli(String victconfli) {
		this.victconfli = victconfli;
	}

	public String getCodvincent() {
		return codvincent;
	}

	public void setCodvincent(String codvincent) {
		this.codvincent = codvincent;
	}

	public String getMenoredad() {
		return menoredad;
	}

	public void setMenoredad(String menoredad) {
		this.menoredad = menoredad;
	}

	public String getDeclararen() {
		return declararen;
	}

	public void setDeclararen(String declararen) {
		this.declararen = declararen;
	}

	public String getPep() {
		return pep;
	}

	public void setPep(String pep) {
		this.pep = pep;
	}

	public String getCamppoliti() {
		return camppoliti;
	}

	public void setCamppoliti(String camppoliti) {
		this.camppoliti = camppoliti;
	}

	public String getOpermndext() {
		return opermndext;
	}

	public void setOpermndext(String opermndext) {
		this.opermndext = opermndext;
	}

	public BigDecimal getActitotneg() {
		return actitotneg;
	}

	public void setActitotneg(BigDecimal actitotneg) {
		this.actitotneg = actitotneg;
	}

	public BigDecimal getNivelendeu() {
		return nivelendeu;
	}

	public void setNivelendeu(BigDecimal nivelendeu) {
		this.nivelendeu = nivelendeu;
	}

	public String getCodtpempre() {
		return codtpempre;
	}

	public void setCodtpempre(String codtpempre) {
		this.codtpempre = codtpempre;
	}

	public String getCodregimen() {
		return codregimen;
	}

	public void setCodregimen(String codregimen) {
		this.codregimen = codregimen;
	}

	public Short getNumrsocios() {
		return numrsocios;
	}

	public void setNumrsocios(Short numrsocios) {
		this.numrsocios = numrsocios;
	}

	public String getNombrepleg() {
		return nombrepleg;
	}

	public void setNombrepleg(String nombrepleg) {
		this.nombrepleg = nombrepleg;
	}

	public String getCodtprpleg() {
		return codtprpleg;
	}

	public void setCodtprpleg(String codtprpleg) {
		this.codtprpleg = codtprpleg;
	}

	public String getRegbiometr() {
		return regbiometr;
	}

	public void setRegbiometr(String regbiometr) {
		this.regbiometr = regbiometr;
	}

	public Integer getNrofinraiz() {
		return nrofinraiz;
	}

	public void setNrofinraiz(Integer nrofinraiz) {
		this.nrofinraiz = nrofinraiz;
	}

	public Short getNrovehicul() {
		return nrovehicul;
	}

	public void setNrovehicul(Short nrovehicul) {
		this.nrovehicul = nrovehicul;
	}

	public String getTipcontrib() {
		return tipcontrib;
	}

	public void setTipcontrib(String tipcontrib) {
		this.tipcontrib = tipcontrib;
	}

	public Integer getNropersgrf() {
		return nropersgrf;
	}

	public void setNropersgrf(Integer nropersgrf) {
		this.nropersgrf = nropersgrf;
	}

	public Integer getNrppercppg() {
		return nrppercppg;
	}

	public void setNrppercppg(Integer nrppercppg) {
		this.nrppercppg = nrppercppg;
	}

	public Short getNivelconsl() {
		return nivelconsl;
	}

	public void setNivelconsl(Short nivelconsl) {
		this.nivelconsl = nivelconsl;
	}

	public String getTipgruende() {
		return tipgruende;
	}

	public void setTipgruende(String tipgruende) {
		this.tipgruende = tipgruende;
	}

	public Integer getSecgruende() {
		return secgruende;
	}

	public void setSecgruende(Integer secgruende) {
		this.secgruende = secgruende;
	}

	public Integer getCodcliecab() {
		return codcliecab;
	}

	public void setCodcliecab(Integer codcliecab) {
		this.codcliecab = codcliecab;
	}

	public Short getNrofilgren() {
		return nrofilgren;
	}

	public void setNrofilgren(Short nrofilgren) {
		this.nrofilgren = nrofilgren;
	}	
	
}
