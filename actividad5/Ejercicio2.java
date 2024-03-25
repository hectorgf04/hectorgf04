package actividad5;

import java.util.Scanner;

public class Ejercicio2 {
	public static boolean entre(double numero1, double numero2) {
		if (numero1 >= 0 && numero1 <= 1 && numero2 >= 0 && numero2 <= 1 ) {
			return true;
		} return false;
		
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca dos numeros reales: ");
		double numero1 = teclado.nextDouble();
		double numero2 = teclado.nextDouble();
		System.out.println(entre(numero1, numero2));
	}
}
