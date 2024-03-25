package actividad5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void contador(String cadena) {
		int x = 0;
		for (int i = 0; i < cadena.length() - 2; i++) {
			if(cadena.substring(i, i + 3).equals("aaa")) {
				x++;
			}
			
		}
		System.out.println("Numero de veces que aparece aaa: "+x);
		
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		contador(cadena);
	}
}
