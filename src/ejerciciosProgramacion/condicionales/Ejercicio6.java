package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio6 {

public static void main (String[]args) {
	
Scanner scanner=new Scanner(System.in);
	
float input;	
float input2;
float input3;
String tipoTriangulo;

System.out.println("Introduce los centímetros que mide el lado A");
input= scanner.nextFloat();
System.out.println("Introduce los centímetros que mide el lado B");
input2= scanner.nextFloat();
System.out.println("Introduce los centímetros que mide el lado C");
input3= scanner.nextFloat();

if (input==input2 && input2==input3) {
tipoTriangulo = "Equilátero";

} else if ((input!=input2 && input2!=input3) && (input!=input3)) {
    tipoTriangulo= "Escaleno";

} else {
    tipoTriangulo = "Isósceles";
    
}
	
System.out.println("Tu triángulo es " + tipoTriangulo);			
	
}
	
	
	
	
}
