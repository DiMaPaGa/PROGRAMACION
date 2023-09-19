package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle8 {

	public static void main (String[]args) {

		Scanner scanner= new Scanner(System.in);

int num1=0;
int num2=1;
int resultado=num1;
int contador=0;

System.out.println(num1);
System.out.println(num2);

do {
resultado=num1+num2;
System.out.println(resultado);
num1=num2;
num2=resultado;
contador++;
} while(contador<8);
		
	
	}// main
}// class
