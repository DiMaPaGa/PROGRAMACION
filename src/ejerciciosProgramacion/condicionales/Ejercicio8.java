package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio8 {

public static void main (String[]args) {
	
Scanner scanner=new Scanner(System.in);

float peso=72;
float altura=1.76f;
float IMC= (peso/(altura*altura));
String mensaje;

System.out.println("Introduce tu peso en Kgs");
peso= scanner.nextFloat();
System.out.println("Introduce tu altura en metros");
altura= scanner.nextFloat();

if (IMC<18.5) {
    mensaje="Tu peso es insuficiente. Tu IMC es " + IMC;
} else 
if (IMC>=18.5 && IMC<25) {
    mensaje="Tienes un peso saludable.¡Enhorabuena! Tu IMC es " + IMC;
} else 
if (IMC>=25 && IMC<30) {
    mensaje="Tienes sobrepeso. Cuídate, sigue una dieta saludable y haz ejercicio. Tu IMC es " + IMC;
} else 
    mensaje="Tienes obesidad. Contacta con tu médico y ponle remedio, ¡Tú puedes! Tu IMC es " + IMC;

System.out.println(mensaje);
}
}
