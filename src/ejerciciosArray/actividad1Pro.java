package ejerciciosArray;

import java.util.Scanner;

public class actividad1Pro {

public static void main (String[]args) {

/*Suma de elementos: Crea un programa que solicite al usuario ingresar 5 números, 
los almacene en un array y luego muestre la suma de todos los números.
MODO PRO*/	
			
Scanner scanner=new Scanner (System.in);

float[]sumador=new float[5];
float input;
float resultado=0;

for (int i=0;i<sumador.length;i++) {
System.out.println("Ingrese un número");
 input=scanner.nextFloat();
 sumador[i]= input;
 resultado = (resultado+sumador[i]);
}
	
 
System.out.println("El total de esta suma es " + resultado);

}//main
}//class