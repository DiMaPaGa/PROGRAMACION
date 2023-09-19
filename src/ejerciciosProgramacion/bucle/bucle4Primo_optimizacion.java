package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle4Primo_optimizacion {

public static void main (String[]args) {

Scanner scanner=new Scanner (System.in);
	
float resultado=0;
boolean primo=true;
boolean repetido=false;

for (int i=1;i<=10;i++) {
	repetido=false;
	primo=true;
	for (int j=1;j<=i;j++) {
		resultado=0;
		resultado=i%j;
		
		if (resultado==0 && j!=i && j!=1 && repetido!=true) {
			primo=false;
			repetido=true;
			System.out.println(i + " NO es primo");
	
		} 
		
} 
	if (primo==true) {
	System.out.println(i + "Es primo");	
		}
}
}//main
}//class
