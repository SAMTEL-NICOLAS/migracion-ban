package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigGeoreferenciarProspectoColumn implements IColumn {

	I_CODIGO_EJECUTIVO(0,"I_codigo_ejecutivo",String.class),
	I_CODIGO_ASESOR_GEO(1,"I_codigo_asesor_geo",String.class),
	I_CODIGO_FUERZA(2,"I_codigo_fuerza",String.class),
	I_TIPO_PERSONA(3,"I_tipo_persona",String.class),
	S_CODIGO_PERSONA(4,"S_codigo_persona",String.class),
	S_NOMBRE_PERSONA(5,"S_nombre_persona",String.class),
	S_NOMBRE1(6,"S_nombre1",String.class),
	S_NOMBRE3(7,"S_nombre3",String.class),
	S_NOMBRE2(8,"S_nombre2",String.class),
	S_NOMBRE4(9,"S_nombre4",String.class),
	I_CODIGO_ACT(10,"I_codigo_act",String.class),
	I_CODIGO_OCUPACION(11,"I_codigo_ocupacion",String.class),
	S_TELEFONO_MOVIL(12,"S_telefono_movil",String.class),
	S_TELEFONO_FIJO(13,"S_telefono_fijo",String.class),
	D_FECHA_NACMTO(14,"D_fecha_nacmto",Date.class),
	M_TOTAL_ACTIVOS(15,"M_total_activos",BigDecimal.class),
	S_TIPO_DIRECCION(16,"S_tipo_direccion",String.class),
	S_CLASE_DIRECCION(17,"S_clase_direccion",String.class),
	I_DEPTO_PPAL(18,"I_depto_ppal",String.class),
	I_CIUDAD_PPAL(19,"I_ciudad_ppal",String.class),
	I_COD_BARRIO(20,"I_cod_barrio",String.class),
	S_DIRECCION_PPAL(21,"S_direccion_ppal",String.class),
	I_CODIGO_ZONA(22,"I_codigo_zona",String.class),
	I_CODIGO_OFICINA(23,"I_codigo_oficina",String.class),
	S_UBICACION_DIRECCION(24,"S_ubicacion_direccion",String.class),
	D_FECHA_CORTE(25,"D_fecha_corte",Date.class),
	I_NRO_CONSULTA(26,"I_nro_consulta",Integer.class),
	S_INTERESADO(27,"S_interesado",String.class),
	S_PRODUCTO(28,"S_producto",String.class);

	
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;

	private TypeBigGeoreferenciarProspectoColumn(int indice, String nombreColumna, Class typeColumn) {
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

	public void setTypeColumn(Class typeColumn) {
		this.typeColumn = typeColumn;
	}

}
