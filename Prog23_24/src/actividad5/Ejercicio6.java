package actividad5;

import java.util.Scanner;

public class Ejercicio6 {
	public static void cambiarPosi(String cadena) {
		String primerCaracter = cadena.substring(0, 1);
		String ultimoCaracter = cadena.substring(cadena.length() - 1, cadena.length());
		String medio = cadena.substring(1,cadena.length() - 1);
		String resultado = ultimoCaracter + medio + primerCaracter;
		System.out.println(resultado);
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		cambiarPosi(cadena);
	}
}
