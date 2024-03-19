package actividad6;

import java.util.Scanner;

public class Ejercicio2 {
	public static void nLetra() {
		String divisible3 = "Coza";
		String divisible5 = "Loza";
		String divisible7 = "Woza";
		String divisible35 = "CozaLoza";
		int linea = 0;
		for(int i = 1; i<=110; i++) {
			if (i%3==0 && i%5==0) {
				System.out.print(divisible35 +" ");
			} else if (i%3==0) {
				System.out.print(divisible3 +" ");
			} else if (i%5==0) {
				System.out.print(divisible5 +" ");
			} else if (i%7==0) {
				System.out.print(divisible7 +" ");
			} else {
				System.out.print(i+" ");
			}
			linea++;
			if (linea == 11) {
				System.out.print("\n");
				linea = 0;
			}
		}
	}
	public static void main (String[] args) {
		nLetra();
	}
}
