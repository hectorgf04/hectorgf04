package tarea2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String[] argumentos) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce un numero entero");
		int x = teclado.nextInt();
		System.out.println("Introduce un numero entero");
		int y = teclado.nextInt();
		System.out.println("Los números situados entre ambos son:");
		if (x < y) {
			int i=x;
			while(i <= y) {
				System.out.println(i);
				i++;}
			
		} else {
			int i=y;
			while(i <= x) {
				System.out.println(i);
				i++;}
			
		}
	}
}
