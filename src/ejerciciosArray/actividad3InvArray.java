package ejerciciosArray;

import java.util.Scanner;

public class actividad3InvArray {

public static void main (String[]args) {
		
/*Invertir un array: Pide al usuario ingresar 5 números y almacénalos en un array. 
Luego, crea un segundo array para almacenar los números en orden inverso y muestra ambos arrays.*/

Scanner scanner=new Scanner (System.in);

int[]arr1=new int[5];
int[]arr2=new int[5];
int input;
int recuento=1;

for (int i=0;i<arr1.length;i++) {
System.out.println("Ingrese un número");
input=scanner.nextInt();
arr1[i]=input;
System.out.println("El número " + (i+1)+ " es: "+ arr1[i]);
arr2[4-i]=input;
}

for (int j=0;j<arr2.length;j++) {
System.out.println("En el orden inverso; el número : " + recuento +" es: "+ arr2[j]);
recuento++;
}	
	
	
} //main

}//class
