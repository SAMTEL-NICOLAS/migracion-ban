package co.com.samtel.cargue.enumeraciones.tables;

public interface IColumn {
	
	int getIndice();
	
	String getNombreColumna();
	
	@SuppressWarnings("rawtypes")
	Class getTypeColumn();

}
