package practica1;

import java.util.Scanner;

/**
 * Se debe desarrollar un programa en Java que interaccione con el usuario mostrando el 
 * siguiente comportamiento: La fecha escrita por el usuario con el formato aaaammdd es
 * reescrita por el programa con el formato dd/mm/aaaa, donde dd es el dıa, mm es el 
 * mes y aaaa es el año.
 */
public class Ejercicio3 {
	
	/**
	 * Pre: ---
	 * Post: En el método principal, creamos un scanner, solicitamos que introduzca una fecha 
	 * en formato 8 cifras y lo almacena en "fecha. Con sus respectivas operaciones se 
	 * sacaran las variables "año","mes" y "dia" que se mostraran en orden. 
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Escribe una fecha con formato de 8 cifras [aaaammdd]: ");
		int fecha = teclado.nextInt();
		int año = fecha/10000;
		int mes = fecha/100 - año*100;
		int dia = fecha - fecha/100*100;
		System.out.println("La fecha escrita es "+dia+"/"+mes+"/"+año);
	}
}

