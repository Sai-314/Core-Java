package ExceptionHandling;

public class BusinessException extends Exception{

	private String errorCode;
	
	public BusinessException(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
