package ejerciciosArray;

import java.util.Scanner;

public class actividad2 {

public static void main (String[]args) {

/*Encontrar el número máximo y mínimo: 
 * Pide al usuario ingresar 10 números y encuentra el número máximo y el número mínimo en ese conjunto.*/
	
Scanner scanner = new Scanner (System.in);

int[]arr=new int[10];
int input;
int mayor=0;
int menor=0;



for (int i=0;i<arr.length;i++) {
System.out.println("Ingrese un número");
input=scanner.nextInt();
arr[i]=input;

if (i==0) {
mayor= input;
menor=input;
} else {
if(arr[i]>mayor){
mayor=arr[i];
}
if (arr[i] <menor){
menor=arr[i];
}
}
}
System.out.println("En este conjunto, el número mayor es " + mayor + " y el menor es " + menor );



}//main
}//class
