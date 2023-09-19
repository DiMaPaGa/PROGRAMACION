package ejerciciosArray;

import java.util.Scanner;

public class actividad5eliminarDuplicados {

public static void main (String[]args) {

Scanner scanner = new Scanner (System.in);

/*Eliminar duplicados: Crea un programa que pida al usuario ingresar una serie de números
 * (el usuario define el tamaño del array) y elimine los elementos duplicados, mostrando solo los valores únicos.*/

//Pediré primero al usuario que ingrese la cantidad de números en su serie para definir la dimensión del array.

int input1=0;
int[]serie=new int [input1];
int input2;
boolean primerDigito= true;
String[]serieSinDup=new String [input1];
boolean repeticion=false;

System.out.println("Cúantos números enteros desea comparar");
input1=scanner.nextInt();
serie=new int [input1];

/*Luego, solicito que incorpore cada número (en bucle) hasta que complete el listado. El primero lo guarda y a partir del segundo
los va comparando*/

for (int i=0;i<serie.length;i++) {
System.out.println("Ingrese un número");
input2=scanner.nextInt();
serie[i]=input2;

if (primerDigito) {
serie[0]=input2;
primerDigito=false;
} else {
if(serie[i]==serie[0]){
repeticion=true;

}else {
repeticion=false;
serie [i]=input2;
}
}
}

}//main
}//class
