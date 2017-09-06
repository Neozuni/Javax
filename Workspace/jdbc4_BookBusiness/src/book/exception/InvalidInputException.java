package book.exception;

public class InvalidInputException extends Exception{
	public InvalidInputException(){
		this("This is InvalidInputException....");
	}
	public InvalidInputException(String message){
		super(message);
	}
}
