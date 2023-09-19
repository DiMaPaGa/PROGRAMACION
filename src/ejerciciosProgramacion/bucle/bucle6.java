package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float num1;
		float num2 = 0;
		float sumatorio = 0;
		boolean primeraVuelta = true;

		System.out.println("Introduce un numero");
		num1 = scanner.nextFloat();

		while (num1 >= 0 && num2 >= 0) {
			System.out.println("Añada otro número que desee sumar");
			num2 = scanner.nextFloat();
			if (num2 < 0) {
				System.out.println("Hemos terminado, solo nos gusta sumar, no restar :P");
			} else {

				if (sumatorio == 0) {
					sumatorio = (num1 + num2);
				} else {
					sumatorio = (sumatorio + num2);
				}
				System.out.println("Ha sumado " + num2 + " el resultado es " + sumatorio);
			}
		}

	} // main
}// class
