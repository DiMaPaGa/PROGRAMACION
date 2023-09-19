package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio9 {

public static void main (String[]args) {

Scanner scanner=new Scanner (System.in);

int input;
int numeroSecreto=(int) Math.floor(Math.random()*(10-1+1)+1);
String pista;

System.out.println("¡Adivina el número secreto del 1 al 10!");
input= scanner.nextInt();

if(input==numeroSecreto){
pista="¡Enhorabuena! Has dado con el número secreto y es " + numeroSecreto;    
} else if (input>numeroSecreto && input<11) {
pista="El número que buscas es más bajo. ¡Prueba de nuevo!";
}  else
pista="El número que buscas es más alto. ¡Prueba de nuevo!";


System.out.println(pista);
}

}

