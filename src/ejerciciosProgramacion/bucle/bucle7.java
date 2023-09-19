package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle7 {

	public static void main (String[]args) {

Scanner scanner= new Scanner (System.in);
	
int input=1;
int resultado;

System.out.println("Introduce un número");
input=scanner.nextInt();

for (int i = 1; i <= 10; i++) {
	resultado=input*i;
	System.out.println(input+ " x "+ i + " = "+ resultado);
}
	
	}//main
}//CLASS
