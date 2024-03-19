package actividad6;

import java.util.Scanner;

public class Ejercicio5 {
	public static void potencias(int n) {
		System.out.println("n    n^2    n^3    n^4");
		for (int i = 1; i <= n; i++) {
			System.out.print(i+"    ");
			for (int j = 2; j <= 4; j++) {
				int elevado = (int)Math.pow(i,j);
				if (i>=4) {
					System.out.print(elevado+"     ");	
					
				} else {
					System.out.print(elevado+"      ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un entero: ");
		int n = teclado.nextInt();
		potencias(n);
	}
}
