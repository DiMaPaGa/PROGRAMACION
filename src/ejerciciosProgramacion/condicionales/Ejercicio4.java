package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio4 {

public static void main (String[]args) {
	
Scanner scanner=new Scanner (System.in);	
	
int input;
String año;

System.out.println("Introduce un año");
input= scanner.nextInt();

    if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
        año = "Es bisiesto";
    } else {
        año = "N0 es bisiesto";
    }	
	
System.out.println(año);	
	
	
	
	
}	
	
}
