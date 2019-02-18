package co.com.samtel.cargue.enumeraciones.tables;
import java.util.Date;
import java.math.BigDecimal;

@SuppressWarnings("all")
public enum TypeBigMetasOficinaColumn implements IColumn {
	
	
	S_COD_OFICINA(0, "S_cod_oficina", String.class),
	D_FECHA(1, "D_fecha", Date.class), 
	I_COD_SEGMENTO_PRODUCTO(2, "I_cod_segmento_producto", Integer.class),
	S_NOMBRE_META(3, "S_nombre_meta", String.class),
	M_VALOR_META(4, "M_valor_meta", BigDecimal.class);
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigMetasOficinaColumn(int indice, String nombreColumna, Class typeColumn) {
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
