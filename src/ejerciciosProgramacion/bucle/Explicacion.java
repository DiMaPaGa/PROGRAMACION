package ejerciciosProgramacion.bucle;

import java.util.Iterator;
import java.util.Scanner;

public class Explicacion {

	public static void main(String[] args) {

		// variables

		Scanner scanner = new Scanner(System.in);

		int num = 0;

		// while
		/*
		 * while (num<10) {
		 * 
		 * System.out.println("numero "+num); num++;
		 * 
		 * }
		 */

		// do-while
		/*
		 * do { System.out.println("numero "+num); num++;
		 * 
		 * 
		 * }while(num<10);
		 */

		/*
		 * // for for (int i = 0; i <= 10; i++) {
		 * 
		 * System.out.println("numero " + i);
		 * 
		 * }
		 */

//fuera del bucle
		/*
		 * int num2 = num * 10;
		 * 
		 * if(num>9 && num2<10) { System.out.println("imposssiblle " + num);
		 * 
		 * }
		 * 
		 * System.out.println("numero " + num2);
		 */

//bucle anidado	
		int suma = 0;

		for (int i = 0; i <= 10; i++) {
			System.out.println("Valor de i: " + i);

			///////////////////
			for (int j = 0; j <= 10; j++) {
				System.out.println("vuelta " + j + " del bucle anidado");
				suma = (i + j);

			}
			/////////////////////////
			System.out.println("He salido del bucle i, su valor es:" + suma);

		}

	}// main
}
