package book.exception;

public class RecoreNotFoundException extends Exception{
	public RecoreNotFoundException(){
		this("This is RecoreNotFoundException....");
	}
	public RecoreNotFoundException(String message){
		super(message);
	}
}
