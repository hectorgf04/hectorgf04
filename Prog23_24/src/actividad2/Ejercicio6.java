package actividad2;

import java.util.Scanner;

/**
 * Comentario clase
 * 
 * @author hector
 */
public class Ejercicio6 {
	
	/**
	* Pre: ---
	* Post: comentario metodo
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce un numero entero");
		int x = teclado.nextInt();
		System.out.println("Introduce un numero entero");
		int y = teclado.nextInt();
		System.out.println("Introduce un numero entero");
		int z = teclado.nextInt();
		if (x > y && y > z) {
			System.out.println("El orden de menor a mayor es "+ z+" "+y+" "+x);
		} else if (x>z && y<z) {
			System.out.println("El orden de menor a mayor es "+ y+" "+z+" "+x);
		} else if (x<z && y>z) {
			System.out.println("El orden de menor a mayor es "+ x+" "+z+" "+y);
		} else if (y>z && x>z) {
			System.out.println("El orden de menor a mayor es "+ z+" "+x+" "+y);
		} else if (z>x && x>y) {
			System.out.println("El orden de menor a mayor es "+ y+" "+x+" "+z);
		}else {
			System.out.println("El orden de menor a mayor es "+ x+" "+y+" "+z);
		}
	}
}
