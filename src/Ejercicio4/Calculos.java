package Ejercicio4;

import exeptions.aritmeticException;

public class Calculos {
	protected double num1;
	protected double num2;

	public Calculos(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		double suma = 0;
		suma = this.num1 + this.num2;
		return suma;
	}

	public double resta() {
		double resta = 0;
		resta = this.num1 - this.num2;
		return resta;
	}

	public double multiplica() {
		double multi = 0;
		try {
			if (num1 == 0.0 || num2 == 0.0) {
				throw new aritmeticException();
			}
		} catch (aritmeticException e) {
			System.out.println(e.multperzero());
		}

		multi = this.num1 * this.num2;
		return multi;
	}

	public double division() {
		double divi = 0;
		try {
			if (num2 == 0.0) {
				throw new aritmeticException();
			}
		} catch (aritmeticException e) {
			System.out.println(e.divperzero());
		}
		divi = this.num1 / this.num2;
		return divi;
	}

	public double pot() {
		double pot = 0;
		pot = Math.pow(this.num1, this.num2);
		return pot;
	}

	public double raizCuadrada(int num) {
		double cuadrada = 0;
		if (num == 1) {
			cuadrada = Math.sqrt(this.num1);
		} else if (num == 2) {
			cuadrada = Math.sqrt(this.num2);
		}
		return cuadrada;

	}

	public double raizCubica(int num) {
		double cubic = 0;
		if (num == 1) {
			cubic = Math.cbrt(this.num1);
		} else if (num == 2) {
			cubic = Math.cbrt(this.num2);
		}
		return cubic;
	}

}
