package actividad2;

import java.util.Scanner;

/**
 * Comentario clase
 * 
 * @author hector
 */
public class Ejercicio4 {
	
	/**
	* Pre: ---
	* Post: comentario metodo
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Número de horas trabajadas");
		int x = teclado.nextInt();
		if(x <= 40 ) {
			System.out.println("Tu sueldo semanal es "+x*16);
		} else {
			System.out.println("Tu sueldo semanal es "+((x-40)*20+(40 * 16)));
		}
	}
}
