package broker.three.exception;

public class RecordNotFoundException extends Exception{
	public RecordNotFoundException() {
		this("This is DuplicateSSNException....");
	}
	public RecordNotFoundException(String message) {
		super(message);
	}
}
