package src;

public class BadDataSetException extends Exception {

	public String setName;

	public BadDataSetException(Exception e, String setName){
		super(e);
		this.setName = setName;
	}
}
