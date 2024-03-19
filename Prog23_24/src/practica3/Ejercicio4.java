package practica3;

/**
 * Diseña e implementa una función en Java void sumar(int a[], int b[], int suma[]), que permite 
 * sumar dos n ́umeros naturales grandes representados mediante dos vectores (a y b), asignando el 
 * resultado al tercer par ́ametro (suma), tambi ́en representado como un vector de enteros sin 
 * signo.
 * @author Hector Garcia
 */
public class Ejercicio4 {
	
	/**
	 * Pre: ---
	 * Post: En este método realiza la suma de las dos tablas y las almacena en la tercera tabla 
	 * llamada suma. En el bucle se suma las dos tablas,al tener sumas de una cifra con otra el
	 * resultado solo puede llegar hasta el 19. Si la suma da 10 o más, entra en el if, lo divide
	 * entre diez cogiendo el resto y asi almacenas el dígito menos significativo y acarreo es 
	 * igual a 1 para sumar 1 a la siguiente cifra. Al ser tablas que no se pueden modificar su
	 * tamaño, si la ultima suma es 10 o más solo aparecera la primera cifra. Por último se muestra
	 * la tabla.
	 */
	public static void sumaTablas(int[] tabla1, int[] tabla2, int[] suma) {
		int acarreo = 0;
		for (int i = tabla1.length - 1; i >= 0; i--) {
			suma[i] = tabla1[i] + tabla2[i] + acarreo;
			if (suma[i] >= 10) {
				suma[i] = suma[i] % 10;
				acarreo = 1;
			} else acarreo = 0;
		}
		for (int j = 0; j < tabla1.length; j++) {
			System.out.print(suma[j]);
		}
	}

	/**
	 * Pre: ---
	 * Post: En el método principal, se crearan las dos tablas de cifras y luego la tabla de la 
	 * misma longitud que las anteriores que almacenara la suma de las cifras de las tablas 
	 */
	public static void main(String[] args) {
		int[] tabla1 = { 8, 5, 5 };
		int[] tabla2 = { 9, 2, 5 };
		int[] suma = new int[tabla1.length];
		sumaTablas(tabla1, tabla2, suma);
	}
}