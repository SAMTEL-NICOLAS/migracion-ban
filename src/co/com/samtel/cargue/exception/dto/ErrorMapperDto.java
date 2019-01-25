package co.com.samtel.cargue.exception.dto;

import co.com.samtel.cargue.enumeraciones.ErrorMapperType;
import co.com.samtel.cargue.enumeraciones.TypeFile;

public class ErrorMapperDto {

	private ErrorMapperType typeError;
	private TypeFile typeFile;
	private String columnName;
	private String description;
	
	public static ErrorMapperDto of(ErrorMapperType typeError, TypeFile typeFile, String columnName, String description) {
		return new ErrorMapperDto(typeError, typeFile, columnName, description);
	}

	public ErrorMapperDto(ErrorMapperType typeError, TypeFile typeFile, String columnName, String description) {
		super();
		this.typeError = typeError;
		this.typeFile = typeFile;
		this.columnName = columnName;
		this.description = description;
	}



	public ErrorMapperType getTypeError() {
		return typeError;
	}

	public void setTypeError(ErrorMapperType typeError) {
		this.typeError = typeError;
	}

	public TypeFile getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(TypeFile typeFile) {
		this.typeFile = typeFile;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
