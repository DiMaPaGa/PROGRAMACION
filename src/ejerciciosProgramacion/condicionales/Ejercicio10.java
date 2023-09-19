package ejerciciosProgramacion.condicionales;

import java.util.Scanner;

public class Ejercicio10 {

public static void main (String[]args) {

Scanner scanner=new Scanner (System.in);

int mes;
String diasMes;
int año = 0;


System.out.println("Introduce un mes del 1 al 12");
mes= scanner.nextInt();

if (mes<1 || mes>12) {
	diasMes= "Inserte un número de mes del 1 al 12";
	System.out.println(diasMes);
} else {
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        diasMes = "31";
    } else {
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = "30";
        } else {
            if (mes == 2 && ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0)) {
                diasMes = "29";
            } else {
                diasMes = "28";
            }
        }
    }
}
System.out.println("Introduce un año (los 4 dígitos)");
año= scanner.nextInt();

System.out.println(diasMes);	
}//main
	
}//class
