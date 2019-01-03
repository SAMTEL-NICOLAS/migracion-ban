package co.com.samtel.dto;

import co.com.samtel.enumeraciones.TableMigration;
import co.com.samtel.enumeraciones.TypeErrors;

public class ErrorDto {

	private TableMigration table;
	private TypeErrors typeError;
	private String message;

	public static ErrorDto of() {
		return new ErrorDto();
	}

	public static ErrorDto of(TableMigration table, TypeErrors typeError, String message) {
		return new ErrorDto(table, typeError, message);
	}

	public ErrorDto(TableMigration table, TypeErrors typeError, String message) {
		super();
		this.table = table;
		this.typeError = typeError;
		this.message = message;
	}

	public ErrorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableMigration getTable() {
		return table;
	}

	public void setTable(TableMigration table) {
		this.table = table;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TypeErrors getTypeError() {
		return typeError;
	}

	public void setTypeError(TypeErrors typeError) {
		this.typeError = typeError;
	}

}
