package actividad5;

import java.util.Scanner;

public class Ejercicio11 {
	public static void vuelta(String cadena) {
		String alReves = "";
		for(int i = cadena.length() - 1; i >= 0; i--) {
			// Preguntar 
			alReves = alReves + cadena.substring(i, i + 1);
			System.out.println(alReves + ""+cadena.substring(i, i + 1));
		} System.out.println("Cadena al reves: " + alReves);
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		vuelta(cadena);
	}
}
