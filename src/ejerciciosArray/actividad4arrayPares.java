package ejerciciosArray;

import java.util.Scanner;

public class actividad4arrayPares {

public static void main (String[]args) {
	
/*Contar números pares e impares: Solicita al usuario que ingrese 
 * 10 números. Luego, cuenta cuántos de estos números son pares y cuántos son impares. */
	
Scanner scanner= new Scanner (System.in);

/*Creo un bucle para que el usuario incorpore los diez números (crear variable input y array), luego, con condiciones, valorar si el número
incorporado es par o impar y crear contador de par y contador de impar*/

int []arr= new int [10];
int input;
int contadorPar=0;
int contadorImpar=0;

for (int i=0;i<arr.length;i++) {
System.out.println("Ingrese un número");
input=scanner.nextInt();
arr[i]=input;

if(input %2!=0){
contadorImpar=(contadorImpar+1);
}
else {
contadorPar=(contadorPar+1);  
}	
}

System.out.println("Ha incorporado " + contadorPar + " números pares y " + contadorImpar + " impares.");

}//main
}//class
