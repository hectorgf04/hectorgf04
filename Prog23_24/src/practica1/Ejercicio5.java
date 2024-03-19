package practica1;

import java.util.Scanner;

/**
 * Se debe desarrollar un programa en Java que interaccione con el usuario mostrando el 
 * siguiente comportamiento: El programa pregunta al usuario por un número entero en el
 * intervalo [1, 10] y le informa por pantalla de su equivalencia como n ́umero romano.
 */
public class Ejercicio5 {
	
	/**
	 * Pre: ---
	 * Post: En el método principal, creamos un scanner, se genera un número aleatorio entre 0 
	 * y 10 y lo almacena en "nUsuario". Dependiendo del número introducido, pasara por
	 * todos los if hasta detenerse en el coincida, mostrando el mensaje de como es el número.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Escribe un entero entre 1 y 10: ");
		int nUsuario = teclado.nextInt();
		if (nUsuario == 1) {
			System.out.print("1 = I");
		} else if(nUsuario == 2) {
			System.out.print("2 = II");
		} else if(nUsuario == 3) {
			System.out.print("3 = III");
		} else if(nUsuario == 4) {
			System.out.print("4 = IV");
		} else if(nUsuario == 5) {
			System.out.print("5 = V");
		} else if(nUsuario == 6) {
			System.out.print("6 = VI");
		} else if(nUsuario == 7) {
			System.out.print("7 = VII");
		} else if(nUsuario == 8) {
			System.out.print("8 = VIII");
		} else if(nUsuario == 9) {
			System.out.print("9 = IX");
		} else {
			System.out.print("10 = X");
		}
	}
}
