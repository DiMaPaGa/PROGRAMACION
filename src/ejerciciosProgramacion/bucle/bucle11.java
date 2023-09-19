package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle11 {

public static void main (String[]args) {

Scanner scanner=new Scanner (System.in);

float input1=0;
float input2=1;
float promedio=1;

System.out.println("Ingrese un número");
input1=scanner.nextFloat();

for (int i=2 ; input2>0;i++) {
	System.out.println("ingrese un nuevo número");
	input2=scanner.nextFloat();
	promedio= (input1+input2)/i;
	System.out.println(promedio);
	input1=input1+input2;
}

System.out.println("No se resta, solo sumamos. El promedio final hasta el último número positivo ha sido " + promedio);

}//main
}//class
