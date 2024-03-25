package actividad5;

import java.util.Scanner;

public class Ejercicio8 {
	public static void nFeo(int numero1, int numero2) {
		int n = 0;
		int m = 0;
		if (numero1<numero2) {
			n = numero1; 
			m = numero2;
		} else {
			n = numero2;
			m = numero1;
		}
		double nAleatorio = Math.floor(Math.random()*(n - 0 + m))+ 0;
		System.out.println(nAleatorio);
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Da valor a N y M: ");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
		nFeo(numero1,numero2);
	}
	
}
