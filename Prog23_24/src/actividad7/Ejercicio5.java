package actividad7;

public class Ejercicio5 {
	public static void copyArray(String[] tabla, String[] tabla2) {
		for (int i = 0; i < tabla.length; i++) {
			tabla2[i] = tabla[i];
		}
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla2[j]);
		}
	}
	public static void main(String[] args) {
		String[] tabla = {"hola", "que", "tal", "estas", "hector"};
		String[] tabla2 = new String[tabla.length];
		//Si pusiera String[] tabla2 = t, se copia la ruta de tabla a tabla2
		copyArray(tabla, tabla2);
		
	}
}