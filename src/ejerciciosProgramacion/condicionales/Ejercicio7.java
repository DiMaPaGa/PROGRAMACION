package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio7 {

public static void main (String[]args) {
	
Scanner scanner=new Scanner(System.in);	
int input = 0;
String diaSemana;

System.out.println("Introduce numero del 1 al 7 correspondiente al orden del día de la semana");
input= scanner.nextInt();

switch(input) {
case 1:{
	System.out.println("Es lunes");
	break;
}
case 2:{
	System.out.println("Es martes");
	break;
}
case 3:{
	System.out.println("Es miércoles");
	break;
}
case 4:{
	System.out.println("Es jueves");
	break;
}
case 5:{
	System.out.println("Es viernes");
	break;
}
case 6:{
	System.out.println("Es sábado");
	break;
}	
case 7:{
	System.out.println("Es domingo");
	break;
}	
default:
	System.out.println("Deber ser un número del 1 al 7");
}
	
	
}
}
