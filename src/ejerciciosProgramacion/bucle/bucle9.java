package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle9 {

	public static void main(String[] args) {

	Scanner scanner= new Scanner (System.in);
	
	int numInicial;
	int resultado;
	int num2;
	int valores;
	int contador=2;
	
	System.out.println("Introduce el número que desees que sea el inicial");
	numInicial= scanner.nextInt();
    
	System.out.println("¿Cuántos valores deseas que aparezcan en tu secuencia?");
	valores= scanner.nextInt();
    
	resultado= ((numInicial-1)+(numInicial));
	System.out.println(resultado);
	num2=(resultado+numInicial);
	System.out.println(num2);
		
	do {
	resultado=resultado+num2;
	System.out.println(resultado);
	numInicial=resultado;
	num2=resultado+numInicial;
	contador++;
	} while(contador!=valores);
	} // main

} // class
