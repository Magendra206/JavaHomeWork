package lmspractice;

public class InvalidRollNumberException extends Exception {
	String message;

	public InvalidRollNumberException(String message) {
		super(message);
		this.message = message;
	}
	

}
