package jdbc.exception;

public class DuplicateIdException extends Exception{
	public DuplicateIdException() {
		this("This is DuplicateIdException...");
	}
	public DuplicateIdException(String message) {
		super(message);
	}
}
