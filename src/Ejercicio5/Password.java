package Ejercicio5;

public class Password {
	protected final int LONG_DEF = 8;

	protected int longitud = LONG_DEF;
	protected String pass;

	public Password(int longitud) {
		this.longitud = longitud;
		this.pass = generarPassword();
	}

	public Password() {
		this.pass = generarPassword();
	}

	public String generarPassword() {
		String finale = "";
		// Cadena con todos los posibles carateres
		String CadenaLetrasNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

		// Creamos un StringBuilder de tantos caracteres como la long de la pass
		StringBuilder newPass = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {

			// numero random entre 0 y la longitud maxima
			int index = (int) (CadenaLetrasNum.length() * Math.random());

			// añadimos el caracter escojido a la pass
			newPass.append(CadenaLetrasNum.charAt(index));
		}

		finale = newPass.toString();
		return finale;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPass() {
		return pass;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", pass=" + pass + "]";
	}

	public boolean esFuerte() {
		boolean esFuerte = false;

		char currentCharacter;
		int numeros = 0;
		int mayus = 0;
		int minus = 0;

		for (int i = 0; i < pass.length(); i++) {
			currentCharacter = pass.charAt(i);
			if (Character.isDigit(currentCharacter)) {
				numeros++;
			} else if (Character.isUpperCase(currentCharacter)) {
				mayus++;
			} else if (Character.isLowerCase(currentCharacter)) {
				minus++;
			}

		}

		if (mayus >= 2 && minus >= 1 && numeros >= 5) {
			esFuerte = true;
		}

		return esFuerte;
	}

}
