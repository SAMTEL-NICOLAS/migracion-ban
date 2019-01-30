package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigMetasFuerzaComercialColumn implements IColumn {
	
	D_FECHA(0, "D_fecha", Date.class), 
	I_COD_FUERZA_COMERCIAL(1, "I_cod_fuerza_comercial", Date.class),
	I_COD_SEGMENTO_PRODUCTO(2, "I_cod_segmento_producto", Integer.class),
	I_CATEGORIA_ASESOR(3, "I_categoria_asesor", String.class),	
	S_NOMBRE_META(4, "S_nombre_meta", String.class),	
	M_VALOR_META(5, "M_valor_meta", BigDecimal.class);

	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigMetasFuerzaComercialColumn(int indice, String nombreColumna, Class typeColumn) {
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
