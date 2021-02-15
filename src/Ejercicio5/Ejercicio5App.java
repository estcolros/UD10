package Ejercicio5;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Cuantas password quieres?");
		int lon = scn.nextInt();
		System.out.println("Como de largo quieres que sean?");
		int lonPass = scn.nextInt();

		Password a[] = new Password[lon];
		// rellenamos el array de passwords
		for (int i = 0; i < lon; i++) {
			a[i] = new Password(lonPass);
		}

		for (Password password : a) {
			System.out.println(password + " " + password.esFuerte());
		}

	}

}
