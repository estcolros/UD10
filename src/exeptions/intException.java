package exeptions;

public class intException extends Exception {
	public String mensaje;

	public intException(String mensaje) {
		super();
		this.mensaje = "El numero es " + mensaje;
	}

	public String getMessage() {
		return mensaje;
	}

}
