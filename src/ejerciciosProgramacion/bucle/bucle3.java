package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle3 {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 100) {
			if (num % 2 == 0) {
				System.out.println("El número " + num + " es par.");

			} else {
				System.out.println("El número " + num + " es impar.");

			}
			num++;
		}

	}
}
