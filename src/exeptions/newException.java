package exeptions;

public class newException extends Exception {

	public newException() {
		super();
	}

	// metodo para mensaje customizado
	public String getMessage() {
		String mensaje = "patata";
		return mensaje;
	}

}