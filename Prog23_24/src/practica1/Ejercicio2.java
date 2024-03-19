package practica1;

import java.util.Scanner;

/**
 * Se debe desarrollar un programa en Java que, generado un numero aleatorio entre 0 y 
 * 20 (usando Math.random()), solicite al usuario numeros enteros indicando ’mayor’ o 
 * ’menor’ seg ́un sea mayor o menor respecto al numero generador aleatoriamente. El 
 * programa finaliza cuando el usuario acierta, mostrando por pantalla un mensaje de
 * felicitacions junto al n ́umero de intentos que ha necesitado el usuario 
 * ’¡Enhorabuena! Has necesitado x intentos’.
 */
public class Ejercicio2 {
	
	/**
	 * Pre: ---
	 * Post: En el método principal, creamos un scanner, se genera un número aleatorio entre 0 
	 * y 20 y lo almacena en "nAleatorio". Dentro de este, solicitamos que introduzca un numero 
	 * que se almacena en "nUsuario" y compara uno con otro, si el primero es mayor al segundo,
	 * se mostrara un mensaje indicando que es mayor, si es menor hara lo mismo. Cuando son
	 * iguales, se felicita al usuario junto con el número de intentos que se necesitó para adivinar.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		double nAleatorio = Math.floor(Math.random()*(20 - 0 + 1))+ 0;
		int intentos = 0;
		while (intentos >= 0) {
			System.out.print("Introduce un número entero: ");
			int nUsuario = teclado.nextInt();
			intentos++;
			if (nUsuario < nAleatorio){
				System.out.println("El numero es mayor");
			} else if(nUsuario > nAleatorio) {
				System.out.println("El numero es menor");
			} else {
				System.out.println("¡Enhorabuena! Has necesitado "+intentos+" intentos.");
			}
		}
	}
}