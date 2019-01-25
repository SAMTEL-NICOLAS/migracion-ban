package co.com.samtel.cargue.exception;

import co.com.samtel.cargue.exception.dto.ErrorMapperDto;

public class MapperException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ErrorMapperDto error;

	public MapperException(ErrorMapperDto error) {
		super();
		this.error = error;
	}

	public ErrorMapperDto getError() {
		return error;
	} 
	

}
