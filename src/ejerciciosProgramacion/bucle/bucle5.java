package ejerciciosProgramacion.bucle;

import java.util.Scanner;

public class bucle5 {

public static void main(String[]args) {

	Scanner scanner= new Scanner (System.in);
	
int menu=0;
float dato1;
float dato2;


do {
System.out.println("Introduce la operación que quieras realizar teniendo en cuenta que: ");
System.out.println("1 = Sumar");
System.out.println("2 = Restar");
System.out.println("3 = Multiplicar");
System.out.println("4 = Dividir");
System.out.println("5 = Salir de la calculadora");
menu=scanner.nextInt();
switch (menu) {
case 1:{
	System.out.println("Introduce un numero a continuación ");
	dato1=scanner.nextFloat();
	System.out.println("Introduce otro numero ");
	dato2=scanner.nextFloat();
	System.out.println ("El resultado es "+ (dato1+dato2)); 
	
	break;
}
case 2:{
	System.out.println("Introduce un numero a continuación ");
	dato1=scanner.nextFloat();
	System.out.println("Introduce otro numero ");
	dato2=scanner.nextFloat();
	System.out.println ("El resultado es "+ (dato1-dato2)); 
	
	break;
}
case 3:{
	System.out.println("Introduce un numero a continuación ");
	dato1=scanner.nextFloat();
	System.out.println("Introduce otro numero ");
	dato2=scanner.nextFloat();
	System.out.println ("El resultado es "+ (dato1*dato2)); 
	
	break;
}

case 4:{
	System.out.println("Introduce un numero a continuación ");
	dato1=scanner.nextFloat();
	System.out.println("Introduce otro numero ");
	dato2=scanner.nextFloat();
	System.out.println ("El resultado es "+ (dato1/dato2)); 
	
	break;
}
case 5:{
	System.out.println("Esperamos haberle sido de ayuda. Vuelva cuando lo necesite :)");
		
	break;
}
default:
	System.out.println("No ha introducido el número correcto (de 1 a 5) Elija la operación que quiera realizar");
}
} while(menu!=5);
	
}//main


}//class
