package co.com.samtel.entity.manual.sql;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIG_GEOREFERENCIAR_PROSPECTO", schema = "dbo")
public class BigGeoReferenciarProspecto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private BigGeoReferenciarProspectoId id;
	
	@Column(name = "i_codigo_ejecutivo")
	private String i_codigo_ejecutivo;	
	
	@Column(name = "i_codigo_asesor_geo")
	private String i_codigo_asesor_geo;	
	
	@Column(name = "i_codigo_fuerza")
	private String i_codigo_fuerza;	
	
	@Column(name = "s_nombre_persona")
	private String s_nombre_persona;	
	
	@Column(name = "s_nombre1")
	private String s_nombre1;		
	
	@Column(name = "s_nombre3")
	private String s_nombre3;	
	
	@Column(name = "s_nombre2")
	private String s_nombre2;	
	
	@Column(name = "s_nombre4")
	private String s_nombre4;	
	
	@Column(name = "i_codigo_act")
	private String i_codigo_act;		
	
	@Column(name = "i_codigo_ocupacion")
	private String i_codigo_ocupacion;	
	
	@Column(name = "s_telefono_movil")
	private String s_telefono_movil;	
	
	@Column(name = "s_telefono_fijo")
	private String s_telefono_fijo;	
	
	@Column(name = "d_fecha_nacmto")
	private Date d_fecha_nacmto;	
	
	@Column(name = "m_total_activos")
	private BigDecimal m_total_activos;	
	
	@Column(name = "s_tipo_direccion")
	private String s_tipo_direccion;	
	
	@Column(name = "s_clase_direccion")
	private String s_clase_direccion;	
	
	@Column(name = "i_depto_ppal")
	private String i_depto_ppal;		
	
	@Column(name = "i_ciudad_ppal")
	private String i_ciudad_ppal;	
	
	@Column(name = "i_cod_barrio")
	private String i_cod_barrio;	
	
	@Column(name = "s_direccion_ppal")
	private String s_direccion_ppal;	
	
	@Column(name = "i_codigo_zona")
	private String i_codigo_zona;
	
	@Column(name = "i_codigo_oficina")
	private String i_codigo_oficina;	
	
	@Column(name = "s_ubicacion_direccion")
	private String s_ubicacion_direccion;	
	
	@Column(name = "i_nro_consulta")
	private Integer i_nro_consulta;	
	
	@Column(name = "s_interesado")
	private String s_interesado;	
	
	@Column(name = "s_producto")
	private String s_producto;

	public BigGeoReferenciarProspectoId getId() {
		return id;
	}

	public void setId(BigGeoReferenciarProspectoId id) {
		this.id = id;
	}
	
	public String getS_nombre_persona() {
		return s_nombre_persona;
	}

	public void setS_nombre_persona(String s_nombre_persona) {
		this.s_nombre_persona = s_nombre_persona;
	}

	public String getS_nombre1() {
		return s_nombre1;
	}

	public void setS_nombre1(String s_nombre1) {
		this.s_nombre1 = s_nombre1;
	}

	public String getS_nombre3() {
		return s_nombre3;
	}

	public void setS_nombre3(String s_nombre3) {
		this.s_nombre3 = s_nombre3;
	}

	public String getS_nombre2() {
		return s_nombre2;
	}

	public void setS_nombre2(String s_nombre2) {
		this.s_nombre2 = s_nombre2;
	}

	public String getS_nombre4() {
		return s_nombre4;
	}

	public void setS_nombre4(String s_nombre4) {
		this.s_nombre4 = s_nombre4;
	}	

	public String getS_telefono_movil() {
		return s_telefono_movil;
	}

	public void setS_telefono_movil(String s_telefono_movil) {
		this.s_telefono_movil = s_telefono_movil;
	}

	public String getS_telefono_fijo() {
		return s_telefono_fijo;
	}

	public void setS_telefono_fijo(String s_telefono_fijo) {
		this.s_telefono_fijo = s_telefono_fijo;
	}

	public Date getD_fecha_nacmto() {
		return d_fecha_nacmto;
	}

	public void setD_fecha_nacmto(Date d_fecha_nacmto) {
		this.d_fecha_nacmto = d_fecha_nacmto;
	}

	public BigDecimal getM_total_activos() {
		return m_total_activos;
	}

	public void setM_total_activos(BigDecimal m_total_activos) {
		this.m_total_activos = m_total_activos;
	}

	public String getS_tipo_direccion() {
		return s_tipo_direccion;
	}

	public void setS_tipo_direccion(String s_tipo_direccion) {
		this.s_tipo_direccion = s_tipo_direccion;
	}

	public String getS_clase_direccion() {
		return s_clase_direccion;
	}

	public void setS_clase_direccion(String s_clase_direccion) {
		this.s_clase_direccion = s_clase_direccion;
	}

	

	public String getS_direccion_ppal() {
		return s_direccion_ppal;
	}

	public void setS_direccion_ppal(String s_direccion_ppal) {
		this.s_direccion_ppal = s_direccion_ppal;
	}

	
	public String getS_ubicacion_direccion() {
		return s_ubicacion_direccion;
	}

	public void setS_ubicacion_direccion(String s_ubicacion_direccion) {
		this.s_ubicacion_direccion = s_ubicacion_direccion;
	}

	public Integer getI_nro_consulta() {
		return i_nro_consulta;
	}

	public void setI_nro_consulta(Integer i_nro_consulta) {
		this.i_nro_consulta = i_nro_consulta;
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

	public String getI_codigo_fuerza() {
		return i_codigo_fuerza;
	}

	public void setI_codigo_fuerza(String i_codigo_fuerza) {
		this.i_codigo_fuerza = i_codigo_fuerza;
	}

	public String getI_codigo_act() {
		return i_codigo_act;
	}

	public void setI_codigo_act(String i_codigo_act) {
		this.i_codigo_act = i_codigo_act;
	}

	public String getI_codigo_ocupacion() {
		return i_codigo_ocupacion;
	}

	public void setI_codigo_ocupacion(String i_codigo_ocupacion) {
		this.i_codigo_ocupacion = i_codigo_ocupacion;
	}

	public String getI_depto_ppal() {
		return i_depto_ppal;
	}

	public void setI_depto_ppal(String i_depto_ppal) {
		this.i_depto_ppal = i_depto_ppal;
	}

	public String getI_ciudad_ppal() {
		return i_ciudad_ppal;
	}

	public void setI_ciudad_ppal(String i_ciudad_ppal) {
		this.i_ciudad_ppal = i_ciudad_ppal;
	}

	public String getI_cod_barrio() {
		return i_cod_barrio;
	}

	public void setI_cod_barrio(String i_cod_barrio) {
		this.i_cod_barrio = i_cod_barrio;
	}

	public String getI_codigo_zona() {
		return i_codigo_zona;
	}

	public void setI_codigo_zona(String i_codigo_zona) {
		this.i_codigo_zona = i_codigo_zona;
	}

	public String getI_codigo_oficina() {
		return i_codigo_oficina;
	}

	public void setI_codigo_oficina(String i_codigo_oficina) {
		this.i_codigo_oficina = i_codigo_oficina;
	}	
	
}
