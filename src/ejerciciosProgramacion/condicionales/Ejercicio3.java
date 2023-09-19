package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	
	
public static void main (String[]args) {
	
Scanner scanner= new Scanner (System.in);
float input1;
float input2;
String compare;

System.out.println("Introduce un número");
input1= scanner.nextFloat();
System.out.println("Introduce otro número");
input2= scanner.nextFloat();

if (input1==input2) {
    compare="Estos números son iguales";
    
} else if (input1<input2) {
    compare= "El numero "+ input2 + " es mayor";
    
} else {
    compare="El numero "+ input1 + " es mayor";
}
System.out.println(compare);	
	
	
	
	
	
	
	
}

}//class
