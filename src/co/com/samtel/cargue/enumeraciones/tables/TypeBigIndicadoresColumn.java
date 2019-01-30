package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigIndicadoresColumn implements IColumn {
	
	FECHA_INICIO(0, "D_fecha_inicio", Date.class), 
	FECHA_FIN(1, "D_fecha_fin", Date.class),
	ID_INDICADOR(2, "I_id_indicador", Integer.class),
	NOMBRE_INDICADOR(3, "S_nombre_indicador", String.class),	
	LIMITE_BAJO(4, "M_limite_bajo", BigDecimal.class),	
	COLOR_LIMITE_BAJO(5, "S_color_limite_bajo", String.class),	
	LIMITE_MEDIO(6, "M_limite_medio", BigDecimal.class),
	COLOR_LIMITE_MEDIO(7, "S_color_limite_medio", String.class),	
	LIMITE_ALTO(8, "M_limite_alto", BigDecimal.class),
	COLOR_LIMITE_ALTO(9, "S_color_limite_alto", String.class);

	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigIndicadoresColumn(int indice, String nombreColumna, Class typeColumn) {
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
