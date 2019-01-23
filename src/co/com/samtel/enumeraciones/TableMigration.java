package co.com.samtel.enumeraciones;

public enum TableMigration {
	
	BIG_RECOGIDOS("CRM1407F","BIG_RECOGIDOS"),
	BIG_RECUPERA_CARTERA_CASTIGADA("CRM1408F","BIG_RECUPERA_CARTERA_CASTIGADA"),
	BIG_CIUDADES("CRM1411F84","BIG_CIUDADES"),
	BIG_BARRIOS("CRM1411FUR","BIG_BARRIOS"),
	BIG_CODIGOS_ABOGADO("CRM1411FYQ","BIG_CODIGOS_ABOGADO"),
	BIG_TIPO_IDENT_CLIENTES("CRM1411F34", "BIG_TIPO_IDENT_CLIENTES"),
	BIG_ACTIVIDAD_ECONOMICA_INTERNA("CRM1411FS3","BIG_ACTIVIDAD_ECONOMICA_INTERN"),
	BIG_TIPO_TRANSACCION("CRM1411F20","BIG_TIPO_TRANSACCION"),
	BIG_ESTADOS_CARPETAS("CRM1411FCE","BIG_ESTADOS_CARPETAS"),
	BIG_SUBPRODUCTOS("CRM1411FAP","BIG_SUBPRODUCTOS"),
	BIG_SUBSEGMENTO_CLIENTE("CRM1411FNI","BIG_SUBSEGMENTO_CLIENTE"),
	BIG_OFICINA("CRM1412F","BIG_OFICINA"),
	BIG_ACTIVO_CONSOLIDADO("CRM1414F","BIG_ACTIVOS_CONSOLIDADO"),
	BIG_CUPO_ROTATIVO("CRM1415F","BIG_CUPO_ROTATIVO"),
	BIG_CLIENTES("CRM1419F","BIG_CLIENTES"),
	BIG_DIRECCION("CRM1420F","BIG_DIRECCION"),
	BIG_CREDIPREMIUM("CRM1481F","BIG_CREDIPREMIUM"),
	BIG_LOCALIDAD("CRM1411FRU","BIG_LOCALIDAD"),
	BIG_PARAMETROS_CONSOLIDADOS("CRM1410F","BIG_PARAMETROS_CONSOLIDADOS"),
	BIG_PASIVOS_CDT("CRM1416F","BIG_PASIVOS_CDT"),
	BIG_PASIVOS_AH("CRM1417F","BIG_PASIVOS_AH"),
	BIG_PASIVOS_CONSOLIDADO("CRM1418F","BIG_PASIVOS_CONSOLIDADO"),
	BIG_ACTIVOS("CRM1413F","BIG_ACTIVOS"),
	BIG_ACTUALIZA_DATOS("CRM1480F","BIG_ACTUALIZA_DATOS"),
	BIG_CLIENTE_ESTADOS("CRM1421F","BIG_CLIENTE_ESTADOS"),
	BIG_NOTA_INTERNA("CRM1422F","BIG_NOTA_INTERNA"),
	BIG_INFO_ADICIONAL_CLIENTE("CRM1423F","BIG_INFOADICIONALCLIENTES"),
	BIG_CONS_CENTRALES("CRM1424F","BIG_CONS_CENTRALES"),
	BIG_CANALES("CRM1425F","BIG_CANALES"),
	BIG_EJECUTIVO("CRM1426F","BIG_EJECUTIVO"),
	BIG_RANGO_MORA("CRM1411FMO","BIG_RANGO_MORA"),
	BIG_CALIFICACION_CARTERA("CRM1411FCA","BIG_CALIFICACION_CARTERA");
	
	private String nameAs;
	private String nameSql;
	
	private TableMigration(String nameAs, String nameSql) {
		this.nameAs = nameAs;
		this.nameSql = nameSql;
	}
	public String getNameAs() {
		return nameAs;
	}
	public void setNameAs(String nameAs) {
		this.nameAs = nameAs;
	}
	public String getNameSql() {
		return nameSql;
	}
	public void setNameSql(String nameSql) {
		this.nameSql = nameSql;
	}
	
}
