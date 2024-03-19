package actividad2;

import java.util.Scanner;

/**
 * Comentario de la clase
 * 
 * @author hector
 */
public class Ejercicio1 {
	
	/**
	* Pre: ---
	* Post: comentario del main
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce tu edad");
		int edad = teclado.nextInt();
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
}
