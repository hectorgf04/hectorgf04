package actividad5;

import java.util.Scanner;

public class Ejercicio7 {
	public static boolean nFeo(double nUsuario) {
		if (nUsuario%2==0) {
			return true;
		} else if (nUsuario%3==0) {
			return true;  	
		} else if (nUsuario%5==0) {
			return true; 
		} else if (nUsuario == 1) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un entero: ");
		double nUsuario = teclado.nextDouble();
		if(nFeo(nUsuario)) {
			System.out.print("El numero "+nUsuario+" es feo");
		} else {
			System.out.print("El numero "+nUsuario+" no es feo");
		}
	}
	
}
