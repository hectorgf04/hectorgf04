package practica3;

/**
 * Se debe desarrollar un programa en Java que, dado un vector de números
 * enteros, un nuevo número entero y un índice válido, devuelva el vector
 * resultado de insertar el valor del nuevo número en el índice válido
 * seleccionado del vector inicial
 * @author Hector Garcia
 */
public class Ejercicio2 {

	/**
	 * Pre: --- 
	 * Post: En este método se inserta el número dado en la posición dada dentro de una tabla de
	 * enteros. El bucle desplaza los números a la derecha,desde la posición que se le da hasta el
	 * último, restandolo 1. Despues se inserta el número dado en la posición dada y por ultimo se
	 * imprime la tabla con bucle.
	 */
	public static void insertElement(int[] tabla, int num, int index) {
		for (int i = tabla.length - 1; i > index; i--) {
			tabla[i] = tabla[i - 1];
		}
		tabla[index] = num;
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla[j]);
		}
	}

	/**
	 * Pre: --- 
	 * Post: En el método principal, crearemos la tabla que ira al método
	 * insertElement, luego el numero que se a insertar en la tabla y despues la
	 * posición en la que se va a insertar el número en la tabla. Por último
	 * llamamos al método que hace y muestra las operaciones.
	 */
	public static void main(String[] args) {
		int[] tabla = { 200, 214, 29, 43, 1007 };
		int num = 2;
		int index = 3;
		insertElement(tabla, num, index);
	}
}