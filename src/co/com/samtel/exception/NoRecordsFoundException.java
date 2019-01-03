package co.com.samtel.exception;

public class NoRecordsFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoRecordsFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoRecordsFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoRecordsFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoRecordsFoundException(String message) {
		super(message);
	}

	public NoRecordsFoundException(Throwable cause) {
		super(cause);
	}

}
