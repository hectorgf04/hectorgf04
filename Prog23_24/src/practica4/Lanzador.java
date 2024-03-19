package practica4;

import java.util.Scanner;

/**
 * El programa se ejecuta y solicita al usuario que introduzca el NUMERO FILAS que debe tener el
 * tablero. Se repite esta acci ́on hasta que el usuario introduce un n ́umero igual o superior a 0.
 * El programa solicita al usuario que introduzca el NUMERO COLUMNAS que debe tener el tablero. Se
 * repite esta acción hasta que el usuario introduce un n ́umero igual o superior a 0.El programa
 * solicita el n ́umero de generaciones a simular. Se repite esta acción hasta que el usuario
 * introduce un numero igual o superior a 0.
 * @author Hector Garcia
 */
public class Lanzador {

	/**
	 * Pre: --- 
	 * Post: En el método principal, pediremos al usuario lo necesario para crear la matriz de
	 * nuestro juego, filas, columnas y generaciones. Podremos hacer la eleccion entre 1 o 2, 1
	 * para elegir nosotros numero de filas,columnas y generaciones y en el 2 tenemos 3 opciones
	 * prederterminadas. Dentro del 1 tenemos bucles para aseguramos que el programa empiece 
	 * poniendo que no pueden ser menores o iguales a 0. Se crea el objeto con los variables
	 * escritas y llamaremos a otro metodo aparte para que imprima el tablero. Dentro del 2, 
	 * tenemos las 3 opciones con sus respectivas configuraciones dadas y tambien la creación de 
	 * los objetos.
	 */
	public static void main(String[] argumentos) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Elige 1(Aleatorio) o 2(Pruebas): ");
		int eleccion = teclado.nextInt();
		if (eleccion == 1) {
			int numero_filas = 0;
			int numero_columnas = 0;
			int numero_generaciones = 0;
			while (numero_filas <= 0) {
				System.out.print("Número de filas: ");
				numero_filas = teclado.nextInt();
			}
			while (numero_columnas <= 0) {
				System.out.print("Número de columnas: ");
				numero_columnas = teclado.nextInt();
			}
			while (numero_generaciones <= 0) {
				System.out.print("Número de generaciones: ");
				numero_generaciones = teclado.nextInt();
			}
			JuegoDeLaVida inicio = new JuegoDeLaVida(numero_filas, numero_columnas, numero_generaciones);
			inicio.tablero();
		} else {
			System.out.print("Elige 1(Cuadrado), 2(Oscilante) o 3(Faro): ");
			int prueba = teclado.nextInt();
			if (prueba == 1) {
				Pruebas prueba1 = new Pruebas(4, 4, 30);
				prueba1.configuracion(prueba);
			} else if (prueba == 2) {
				Pruebas prueba2 = new Pruebas(5, 5, 30);
				prueba2.configuracion(prueba);
			} else if (prueba == 3) {
				Pruebas prueba3 = new Pruebas(6, 6, 30);
				prueba3.configuracion(prueba);
			}
		}
	}
}
