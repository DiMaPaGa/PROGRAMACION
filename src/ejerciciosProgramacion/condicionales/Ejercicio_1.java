package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {

		// variables

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		String numero;

		System.out.println("Introduce un número");
		input = scanner.nextInt();

		// ejecucion

		if (input > 0) {
			numero = "positivo";
		}

		else if (input < 0) {
			numero = "negativo";
		}

		else {
			numero = "cero";
		}

		// código

		System.out.println("Tu número es " + numero);

	}// main
}// class
