package co.com.samtel.cargue.enumeraciones.tables;

import java.util.Date;
import java.math.BigDecimal;

@SuppressWarnings("all")
public enum TypeBigCalificacionCarteraClienteColumn implements IColumn {
	
	IDENTIFICACION_CLIENTE(0, "S_identificacion_cliente", String.class), 
	TIPO_IDENTIFICACION(1, "I_tipo_identificacion", String.class),
	CODIGO_CLIENTE(2, "I_codigo_cliente", String.class),
	FUERZA_COMERCIAL(3, "I_fuerza_comercial", String.class),
	OFICINA(4, "I_oficina", String.class),
	DESCRIPCION_LINEA(5, "S_descripcion_linea", String.class),
	COD_OPERACION(6, "I_cod_operacion", Long.class),
	CALIFICACION_ANTERIOR(7, "S_calificacion_anterior", String.class),
	CALIFICACION_ACTUAL(8, "S_calificacion_actual", String.class),
	FECHA_INICIO_CRE(9, "D_fecha_inicio_cre", Date.class),
	FECHA_VCTO(10, "D_fecha_vcto", Date.class),
	DIAS_MORA(11, "I_dias_de_mora", Integer.class),
	CAPITAL(12, "M_capital", BigDecimal.class),
	RE_ESTADO(13, "I_re_estado", Integer.class),
	FECHA_CARGA(14, "D_fecha_carga", Date.class);

	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigCalificacionCarteraClienteColumn(int indice, String nombreColumna, Class typeColumn) {
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
