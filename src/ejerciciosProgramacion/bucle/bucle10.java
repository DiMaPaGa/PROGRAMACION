package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle10 {

public static void main (String[]args) {

Scanner scanner=new Scanner (System.in);

int input;
int numeroSecreto=(int) Math.floor(Math.random()*(10-1+1)+1);
String pista;

System.out.println("¡Adivina el número secreto del 1 al 10!");
input= scanner.nextInt();

while (input!=numeroSecreto) {
if(input>0 && input<11) {
if (input>numeroSecreto) {
	pista="El número que buscas es más bajo. ¡Prueba de nuevo!";
	}  else {
	pista="El número que buscas es más alto. ¡Prueba de nuevo!";
	}	
} else {
	pista="Nooo... Te hemos dicho un número de 1 a 10";
}

System.out.println(pista);
System.out.println("Escribe tu siguiente intento (de 1 a 10)");
input= scanner.nextInt();
}


System.out.println("¡Enhorabuena! Has dado con el número secreto y es " + numeroSecreto);
	


}
}
