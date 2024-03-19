package actividad6;

import java.util.Scanner;

public class Ejercicio1 {
	public static void nLetra(int nUsuario) {
		if(nUsuario == 0) {
			System.out.print("Cero");
		} else if(nUsuario == 1) {
			System.out.print("Uno");
		} else if(nUsuario == 2) {
			System.out.print("Dos");
		} else if(nUsuario == 3) {
			System.out.print("Tres");
		} else if(nUsuario == 4) {
			System.out.print("Cuatro");
		} else if(nUsuario == 5) {
			System.out.print("Cinco");
		} else if(nUsuario == 6) {
			System.out.print("Seis");
		} else if(nUsuario == 7) {
			System.out.print("Siete");
		} else if(nUsuario == 8) {
			System.out.print("Ocho");
		} else if(nUsuario == 9) {
			System.out.print("Nueve");
		} else {
			System.out.print("Otros");
		}
	}
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un entero: ");
		int nUsuario = teclado.nextInt();
		nLetra(nUsuario);
	}
}
