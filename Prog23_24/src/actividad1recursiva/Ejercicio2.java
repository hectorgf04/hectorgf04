package actividad1recursiva;

import java.util.Scanner;

/**
 *Implementa un programa Java que dado un número natural N, devuelva su factorial de forma recursiva.
 */
public class Ejercicio2 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Introduce N y te devolvera el factorial: ");
		int ene = teclado.nextInt();
		System.out.println("El factorial es " + factorial(ene));
	}
	
	public static int factorial(int ene) {
		if (ene == 0) return 1;
		else return ene * (factorial(ene - 1));
	}
}
