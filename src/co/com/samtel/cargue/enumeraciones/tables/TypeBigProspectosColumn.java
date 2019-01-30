package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigProspectosColumn implements IColumn {
	
	S_TIPO_CLIENTE(0, "S_tipo_cliente", String.class), 
	S_CODIGO_TIPO_IDENTIFICACION(1, "S_codigo_tipo_identificacion", String.class),
	S_NUMERO_IDENTIFICACION(2, "S_numero_identificacion", Integer.class),
	S_NOMBRE_COMPLETO(3, "S_nombre_completo", String.class),
	I_POSECION_NEGOCIO_MES(4, "I_posecion_negocio_mes", Integer.class),
	I_COD_FUERZA_COMERCIAL(5, "I_cod_fuerza_comercial", String.class),
	I_CODIGO_EJECUTIVO(6, "I_codigo_ejecutivo", String.class),
	I_CODIGO_ASESOR_GEO(7, "I_codigo_asesor_geo", String.class),
	S_COD_SECTOR_ECONOMICO(8, "S_cod_sector_economico", String.class),	
	S_COD_INTERNO_ACTIVIDAD_ECONOMICA(9, "S_cod_interno_actividad_economica", String.class),
	I_AGENCIA_CREACION(10, "I_agencia_creacion", String.class),
	I_CODIGO_SEGMENTO(11, "I_codigo_segmento", String.class),
	I_CODIGO_SUB_SEGMENTO(12, "I_codigo_sub_segmento", String.class),
	S_TELEFONO_MOVIL(13, "S_telefono_movil", String.class),
	S_SEXO(14, "S_sexo", String.class),
	D_FECHA_NACIMIENTO(15, "D_fecha_nacimiento", Date.class),
	I_EDAD(16, "I_edad", Integer.class),
	M_TOTAL_ACTIVOS(17, "M_total_activos", BigDecimal.class),
	I_COD_TIPO_DIRECCION(18, "I_cod_tipo_direccion", String.class),
	I_COD_CLASIFICA_DIRECCION(19, "I_cod_clasifica_direccion", String.class),
	I_COD_DEPARTAMENTO_CAP(20, "I_cod_departamento_cap", String.class),
	I_COD_MUNICIPIO_CAP(21, "I_cod_municipio_cap", String.class),
	I_COD_BARRIO_CAP(22, "I_cod_barrio_cap", String.class),
	S_DIRECCION_PREDIO_CAP(23, "S_direccion_predio_cap", String.class),	
	S_ESTADO_GEOREFERENCIA(24, "S_estado_georeferencia", String.class),
	S_DIRECCION_PREDIO_GEO(25, "S_direccion_predio_geo", String.class),
	I_COD_LOCALIDAD(26, "I_cod_localidad", String.class),
	I_COD_BARRIO_GEO(27, "I_cod_barrio_geo", Long.class),
	I_COD_OFICINA_GEO(28, "I_cod_oficina_geo", Integer.class),
	I_COD_ZONA_GEO(29, "I_cod_zona_geo", String.class),
	I_COD_SUBZONA_GEO(30, "I_cod_subzona_geo", String.class),
	F_COORD_X(31, "F_coord_x", BigDecimal.class),
	F_COORD_Y(32, "F_coord_y", BigDecimal.class),
	I_CODIGO_POSTAL(33, "I_codigo_postal", Integer.class),
	S_REFERENCIA_DIRECCION(34, "S_referencia_direccion", String.class),
	S_CANAL_VINCULACION(35, "S_canal_vinculacion", String.class),
	I_NUMERO_CARPETA(36, "I_numero_carpeta", Integer.class),
	D_FECHA_CARGUE(37, "D_fecha_cargue", Date.class),
	D_FECHA_CONSULTA(38, "D_fecha_consulta", Date.class),	
	S_INTERESADO(39, "S_interesado", String.class),
	S_PRODUCTO(40, "S_producto", String.class);
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigProspectosColumn(int indice, String nombreColumna, Class typeColumn) {
		this.indice = indice;
		this.nombreColumna = nombreColumna;
		this.typeColumn = typeColumn;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getNombreColumna() {
		return nombreColumna;
	}

	public void setNombreColumna(String nombreColumna) {
		this.nombreColumna = nombreColumna;
	}

	public Class getTypeColumn() {
		return typeColumn;
	}

	public void setTypeColumn( Class typeColumn) {
		this.typeColumn = typeColumn;
	}
}
