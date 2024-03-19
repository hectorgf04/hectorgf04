package practica3;

/**
 * Se debe desarrollar un programa en Java que, dado un vector de cadenas de caracteres y una 
 * nuevacadena, devuelva el ́ındice del vector cuyo valor es igual al valor de la cadena dada. 
 * En caso de no haber ningún valor igual al introducido, se devuelve -1.
 */
public class Ejercicio3 {
	
	/**
	 * Pre: ---
	 * Post: En este método se recorre toda la tabla en un bucle, dentro del bucle estara el if que
	 * mirara si algun elemento de la tabla de strings coincide con la cadena dada. Si coincide se
	 * mandara al main el indice de donde se encuentra la cadena, si no se encuentra en la tabla se
	 * mandara un -1. 
	 */
	public static int indexContains(String[] tabla, String cadena) {
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].equalsIgnoreCase(cadena)) {
				System.out.print("La cadena se situa en el indice: ");
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Pre: ---
	 * Post: En el método principal, crearemos la tabla de strings, luego la cadena que se buscara
	 * en la tabla. Se mostrara la tabla y se ejecutara el método.
	 */
	public static void main(String[] args) {
		String[] tabla = { "hola", "que", "tal", "estas", "hector" };
		String cadena = "estas";
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla[j]);
		}
		System.out.print("\n");
		System.out.println(indexContains(tabla, cadena));
	}
}