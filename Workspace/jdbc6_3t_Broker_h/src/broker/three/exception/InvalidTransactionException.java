package broker.three.exception;

public class InvalidTransactionException extends Exception{
	public InvalidTransactionException() {
		this("This is DuplicateSSNException....");
	}
	public InvalidTransactionException(String message) {
		super(message);
	}
}
