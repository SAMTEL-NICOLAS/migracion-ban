package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_PROSPECTOS", schema = "dbo")
public class BigProspectos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigProspectosId id;
	
	@Column(name = "s_tipo_cliente")
	private String s_tipo_cliente;
	
	@Column(name = "s_nombre_completo")
	private String s_nombre_completo;
	
	@Column(name = "i_posecion_negocio_mes")
	private Integer i_posecion_negocio_mes;
	
	@Column(name = "i_cod_fuerza_comercial")
	private String i_cod_fuerza_comercial;
	
	@Column(name = "i_codigo_ejecutivo")
	private String i_codigo_ejecutivo;
	
	@Column(name = "i_codigo_asesor_geo")
	private String i_codigo_asesor_geo;
	
	@Column(name = "s_cod_sector_economico")
	private String s_cod_sector_economico;	
	
	@Column(name = "s_cod_interno_actividad_economica")
	private String s_cod_interno_actividad_economica;
	
	@Column(name = "i_agencia_creacion")
	private String i_agencia_creacion;
	
	@Column(name = "i_codigo_segmento")
	private String i_codigo_segmento;
	
	@Column(name = "i_codigo_sub_segmento")
	private String i_codigo_sub_segmento;
	
	@Column(name = "s_telefono_movil")
	private String s_telefono_movil;
	
	@Column(name = "s_sexo")
	private String s_sexo;
	
	@Column(name = "d_fecha_nacimiento")
	private Date d_fecha_nacimiento;	
	
	@Column(name = "i_edad")
	private Integer i_edad;
	
	@Column(name = "m_total_activos")
	private BigDecimal m_total_activos;
	
	@Column(name = "i_cod_tipo_direccion")
	private String i_cod_tipo_direccion;
	
	@Column(name = "i_cod_clasifica_direccion")
	private String i_cod_clasifica_direccion;
	
	@Column(name = "i_cod_departamento_cap")
	private String i_cod_departamento_cap;
	
	@Column(name = "i_cod_municipio_cap")
	private String i_cod_municipio_cap;
	
	@Column(name = "i_cod_barrio_cap")
	private String i_cod_barrio_cap;

	@Column(name = "s_direccion_predio_cap")
	private String s_direccion_predio_cap;
	
	@Column(name = "s_estado_georeferencia")
	private String s_estado_georeferencia;
	
	@Column(name = "s_direccion_predio_geo")
	private String s_direccion_predio_geo;
	
	@Column(name = "i_cod_localidad")
	private String i_cod_localidad;
	
	@Column(name = "i_cod_barrio_geo")
	private Long i_cod_barrio_geo;

	@Column(name = "i_cod_oficina_geo")
	private Integer i_cod_oficina_geo;
	
	@Column(name = "i_cod_zona_geo")
	private String i_cod_zona_geo;
	
	@Column(name = "i_cod_subzona_geo")
	private String i_cod_subzona_geo;
	
	@Column(name = "f_coord_x")
	private BigDecimal f_coord_x;
	
	@Column(name = "f_coord_y")
	private BigDecimal f_coord_y;

	@Column(name = "i_codigo_postal")
	private Integer i_codigo_postal;
	
	@Column(name = "s_referencia_direccion")
	private String s_referencia_direccion;
	
	@Column(name = "s_canal_vinculacion")
	private String s_canal_vinculacion;
	
	@Column(name = "d_fecha_consulta")
	private Date d_fecha_consulta;

	@Column(name = "s_interesado")
	private String s_interesado;	

	@Column(name = "s_producto")
	private String s_producto;

	public BigProspectosId getId() {
		return id;
	}

	public void setId(BigProspectosId id) {
		this.id = id;
	}

	public String getS_tipo_cliente() {
		return s_tipo_cliente;
	}

	public void setS_tipo_cliente(String s_tipo_cliente) {
		this.s_tipo_cliente = s_tipo_cliente;
	}

	public String getS_nombre_completo() {
		return s_nombre_completo;
	}

	public void setS_nombre_completo(String s_nombre_completo) {
		this.s_nombre_completo = s_nombre_completo;
	}

	public Integer getI_posecion_negocio_mes() {
		return i_posecion_negocio_mes;
	}

	public void setI_posecion_negocio_mes(Integer i_posecion_negocio_mes) {
		this.i_posecion_negocio_mes = i_posecion_negocio_mes;
	}



	public String getS_cod_sector_economico() {
		return s_cod_sector_economico;
	}

	public void setS_cod_sector_economico(String s_cod_sector_economico) {
		this.s_cod_sector_economico = s_cod_sector_economico;
	}

	public String getS_cod_interno_actividad_economica() {
		return s_cod_interno_actividad_economica;
	}

	public void setS_cod_interno_actividad_economica(String s_cod_interno_actividad_economica) {
		this.s_cod_interno_actividad_economica = s_cod_interno_actividad_economica;
	}
	public String getS_telefono_movil() {
		return s_telefono_movil;
	}

	public void setS_telefono_movil(String s_telefono_movil) {
		this.s_telefono_movil = s_telefono_movil;
	}

	public String getS_sexo() {
		return s_sexo;
	}

	public void setS_sexo(String s_sexo) {
		this.s_sexo = s_sexo;
	}

	public Date getD_fecha_nacimiento() {
		return d_fecha_nacimiento;
	}

	public void setD_fecha_nacimiento(Date d_fecha_nacimiento) {
		this.d_fecha_nacimiento = d_fecha_nacimiento;
	}

	public Integer getI_edad() {
		return i_edad;
	}

	public void setI_edad(Integer i_edad) {
		this.i_edad = i_edad;
	}

	public BigDecimal getM_total_activos() {
		return m_total_activos;
	}

	public void setM_total_activos(BigDecimal m_total_activos) {
		this.m_total_activos = m_total_activos;
	}

	public String getI_cod_tipo_direccion() {
		return i_cod_tipo_direccion;
	}

	public void setI_cod_tipo_direccion(String i_cod_tipo_direccion) {
		this.i_cod_tipo_direccion = i_cod_tipo_direccion;
	}

	public String getI_cod_clasifica_direccion() {
		return i_cod_clasifica_direccion;
	}

	public void setI_cod_clasifica_direccion(String i_cod_clasifica_direccion) {
		this.i_cod_clasifica_direccion = i_cod_clasifica_direccion;
	}	

	public String getS_direccion_predio_cap() {
		return s_direccion_predio_cap;
	}

	public void setS_direccion_predio_cap(String s_direccion_predio_cap) {
		this.s_direccion_predio_cap = s_direccion_predio_cap;
	}

	public String getS_estado_georeferencia() {
		return s_estado_georeferencia;
	}

	public void setS_estado_georeferencia(String s_estado_georeferencia) {
		this.s_estado_georeferencia = s_estado_georeferencia;
	}

	public String getS_direccion_predio_geo() {
		return s_direccion_predio_geo;
	}

	public void setS_direccion_predio_geo(String s_direccion_predio_geo) {
		this.s_direccion_predio_geo = s_direccion_predio_geo;
	}	

	public Long getI_cod_barrio_geo() {
		return i_cod_barrio_geo;
	}

	public void setI_cod_barrio_geo(Long i_cod_barrio_geo) {
		this.i_cod_barrio_geo = i_cod_barrio_geo;
	}

	public Integer getI_cod_oficina_geo() {
		return i_cod_oficina_geo;
	}

	public void setI_cod_oficina_geo(Integer i_cod_oficina_geo) {
		this.i_cod_oficina_geo = i_cod_oficina_geo;
	}

	public String getI_cod_zona_geo() {
		return i_cod_zona_geo;
	}

	public void setI_cod_zona_geo(String i_cod_zona_geo) {
		this.i_cod_zona_geo = i_cod_zona_geo;
	}

	public String getI_cod_subzona_geo() {
		return i_cod_subzona_geo;
	}

	public void setI_cod_subzona_geo(String i_cod_subzona_geo) {
		this.i_cod_subzona_geo = i_cod_subzona_geo;
	}

	public BigDecimal getF_coord_x() {
		return f_coord_x;
	}

	public void setF_coord_x(BigDecimal f_coord_x) {
		this.f_coord_x = f_coord_x;
	}

	public BigDecimal getF_coord_y() {
		return f_coord_y;
	}

	public void setF_coord_y(BigDecimal f_coord_y) {
		this.f_coord_y = f_coord_y;
	}

	public Integer getI_codigo_postal() {
		return i_codigo_postal;
	}

	public void setI_codigo_postal(Integer i_codigo_postal) {
		this.i_codigo_postal = i_codigo_postal;
	}

	public String getS_referencia_direccion() {
		return s_referencia_direccion;
	}

	public void setS_referencia_direccion(String s_referencia_direccion) {
		this.s_referencia_direccion = s_referencia_direccion;
	}

	public String getS_canal_vinculacion() {
		return s_canal_vinculacion;
	}

	public void setS_canal_vinculacion(String s_canal_vinculacion) {
		this.s_canal_vinculacion = s_canal_vinculacion;
	}

	public Date getD_fecha_consulta() {
		return d_fecha_consulta;
	}

	public void setD_fecha_consulta(Date d_fecha_consulta) {
		this.d_fecha_consulta = d_fecha_consulta;
	}

	public String getS_interesado() {
		return s_interesado;
	}

	public void setS_interesado(String s_interesado) {
		this.s_interesado = s_interesado;
	}

	public String getS_producto() {
		return s_producto;
	}

	public void setS_producto(String s_producto) {
		this.s_producto = s_producto;
	}

	public String getI_cod_fuerza_comercial() {
		return i_cod_fuerza_comercial;
	}

	public void setI_cod_fuerza_comercial(String i_cod_fuerza_comercial) {
		this.i_cod_fuerza_comercial = i_cod_fuerza_comercial;
	}

	public String getI_codigo_ejecutivo() {
		return i_codigo_ejecutivo;
	}

	public void setI_codigo_ejecutivo(String i_codigo_ejecutivo) {
		this.i_codigo_ejecutivo = i_codigo_ejecutivo;
	}

	public String getI_codigo_asesor_geo() {
		return i_codigo_asesor_geo;
	}

	public void setI_codigo_asesor_geo(String i_codigo_asesor_geo) {
		this.i_codigo_asesor_geo = i_codigo_asesor_geo;
	}

	public String getI_agencia_creacion() {
		return i_agencia_creacion;
	}

	public void setI_agencia_creacion(String i_agencia_creacion) {
		this.i_agencia_creacion = i_agencia_creacion;
	}

	public String getI_codigo_segmento() {
		return i_codigo_segmento;
	}

	public void setI_codigo_segmento(String i_codigo_segmento) {
		this.i_codigo_segmento = i_codigo_segmento;
	}

	public String getI_codigo_sub_segmento() {
		return i_codigo_sub_segmento;
	}

	public void setI_codigo_sub_segmento(String i_codigo_sub_segmento) {
		this.i_codigo_sub_segmento = i_codigo_sub_segmento;
	}

	public String getI_cod_departamento_cap() {
		return i_cod_departamento_cap;
	}

	public void setI_cod_departamento_cap(String i_cod_departamento_cap) {
		this.i_cod_departamento_cap = i_cod_departamento_cap;
	}

	public String getI_cod_municipio_cap() {
		return i_cod_municipio_cap;
	}

	public void setI_cod_municipio_cap(String i_cod_municipio_cap) {
		this.i_cod_municipio_cap = i_cod_municipio_cap;
	}

	public String getI_cod_barrio_cap() {
		return i_cod_barrio_cap;
	}

	public void setI_cod_barrio_cap(String i_cod_barrio_cap) {
		this.i_cod_barrio_cap = i_cod_barrio_cap;
	}

	public String getI_cod_localidad() {
		return i_cod_localidad;
	}

	public void setI_cod_localidad(String i_cod_localidad) {
		this.i_cod_localidad = i_cod_localidad;
	}
	
	
}
