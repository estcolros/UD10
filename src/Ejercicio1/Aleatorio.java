package Ejercicio1;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Aleatorio {
	Random r = new Random();
	Scanner scn = new Scanner(System.in);
	private int random;
	private final int MIN = 1;
	private final int MAX = 500;

	public Aleatorio() {
		this.random = r.nextInt(MAX) + 1;
	}

	public int getRandom() {
		return random;
	}

	public void intentos() {
		System.out.println("Numero Random: " + random);

	}

	public void menu() {
		boolean acierto = false;
		int intento = 1;
		intentos();
		int num = 0;
		boolean continua = true;
		while (continua == true) {
			try {
				continua = false;
				System.out.println("Intenta adivinar un numero entre " + MIN + " y " + MAX);
				num = scn.nextInt();
				// System.out.println("Intenta adivinar un numero entre "+MIN+" y "+MAX);
				// num=scn.nextInt();

				if (num != random) {
					while (!acierto) {
						if (num > random) {
							System.out.println("Numero demasiado grande, prueba otra vez");
							intento++;
							num = scn.nextInt();
						} else if (num < random) {
							System.out.println("Numero demasiado pequeño, prueba otra vez");
							intento++;
							num = scn.nextInt();
						} else {
							acierto = true;
						}
					}
				}
				System.out.println("¡Has acertado!, ¡solo te ha costado " + intento + " intentos!");

			} catch (InputMismatchException e) {
				intento++;
				// TODO: handle exception
				System.out.println("No has introducido ningun numero entero... Intentalo de nuevo");
				// sin lo de abajo bucle infinito
				num = scn.nextInt();
				num = scn.nextInt();
				intento++;
				continua = true;
			}
		}
	}

}