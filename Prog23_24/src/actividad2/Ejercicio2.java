package actividad2;

import java.util.Scanner;


/**
 * Comentario clase
 * 
 * @author hector
 */
public class Ejercicio2 {
	
	/**
	* Pre: ---
	* Post: comentario metodo
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce una nota");
		double primeraNota = teclado.nextInt();
		System.out.println("Introduce otro nota");
		double segundaNota = teclado.nextInt();
		if(primeraNota > segundaNota) {
			System.out.println("La mejor nota es "+primeraNota);
		} else if(primeraNota > segundaNota) {
			System.out.println("La mejor nota es "+segundaNota);
		} else {
			System.out.println("Son iguales");
		}
	}
}
