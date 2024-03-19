package actividad6;

import java.util.Scanner;

public class Ejercicio3 {
	public static void pEscalera(int nUsuario) {
		int i = nUsuario;
		
		while (i>0) {
			int j = 0;
			while(j<i) {
				System.out.print("*");
				j++;
			} i--;
		System.out.println();
		}	
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un entero: ");
		int nUsuario = teclado.nextInt();
		pEscalera(nUsuario);
	}
}
