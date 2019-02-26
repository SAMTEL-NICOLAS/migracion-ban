package co.com.samtel.cargue.exception;

public class UploadMapperExpetion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileName;
	private String columnName;
	private Long row;
	private Long column;
	private String message;	


	public UploadMapperExpetion(String fileName, String columnName, Long row, Long column, String message) {
		super();
		this.fileName = fileName;
		this.columnName = columnName;
		this.row = row;
		this.column = column;
		this.message = message;
	}

	public UploadMapperExpetion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UploadMapperExpetion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UploadMapperExpetion(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UploadMapperExpetion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UploadMapperExpetion(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public Long getRow() {
		return row;
	}

	public void setRow(Long row) {
		this.row = row;
	}

	public Long getColumn() {
		return column;
	}

	public void setColumn(Long column) {
		this.column = column;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	

}
