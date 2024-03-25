package actividad5;

import java.util.Scanner;

public class Ejercicio4 {
	public static void contador(String cadena) {
		System.out.println("La longitud de la cadena es de "+cadena.length());
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		contador(cadena);
	}
}
