package ejerciciosProgramacion.bucle;

public class bucle4Primo {

	public static void main(String[] args) {

	int contador=0;	
		for (int i = 1; i <= 1000; i++) {

			boolean primo = true;

			for (int j = 1; j <= i; j++) {
				float resultado = i % j;

				if (resultado == 0 && j != i && j != 1) {
					primo = false;
				}
			}
			if (primo) {
				System.out.println(i + "Es primo");
				contador++;
			} else {
				System.out.println(i + " NO es primo");

			}
		}
System.out.println("Hay un total de " + contador + " números primos");
	}// main
}// class
