package ejerciciosArray;

import java.util.Scanner;

public class actividad1 {

public static void main (String[]args) {

/*Suma de elementos: Crea un programa que solicite al usuario ingresar 5 números, 
los almacene en un array y luego muestre la suma de todos los números.
MODO PRINGUI*/	
	
Scanner scanner=new Scanner (System.in);

float[]sumador=new float[5];
float input;

System.out.println("Ingrese el primer número que desees sumar");
input=scanner.nextFloat();
sumador[0]=input;

System.out.println("Ingrese el segundo número");
input=scanner.nextFloat();
sumador[1]=input;

System.out.println("Ingrese el tercer número");
input=scanner.nextFloat();
sumador[2]=input;

System.out.println("Ingrese el cuarto número");
input=scanner.nextFloat();
sumador[3]=input;

System.out.println("Ingrese el quinto número");
input=scanner.nextFloat();
sumador[4]=input;

System.out.println("El total de esta suma es " + (sumador[0]+sumador[1]+ sumador[2]+ sumador[3]+ sumador[4]));

}//main
}//class
