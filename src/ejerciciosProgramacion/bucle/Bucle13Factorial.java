package ejerciciosProgramacion.bucle;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Bucle13Factorial {

public static void main (String[]args) {
	
Scanner scanner= new Scanner (System.in);

int input=1;
int factorial=1;
int resultado=0;
int acumulado=0;
boolean primeraVuelta=true;

System.out.println("Introduce un número (no decimal)");
input= scanner.nextInt();
factorial=(input-1);

do {

if (primeraVuelta) {
resultado=input*factorial;
acumulado= resultado;
factorial--;
primeraVuelta=false;
}
else {
	resultado=acumulado*factorial;
	acumulado= resultado;
	factorial--;	
}

}
while (factorial >0);

System.out.println("El factorial de " + input + " es "+ resultado);

	
}//main
}//class

