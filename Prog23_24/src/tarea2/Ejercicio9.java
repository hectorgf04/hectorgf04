package tarea2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main (String[] argumentos) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce 10 números enteros");
		int numeros = 0;
		int veces0 = 0;
		while (numeros < 10) {
			int numero = teclado.nextInt();
			if (numero == 0) {
				
			}
			numeros++;
		}
		System.out.println("Se ha introducido el numero 0, "+veces0+" veces");
	}
}
