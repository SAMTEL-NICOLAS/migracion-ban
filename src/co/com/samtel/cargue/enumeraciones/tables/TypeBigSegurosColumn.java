package co.com.samtel.cargue.enumeraciones.tables;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("all")
public enum TypeBigSegurosColumn implements IColumn {
	
	S_TERRITORIAL(0,"S_territorial",String.class),	
	S_COD_OFICINA(1,"S_cod_oficina",Short.class),	
	S_NOM_OFICINA(2,"S_nom_oficina",String.class),	
	D_FECHA(3,"D_fecha",Date.class),		
	S_ID_VENDEDOR(4,"S_id_vendedor",String.class),	
	S_NOMBRE_VENDEDOR(5,"S_nombre_vendedor",String.class),	
	S_CARGO_ASESOR(6,"S_cargo_asesor",String.class),
	S_ID_APROBADOR(7,"S_id_aprobador",String.class),	
	S_NOMBRE_APROBADOR(8,"S_nombre_aprobador",String.class),	
	S_ID_CLIENTE(9,"S_id_cliente",String.class),	
	S_NOMBRE_CLIENTE(10,"S_nombre_cliente",String.class),	
	S_PLAN(11,"S_plan",String.class),
	M_VALOR_MENSUAL(12,"M_valor_mensual",BigDecimal.class),	
	M_TOTAL_PLAN(13,"M_total_plan",BigDecimal.class),
	I_NUMERO_MESES(14,"I_numero_meses",Integer.class),	
	S_FORMA_PAGO(15,"S_forma_pago",String.class),	
	S_ORIGEN_VENTA(16,"S_origen_venta",String.class),	
	M_TOTAL_PAGADO(17,"M_total_pagado",BigDecimal.class),	
	S_STATUS(18,"S_status",String.class),
	D_COBERTURA_HASTA(19,"D_cobertura_hasta",Date.class),	
	M_NUM_CTAXPAGAR(20,"M_num_ctaxpagar",Integer.class),	
	I_GRUPO(21,"I_grupo",Integer.class),
	I_COD_PRODUCTO(22,"I_cod_producto",Integer.class),
	D_FECHA_CORTE(23,"D_fecha_corte",Date.class),
	I_CODIGO_ASESOR(24,"I_codigo_asesor",Integer.class),	
	I_CODIGO_CLIENTE(25,"I_codigo_cliente",Long.class),	
	I_PRODUCTO(26,"I_producto_asociado",Long.class);
	
	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;	

	private TypeBigSegurosColumn(int indice, String nombreColumna, Class typeColumn) {
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
