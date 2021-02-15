package exeptions;

public class aritmeticException extends Exception {

	public String multperzero() {
		String message = "Estas multiplicando por zero?!";
		return message;
	}

	public String divperzero() {
		String message = "Estas dividiendo entre zero?!";
		return message;
	}
}
