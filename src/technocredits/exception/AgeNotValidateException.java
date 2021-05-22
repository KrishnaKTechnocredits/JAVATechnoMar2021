package technocredits.exception;

public class AgeNotValidateException extends Exception{
	
	public AgeNotValidateException() {
		super();
	}
	
	public AgeNotValidateException(String message) {
		super(message);
	}
	
	public String toString() {
		return getMessage();
	}
}
