package actividad5;

import java.util.Scanner;

public class Ejercicio3 {
	public static void quitador(String cadena) {
		String nuevaCadena = cadena.substring(0, cadena.length() - 1);
		System.out.println("La nueva cadena sera: "+nuevaCadena);
		
	}
	
	
	

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		quitador(cadena);
		
	}
}
