package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio5 {

public static void main (String[]args) {
	
Scanner scanner= new Scanner (System.in);	
float precio;	
float coste;

System.out.println("Introduce el precio de tu compra");
precio= scanner.nextFloat();

if (precio>=100) {
    coste=precio-((precio*10)/100);
} else {
    coste=precio;
}
	
System.out.println("El precio total de tu compra es " + coste);		
	
	
	
}
	

}
