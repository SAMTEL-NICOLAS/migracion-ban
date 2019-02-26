package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigInfFinancieraColumn implements IColumn {
	
	I_COD_OFICINA(0,"I_cod_oficina",String.class),
	M_GASTO_ADMINISTRATIVO(1,"M_gasto_administrativo",BigDecimal.class),
	M_GASTO_PERSONAL(2,"M_gasto_personal",BigDecimal.class),
	M_GASTO_NETO_PROVISION(3,"M_gasto_neto_provision",BigDecimal.class),
	M_GASTO_ASIGNADO(4,"M_gasto_asignado",BigDecimal.class),
	M_COSTO_PATRIMONIO_RIESGO(5,"M_costo_patrimonio_riesgo",BigDecimal.class),
	D_FECHA_CORTE(6,"D_fecha_corte",Date.class),
	M_INGRESOS_TOTALES(7,"M_ingresos_totales",BigDecimal.class),
	M_EGRESOS_TOTALES(8,"M_egresos_totales",BigDecimal.class);
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;
	

	private TypeBigInfFinancieraColumn(int indice, String nombreColumna, Class typeColumn) {
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
