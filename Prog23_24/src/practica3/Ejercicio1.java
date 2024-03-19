package practica3;

/**
 * Se debe desarrollar un programa en Java que, dado un vector de enteros,muestre por pantalla el
 * número de enteros positivos, el número de enteros negativos, el número de ceros, el número de
 * enteros pares y el número de enteros impares del vector dado.
 * @author Hector Garcia
 */
public class Ejercicio1 {

	/**
	 * Pre: --- 
	 * Post:En este método se calculan las diversas estadisticas que pide el ejercicio dado una
	 * tabla. Primero se crean las 5 variables para que se almacenen las diferentes estadisticas
	 * y despues ira un bucle que recorrera la tabla uno a uno hasta su longitud. Dentro del bucle
	 * habra un if y dependiendo de como sea el elemento de la tabla sumara 1 a la variable
	 * correspondiente. Por ultimo se imprime el resultado de todas las estadisticas.
	 */
	public static void estadisticasTabla(int[] tabla) {
		int nPositivos = 0;
		int nNegativos = 0;
		int nCeros = 0;
		int nPares = 0;
		int nImpares = 0;
		for (int j = 0; j < tabla.length; j++) {
			if (tabla[j] > 0) {
				nPositivos++;
			} else if (tabla[j] < 0) {
				nNegativos++;
			} else if (tabla[j] == 0) {
				nCeros++;
			}
			if (tabla[j] % 2 == 0) {
				nPares++;
			} else if (tabla[j] % 2 != 0) {
				nImpares++;
			}
		}
		System.out.println("Estadisticas");
		System.out.println("============");
		System.out.println("El numero de enteros positivos es " + nPositivos);
		System.out.println("El numero de enteros negativos es " + nNegativos);
		System.out.println("El numero de ceros es " + nCeros);
		System.out.println("El numero de pares es " + nPares);
		System.out.println("El numero de impares es " + nImpares);
	}

	/**
	 * Pre: --- 
	 * Post: En el método principal, crearemos la tabla que luego ira al método estadisticasTabla,
	 * despues estara el bucle que recorre toda la tabla y la muestra y por último llamamos al 
	 * método que hace y muestra las operaciones.
	 */
	public static void main(String[] args) {
		int[] tabla = { 0, 2, 3, 0, 5, 6, 7, -3, -2, -1 };
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}
		System.out.println("");
		estadisticasTabla(tabla);
	}
}