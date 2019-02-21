package co.com.samtel.cargue.enumeraciones.tables;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigProductosColumn implements IColumn {
	
	I_COD_TIPO_PRODUCTO(0, "I_cod_tipo_producto",Integer.class),
	S_DES_TIPO_PRODUCTO(1,"S_des_tipo_producto",String.class),
	I_COD_PRODUCTO(2,"I_cod_producto",Integer.class),
	S_DES_PRODUCTO(3,"S_des_producto",String.class),	
	I_COD_SUB_PRODUCTO(4,"I_cod_sub_producto",Integer.class),
	S_DES_SUB_PRODUCTO(5,"S_des_sub_producto",String.class),
	S_DES_SEGMENTO_PRODUCTO(6,"S_des_segmento_producto",String.class),	
	S_DES_CATEGORIA_ASESOR(7,"S_des_categoria_asesor",String.class),
	S_DES_SEGMENTO_CLIENTE(8,"S_des_segmento_cliente",String.class),
	S_DES_SEGMENTO_TASAs(9,"S_des_segmento_tasas",String.class),
	M_TASA_REFERENCIA(10,"M_tasa_referencia",BigDecimal.class),
	D_FECHA_CORTE(11,"D_fecha_corte",Date.class);
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;	

	private TypeBigProductosColumn(int indice, String nombreColumna, Class typeColumn) {
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
