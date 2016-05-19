package src.ex01;

public class ObjectNotFoundException extends Exception {

	public final String message;

	public ObjectNotFoundException(String message){
		super(message);
		this.message = message;
	}
}
