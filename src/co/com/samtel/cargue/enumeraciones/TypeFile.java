package co.com.samtel.cargue.enumeraciones;

public enum TypeFile {
	//BIG_DESENDEUDESE(3,"BIG_DESENDEUDESE"), BIG_METAS_FUERZA_COMERCIAL(2,"BIG_METAS_FUERZA_COMERCIAL");
	BIG_DESENDEUDESE(96,"BIG_DESENDEUDESE");
	private Integer numColumns;
	private String nombreArchivo;
	

	private TypeFile(Integer numColumns, String nombreArchivo) {
		this.numColumns = numColumns;
		this.nombreArchivo = nombreArchivo;
	}

	public Integer getNumColumns() {
		return numColumns;
	}

	public void setNumColumns(Integer numColumns) {
		this.numColumns = numColumns;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

}
