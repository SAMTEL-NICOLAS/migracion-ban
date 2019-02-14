package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigGeneraIcsColumn implements IColumn {
	
	I_CODIGO_CLIENTE (0,"I_codigo_cliente",Integer.class), //no viene
	S_ID_CLIENTE (1,"S_id_cliente",String.class),
	S_COD_PRODUCTO (2,"S_cod_producto",String.class),
	S_COD_EJECUTIVO (3,"S_cod_ejecutivo",String.class),
	M_MORA (4,"M_mora",BigDecimal.class),
	M_SALDO_CAPITAL(5,"M_saldo_capital",BigDecimal.class),
	M_INTERES_CORRIENTE(6,"M_interes_corriente",BigDecimal.class),
	M_CAPITAL_MORA(7,"M_capital_mora",BigDecimal.class),
	M_INTERES_MORA(8,"M_interes_mora",BigDecimal.class),
	I_DIAS_MORA (9,"I_dias_mora",Integer.class),
	D_FECHA_PAGO (10,"D_fecha_pago",Date.class),
	I_CUOTA_VENCIDA (11,"I_cuota_vencida",Integer.class),
	D_FECHA_ULT_GESTION (12,"D_fecha_ult_gestion",Date.class),
	S_ID_ACCION (13,"S_id_accion",String.class),
	S_ID_RESPUESTA (14,"S_id_respuesta",String.class),
	S_OBSERVACION (15,"S_observacion",String.class),
	S_ID_RAZON (16,"S_id_razon",String.class),
	D_FECHA_CORTE (17,"D_fecha_corte",Date.class);
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigGeneraIcsColumn(int indice, String nombreColumna, Class typeColumn) {
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
