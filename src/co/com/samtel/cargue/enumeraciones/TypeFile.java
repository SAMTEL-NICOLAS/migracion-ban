package co.com.samtel.cargue.enumeraciones;

public enum TypeFile {

	BIG_DESENDEUDESE(1,3,"BIG_DESENDEUDESE"), BIG_METAS_FUERZA_COMERCIAL(2,3,"BIG_METAS_FUERZA_COMERCIAL");

	private Integer id;
	private Integer numColumns;
	private String nombreArchivo;
	

	private TypeFile(Integer id, Integer numColumns, String nombreArchivo) {
		this.numColumns = numColumns;
		this.nombreArchivo = nombreArchivo;
		this.id = id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
