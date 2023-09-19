package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle12 {


public static void main (String[]args) {

Scanner scanner=new Scanner (System.in);

float input=0;
float sumatorio=0;
int contador=0;
boolean salida=true;



for (int i=0; salida; i++) {
	System.out.println("Ingrese un número");
	input=scanner.nextFloat();
	if (input<0) {
		//finalizar salida//
		contador=i;
		salida=false;
	} else {
	sumatorio=sumatorio+input;
	System.out.println("Lleva sumado "+ sumatorio);
	
	}
} 
 System.out.println("No se resta, solo sumamos. El promedio final hasta el último número positivo ha sido " + (sumatorio/contador));

}//main
}//class

