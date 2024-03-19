package actividad1;

import java.util.Scanner;

/**
 * Comentario de la clase 
 * 
 * @author hector
 */
public class Ejercicio5 {
	
	/**
	 * Pre:
	 * Post: comentario del main
	 */
	public static void main(String[] argumentos){
		int x = 0;
		int y = 0;
		int suma;
		int resta;
		int mult;
		double div;
		
		Scanner teclado = new Scanner( System.in);
		
		System.out.println("Introduce valor para x");
			x = teclado.nextInt();
		System.out.println("Introduce valor para y");
			y = teclado.nextInt();
		
		suma = x + y;
		resta = x - y;
		mult = x * y;
		div = x / y;
		
		System.out.println("La suma de los valores x e y es "+suma);
		System.out.println("La resta de los valores x e y es "+resta);
		System.out.println("La multiplicación de los valores x e y es "+mult);
		System.out.println("La división de los valores x e y es "+div);
		System.out.println("El resto de los valores x e y es "+ x%y);
		}
	}