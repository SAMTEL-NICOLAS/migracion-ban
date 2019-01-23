package co.com.samtel.exception;

public class ControlledExeption extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ControlledExeption() {
		super();
	}

	public ControlledExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ControlledExeption(String message, Throwable cause) {
		super(message, cause);
	}

	public ControlledExeption(String message) {
		super(message);
	}

	public ControlledExeption(Throwable cause) {
		super(cause);
	}

}
