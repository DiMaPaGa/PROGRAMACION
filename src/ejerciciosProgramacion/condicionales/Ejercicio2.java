package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[]args) {
		
	Scanner scanner= new Scanner (System.in);	
	int input=0;
	String numero;
	
	System.out.println("Introduce un número entero cualquiera");
	input= scanner.nextInt();
	
	if (input==0) {
		numero= "cero";
	}
	else if(input %2!=0){
	 numero="impar";    
	}

	else {
	numero="par";  
		}	
				
	System.out.println("Este número es " + numero);	
		
		
		
		
	}
	
	
	
	
}
