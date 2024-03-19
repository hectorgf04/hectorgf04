package actividad5;

import java.util.Scanner;

public class Ejercicio1 {
	public static boolean iguales4() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un entero: ");
		int numero1 = teclado.nextInt();
		int i = 0;
		while (i < 3) {
			System.out.println("Introduzca un entero: ");
			int numero2 = teclado.nextInt();
			if (numero1 != numero2) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(iguales4());
	}
}
