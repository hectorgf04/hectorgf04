package actividad2;

import java.util.Scanner;

/**
 * Comentario clase
 * 
 * @author hector
 */
public class Ejercicio3 {
	
	/**
	* Pre: ---
	* Post: comentario metodo
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce el importe de la compra");
		double importeCompra = teclado.nextInt();
		if(importeCompra > 300) {
			System.out.println("Tu precio final es "+importeCompra*80/100);
		} else {
			System.out.println("Tu precio final es "+importeCompra);
		}
	}
}