package co.com.samtel.cargue.enumeraciones.tables;
@SuppressWarnings("all")
public enum TypeBigDesendeudeseColumn implements IColumn {

	TIPO_DOCUMENTO(0, "TipoDocumento", String.class), 
	IDENTIFICACION_CLIENTE(1, "IdentificacionCliente", String.class),
	CODIGO_CLIENTE(2, "CodigoCliente", String.class);

	private int indice;
	private String nombreColumna;
	@SuppressWarnings("rawtypes")
	private Class typeColumn;

	

	private TypeBigDesendeudeseColumn(int indice, String nombreColumna, Class typeColumn) {
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
