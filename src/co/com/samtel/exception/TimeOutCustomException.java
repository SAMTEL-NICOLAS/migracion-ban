package co.com.samtel.exception;

public class TimeOutCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TimeOutCustomException() {
		super();
	}

	public TimeOutCustomException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public TimeOutCustomException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TimeOutCustomException(String arg0) {
		super(arg0);
	}

	public TimeOutCustomException(Throwable arg0) {
		super(arg0);
	}
	
	

}
