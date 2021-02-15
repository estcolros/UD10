package Ejercicio3;

import java.util.Random;
import exeptions.intException;

public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		System.out.println("Generando numero random...");
		String mensaje = "";
		int a = rn.nextInt(999);
		try {
			if (a % 2 == 0) {
				mensaje = "par";
			} else {
				mensaje = "inpar";
			}
			throw new intException(mensaje);
		} catch (intException e) {
			System.out.println(e.getMessage());
		}

	}

}