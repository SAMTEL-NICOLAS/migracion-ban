package co.com.samtel.cargue.enumeraciones;

public enum TypeFile {

	BIG_CALIFICACION_CARTERA_CLIENTE(1, 15, "BIG_CALIFICACION_CARTERA_CLIENTE"),
	BIG_PARA_INDICADORES(2, 10, "BIG_INDICADORES"),
	BIG_PROSPECTOS(3, 41, "BIG_PROSPECTOS"),
	BIG_METAS_OFICINA(4, 5, "BIG_METAS_OFICINA"),
	BIG_METAS_FUERZA_COMERCIAL(5, 6, "BIG_METAS_FC"),
	BIG_INF_FINANCIERA(6, 9, "BIG_INF_FINANCIERA"),
	BIG_GEOREFERENCIAR_PROSPECTO(7, 29, "BIG_GEOREFERENCIAR_PROSPECTO"),
	BIG_DESENDEUDESE(8, 96, "BIG_DESENDEUDESE"), 
	BIG_GENERA_ICS(9,18,"BIG_GENERA_ICS"),
	BIG_CIFIN_BUREAU(10,60,"BIG_CIFIN_BUREAU"),
	BIG_PRODUCTOS(11,12,"BIG_PRODUCTOS"),
	BIG_SEGUROS(12,27,"BIG_SEGUROS")
	;

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
