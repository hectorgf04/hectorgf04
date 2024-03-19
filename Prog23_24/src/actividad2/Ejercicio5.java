package actividad2;

import java.util.Scanner;

/**
 * Comentario clase
 * 
 * @author hector
 */
public class Ejercicio5 {
	
	/**
	* Pre: ---
	* Post: comentario metodo
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce un año");
		int x = teclado.nextInt();
		int y = x%4;
		if(y==0) {
			System.out.println("El año "+x+" es bisiesto");
		} else { 
			System.out.println("El año "+x+" no es bisiesto");
		}
	}
}


